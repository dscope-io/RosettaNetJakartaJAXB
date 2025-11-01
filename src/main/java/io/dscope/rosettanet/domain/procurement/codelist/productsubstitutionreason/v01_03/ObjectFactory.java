
package io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductSubstitutionReasonType }
     * 
     */
    public ProductSubstitutionReasonType createProductSubstitutionReasonType() {
        return new ProductSubstitutionReasonType();
    }

    /**
     * Create an instance of {@link ProductSubstitutionReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductSubstitutionReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03", name = "ProductSubstitutionReasonA")
    public ProductSubstitutionReasonA createProductSubstitutionReasonA(Object value) {
        return new ProductSubstitutionReasonA(value);
    }

    /**
     * Create an instance of {@link ProductSubstitutionReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductSubstitutionReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03", name = "ProductSubstitutionReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03", substitutionHeadName = "ProductSubstitutionReasonA")
    public ProductSubstitutionReason createProductSubstitutionReason(ProductSubstitutionReasonType value) {
        return new ProductSubstitutionReason(value);
    }

}
