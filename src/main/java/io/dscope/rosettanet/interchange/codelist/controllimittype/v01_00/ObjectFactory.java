
package io.dscope.rosettanet.interchange.codelist.controllimittype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.controllimittype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.controllimittype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ControlLimitTypeType }
     * 
     */
    public ControlLimitTypeType createControlLimitTypeType() {
        return new ControlLimitTypeType();
    }

    /**
     * Create an instance of {@link ControlLimitTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ControlLimitTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ControlLimitType:xsd:codelist:1.0", name = "ControlLimitTypeA")
    public ControlLimitTypeA createControlLimitTypeA(Object value) {
        return new ControlLimitTypeA(value);
    }

    /**
     * Create an instance of {@link ControlLimitType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ControlLimitType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ControlLimitType:xsd:codelist:1.0", name = "ControlLimitType", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:ControlLimitType:xsd:codelist:1.0", substitutionHeadName = "ControlLimitTypeA")
    public ControlLimitType createControlLimitType(ControlLimitTypeType value) {
        return new ControlLimitType(value);
    }

}
