
package io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.productreturnreason.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductReturnReasonType }
     * 
     */
    public ProductReturnReasonType createProductReturnReasonType() {
        return new ProductReturnReasonType();
    }

    /**
     * Create an instance of {@link ProductReturnReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductReturnReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02", name = "ProductReturnReasonA")
    public ProductReturnReasonA createProductReturnReasonA(Object value) {
        return new ProductReturnReasonA(value);
    }

    /**
     * Create an instance of {@link ProductReturnReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductReturnReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02", name = "ProductReturnReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:ProductReturnReason:xsd:codelist:01.02", substitutionHeadName = "ProductReturnReasonA")
    public ProductReturnReason createProductReturnReason(ProductReturnReasonType value) {
        return new ProductReturnReason(value);
    }

}
