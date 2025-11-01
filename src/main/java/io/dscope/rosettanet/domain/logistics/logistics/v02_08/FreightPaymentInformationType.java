
package io.dscope.rosettanet.domain.logistics.logistics.v02_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03.FreightPaymentTerms;
import io.dscope.rosettanet.universal.monetaryexpression.v01_03.FinancialAmountType;


/**
 * <p>Java class for FreightPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightPaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightCharges" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FreightPaymentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03}FreightPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="TaxDutiesAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FreightPaymentInformationType", propOrder = {
    "freightCharges",
    "freightPaymentAccount",
    "freightPaymentTerms",
    "taxDutiesAccount"
})
public class FreightPaymentInformationType {

    @XmlElement(name = "FreightCharges")
    protected FinancialAmountType freightCharges;
    @XmlElement(name = "FreightPaymentAccount")
    protected String freightPaymentAccount;
    @XmlElementRef(name = "FreightPaymentTerms", namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", type = FreightPaymentTerms.class, required = false)
    protected FreightPaymentTerms freightPaymentTerms;
    @XmlElement(name = "TaxDutiesAccount")
    protected String taxDutiesAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightCharges(FinancialAmountType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the freightPaymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightPaymentAccount() {
        return freightPaymentAccount;
    }

    /**
     * Sets the value of the freightPaymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightPaymentAccount(String value) {
        this.freightPaymentAccount = value;
    }

    /**
     * Gets the value of the freightPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public FreightPaymentTerms getFreightPaymentTerms() {
        return freightPaymentTerms;
    }

    /**
     * Sets the value of the freightPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public void setFreightPaymentTerms(FreightPaymentTerms value) {
        this.freightPaymentTerms = value;
    }

    /**
     * Gets the value of the taxDutiesAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxDutiesAccount() {
        return taxDutiesAccount;
    }

    /**
     * Sets the value of the taxDutiesAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxDutiesAccount(String value) {
        this.taxDutiesAccount = value;
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
