
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingOrderConfirmationNotificationType }
     * 
     */
    public ShippingOrderConfirmationNotificationType createShippingOrderConfirmationNotificationType() {
        return new ShippingOrderConfirmationNotificationType();
    }

    /**
     * Create an instance of {@link RequestingOrderInformationType }
     * 
     */
    public RequestingOrderInformationType createRequestingOrderInformationType() {
        return new RequestingOrderInformationType();
    }

    /**
     * Create an instance of {@link RequestingOrderLineItemReferenceType }
     * 
     */
    public RequestingOrderLineItemReferenceType createRequestingOrderLineItemReferenceType() {
        return new RequestingOrderLineItemReferenceType();
    }

    /**
     * Create an instance of {@link RoutingInformationType }
     * 
     */
    public RoutingInformationType createRoutingInformationType() {
        return new RoutingInformationType();
    }

    /**
     * Create an instance of {@link ShipmentConfirmationType }
     * 
     */
    public ShipmentConfirmationType createShipmentConfirmationType() {
        return new ShipmentConfirmationType();
    }

    /**
     * Create an instance of {@link ShipmentInformationType }
     * 
     */
    public ShipmentInformationType createShipmentInformationType() {
        return new ShipmentInformationType();
    }

    /**
     * Create an instance of {@link ShipmentLineItemType }
     * 
     */
    public ShipmentLineItemType createShipmentLineItemType() {
        return new ShipmentLineItemType();
    }

    /**
     * Create an instance of {@link ShippingContainerType }
     * 
     */
    public ShippingContainerType createShippingContainerType() {
        return new ShippingContainerType();
    }

    /**
     * Create an instance of {@link ShippingContainerItemType }
     * 
     */
    public ShippingContainerItemType createShippingContainerItemType() {
        return new ShippingContainerItemType();
    }

    /**
     * Create an instance of {@link SubContainerType }
     * 
     */
    public SubContainerType createSubContainerType() {
        return new SubContainerType();
    }

    /**
     * Create an instance of {@link ShippingOrderConfirmationNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderConfirmationNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00", name = "ShippingOrderConfirmationNotification")
    public ShippingOrderConfirmationNotification createShippingOrderConfirmationNotification(ShippingOrderConfirmationNotificationType value) {
        return new ShippingOrderConfirmationNotification(value);
    }

}
