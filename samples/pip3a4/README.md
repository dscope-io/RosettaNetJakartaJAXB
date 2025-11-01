# PIP3A4 Purchase Order Request Demo

This sample demonstrates how to marshal and unmarshal the RosettaNet PIP3A4 Purchase Order
Request using the Jakarta JAXB bindings that live in this repository.

## Layout

```
samples/pip3a4/
  README.md
  src/main/java/io/dscope/samples/pip3a4/PurchaseOrderRequestDemo.java
  src/main/resources/samples/pip3a4/PurchaseOrderRequest.xml
```

The XML payload under `src/main/resources` is the official descriptive sample that ships with
RosettaNet PIP3A4 V11.15.00.

## Running the demo

Ensure a Java 21 toolchain is available on your machine (the sample build uses Gradle's toolchain
support to provision JDK 21 when possible).

Use the repository wrapper to compile and execute the demo module directly:

```sh
./gradlew -p samples/pip3a4 run
```

The task will:

1. Unmarshal the sample XML into the generated JAXB model.
2. Mutate the document header and bump the first line item quantity.
3. Marshal the modified payload back to XML and print it to the console.

If you prefer to tinker from an IDE, mark `samples/pip3a4/src/main/java` as a separate source root
and run `io.dscope.samples.pip3a4.PurchaseOrderRequestDemo` directly. The sample now depends on the
`jakarta.xml.bind` APIs, so ensure your IDE resolves those from the buildscript dependencies.
