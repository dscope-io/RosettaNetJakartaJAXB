
package io.dscope.rosettanet.interchange.purchaseordercancellationrequestnotification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.purchaseordercancellationrequestnotification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.purchaseordercancellationrequestnotification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderCancellationRequestType }
     * 
     */
    public PurchaseOrderCancellationRequestType createPurchaseOrderCancellationRequestType() {
        return new PurchaseOrderCancellationRequestType();
    }

    /**
     * Create an instance of {@link PurchaseOrderCancellationType }
     * 
     */
    public PurchaseOrderCancellationType createPurchaseOrderCancellationType() {
        return new PurchaseOrderCancellationType();
    }

    /**
     * Create an instance of {@link PurchaseOrderCancellationRequest }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderCancellationRequest }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PurchaseOrderCancellationRequestNotification:xsd:schema:01.00", name = "PurchaseOrderCancellationRequest")
    public PurchaseOrderCancellationRequest createPurchaseOrderCancellationRequest(PurchaseOrderCancellationRequestType value) {
        return new PurchaseOrderCancellationRequest(value);
    }

}
