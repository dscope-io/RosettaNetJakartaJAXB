
package io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MonetaryAmountTypeType }
     * 
     */
    public MonetaryAmountTypeType createMonetaryAmountTypeType() {
        return new MonetaryAmountTypeType();
    }

    /**
     * Create an instance of {@link MonetaryAmountTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MonetaryAmountTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.00", name = "MonetaryAmountTypeA")
    public MonetaryAmountTypeA createMonetaryAmountTypeA(Object value) {
        return new MonetaryAmountTypeA(value);
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MonetaryAmountType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.00", name = "MonetaryAmountType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.00", substitutionHeadName = "MonetaryAmountTypeA")
    public MonetaryAmountType createMonetaryAmountType(MonetaryAmountTypeType value) {
        return new MonetaryAmountType(value);
    }

}
