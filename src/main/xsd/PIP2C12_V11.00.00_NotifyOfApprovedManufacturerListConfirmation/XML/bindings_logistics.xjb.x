<?xml version="1.0" encoding="UTF-8"?>
<jxb:bindings jxb:extensionBindingPrefixes="xjc annox" version="2.1" xmlns:annox="http://annox.dev.java.net" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:jxb="http://java.sun.com/xml/ns/jaxb">
    <jxb:bindings node="/xs:schema" schemaLocation="Domain/Logistics/Logistics_02_23.xsd">
        <!-- bind only the element or complexType you want -->
        <jxb:bindings node="//xs:complexType[@name='DateQuantityType']">
            <jxb:class name="DateQuantityType"/>
        </jxb:bindings>
            <jxb:bindings node="//xs:complexType[@name='Att']">
            <jxb:class name="DateQuantityType"/>
        </jxb:bindings>    
        <jxb:schemaBindings>
            <jxb:package name="io.dscope.rosettanet.domain.logistics.logistics.v02_23"/>
        </jxb:schemaBindings>
    </jxb:bindings>
</jxb:bindings>