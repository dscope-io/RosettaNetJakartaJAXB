
package io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderConfirmationType }
     * 
     */
    public PurchaseOrderConfirmationType createPurchaseOrderConfirmationType() {
        return new PurchaseOrderConfirmationType();
    }

    /**
     * Create an instance of {@link OrderLineItemType }
     * 
     */
    public OrderLineItemType createOrderLineItemType() {
        return new OrderLineItemType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link ProductSubLineItemType }
     * 
     */
    public ProductSubLineItemType createProductSubLineItemType() {
        return new ProductSubLineItemType();
    }

    /**
     * Create an instance of {@link PurchaseOrderType }
     * 
     */
    public PurchaseOrderType createPurchaseOrderType() {
        return new PurchaseOrderType();
    }

    /**
     * Create an instance of {@link ServiceLineItemType }
     * 
     */
    public ServiceLineItemType createServiceLineItemType() {
        return new ServiceLineItemType();
    }

    /**
     * Create an instance of {@link ServiceLineItemByOptionType }
     * 
     */
    public ServiceLineItemByOptionType createServiceLineItemByOptionType() {
        return new ServiceLineItemByOptionType();
    }

    /**
     * Create an instance of {@link TaxSummaryType }
     * 
     */
    public TaxSummaryType createTaxSummaryType() {
        return new TaxSummaryType();
    }

    /**
     * Create an instance of {@link PurchaseOrderConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.01", name = "PurchaseOrderConfirmation")
    public PurchaseOrderConfirmation createPurchaseOrderConfirmation(PurchaseOrderConfirmationType value) {
        return new PurchaseOrderConfirmation(value);
    }

}
