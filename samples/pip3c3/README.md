````markdown
# PIP3C3 Invoice Notification Demo

This sample demonstrates how to marshal and unmarshal the RosettaNet PIP3C3 Invoice
Notification (version 02.05) using the Jakarta JAXB bindings supplied by this repository.

## Layout

```
samples/pip3c3/
  README.md
  pip3c3_packages.properties
  src/main/java/io/dscope/samples/pip3c3/InvoiceNotificationDemo.java
  src/main/resources/samples/pip3c3/InvoiceNotification.xml
```

The XML payload under `src/main/resources` is the descriptive sample distributed with
RosettaNet PIP3C3 V11.04.00.

## Running the demo

Ensure a Java 21 toolchain is available (the build will attempt to provision it via Gradle
toolchains when invoked with the wrapper). Use the project-local Gradle wrapper (or your own Gradle
installation) to build and run the demo:

```sh
./gradlew -p samples/pip3c3 run
```

During execution the demo will:

1. Unmarshal the descriptive invoice notification payload into the generated JAXB model.
2. Refresh the document header, total line-item count, and purchase order references.
3. Increase the first line-item amount and keep the invoice totals in sync.
4. Marshal the modified payload back to XML and print it to the console, while also
   writing a copy to `samples/pip3c3/build/samples/pip3c3-invoice-notification.xml`.

If you prefer experimenting inside an IDE, mark `samples/pip3c3/src/main/java` as a
separate source root and run `io.dscope.samples.pip3c3.InvoiceNotificationDemo` directly. The module
depends on the `jakarta.xml.bind` APIs supplied by the buildscript classpath.
````
