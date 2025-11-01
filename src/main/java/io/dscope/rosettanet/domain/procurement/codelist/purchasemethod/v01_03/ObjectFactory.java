
package io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseMethodType }
     * 
     */
    public PurchaseMethodType createPurchaseMethodType() {
        return new PurchaseMethodType();
    }

    /**
     * Create an instance of {@link PurchaseMethodA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseMethodA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03", name = "PurchaseMethodA")
    public PurchaseMethodA createPurchaseMethodA(Object value) {
        return new PurchaseMethodA(value);
    }

    /**
     * Create an instance of {@link PurchaseMethod }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseMethod }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03", name = "PurchaseMethod", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03", substitutionHeadName = "PurchaseMethodA")
    public PurchaseMethod createPurchaseMethod(PurchaseMethodType value) {
        return new PurchaseMethod(value);
    }

}
