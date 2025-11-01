
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingDocumentationNotificationType }
     * 
     */
    public ShippingDocumentationNotificationType createShippingDocumentationNotificationType() {
        return new ShippingDocumentationNotificationType();
    }

    /**
     * Create an instance of {@link AmendmentInformationType }
     * 
     */
    public AmendmentInformationType createAmendmentInformationType() {
        return new AmendmentInformationType();
    }

    /**
     * Create an instance of {@link DateInformationType }
     * 
     */
    public DateInformationType createDateInformationType() {
        return new DateInformationType();
    }

    /**
     * Create an instance of {@link DeclarationInformationType }
     * 
     */
    public DeclarationInformationType createDeclarationInformationType() {
        return new DeclarationInformationType();
    }

    /**
     * Create an instance of {@link HeaderInformationType }
     * 
     */
    public HeaderInformationType createHeaderInformationType() {
        return new HeaderInformationType();
    }

    /**
     * Create an instance of {@link PartnerProductIdentificationType }
     * 
     */
    public PartnerProductIdentificationType createPartnerProductIdentificationType() {
        return new PartnerProductIdentificationType();
    }

    /**
     * Create an instance of {@link PricingInformationType }
     * 
     */
    public PricingInformationType createPricingInformationType() {
        return new PricingInformationType();
    }

    /**
     * Create an instance of {@link PricingPaymentInformationType }
     * 
     */
    public PricingPaymentInformationType createPricingPaymentInformationType() {
        return new PricingPaymentInformationType();
    }

    /**
     * Create an instance of {@link ProductIdentificationInformationType }
     * 
     */
    public ProductIdentificationInformationType createProductIdentificationInformationType() {
        return new ProductIdentificationInformationType();
    }

    /**
     * Create an instance of {@link RequestingOrderInformationType }
     * 
     */
    public RequestingOrderInformationType createRequestingOrderInformationType() {
        return new RequestingOrderInformationType();
    }

    /**
     * Create an instance of {@link RoutingInformationType }
     * 
     */
    public RoutingInformationType createRoutingInformationType() {
        return new RoutingInformationType();
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
     * Create an instance of {@link ShipmentReturnInformationType }
     * 
     */
    public ShipmentReturnInformationType createShipmentReturnInformationType() {
        return new ShipmentReturnInformationType();
    }

    /**
     * Create an instance of {@link ShippingBusinessDocumentType }
     * 
     */
    public ShippingBusinessDocumentType createShippingBusinessDocumentType() {
        return new ShippingBusinessDocumentType();
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
     * Create an instance of {@link ShippingOrderInformationType }
     * 
     */
    public ShippingOrderInformationType createShippingOrderInformationType() {
        return new ShippingOrderInformationType();
    }

    /**
     * Create an instance of {@link SubContainerType }
     * 
     */
    public SubContainerType createSubContainerType() {
        return new SubContainerType();
    }

    /**
     * Create an instance of {@link ShippingDocumentationNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingDocumentationNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09", name = "ShippingDocumentationNotification")
    public ShippingDocumentationNotification createShippingDocumentationNotification(ShippingDocumentationNotificationType value) {
        return new ShippingDocumentationNotification(value);
    }

}
