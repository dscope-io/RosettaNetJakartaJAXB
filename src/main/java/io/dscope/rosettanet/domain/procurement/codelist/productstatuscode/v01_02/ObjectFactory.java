
package io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductStatusCodeType }
     * 
     */
    public ProductStatusCodeType createProductStatusCodeType() {
        return new ProductStatusCodeType();
    }

    /**
     * Create an instance of {@link ProductStatusCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductStatusCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:01.02", name = "ProductStatusCodeA")
    public ProductStatusCodeA createProductStatusCodeA(Object value) {
        return new ProductStatusCodeA(value);
    }

    /**
     * Create an instance of {@link ProductStatusCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductStatusCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:01.02", name = "ProductStatusCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:01.02", substitutionHeadName = "ProductStatusCodeA")
    public ProductStatusCode createProductStatusCode(ProductStatusCodeType value) {
        return new ProductStatusCode(value);
    }

}
