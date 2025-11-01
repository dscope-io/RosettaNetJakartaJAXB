
package io.dscope.rosettanet.domain.design.codelist.actioncode.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.actioncode.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.actioncode.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActionCodeType }
     * 
     */
    public ActionCodeType createActionCodeType() {
        return new ActionCodeType();
    }

    /**
     * Create an instance of {@link ActionCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ActionCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01", name = "ActionCodeA")
    public ActionCodeA createActionCodeA(Object value) {
        return new ActionCodeA(value);
    }

    /**
     * Create an instance of {@link ActionCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ActionCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01", name = "ActionCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01", substitutionHeadName = "ActionCodeA")
    public ActionCode createActionCode(ActionCodeType value) {
        return new ActionCode(value);
    }

}
