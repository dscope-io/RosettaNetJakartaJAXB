
package io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RateTypeType }
     * 
     */
    public RateTypeType createRateTypeType() {
        return new RateTypeType();
    }

    /**
     * Create an instance of {@link RateTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RateTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.00", name = "RateTypeA")
    public RateTypeA createRateTypeA(Object value) {
        return new RateTypeA(value);
    }

    /**
     * Create an instance of {@link RateType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RateType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.00", name = "RateType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.00", substitutionHeadName = "RateTypeA")
    public RateType createRateType(RateTypeType value) {
        return new RateType(value);
    }

}
