
package io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingDocumentType }
     * 
     */
    public ShippingDocumentType createShippingDocumentType() {
        return new ShippingDocumentType();
    }

    /**
     * Create an instance of {@link ShippingDocumentA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingDocumentA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.01", name = "ShippingDocumentA")
    public ShippingDocumentA createShippingDocumentA(Object value) {
        return new ShippingDocumentA(value);
    }

    /**
     * Create an instance of {@link ShippingDocument }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingDocument }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.01", name = "ShippingDocument", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.01", substitutionHeadName = "ShippingDocumentA")
    public ShippingDocument createShippingDocument(ShippingDocumentType value) {
        return new ShippingDocument(value);
    }

}
