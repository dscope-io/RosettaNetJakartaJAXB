
package io.dscope.rosettanet.domain.logistics.codelist.partstatus.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.partstatus.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.partstatus.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartStatusType }
     * 
     */
    public PartStatusType createPartStatusType() {
        return new PartStatusType();
    }

    /**
     * Create an instance of {@link PartStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PartStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:PartStatus:xsd:codelist:01.00", name = "PartStatusA")
    public PartStatusA createPartStatusA(Object value) {
        return new PartStatusA(value);
    }

    /**
     * Create an instance of {@link PartStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PartStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:PartStatus:xsd:codelist:01.00", name = "PartStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:PartStatus:xsd:codelist:01.00", substitutionHeadName = "PartStatusA")
    public PartStatus createPartStatus(PartStatusType value) {
        return new PartStatus(value);
    }

}
