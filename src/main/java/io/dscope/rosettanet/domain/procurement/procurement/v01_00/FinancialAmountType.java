
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.invoicechargetype.v01_00.InvoiceChargeType;
import io.dscope.rosettanet.domain.procurement.codelist.monetaryamounttype.v01_00.MonetaryAmountType;


/**
 * <p>Java class for FinancialAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancialAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}FinancialAmountType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0}InvoiceChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:1.0}MonetaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinancialAmountType", propOrder = {
    "invoiceChargeType",
    "monetaryAmountType"
})
public class FinancialAmountType
    extends io.dscope.rosettanet.universal.monetaryexpression.v01_00.FinancialAmountType
{

    @XmlElementRef(name = "InvoiceChargeType", namespace = "urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0", type = InvoiceChargeType.class, required = false)
    protected InvoiceChargeType invoiceChargeType;
    @XmlElementRef(name = "MonetaryAmountType", namespace = "urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:1.0", type = MonetaryAmountType.class, required = false)
    protected MonetaryAmountType monetaryAmountType;

    /**
     * Gets the value of the invoiceChargeType property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceChargeType }
     *     
     */
    public InvoiceChargeType getInvoiceChargeType() {
        return invoiceChargeType;
    }

    /**
     * Sets the value of the invoiceChargeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceChargeType }
     *     
     */
    public void setInvoiceChargeType(InvoiceChargeType value) {
        this.invoiceChargeType = value;
    }

    /**
     * Gets the value of the monetaryAmountType property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getMonetaryAmountType() {
        return monetaryAmountType;
    }

    /**
     * Sets the value of the monetaryAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setMonetaryAmountType(MonetaryAmountType value) {
        this.monetaryAmountType = value;
    }

}
