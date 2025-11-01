
package io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderFillPriorityType }
     * 
     */
    public PurchaseOrderFillPriorityType createPurchaseOrderFillPriorityType() {
        return new PurchaseOrderFillPriorityType();
    }

    /**
     * Create an instance of {@link PurchaseOrderFillPriorityA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderFillPriorityA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", name = "PurchaseOrderFillPriorityA")
    public PurchaseOrderFillPriorityA createPurchaseOrderFillPriorityA(Object value) {
        return new PurchaseOrderFillPriorityA(value);
    }

    /**
     * Create an instance of {@link PurchaseOrderFillPriority }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderFillPriority }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", name = "PurchaseOrderFillPriority", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", substitutionHeadName = "PurchaseOrderFillPriorityA")
    public PurchaseOrderFillPriority createPurchaseOrderFillPriority(PurchaseOrderFillPriorityType value) {
        return new PurchaseOrderFillPriority(value);
    }

}
