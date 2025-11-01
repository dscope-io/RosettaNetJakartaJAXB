
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_06;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_06 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_06
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelfBillingInvoiceNotificationType }
     * 
     */
    public SelfBillingInvoiceNotificationType createSelfBillingInvoiceNotificationType() {
        return new SelfBillingInvoiceNotificationType();
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
     * Create an instance of {@link ProductDescriptionType }
     * 
     */
    public ProductDescriptionType createProductDescriptionType() {
        return new ProductDescriptionType();
    }

    /**
     * Create an instance of {@link ProductMovementType }
     * 
     */
    public ProductMovementType createProductMovementType() {
        return new ProductMovementType();
    }

    /**
     * Create an instance of {@link SelfBillingInvoiceNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SelfBillingInvoiceNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.06", name = "SelfBillingInvoiceNotification")
    public SelfBillingInvoiceNotification createSelfBillingInvoiceNotification(SelfBillingInvoiceNotificationType value) {
        return new SelfBillingInvoiceNotification(value);
    }

}
