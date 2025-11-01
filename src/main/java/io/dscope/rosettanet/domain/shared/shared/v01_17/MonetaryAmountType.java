
package io.dscope.rosettanet.domain.shared.shared.v01_17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_03.AmountType;
import io.dscope.rosettanet.domain.shared.codelist.invoicechargetype.v01_02.InvoiceChargeType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmount;


/**
 * <p>Java class for MonetaryAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonetaryAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.03}AmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02}InvoiceChargeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01}MonetaryAmountType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonetaryAmountType", propOrder = {
    "amountType",
    "financialAmount",
    "invoiceChargeType",
    "monetaryAmountType"
})
public class MonetaryAmountType {

    @XmlElementRef(name = "AmountType", namespace = "urn:rosettanet:specification:domain:Shared:AmountType:xsd:codelist:01.03", type = AmountType.class, required = false)
    protected AmountType amountType;
    @XmlElementRef(name = "FinancialAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06", type = FinancialAmount.class)
    protected FinancialAmount financialAmount;
    @XmlElementRef(name = "InvoiceChargeType", namespace = "urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.02", type = InvoiceChargeType.class, required = false)
    protected InvoiceChargeType invoiceChargeType;
    @XmlElementRef(name = "MonetaryAmountType", namespace = "urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01", type = io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType.class, required = false)
    protected io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType monetaryAmountType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the amountType property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getAmountType() {
        return amountType;
    }

    /**
     * Sets the value of the amountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setAmountType(AmountType value) {
        this.amountType = value;
    }

    /**
     * Gets the value of the financialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmount }
     *     
     */
    public FinancialAmount getFinancialAmount() {
        return financialAmount;
    }

    /**
     * Sets the value of the financialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmount }
     *     
     */
    public void setFinancialAmount(FinancialAmount value) {
        this.financialAmount = value;
    }

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
     *     {@link io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType }
     *     
     */
    public io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType getMonetaryAmountType() {
        return monetaryAmountType;
    }

    /**
     * Sets the value of the monetaryAmountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType }
     *     
     */
    public void setMonetaryAmountType(io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountType value) {
        this.monetaryAmountType = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
