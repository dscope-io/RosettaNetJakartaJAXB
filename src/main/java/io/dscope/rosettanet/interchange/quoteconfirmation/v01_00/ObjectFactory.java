
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.quoteconfirmation.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.quoteconfirmation.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteConfirmationType }
     * 
     */
    public QuoteConfirmationType createQuoteConfirmationType() {
        return new QuoteConfirmationType();
    }

    /**
     * Create an instance of {@link CompetitorReferenceType }
     * 
     */
    public CompetitorReferenceType createCompetitorReferenceType() {
        return new CompetitorReferenceType();
    }

    /**
     * Create an instance of {@link OrderLeadTimeType }
     * 
     */
    public OrderLeadTimeType createOrderLeadTimeType() {
        return new OrderLeadTimeType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link QuoteType }
     * 
     */
    public QuoteType createQuoteType() {
        return new QuoteType();
    }

    /**
     * Create an instance of {@link QuoteCustomerInformationType }
     * 
     */
    public QuoteCustomerInformationType createQuoteCustomerInformationType() {
        return new QuoteCustomerInformationType();
    }

    /**
     * Create an instance of {@link QuoteLineItemType }
     * 
     */
    public QuoteLineItemType createQuoteLineItemType() {
        return new QuoteLineItemType();
    }

    /**
     * Create an instance of {@link QuoteQuantityType }
     * 
     */
    public QuoteQuantityType createQuoteQuantityType() {
        return new QuoteQuantityType();
    }

    /**
     * Create an instance of {@link RequoteLineStatusType }
     * 
     */
    public RequoteLineStatusType createRequoteLineStatusType() {
        return new RequoteLineStatusType();
    }

    /**
     * Create an instance of {@link ServiceLineItemType }
     * 
     */
    public ServiceLineItemType createServiceLineItemType() {
        return new ServiceLineItemType();
    }

    /**
     * Create an instance of {@link ServiceLineItemByOptionType }
     * 
     */
    public ServiceLineItemByOptionType createServiceLineItemByOptionType() {
        return new ServiceLineItemByOptionType();
    }

    /**
     * Create an instance of {@link TermsAndConditionsType }
     * 
     */
    public TermsAndConditionsType createTermsAndConditionsType() {
        return new TermsAndConditionsType();
    }

    /**
     * Create an instance of {@link TransportationScheduleType }
     * 
     */
    public TransportationScheduleType createTransportationScheduleType() {
        return new TransportationScheduleType();
    }

    /**
     * Create an instance of {@link QuoteConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00", name = "QuoteConfirmation")
    public QuoteConfirmation createQuoteConfirmation(QuoteConfirmationType value) {
        return new QuoteConfirmation(value);
    }

}
