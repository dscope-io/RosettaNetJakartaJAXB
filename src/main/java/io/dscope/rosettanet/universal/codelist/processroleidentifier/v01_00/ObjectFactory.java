
package io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessRoleIdentifierType }
     * 
     */
    public ProcessRoleIdentifierType createProcessRoleIdentifierType() {
        return new ProcessRoleIdentifierType();
    }

    /**
     * Create an instance of {@link ProcessRoleIdentifierA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProcessRoleIdentifierA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:1.0", name = "ProcessRoleIdentifierA")
    public ProcessRoleIdentifierA createProcessRoleIdentifierA(Object value) {
        return new ProcessRoleIdentifierA(value);
    }

    /**
     * Create an instance of {@link ProcessRoleIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProcessRoleIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:1.0", name = "ProcessRoleIdentifier", substitutionHeadNamespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:1.0", substitutionHeadName = "ProcessRoleIdentifierA")
    public ProcessRoleIdentifier createProcessRoleIdentifier(ProcessRoleIdentifierType value) {
        return new ProcessRoleIdentifier(value);
    }

}
