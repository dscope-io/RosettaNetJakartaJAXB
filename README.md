# RosettaNet JAXB Utilities

This project contains Jakarta JAXB generated models, bindings, and round-trip validation tests for the DScope RosettaNet payload library. Gradle orchestrates the build, generates test fixtures, and executes XML round-trip verification across the RosettaNet specification catalogue.

## Project Layout

- `src/main/java` – JAXB-generated domain libraries.
- `src/main/resources` – global RosettaNet configuration (`RosettaNet.properties`).
- `src/main/xsd` – RosettaNet schemas, specification descriptors, and binding customisations.
- `src/test/java` – Dynamic JUnit 5 test suites for marshaling/unmarshaling descriptive payloads.
- `src/main/dtd/rnif.md` – RNIF 2.0 envelope summary distilled from the RNIF DTD/message guideline set.
- `src/xsd/pip-documentation.md` – Local index of RosettaNet Partner Interface Process documentation links.

## Prerequisites

- Java 21 toolchain on the `PATH` (or `JAVA_HOME` pointing to a Java 21 installation).
- Gradle 9.1+ available locally **or** use the bundled `./gradlew` wrapper (pinned to Gradle 9.1).

## Building

```bash
# Using a local Gradle installation
gradle clean build

# Or via the provided wrapper
./gradlew clean build
```

The build compiles the Jakarta JAXB sources, runs unit tests, and produces the shaded distribution JAR under `build/libs`.

## Running Tests Only

```bash
# Execute the RosettaNet PIP round-trip validation
./gradlew test --tests '*RosettaNetPIPTest*'
```

The parameterised test exercises RosettaNet payloads defined in `src/test/resources`, performing dictionary-driven Jakarta JAXB marshal/unmarshal round-trips to ensure the generated bindings remain consistent.

## Troubleshooting

- **Missing wrapper JAR** – Ensure `gradle/wrapper/gradle-wrapper.jar` and `gradle-wrapper.properties` exist if you intend to use `./gradlew`.
- **JAXB context errors** – Check that the relevant `.properties` files include the correct `packages` entries, and confirm the generated classes are on the classpath.
- **Spec XML not found** – Verify `src/main/xsd/specs.xml` (or `src/xsd/specs.xml`) lists the desired PIPs and that their `Descriptive` folders contain sample XML files.

## License

See [LICENSE](LICENSE) for details.
