
package io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentModeType }
     * 
     */
    public ShipmentModeType createShipmentModeType() {
        return new ShipmentModeType();
    }

    /**
     * Create an instance of {@link ShipmentModeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentModeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.03", name = "ShipmentModeA")
    public ShipmentModeA createShipmentModeA(Object value) {
        return new ShipmentModeA(value);
    }

    /**
     * Create an instance of {@link ShipmentMode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentMode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.03", name = "ShipmentMode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.03", substitutionHeadName = "ShipmentModeA")
    public ShipmentMode createShipmentMode(ShipmentModeType value) {
        return new ShipmentMode(value);
    }

}
