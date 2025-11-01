
package io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpecialHandlingType }
     * 
     */
    public SpecialHandlingType createSpecialHandlingType() {
        return new SpecialHandlingType();
    }

    /**
     * Create an instance of {@link SpecialHandlingA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecialHandlingA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.04", name = "SpecialHandlingA")
    public SpecialHandlingA createSpecialHandlingA(Object value) {
        return new SpecialHandlingA(value);
    }

    /**
     * Create an instance of {@link SpecialHandling }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecialHandling }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.04", name = "SpecialHandling", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.04", substitutionHeadName = "SpecialHandlingA")
    public SpecialHandling createSpecialHandling(SpecialHandlingType value) {
        return new SpecialHandling(value);
    }

}
