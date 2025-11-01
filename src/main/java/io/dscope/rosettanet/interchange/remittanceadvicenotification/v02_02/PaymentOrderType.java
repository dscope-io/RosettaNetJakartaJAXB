
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.AccountDescriptionType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;


/**
 * <p>Java class for PaymentOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BankTraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="TotalRemittanceAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType"/&gt;
 *         &lt;element name="TransferFrom" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AccountDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TransferTo" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AccountDescriptionType"/&gt;
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
@XmlType(name = "PaymentOrderType", propOrder = {
    "bankTraceIdentifier",
    "checkNumber",
    "effectiveDate",
    "totalRemittanceAmount",
    "transferFrom",
    "transferTo"
})
public class PaymentOrderType {

    @XmlElement(name = "BankTraceIdentifier")
    protected String bankTraceIdentifier;
    @XmlElement(name = "CheckNumber")
    protected String checkNumber;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "TotalRemittanceAmount", required = true)
    protected FinancialAmountType totalRemittanceAmount;
    @XmlElement(name = "TransferFrom")
    protected AccountDescriptionType transferFrom;
    @XmlElement(name = "TransferTo", required = true)
    protected AccountDescriptionType transferTo;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bankTraceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankTraceIdentifier() {
        return bankTraceIdentifier;
    }

    /**
     * Sets the value of the bankTraceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankTraceIdentifier(String value) {
        this.bankTraceIdentifier = value;
    }

    /**
     * Gets the value of the checkNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCheckNumber() {
        return checkNumber;
    }

    /**
     * Sets the value of the checkNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCheckNumber(String value) {
        this.checkNumber = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the totalRemittanceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalRemittanceAmount() {
        return totalRemittanceAmount;
    }

    /**
     * Sets the value of the totalRemittanceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalRemittanceAmount(FinancialAmountType value) {
        this.totalRemittanceAmount = value;
    }

    /**
     * Gets the value of the transferFrom property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDescriptionType }
     *     
     */
    public AccountDescriptionType getTransferFrom() {
        return transferFrom;
    }

    /**
     * Sets the value of the transferFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDescriptionType }
     *     
     */
    public void setTransferFrom(AccountDescriptionType value) {
        this.transferFrom = value;
    }

    /**
     * Gets the value of the transferTo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDescriptionType }
     *     
     */
    public AccountDescriptionType getTransferTo() {
        return transferTo;
    }

    /**
     * Sets the value of the transferTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDescriptionType }
     *     
     */
    public void setTransferTo(AccountDescriptionType value) {
        this.transferTo = value;
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
