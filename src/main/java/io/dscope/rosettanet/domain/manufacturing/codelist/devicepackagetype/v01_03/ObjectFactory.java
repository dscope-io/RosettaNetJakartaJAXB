
package io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DevicePackageTypeType }
     * 
     */
    public DevicePackageTypeType createDevicePackageTypeType() {
        return new DevicePackageTypeType();
    }

    /**
     * Create an instance of {@link DevicePackageTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DevicePackageTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.03", name = "DevicePackageTypeA")
    public DevicePackageTypeA createDevicePackageTypeA(Object value) {
        return new DevicePackageTypeA(value);
    }

    /**
     * Create an instance of {@link DevicePackageType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DevicePackageType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.03", name = "DevicePackageType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.03", substitutionHeadName = "DevicePackageTypeA")
    public DevicePackageType createDevicePackageType(DevicePackageTypeType value) {
        return new DevicePackageType(value);
    }

}
