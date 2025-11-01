
package io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.failuremodifier.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FailureModifierType }
     * 
     */
    public FailureModifierType createFailureModifierType() {
        return new FailureModifierType();
    }

    /**
     * Create an instance of {@link FailureModifierA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureModifierA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", name = "FailureModifierA")
    public FailureModifierA createFailureModifierA(Object value) {
        return new FailureModifierA(value);
    }

    /**
     * Create an instance of {@link FailureModifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FailureModifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", name = "FailureModifier", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:FailureModifier:xsd:codelist:01.02", substitutionHeadName = "FailureModifierA")
    public FailureModifier createFailureModifier(FailureModifierType value) {
        return new FailureModifier(value);
    }

}
