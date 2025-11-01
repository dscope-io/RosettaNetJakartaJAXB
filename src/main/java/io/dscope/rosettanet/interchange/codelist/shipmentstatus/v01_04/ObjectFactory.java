
package io.dscope.rosettanet.interchange.codelist.shipmentstatus.v01_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.shipmentstatus.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.shipmentstatus.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentStatusType }
     * 
     */
    public ShipmentStatusType createShipmentStatusType() {
        return new ShipmentStatusType();
    }

    /**
     * Create an instance of {@link ShipmentStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShipmentStatus:xsd:codelist:01.04", name = "ShipmentStatusA")
    public ShipmentStatusA createShipmentStatusA(Object value) {
        return new ShipmentStatusA(value);
    }

    /**
     * Create an instance of {@link ShipmentStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShipmentStatus:xsd:codelist:01.04", name = "ShipmentStatus", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:ShipmentStatus:xsd:codelist:01.04", substitutionHeadName = "ShipmentStatusA")
    public ShipmentStatus createShipmentStatus(ShipmentStatusType value) {
        return new ShipmentStatus(value);
    }

}
