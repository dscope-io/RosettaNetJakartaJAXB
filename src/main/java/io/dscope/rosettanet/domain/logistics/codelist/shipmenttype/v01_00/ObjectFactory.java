
package io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentTypeType }
     * 
     */
    public ShipmentTypeType createShipmentTypeType() {
        return new ShipmentTypeType();
    }

    /**
     * Create an instance of {@link ShipmentTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.00", name = "ShipmentTypeA")
    public ShipmentTypeA createShipmentTypeA(Object value) {
        return new ShipmentTypeA(value);
    }

    /**
     * Create an instance of {@link ShipmentType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.00", name = "ShipmentType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.00", substitutionHeadName = "ShipmentTypeA")
    public ShipmentType createShipmentType(ShipmentTypeType value) {
        return new ShipmentType(value);
    }

}
