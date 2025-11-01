
package io.dscope.rosettanet.interchange.codelist.productterms.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.productterms.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.productterms.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductTermsType }
     * 
     */
    public ProductTermsType createProductTermsType() {
        return new ProductTermsType();
    }

    /**
     * Create an instance of {@link ProductTermsA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductTermsA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.00", name = "ProductTermsA")
    public ProductTermsA createProductTermsA(Object value) {
        return new ProductTermsA(value);
    }

    /**
     * Create an instance of {@link ProductTerms }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductTerms }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.00", name = "ProductTerms", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.00", substitutionHeadName = "ProductTermsA")
    public ProductTerms createProductTerms(ProductTermsType value) {
        return new ProductTerms(value);
    }

}
