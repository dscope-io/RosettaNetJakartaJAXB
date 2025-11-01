
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderStatusType }
     * 
     */
    public PurchaseOrderStatusType createPurchaseOrderStatusType() {
        return new PurchaseOrderStatusType();
    }

    /**
     * Create an instance of {@link PurchaseOrderStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02", name = "PurchaseOrderStatusA")
    public PurchaseOrderStatusA createPurchaseOrderStatusA(Object value) {
        return new PurchaseOrderStatusA(value);
    }

    /**
     * Create an instance of {@link PurchaseOrderStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02", name = "PurchaseOrderStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02", substitutionHeadName = "PurchaseOrderStatusA")
    public PurchaseOrderStatus createPurchaseOrderStatus(PurchaseOrderStatusType value) {
        return new PurchaseOrderStatus(value);
    }

}
