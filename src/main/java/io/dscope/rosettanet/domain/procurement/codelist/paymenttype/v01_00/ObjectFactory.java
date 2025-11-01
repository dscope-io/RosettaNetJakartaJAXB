
package io.dscope.rosettanet.domain.procurement.codelist.paymenttype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.paymenttype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.paymenttype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PaymentTypeType }
     * 
     */
    public PaymentTypeType createPaymentTypeType() {
        return new PaymentTypeType();
    }

    /**
     * Create an instance of {@link PaymentTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PaymentTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PaymentType:xsd:codelist:1.0", name = "PaymentTypeA")
    public PaymentTypeA createPaymentTypeA(Object value) {
        return new PaymentTypeA(value);
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PaymentType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:PaymentType:xsd:codelist:1.0", name = "PaymentType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:PaymentType:xsd:codelist:1.0", substitutionHeadName = "PaymentTypeA")
    public PaymentType createPaymentType(PaymentTypeType value) {
        return new PaymentType(value);
    }

}
