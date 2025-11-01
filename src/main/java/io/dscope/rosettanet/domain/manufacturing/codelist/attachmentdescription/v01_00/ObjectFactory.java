
package io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AttachmentDescriptionType }
     * 
     */
    public AttachmentDescriptionType createAttachmentDescriptionType() {
        return new AttachmentDescriptionType();
    }

    /**
     * Create an instance of {@link AttachmentDescriptionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AttachmentDescriptionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:1.0", name = "AttachmentDescriptionA")
    public AttachmentDescriptionA createAttachmentDescriptionA(Object value) {
        return new AttachmentDescriptionA(value);
    }

    /**
     * Create an instance of {@link AttachmentDescription }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AttachmentDescription }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:1.0", name = "AttachmentDescription", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:1.0", substitutionHeadName = "AttachmentDescriptionA")
    public AttachmentDescription createAttachmentDescription(AttachmentDescriptionType value) {
        return new AttachmentDescription(value);
    }

}
