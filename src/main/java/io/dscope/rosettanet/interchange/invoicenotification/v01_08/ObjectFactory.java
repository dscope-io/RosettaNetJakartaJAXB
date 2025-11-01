
package io.dscope.rosettanet.interchange.invoicenotification.v01_08;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.invoicenotification.v01_08 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.invoicenotification.v01_08
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InvoiceNotificationType }
     * 
     */
    public InvoiceNotificationType createInvoiceNotificationType() {
        return new InvoiceNotificationType();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link InvoiceLineItemType }
     * 
     */
    public InvoiceLineItemType createInvoiceLineItemType() {
        return new InvoiceLineItemType();
    }

    /**
     * Create an instance of {@link OrderStatusType }
     * 
     */
    public OrderStatusType createOrderStatusType() {
        return new OrderStatusType();
    }

    /**
     * Create an instance of {@link ProductDescriptionType }
     * 
     */
    public ProductDescriptionType createProductDescriptionType() {
        return new ProductDescriptionType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link PurchaseOrderType }
     * 
     */
    public PurchaseOrderType createPurchaseOrderType() {
        return new PurchaseOrderType();
    }

    /**
     * Create an instance of {@link InvoiceNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InvoiceNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.08", name = "InvoiceNotification")
    public InvoiceNotification createInvoiceNotification(InvoiceNotificationType value) {
        return new InvoiceNotification(value);
    }

}
