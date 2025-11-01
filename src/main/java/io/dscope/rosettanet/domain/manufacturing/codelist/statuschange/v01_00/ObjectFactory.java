
package io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StatusChangeType }
     * 
     */
    public StatusChangeType createStatusChangeType() {
        return new StatusChangeType();
    }

    /**
     * Create an instance of {@link StatusChangeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StatusChangeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.00", name = "StatusChangeA")
    public StatusChangeA createStatusChangeA(Object value) {
        return new StatusChangeA(value);
    }

    /**
     * Create an instance of {@link StatusChange }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StatusChange }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.00", name = "StatusChange", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.00", substitutionHeadName = "StatusChangeA")
    public StatusChange createStatusChange(StatusChangeType value) {
        return new StatusChange(value);
    }

}
