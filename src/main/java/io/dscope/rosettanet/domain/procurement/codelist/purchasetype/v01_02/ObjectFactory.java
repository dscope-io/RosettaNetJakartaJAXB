
package io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseTypeType }
     * 
     */
    public PurchaseTypeType createPurchaseTypeType() {
        return new PurchaseTypeType();
    }

    /**
     * Create an instance of {@link PurchaseTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.02", name = "PurchaseTypeA")
    public PurchaseTypeA createPurchaseTypeA(Object value) {
        return new PurchaseTypeA(value);
    }

    /**
     * Create an instance of {@link PurchaseType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.02", name = "PurchaseType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.02", substitutionHeadName = "PurchaseTypeA")
    public PurchaseType createPurchaseType(PurchaseTypeType value) {
        return new PurchaseType(value);
    }

}
