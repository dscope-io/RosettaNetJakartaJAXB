
package io.dscope.rosettanet.universal.document.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.document.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.document.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BusinessDocumentReferenceType }
     * 
     */
    public BusinessDocumentReferenceType createBusinessDocumentReferenceType() {
        return new BusinessDocumentReferenceType();
    }

    /**
     * Create an instance of {@link BusinessDocumentReference }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link BusinessDocumentReference }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.03", name = "BusinessDocumentReference")
    public BusinessDocumentReference createBusinessDocumentReference(BusinessDocumentReferenceType value) {
        return new BusinessDocumentReference(value);
    }

}
