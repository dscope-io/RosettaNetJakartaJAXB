
package io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TPIRFileTypeType }
     * 
     */
    public TPIRFileTypeType createTPIRFileTypeType() {
        return new TPIRFileTypeType();
    }

    /**
     * Create an instance of {@link TPIRFileTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TPIRFileTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.01", name = "TPIRFileTypeA")
    public TPIRFileTypeA createTPIRFileTypeA(Object value) {
        return new TPIRFileTypeA(value);
    }

    /**
     * Create an instance of {@link TPIRFileType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TPIRFileType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.01", name = "TPIRFileType", substitutionHeadNamespace = "urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.01", substitutionHeadName = "TPIRFileTypeA")
    public TPIRFileType createTPIRFileType(TPIRFileTypeType value) {
        return new TPIRFileType(value);
    }

}
