
package io.dscope.rosettanet.domain.logistics.codelist.markuptype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.markuptype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.markuptype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MarkUpTypeType }
     * 
     */
    public MarkUpTypeType createMarkUpTypeType() {
        return new MarkUpTypeType();
    }

    /**
     * Create an instance of {@link MarkUpTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MarkUpTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:MarkUpType:xsd:codelist:01.00", name = "MarkUpTypeA")
    public MarkUpTypeA createMarkUpTypeA(Object value) {
        return new MarkUpTypeA(value);
    }

    /**
     * Create an instance of {@link MarkUpType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MarkUpType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:MarkUpType:xsd:codelist:01.00", name = "MarkUpType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:MarkUpType:xsd:codelist:01.00", substitutionHeadName = "MarkUpTypeA")
    public MarkUpType createMarkUpType(MarkUpTypeType value) {
        return new MarkUpType(value);
    }

}
