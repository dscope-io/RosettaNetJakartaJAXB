
package io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteAcknowledgmentReasonType }
     * 
     */
    public QuoteAcknowledgmentReasonType createQuoteAcknowledgmentReasonType() {
        return new QuoteAcknowledgmentReasonType();
    }

    /**
     * Create an instance of {@link QuoteAcknowledgmentReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteAcknowledgmentReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", name = "QuoteAcknowledgmentReasonA")
    public QuoteAcknowledgmentReasonA createQuoteAcknowledgmentReasonA(Object value) {
        return new QuoteAcknowledgmentReasonA(value);
    }

    /**
     * Create an instance of {@link QuoteAcknowledgmentReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteAcknowledgmentReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", name = "QuoteAcknowledgmentReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", substitutionHeadName = "QuoteAcknowledgmentReasonA")
    public QuoteAcknowledgmentReason createQuoteAcknowledgmentReason(QuoteAcknowledgmentReasonType value) {
        return new QuoteAcknowledgmentReason(value);
    }

}
