
package io.dscope.rosettanet.domain.design.codelist.abccode.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.abccode.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.abccode.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ABCCodeType }
     * 
     */
    public ABCCodeType createABCCodeType() {
        return new ABCCodeType();
    }

    /**
     * Create an instance of {@link ABCCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ABCCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", name = "ABCCodeA")
    public ABCCodeA createABCCodeA(Object value) {
        return new ABCCodeA(value);
    }

    /**
     * Create an instance of {@link ABCCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ABCCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", name = "ABCCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", substitutionHeadName = "ABCCodeA")
    public ABCCode createABCCode(ABCCodeType value) {
        return new ABCCode(value);
    }

}
