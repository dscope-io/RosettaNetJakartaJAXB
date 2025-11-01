
package io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IncotermsType }
     * 
     */
    public IncotermsType createIncotermsType() {
        return new IncotermsType();
    }

    /**
     * Create an instance of {@link IncotermsA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link IncotermsA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", name = "IncotermsA")
    public IncotermsA createIncotermsA(Object value) {
        return new IncotermsA(value);
    }

    /**
     * Create an instance of {@link Incoterms }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Incoterms }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", name = "Incoterms", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", substitutionHeadName = "IncotermsA")
    public Incoterms createIncoterms(IncotermsType value) {
        return new Incoterms(value);
    }

}
