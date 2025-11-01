
package io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.markside.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarkSideType }
     * 
     */
    public MarkSideType createMarkSideType() {
        return new MarkSideType();
    }

    /**
     * Create an instance of {@link MarkSideA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MarkSideA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:1.0", name = "MarkSideA")
    public MarkSideA createMarkSideA(Object value) {
        return new MarkSideA(value);
    }

    /**
     * Create an instance of {@link MarkSide }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MarkSide }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:1.0", name = "MarkSide", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:MarkSide:xsd:codelist:1.0", substitutionHeadName = "MarkSideA")
    public MarkSide createMarkSide(MarkSideType value) {
        return new MarkSide(value);
    }

}
