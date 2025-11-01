
package io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RawWaferTypeType }
     * 
     */
    public RawWaferTypeType createRawWaferTypeType() {
        return new RawWaferTypeType();
    }

    /**
     * Create an instance of {@link RawWaferTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RawWaferTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03", name = "RawWaferTypeA")
    public RawWaferTypeA createRawWaferTypeA(Object value) {
        return new RawWaferTypeA(value);
    }

    /**
     * Create an instance of {@link RawWaferType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RawWaferType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03", name = "RawWaferType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03", substitutionHeadName = "RawWaferTypeA")
    public RawWaferType createRawWaferType(RawWaferTypeType value) {
        return new RawWaferType(value);
    }

}
