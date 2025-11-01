
package io.dscope.rosettanet.interchange.codelist.parttype.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.parttype.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.parttype.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PartTypeType }
     * 
     */
    public PartTypeType createPartTypeType() {
        return new PartTypeType();
    }

    /**
     * Create an instance of {@link PartTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PartTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", name = "PartTypeA")
    public PartTypeA createPartTypeA(Object value) {
        return new PartTypeA(value);
    }

    /**
     * Create an instance of {@link PartType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PartType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", name = "PartType", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", substitutionHeadName = "PartTypeA")
    public PartType createPartType(PartTypeType value) {
        return new PartType(value);
    }

}
