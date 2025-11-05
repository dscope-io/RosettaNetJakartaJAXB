# Maven Central Release Guide

This document provides a complete guide for publishing the RosettaNet Jakarta JAXB artifacts to Maven Central using Sonatype OSSRH.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Gradle Configuration](#gradle-configuration)
- [Secrets and Credentials](#secrets-and-credentials)
- [Local Release Process](#local-release-process)
- [CI/CD Automation](#cicd-automation)
- [Validation Steps](#validation-steps)
- [OSSRH Staging and Release](#ossrh-staging-and-release)
- [Verification](#verification)
- [Troubleshooting](#troubleshooting)
- [Rollback](#rollback)

## Prerequisites

Before publishing to Maven Central, ensure you have:

1. **Sonatype OSSRH Account**: Register at [https://issues.sonatype.org](https://issues.sonatype.org)
2. **Approved Group ID**: Request approval for the `io.dscope` group ID via OSSRH JIRA
3. **GPG Key Pair**: Generate a GPG key for signing artifacts
4. **Java 21+**: Required by the project toolchain
5. **Gradle 9.1+**: Bundled with the project via wrapper

## Gradle Configuration

### Plugins

The `build.gradle` file includes the following plugins for publishing:

```gradle
plugins {
    id 'java'
    id 'maven-publish'
    id 'signing'
}
```

### Publishing Block

The publishing configuration defines the Maven publication:

```gradle
publishing {
    publications {
        mavenJava(MavenPublication) {
            from components.java
            artifact tasks.named('fatJar')
            
            pom {
                name = 'dscope-rosettanet-jakarta-jaxb'
                description = 'RosettaNet JAXB bindings packaged for Jakarta runtimes.'
                url = 'https://github.com/dscope-io/RosettaNetJakartaJAXB'
                
                licenses {
                    license {
                        name = 'Apache License, Version 2.0'
                        url = 'https://www.apache.org/licenses/LICENSE-2.0'
                    }
                }
                
                developers {
                    developer {
                        id = 'dscope-io'
                        name = 'DScope Development Team'
                        email = 'dev@dscope.io'
                    }
                }
                
                scm {
                    connection = 'scm:git:https://github.com/dscope-io/RosettaNetJakartaJAXB.git'
                    developerConnection = 'scm:git:ssh://git@github.com:dscope-io/RosettaNetJakartaJAXB.git'
                    url = 'https://github.com/dscope-io/RosettaNetJakartaJAXB'
                }
            }
        }
    }
    
    repositories {
        maven {
            name = "OSSRH"
            def releasesRepoUrl = "https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/"
            def snapshotsRepoUrl = "https://s01.oss.sonatype.org/content/repositories/snapshots/"
            url = version.endsWith('SNAPSHOT') ? snapshotsRepoUrl : releasesRepoUrl
            
            credentials {
                username = project.findProperty("ossrhUsername") ?: System.getenv("OSSRH_USERNAME")
                password = project.findProperty("ossrhPassword") ?: System.getenv("OSSRH_PASSWORD")
            }
        }
    }
}
```

### Signing Block

Artifacts are signed using GPG:

```gradle
signing {
    def signingKey = project.findProperty("signingKey") ?: System.getenv("SIGNING_KEY")
    def signingPassword = project.findProperty("signingPassword") ?: System.getenv("SIGNING_PASSWORD")
    
    if (signingKey && signingPassword) {
        useInMemoryPgpKeys(signingKey, signingPassword)
        sign publishing.publications.mavenJava
    }
    
    required { gradle.taskGraph.hasTask("publish") || gradle.taskGraph.hasTask("publishToSonatype") }
}
```

### Versioning Strategy

Version is defined in `build.gradle`:

```gradle
version = '0.5.0'
```

- **Release versions**: Use semantic versioning (e.g., `0.5.0`, `1.0.0`)
- **Snapshot versions**: Append `-SNAPSHOT` (e.g., `0.5.1-SNAPSHOT`)
- Update version before each release

### Artifact Metadata

The project generates the following artifacts:

- **Main JAR**: `dscope-rosettanet-jakarta-jaxb-{version}.jar`
- **Sources JAR**: `dscope-rosettanet-jakarta-jaxb-{version}-sources.jar`
- **Javadoc JAR**: `dscope-rosettanet-jakarta-jaxb-{version}-javadoc.jar`
- **Fat JAR**: `dscope-rosettanet-jakarta-jaxb-with-dependencies-{version}-all.jar`

## Secrets and Credentials

### Required Secrets

The following secrets are required for publishing:

1. **OSSRH_USERNAME**: Your Sonatype OSSRH username
2. **OSSRH_PASSWORD**: Your Sonatype OSSRH password or token
3. **SIGNING_KEY**: Base64-encoded GPG private key (ASCII-armored)
4. **SIGNING_PASSWORD**: Passphrase for the GPG key

### GPG Key Generation

Generate a GPG key pair for signing:

```bash
# Generate a new GPG key
gpg --gen-key

# Follow prompts to create key with:
# - Real name
# - Email address
# - Passphrase (save as SIGNING_PASSWORD)

# Export the private key in ASCII-armored format
gpg --armor --export-secret-keys YOUR_KEY_ID > private-key.asc

# Convert to base64 for use as SIGNING_KEY secret
cat private-key.asc | base64 -w 0 > private-key.base64

# Upload public key to keyserver
gpg --keyserver keyserver.ubuntu.com --send-keys YOUR_KEY_ID
```

### Local Configuration

For local development and testing, configure credentials in one of these ways:

#### Option 1: Environment Variables

```bash
export OSSRH_USERNAME="your-username"
export OSSRH_PASSWORD="your-password"
export SIGNING_KEY="base64-encoded-key"
export SIGNING_PASSWORD="your-key-passphrase"
```

#### Option 2: Gradle Properties

Create `~/.gradle/gradle.properties`:

```properties
ossrhUsername=your-username
ossrhPassword=your-password
signingKey=base64-encoded-key
signingPassword=your-key-passphrase
```

**Security Note**: Never commit credentials to version control. Add `gradle.properties` to `.gitignore`.

### CI Configuration

For GitHub Actions, configure secrets in repository settings:

1. Navigate to **Settings > Secrets and variables > Actions**
2. Add the following repository secrets:
   - `OSSRH_USERNAME`
   - `OSSRH_PASSWORD`
   - `SIGNING_KEY`
   - `SIGNING_PASSWORD`

## Local Release Process

### Step 1: Prepare Release

1. **Update version** in `build.gradle`:
   ```gradle
   version = '0.5.0'  // Remove -SNAPSHOT suffix
   ```

2. **Update documentation** if needed (README.md, CHANGELOG.md)

3. **Commit changes**:
   ```bash
   git add build.gradle
   git commit -m "Prepare release 0.5.0"
   ```

### Step 2: Validate Build

Run the full build and test suite:

```bash
./gradlew clean build
```

Verify:
- All tests pass
- No compilation errors
- JAR files are generated in `build/libs/`

### Step 3: Publish to Maven Local

Test the publishing process locally:

```bash
./gradlew publishToMavenLocal
```

This publishes to `~/.m2/repository/io/dscope/dscope-rosettanet-jakarta-jaxb/`.

Verify:
- All artifacts are present (JAR, sources, javadoc, POM)
- Signatures are generated (`.asc` files)
- POM contains correct metadata

### Step 4: Publish to OSSRH

Publish to the staging repository:

```bash
./gradlew publish
```

This uploads artifacts to OSSRH staging repository.

### Step 5: Create Git Tag

Tag the release:

```bash
git tag -a v0.5.0 -m "Release version 0.5.0"
git push origin v0.5.0
```

### Step 6: Update to Next Development Version

Update version for next development cycle:

```gradle
version = '0.5.1-SNAPSHOT'
```

Commit and push:

```bash
git add build.gradle
git commit -m "Prepare next development version 0.5.1-SNAPSHOT"
git push origin main
```

## CI/CD Automation

### GitHub Actions Workflow

Create `.github/workflows/release.yml`:

```yaml
name: Release to Maven Central

on:
  push:
    tags:
      - 'v*'
  workflow_dispatch:
    inputs:
      version:
        description: 'Release version (e.g., 0.5.0)'
        required: true
        type: string

jobs:
  release:
    runs-on: ubuntu-latest
    
    steps:
      - name: Checkout code
        uses: actions/checkout@v4
      
      - name: Set up Java 21
        uses: actions/setup-java@v4
        with:
          distribution: 'temurin'
          java-version: '21'
          cache: 'gradle'
      
      - name: Validate Gradle wrapper
        uses: gradle/wrapper-validation-action@v2
      
      - name: Run tests
        run: ./gradlew test
      
      - name: Publish to Maven Central
        env:
          OSSRH_USERNAME: ${{ secrets.OSSRH_USERNAME }}
          OSSRH_PASSWORD: ${{ secrets.OSSRH_PASSWORD }}
          SIGNING_KEY: ${{ secrets.SIGNING_KEY }}
          SIGNING_PASSWORD: ${{ secrets.SIGNING_PASSWORD }}
        run: ./gradlew publish
      
      - name: Create GitHub Release
        uses: softprops/action-gh-release@v1
        if: startsWith(github.ref, 'refs/tags/')
        with:
          files: |
            build/libs/*.jar
          generate_release_notes: true
        env:
          GITHUB_TOKEN: ${{ secrets.GITHUB_TOKEN }}
```

### Workflow Triggers

The workflow is triggered by:

1. **Tag Push**: Automatically when a tag matching `v*` is pushed
2. **Manual Dispatch**: Via GitHub UI with custom version input

### Safety Checks

The workflow includes:

- **Wrapper validation**: Ensures Gradle wrapper hasn't been tampered with
- **Test execution**: All tests must pass before publishing
- **Secret validation**: Build fails if required secrets are missing
- **Tag format**: Only tags matching `v*` pattern trigger releases

### Manual Release via GitHub Actions

1. Navigate to **Actions > Release to Maven Central**
2. Click **Run workflow**
3. Select branch (typically `main`)
4. Enter version number (e.g., `0.5.0`)
5. Click **Run workflow**

## Validation Steps

### Pre-Release Validation

Before publishing to Maven Central, complete these validation steps:

#### 1. Build Validation

```bash
# Clean build
./gradlew clean build

# Verify no errors
echo $?  # Should be 0
```

#### 2. Test Validation

```bash
# Run all tests
./gradlew test

# Run specific test suite
./gradlew test --tests '*RosettaNetPIPTest*'

# Check test report
open build/reports/tests/test/index.html
```

#### 3. Artifact Generation

```bash
# Generate all artifacts
./gradlew assemble

# List generated artifacts
ls -lh build/libs/
```

Expected artifacts:
- `dscope-rosettanet-jakarta-jaxb-{version}.jar`
- `dscope-rosettanet-jakarta-jaxb-{version}-sources.jar`
- `dscope-rosettanet-jakarta-jaxb-{version}-javadoc.jar`
- `dscope-rosettanet-jakarta-jaxb-with-dependencies-{version}-all.jar`

#### 4. Local Maven Publication

```bash
# Publish to local Maven repository
./gradlew publishToMavenLocal

# Verify installation
ls -lh ~/.m2/repository/io/dscope/dscope-rosettanet-jakarta-jaxb/{version}/
```

#### 5. Signature Verification

```bash
# Navigate to local Maven repository
cd ~/.m2/repository/io/dscope/dscope-rosettanet-jakarta-jaxb/{version}/

# Verify signatures
gpg --verify dscope-rosettanet-jakarta-jaxb-{version}.jar.asc dscope-rosettanet-jakarta-jaxb-{version}.jar
gpg --verify dscope-rosettanet-jakarta-jaxb-{version}-sources.jar.asc dscope-rosettanet-jakarta-jaxb-{version}-sources.jar
gpg --verify dscope-rosettanet-jakarta-jaxb-{version}-javadoc.jar.asc dscope-rosettanet-jakarta-jaxb-{version}-javadoc.jar
```

All signatures should verify successfully.

#### 6. POM Validation

```bash
# Inspect generated POM
cat ~/.m2/repository/io/dscope/dscope-rosettanet-jakarta-jaxb/{version}/dscope-rosettanet-jakarta-jaxb-{version}.pom
```

Verify POM contains:
- Correct group ID, artifact ID, and version
- License information
- Developer information
- SCM information
- Dependencies

#### 7. Integration Test

Create a test project to verify the published artifact:

```groovy
// test-project/build.gradle
plugins {
    id 'java'
}

repositories {
    mavenLocal()
}

dependencies {
    implementation 'io.dscope:dscope-rosettanet-jakarta-jaxb:{version}'
}
```

```bash
cd test-project
./gradlew build
```

### Post-Release Validation

After publishing to Maven Central:

#### 1. Verify OSSRH Upload

1. Login to [https://s01.oss.sonatype.org/](https://s01.oss.sonatype.org/)
2. Navigate to **Staging Repositories**
3. Find your staging repository (e.g., `iodscope-1001`)
4. Verify all artifacts are present with signatures

#### 2. Verify Maven Central Sync

After closing and releasing the staging repository:

```bash
# Check Maven Central (may take 2+ hours)
curl https://repo1.maven.org/maven2/io/dscope/dscope-rosettanet-jakarta-jaxb/{version}/
```

#### 3. Verify Search Indexing

Search for the artifact on [https://search.maven.org/](https://search.maven.org/):
- Group ID: `io.dscope`
- Artifact ID: `dscope-rosettanet-jakarta-jaxb`

Note: Indexing may take 2-4 hours after release.

## OSSRH Staging and Release

### Understanding OSSRH Workflow

Sonatype OSSRH uses a staging workflow:

1. **Upload**: Artifacts are uploaded to a staging repository
2. **Close**: Staging repository is closed, triggering validation
3. **Release**: After validation passes, repository is released to Maven Central
4. **Sync**: Artifacts sync to Maven Central (2-4 hours)

### Staging Repository

After running `./gradlew publish`:

1. Login to [https://s01.oss.sonatype.org/](https://s01.oss.sonatype.org/)
2. Navigate to **Staging Repositories** (left menu)
3. Find your repository (e.g., `iodscope-1001`)
4. Select the repository

### Closing the Staging Repository

1. Select your staging repository
2. Click **Close** button
3. Wait for validation to complete (2-5 minutes)
4. Check **Activity** tab for validation results

Validation includes:
- Signature verification
- POM validation
- Repository structure check
- Source and Javadoc presence

### Releasing to Maven Central

After successful validation:

1. Select the closed staging repository
2. Click **Release** button
3. Confirm the release

The artifacts will sync to Maven Central within 2-4 hours.

### Automated Staging (Optional)

For fully automated releases, consider using the Nexus Staging Plugin:

```gradle
plugins {
    id "io.github.gradle-nexus.publish-plugin" version "1.3.0"
}

nexusPublishing {
    repositories {
        sonatype {
            nexusUrl.set(uri("https://s01.oss.sonatype.org/service/local/"))
            snapshotRepositoryUrl.set(uri("https://s01.oss.sonatype.org/content/repositories/snapshots/"))
            username = project.findProperty("ossrhUsername") ?: System.getenv("OSSRH_USERNAME")
            password = project.findProperty("ossrhPassword") ?: System.getenv("OSSRH_PASSWORD")
        }
    }
}
```

Then use:

```bash
./gradlew publishToSonatype closeSonatypeStagingRepository
# or for full automation:
./gradlew publishToSonatype closeAndReleaseSonatypeStagingRepository
```

## Verification

### Verify Maven Central Deployment

Check that artifacts are available on Maven Central:

```bash
# Check if artifact exists
curl -I https://repo1.maven.org/maven2/io/dscope/dscope-rosettanet-jakarta-jaxb/{version}/dscope-rosettanet-jakarta-jaxb-{version}.jar

# Download and verify
wget https://repo1.maven.org/maven2/io/dscope/dscope-rosettanet-jakarta-jaxb/{version}/dscope-rosettanet-jakarta-jaxb-{version}.jar
```

### Verify in Downstream Projects

Test the release in a real project:

```groovy
dependencies {
    implementation 'io.dscope:dscope-rosettanet-jakarta-jaxb:{version}'
}
```

### Verify Search Engines

Check these Maven search engines:

- [Maven Central Repository Search](https://search.maven.org/)
- [MVN Repository](https://mvnrepository.com/)

## Troubleshooting

### Common Issues and Solutions

#### Issue: "Could not find matching constructor for: org.gradle.api.internal.artifacts.dsl.dependencies.DefaultDependencyConstraintHandler"

**Cause**: Gradle version incompatibility

**Solution**: Use the correct Gradle version (9.1+):
```bash
./gradlew --version
./gradlew wrapper --gradle-version 9.1
```

#### Issue: "PGP signature verification failed"

**Cause**: 
- GPG key not properly configured
- Wrong signing password
- Key not uploaded to keyserver

**Solution**:
1. Verify GPG key exists: `gpg --list-secret-keys`
2. Verify signing credentials are correct
3. Upload key to keyserver: `gpg --keyserver keyserver.ubuntu.com --send-keys KEY_ID`
4. Re-export and encode key properly

#### Issue: "Received status code 401 from server: Unauthorized"

**Cause**: Invalid OSSRH credentials

**Solution**:
1. Verify username and password are correct
2. Check if token is still valid (tokens can expire)
3. Generate new token in OSSRH if needed
4. Verify credentials are properly set in environment or properties

#### Issue: "Staging repository is not in the correct state for release"

**Cause**: Repository wasn't closed before attempting release

**Solution**:
1. Close the staging repository first
2. Wait for validation to complete
3. Then release the repository

#### Issue: "Missing required metadata: developers section"

**Cause**: POM is missing required information

**Solution**: Verify `build.gradle` includes all required POM elements:
- name
- description
- url
- licenses
- developers
- scm

#### Issue: "No signature files were found"

**Cause**: Signing plugin not configured or signing credentials missing

**Solution**:
1. Verify signing plugin is applied
2. Verify SIGNING_KEY and SIGNING_PASSWORD are set
3. Check signing configuration in build.gradle

#### Issue: "Artifact already exists"

**Cause**: Trying to republish the same version

**Solution**:
- Maven Central doesn't allow overwriting releases
- Increment version number and publish again
- For snapshots, this shouldn't occur

#### Issue: "Publication only contains dependencies"

**Cause**: Trying to publish before build completes

**Solution**:
```bash
./gradlew clean build
./gradlew publish
```

#### Issue: "Connection timeout during upload"

**Cause**: Large artifacts or slow network

**Solution**:
- Retry the upload
- Check network connection
- Increase timeout in gradle.properties:
  ```properties
  systemProp.org.gradle.internal.http.connectionTimeout=120000
  systemProp.org.gradle.internal.http.socketTimeout=120000
  ```

### Debug Mode

Run Gradle with debug output:

```bash
./gradlew publish --debug > publish-debug.log 2>&1
```

Examine the log for detailed error information.

### Verify Configuration

Test configuration without publishing:

```bash
# Dry run - shows what would be published
./gradlew publish --dry-run

# Generate POM without publishing
./gradlew generatePomFileForMavenJavaPublication

# Check generated POM
cat build/publications/mavenJava/pom-default.xml
```

## Rollback

### Cannot Delete from Maven Central

**Important**: Once a release is published to Maven Central, it **cannot be deleted or modified**. Artifacts are immutable.

### Rollback Options

If you need to "rollback" a release:

1. **For Critical Issues**: Publish a new patch version with fixes
   ```gradle
   version = '0.5.1'  // Fix version
   ```

2. **For Security Issues**: 
   - Publish a patched version immediately
   - Contact Sonatype to mark the vulnerable version

3. **For SNAPSHOT Releases**: 
   - Simply republish with fixes
   - Snapshots can be overwritten

### Drop Staging Repository

If you haven't released yet, you can drop the staging repository:

1. Login to [https://s01.oss.sonatype.org/](https://s01.oss.sonatype.org/)
2. Navigate to **Staging Repositories**
3. Select your staging repository
4. Click **Drop** button
5. Fix issues and republish

### Version Bumping Strategy

If a release needs to be abandoned:

1. **Minor issues**: Publish patch version (0.5.0 → 0.5.1)
2. **Major issues**: Publish new minor version (0.5.0 → 0.6.0)
3. **Document in release notes** why version was skipped

### Communication

If a problematic version was released:

1. Update README.md with recommended version
2. Add notice in GitHub Releases
3. Create issue documenting the problem
4. Update CHANGELOG.md
5. Consider blog post or announcement for major issues

## Release Checklist

Use this checklist for each release:

### Pre-Release

- [ ] All tests pass locally
- [ ] Version updated in build.gradle (without -SNAPSHOT)
- [ ] CHANGELOG.md updated with release notes
- [ ] README.md reviewed for accuracy
- [ ] All changes committed to version control
- [ ] Working branch merged to main

### Validation

- [ ] `./gradlew clean build` succeeds
- [ ] `./gradlew test` passes all tests
- [ ] `./gradlew publishToMavenLocal` succeeds
- [ ] Generated artifacts verified in ~/.m2/repository
- [ ] Signatures verified with `gpg --verify`
- [ ] POM metadata validated

### Release

- [ ] `./gradlew publish` completes successfully
- [ ] OSSRH staging repository verified
- [ ] Staging repository closed successfully
- [ ] Validation checks passed
- [ ] Staging repository released
- [ ] Git tag created: `git tag -a v{version} -m "Release version {version}"`
- [ ] Tag pushed: `git push origin v{version}`

### Post-Release

- [ ] Version updated to next SNAPSHOT
- [ ] Changes committed: "Prepare next development version"
- [ ] Artifacts synced to Maven Central (2-4 hours)
- [ ] Artifact searchable on Maven Central Search
- [ ] GitHub Release created with notes
- [ ] Announcement published (if applicable)
- [ ] Documentation updated (if needed)

### Verification

- [ ] Artifact downloadable from Maven Central
- [ ] Test project can resolve and use the dependency
- [ ] All signatures valid on Maven Central
- [ ] Search engines indexed the new version

## Additional Resources

- [Central Repository Documentation](https://central.sonatype.org/publish/)
- [OSSRH Guide](https://central.sonatype.org/publish/publish-guide/)
- [Gradle Maven Publish Plugin](https://docs.gradle.org/current/userguide/publishing_maven.html)
- [Gradle Signing Plugin](https://docs.gradle.org/current/userguide/signing_plugin.html)
- [GPG Documentation](https://www.gnupg.org/documentation/)
- [Semantic Versioning](https://semver.org/)

## Support

For issues with:
- **This project**: Open an issue on [GitHub](https://github.com/dscope-io/RosettaNetJakartaJAXB/issues)
- **OSSRH/Maven Central**: Contact [Sonatype Support](https://central.sonatype.org/publish/publish-guide/#releasing-to-central)
- **Gradle**: Check [Gradle Forums](https://discuss.gradle.org/)
