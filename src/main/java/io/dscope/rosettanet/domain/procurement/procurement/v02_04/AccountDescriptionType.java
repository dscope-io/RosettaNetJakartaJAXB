
package io.dscope.rosettanet.domain.procurement.procurement.v02_04;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_03.AccountClassification;
import io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_01.PaymentMethod;
import io.dscope.rosettanet.universal.partneridentification.v01_06.PartnerDescription;


/**
 * <p>Java class for AccountDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.03}AccountClassification" minOccurs="0"/&gt;
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}CreditCard" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.01}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="PrePaymentCheckNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WireTransferIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "AccountDescriptionType", propOrder = {
    "accountClassification",
    "accountName",
    "accountNumber",
    "creditCard",
    "partnerDescription",
    "paymentMethod",
    "prePaymentCheckNumber",
    "wireTransferIdentifier"
})
public class AccountDescriptionType {

    @XmlElementRef(name = "AccountClassification", namespace = "urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.03", type = AccountClassification.class, required = false)
    protected AccountClassification accountClassification;
    @XmlElement(name = "AccountName")
    protected String accountName;
    @XmlElement(name = "AccountNumber")
    protected String accountNumber;
    @XmlElementRef(name = "CreditCard", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", type = CreditCard.class, required = false)
    protected CreditCard creditCard;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PaymentMethod", namespace = "urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.01", type = PaymentMethod.class, required = false)
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "PrePaymentCheckNumber")
    protected String prePaymentCheckNumber;
    @XmlElement(name = "WireTransferIdentifier")
    protected String wireTransferIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountClassification property.
     * 
     * @return
     *     possible object is
     *     {@link AccountClassification }
     *     
     */
    public AccountClassification getAccountClassification() {
        return accountClassification;
    }

    /**
     * Sets the value of the accountClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountClassification }
     *     
     */
    public void setAccountClassification(AccountClassification value) {
        this.accountClassification = value;
    }

    /**
     * Gets the value of the accountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountName(String value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountNumber(String value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the creditCard property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCard }
     *     
     */
    public CreditCard getCreditCard() {
        return creditCard;
    }

    /**
     * Sets the value of the creditCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCard }
     *     
     */
    public void setCreditCard(CreditCard value) {
        this.creditCard = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentMethod }
     *     
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethod }
     *     
     */
    public void setPaymentMethod(PaymentMethod value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the prePaymentCheckNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrePaymentCheckNumber() {
        return prePaymentCheckNumber;
    }

    /**
     * Sets the value of the prePaymentCheckNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrePaymentCheckNumber(String value) {
        this.prePaymentCheckNumber = value;
    }

    /**
     * Gets the value of the wireTransferIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWireTransferIdentifier() {
        return wireTransferIdentifier;
    }

    /**
     * Sets the value of the wireTransferIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWireTransferIdentifier(String value) {
        this.wireTransferIdentifier = value;
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
