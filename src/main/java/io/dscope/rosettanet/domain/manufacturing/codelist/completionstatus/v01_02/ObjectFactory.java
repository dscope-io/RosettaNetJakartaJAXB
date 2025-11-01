
package io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompletionStatusType }
     * 
     */
    public CompletionStatusType createCompletionStatusType() {
        return new CompletionStatusType();
    }

    /**
     * Create an instance of {@link CompletionStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CompletionStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02", name = "CompletionStatusA")
    public CompletionStatusA createCompletionStatusA(Object value) {
        return new CompletionStatusA(value);
    }

    /**
     * Create an instance of {@link CompletionStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CompletionStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02", name = "CompletionStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02", substitutionHeadName = "CompletionStatusA")
    public CompletionStatus createCompletionStatus(CompletionStatusType value) {
        return new CompletionStatus(value);
    }

}
