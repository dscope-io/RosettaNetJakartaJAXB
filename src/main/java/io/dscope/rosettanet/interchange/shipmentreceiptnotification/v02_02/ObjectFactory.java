
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShipmentReceiptNotificationType }
     * 
     */
    public ShipmentReceiptNotificationType createShipmentReceiptNotificationType() {
        return new ShipmentReceiptNotificationType();
    }

    /**
     * Create an instance of {@link DiscrepancyInformationType }
     * 
     */
    public DiscrepancyInformationType createDiscrepancyInformationType() {
        return new DiscrepancyInformationType();
    }

    /**
     * Create an instance of {@link QuantityInformationType }
     * 
     */
    public QuantityInformationType createQuantityInformationType() {
        return new QuantityInformationType();
    }

    /**
     * Create an instance of {@link ShipmentReceiptType }
     * 
     */
    public ShipmentReceiptType createShipmentReceiptType() {
        return new ShipmentReceiptType();
    }

    /**
     * Create an instance of {@link ShipmentReceiptLineItemType }
     * 
     */
    public ShipmentReceiptLineItemType createShipmentReceiptLineItemType() {
        return new ShipmentReceiptLineItemType();
    }

    /**
     * Create an instance of {@link ShipmentReceiptNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShipmentReceiptNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.02", name = "ShipmentReceiptNotification")
    public ShipmentReceiptNotification createShipmentReceiptNotification(ShipmentReceiptNotificationType value) {
        return new ShipmentReceiptNotification(value);
    }

}
