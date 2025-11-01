
package io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FreightPaymentTermsType }
     * 
     */
    public FreightPaymentTermsType createFreightPaymentTermsType() {
        return new FreightPaymentTermsType();
    }

    /**
     * Create an instance of {@link FreightPaymentTermsA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FreightPaymentTermsA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", name = "FreightPaymentTermsA")
    public FreightPaymentTermsA createFreightPaymentTermsA(Object value) {
        return new FreightPaymentTermsA(value);
    }

    /**
     * Create an instance of {@link FreightPaymentTerms }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FreightPaymentTerms }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", name = "FreightPaymentTerms", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", substitutionHeadName = "FreightPaymentTermsA")
    public FreightPaymentTerms createFreightPaymentTerms(FreightPaymentTermsType value) {
        return new FreightPaymentTerms(value);
    }

}
