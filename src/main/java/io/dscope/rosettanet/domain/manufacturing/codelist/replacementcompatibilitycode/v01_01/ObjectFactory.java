
package io.dscope.rosettanet.domain.manufacturing.codelist.replacementcompatibilitycode.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.replacementcompatibilitycode.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.replacementcompatibilitycode.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReplacementCompatibilityCodeType }
     * 
     */
    public ReplacementCompatibilityCodeType createReplacementCompatibilityCodeType() {
        return new ReplacementCompatibilityCodeType();
    }

    /**
     * Create an instance of {@link ReplacementCompatibilityCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReplacementCompatibilityCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:ReplacementCompatibilityCode:xsd:codelist:01.01", name = "ReplacementCompatibilityCodeA")
    public ReplacementCompatibilityCodeA createReplacementCompatibilityCodeA(Object value) {
        return new ReplacementCompatibilityCodeA(value);
    }

    /**
     * Create an instance of {@link ReplacementCompatibilityCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReplacementCompatibilityCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:ReplacementCompatibilityCode:xsd:codelist:01.01", name = "ReplacementCompatibilityCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:ReplacementCompatibilityCode:xsd:codelist:01.01", substitutionHeadName = "ReplacementCompatibilityCodeA")
    public ReplacementCompatibilityCode createReplacementCompatibilityCode(ReplacementCompatibilityCodeType value) {
        return new ReplacementCompatibilityCode(value);
    }

}
