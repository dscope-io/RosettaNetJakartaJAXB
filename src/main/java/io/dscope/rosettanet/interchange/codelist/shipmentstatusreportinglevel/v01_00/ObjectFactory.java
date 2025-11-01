
package io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentStatusReportingLevelType }
     * 
     */
    public ShipmentStatusReportingLevelType createShipmentStatusReportingLevelType() {
        return new ShipmentStatusReportingLevelType();
    }

    /**
     * Create an instance of {@link ShipmentStatusReportingLevelA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentStatusReportingLevelA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00", name = "ShipmentStatusReportingLevelA")
    public ShipmentStatusReportingLevelA createShipmentStatusReportingLevelA(Object value) {
        return new ShipmentStatusReportingLevelA(value);
    }

    /**
     * Create an instance of {@link ShipmentStatusReportingLevel }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentStatusReportingLevel }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00", name = "ShipmentStatusReportingLevel", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00", substitutionHeadName = "ShipmentStatusReportingLevelA")
    public ShipmentStatusReportingLevel createShipmentStatusReportingLevel(ShipmentStatusReportingLevelType value) {
        return new ShipmentStatusReportingLevel(value);
    }

}
