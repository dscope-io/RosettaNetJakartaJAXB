
package io.dscope.rosettanet.interchange.quoterequest.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.quotestatus.v01_03.QuoteStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.CustomerInformationType;


/**
 * <p>Java class for QuoteCustomerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteCustomerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}CustomerInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03}QuoteStatus"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteCustomerInformationType", propOrder = {
    "quoteStatus"
})
public class QuoteCustomerInformationType
    extends CustomerInformationType
{

    @XmlElementRef(name = "QuoteStatus", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.03", type = QuoteStatus.class)
    protected QuoteStatus quoteStatus;

    /**
     * Gets the value of the quoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteStatus }
     *     
     */
    public QuoteStatus getQuoteStatus() {
        return quoteStatus;
    }

    /**
     * Sets the value of the quoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteStatus }
     *     
     */
    public void setQuoteStatus(QuoteStatus value) {
        this.quoteStatus = value;
    }

}
