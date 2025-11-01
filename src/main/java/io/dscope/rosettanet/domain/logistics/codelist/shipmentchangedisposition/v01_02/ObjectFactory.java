
package io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentChangeDispositionType }
     * 
     */
    public ShipmentChangeDispositionType createShipmentChangeDispositionType() {
        return new ShipmentChangeDispositionType();
    }

    /**
     * Create an instance of {@link ShipmentChangeDispositionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentChangeDispositionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.02", name = "ShipmentChangeDispositionA")
    public ShipmentChangeDispositionA createShipmentChangeDispositionA(Object value) {
        return new ShipmentChangeDispositionA(value);
    }

    /**
     * Create an instance of {@link ShipmentChangeDisposition }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentChangeDisposition }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.02", name = "ShipmentChangeDisposition", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.02", substitutionHeadName = "ShipmentChangeDispositionA")
    public ShipmentChangeDisposition createShipmentChangeDisposition(ShipmentChangeDispositionType value) {
        return new ShipmentChangeDisposition(value);
    }

}
