
package io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MimeTypeQualifierType }
     * 
     */
    public MimeTypeQualifierType createMimeTypeQualifierType() {
        return new MimeTypeQualifierType();
    }

    /**
     * Create an instance of {@link MimeTypeQualifierA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MimeTypeQualifierA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", name = "MimeTypeQualifierA")
    public MimeTypeQualifierA createMimeTypeQualifierA(Object value) {
        return new MimeTypeQualifierA(value);
    }

    /**
     * Create an instance of {@link MimeTypeQualifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MimeTypeQualifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", name = "MimeTypeQualifier", substitutionHeadNamespace = "urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", substitutionHeadName = "MimeTypeQualifierA")
    public MimeTypeQualifier createMimeTypeQualifier(MimeTypeQualifierType value) {
        return new MimeTypeQualifier(value);
    }

}
