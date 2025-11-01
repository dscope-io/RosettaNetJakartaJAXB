
package io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_00 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeviceTypeType }
     * 
     */
    public DeviceTypeType createDeviceTypeType() {
        return new DeviceTypeType();
    }

    /**
     * Create an instance of {@link DeviceTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DeviceTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:1.0", name = "DeviceTypeA")
    public DeviceTypeA createDeviceTypeA(Object value) {
        return new DeviceTypeA(value);
    }

    /**
     * Create an instance of {@link DeviceType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DeviceType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:1.0", name = "DeviceType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:1.0", substitutionHeadName = "DeviceTypeA")
    public DeviceType createDeviceType(DeviceTypeType value) {
        return new DeviceType(value);
    }

}
