
package io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuoteStatusType }
     * 
     */
    public QuoteStatusType createQuoteStatusType() {
        return new QuoteStatusType();
    }

    /**
     * Create an instance of {@link QuoteStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03", name = "QuoteStatusA")
    public QuoteStatusA createQuoteStatusA(Object value) {
        return new QuoteStatusA(value);
    }

    /**
     * Create an instance of {@link QuoteStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuoteStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03", name = "QuoteStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03", substitutionHeadName = "QuoteStatusA")
    public QuoteStatus createQuoteStatus(QuoteStatusType value) {
        return new QuoteStatus(value);
    }

}
