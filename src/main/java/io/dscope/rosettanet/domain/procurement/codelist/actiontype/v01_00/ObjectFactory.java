
package io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ActionTypeType }
     * 
     */
    public ActionTypeType createActionTypeType() {
        return new ActionTypeType();
    }

    /**
     * Create an instance of {@link ActionTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ActionTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:1.0", name = "ActionTypeA")
    public ActionTypeA createActionTypeA(Object value) {
        return new ActionTypeA(value);
    }

    /**
     * Create an instance of {@link ActionType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ActionType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:1.0", name = "ActionType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:1.0", substitutionHeadName = "ActionTypeA")
    public ActionType createActionType(ActionTypeType value) {
        return new ActionType(value);
    }

}
