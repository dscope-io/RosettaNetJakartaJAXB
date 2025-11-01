
package io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PriorityType }
     * 
     */
    public PriorityType createPriorityType() {
        return new PriorityType();
    }

    /**
     * Create an instance of {@link PriorityA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PriorityA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", name = "PriorityA")
    public PriorityA createPriorityA(Object value) {
        return new PriorityA(value);
    }

    /**
     * Create an instance of {@link Priority }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Priority }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", name = "Priority", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", substitutionHeadName = "PriorityA")
    public Priority createPriority(PriorityType value) {
        return new Priority(value);
    }

}
