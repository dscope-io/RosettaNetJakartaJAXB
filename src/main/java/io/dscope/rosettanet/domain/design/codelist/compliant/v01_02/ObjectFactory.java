
package io.dscope.rosettanet.domain.design.codelist.compliant.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.compliant.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.compliant.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CompliantType }
     * 
     */
    public CompliantType createCompliantType() {
        return new CompliantType();
    }

    /**
     * Create an instance of {@link CompliantA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CompliantA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.02", name = "CompliantA")
    public CompliantA createCompliantA(Object value) {
        return new CompliantA(value);
    }

    /**
     * Create an instance of {@link Compliant }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Compliant }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.02", name = "Compliant", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.02", substitutionHeadName = "CompliantA")
    public Compliant createCompliant(CompliantType value) {
        return new Compliant(value);
    }

}
