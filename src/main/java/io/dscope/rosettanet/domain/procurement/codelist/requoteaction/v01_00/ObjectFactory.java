
package io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequoteActionType }
     * 
     */
    public RequoteActionType createRequoteActionType() {
        return new RequoteActionType();
    }

    /**
     * Create an instance of {@link RequoteActionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequoteActionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:1.0", name = "RequoteActionA")
    public RequoteActionA createRequoteActionA(Object value) {
        return new RequoteActionA(value);
    }

    /**
     * Create an instance of {@link RequoteAction }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequoteAction }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:1.0", name = "RequoteAction", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:1.0", substitutionHeadName = "RequoteActionA")
    public RequoteAction createRequoteAction(RequoteActionType value) {
        return new RequoteAction(value);
    }

}
