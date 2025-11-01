
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdvanceShipmentNotificationType }
     * 
     */
    public AdvanceShipmentNotificationType createAdvanceShipmentNotificationType() {
        return new AdvanceShipmentNotificationType();
    }

    /**
     * Create an instance of {@link AdvanceShipmentType }
     * 
     */
    public AdvanceShipmentType createAdvanceShipmentType() {
        return new AdvanceShipmentType();
    }

    /**
     * Create an instance of {@link DeviceActivationInformationType }
     * 
     */
    public DeviceActivationInformationType createDeviceActivationInformationType() {
        return new DeviceActivationInformationType();
    }

    /**
     * Create an instance of {@link DeviceActivationNumberType }
     * 
     */
    public DeviceActivationNumberType createDeviceActivationNumberType() {
        return new DeviceActivationNumberType();
    }

    /**
     * Create an instance of {@link DocumentSubLineLotShipReferenceType }
     * 
     */
    public DocumentSubLineLotShipReferenceType createDocumentSubLineLotShipReferenceType() {
        return new DocumentSubLineLotShipReferenceType();
    }

    /**
     * Create an instance of {@link LotShipReferenceType }
     * 
     */
    public LotShipReferenceType createLotShipReferenceType() {
        return new LotShipReferenceType();
    }

    /**
     * Create an instance of {@link ShipmentType }
     * 
     */
    public ShipmentType createShipmentType() {
        return new ShipmentType();
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
     * Create an instance of {@link AdvanceShipmentNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AdvanceShipmentNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.01", name = "AdvanceShipmentNotification")
    public AdvanceShipmentNotification createAdvanceShipmentNotification(AdvanceShipmentNotificationType value) {
        return new AdvanceShipmentNotification(value);
    }

}
