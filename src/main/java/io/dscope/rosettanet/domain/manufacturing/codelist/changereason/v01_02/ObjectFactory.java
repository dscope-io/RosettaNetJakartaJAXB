
package io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ChangeReasonType }
     * 
     */
    public ChangeReasonType createChangeReasonType() {
        return new ChangeReasonType();
    }

    /**
     * Create an instance of {@link ChangeReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ChangeReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.02", name = "ChangeReasonA")
    public ChangeReasonA createChangeReasonA(Object value) {
        return new ChangeReasonA(value);
    }

    /**
     * Create an instance of {@link ChangeReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ChangeReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.02", name = "ChangeReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.02", substitutionHeadName = "ChangeReasonA")
    public ChangeReason createChangeReason(ChangeReasonType value) {
        return new ChangeReason(value);
    }

}
