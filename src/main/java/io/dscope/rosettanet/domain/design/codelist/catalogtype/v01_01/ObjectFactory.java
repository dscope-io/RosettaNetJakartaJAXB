
package io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CatalogTypeType }
     * 
     */
    public CatalogTypeType createCatalogTypeType() {
        return new CatalogTypeType();
    }

    /**
     * Create an instance of {@link CatalogTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CatalogTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01", name = "CatalogTypeA")
    public CatalogTypeA createCatalogTypeA(Object value) {
        return new CatalogTypeA(value);
    }

    /**
     * Create an instance of {@link CatalogType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CatalogType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01", name = "CatalogType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.01", substitutionHeadName = "CatalogTypeA")
    public CatalogType createCatalogType(CatalogTypeType value) {
        return new CatalogType(value);
    }

}
