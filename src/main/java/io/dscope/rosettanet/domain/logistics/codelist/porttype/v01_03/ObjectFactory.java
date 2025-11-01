
package io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.porttype.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PortTypeType }
     * 
     */
    public PortTypeType createPortTypeType() {
        return new PortTypeType();
    }

    /**
     * Create an instance of {@link PortTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PortTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:01.03", name = "PortTypeA")
    public PortTypeA createPortTypeA(Object value) {
        return new PortTypeA(value);
    }

    /**
     * Create an instance of {@link PortType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PortType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:01.03", name = "PortType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:PortType:xsd:codelist:01.03", substitutionHeadName = "PortTypeA")
    public PortType createPortType(PortTypeType value) {
        return new PortType(value);
    }

}
