
package io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AmountTypeType }
     * 
     */
    public AmountTypeType createAmountTypeType() {
        return new AmountTypeType();
    }

    /**
     * Create an instance of {@link AmountTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AmountTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.01", name = "AmountTypeA")
    public AmountTypeA createAmountTypeA(Object value) {
        return new AmountTypeA(value);
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AmountType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.01", name = "AmountType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.01", substitutionHeadName = "AmountTypeA")
    public AmountType createAmountType(AmountTypeType value) {
        return new AmountType(value);
    }

}
