
package io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileTransmissionType }
     * 
     */
    public FileTransmissionType createFileTransmissionType() {
        return new FileTransmissionType();
    }

    /**
     * Create an instance of {@link FileTransmissionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FileTransmissionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", name = "FileTransmissionA")
    public FileTransmissionA createFileTransmissionA(Object value) {
        return new FileTransmissionA(value);
    }

    /**
     * Create an instance of {@link FileTransmission }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FileTransmission }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", name = "FileTransmission", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", substitutionHeadName = "FileTransmissionA")
    public FileTransmission createFileTransmission(FileTransmissionType value) {
        return new FileTransmission(value);
    }

}
