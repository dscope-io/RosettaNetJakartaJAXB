
package io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PCMParmTypeType }
     * 
     */
    public PCMParmTypeType createPCMParmTypeType() {
        return new PCMParmTypeType();
    }

    /**
     * Create an instance of {@link PCMParmTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PCMParmTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:PCMParmType:xsd:codelist:01.03", name = "PCMParmTypeA")
    public PCMParmTypeA createPCMParmTypeA(Object value) {
        return new PCMParmTypeA(value);
    }

    /**
     * Create an instance of {@link PCMParmType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PCMParmType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:PCMParmType:xsd:codelist:01.03", name = "PCMParmType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:PCMParmType:xsd:codelist:01.03", substitutionHeadName = "PCMParmTypeA")
    public PCMParmType createPCMParmType(PCMParmTypeType value) {
        return new PCMParmType(value);
    }

}
