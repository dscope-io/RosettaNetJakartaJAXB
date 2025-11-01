
package io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ManufacturerPartStatusType }
     * 
     */
    public ManufacturerPartStatusType createManufacturerPartStatusType() {
        return new ManufacturerPartStatusType();
    }

    /**
     * Create an instance of {@link ManufacturerPartStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManufacturerPartStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0", name = "ManufacturerPartStatusA")
    public ManufacturerPartStatusA createManufacturerPartStatusA(Object value) {
        return new ManufacturerPartStatusA(value);
    }

    /**
     * Create an instance of {@link ManufacturerPartStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManufacturerPartStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0", name = "ManufacturerPartStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0", substitutionHeadName = "ManufacturerPartStatusA")
    public ManufacturerPartStatus createManufacturerPartStatus(ManufacturerPartStatusType value) {
        return new ManufacturerPartStatus(value);
    }

}
