
package io.dscope.rosettanet.universal.codelist.weighttype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.weighttype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.weighttype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WeightTypeType }
     * 
     */
    public WeightTypeType createWeightTypeType() {
        return new WeightTypeType();
    }

    /**
     * Create an instance of {@link WeightTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WeightTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.00", name = "WeightTypeA")
    public WeightTypeA createWeightTypeA(Object value) {
        return new WeightTypeA(value);
    }

    /**
     * Create an instance of {@link WeightType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WeightType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.00", name = "WeightType", substitutionHeadNamespace = "urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.00", substitutionHeadName = "WeightTypeA")
    public WeightType createWeightType(WeightTypeType value) {
        return new WeightType(value);
    }

}
