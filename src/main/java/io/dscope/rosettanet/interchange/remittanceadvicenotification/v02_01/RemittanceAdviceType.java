
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_01;

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
import io.dscope.rosettanet.universal.monetaryexpression.v01_04.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;


/**
 * <p>Java class for RemittanceAdviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAdviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DiscountAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="PaymentOrder" type="{urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.01}PaymentOrderType"/&gt;
 *         &lt;element name="RemittanceLineItem" type="{urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.01}RemittanceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="UniqueRemittanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RemittanceAdviceType", propOrder = {
    "discountAmount",
    "partnerDescription",
    "paymentOrder",
    "remittanceLineItem",
    "uniqueRemittanceIdentifier"
})
public class RemittanceAdviceType {

    @XmlElement(name = "DiscountAmount")
    protected FinancialAmountType discountAmount;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "PaymentOrder", required = true)
    protected PaymentOrderType paymentOrder;
    @XmlElement(name = "RemittanceLineItem", required = true)
    protected List<RemittanceLineItemType> remittanceLineItem;
    @XmlElement(name = "UniqueRemittanceIdentifier")
    protected String uniqueRemittanceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setDiscountAmount(FinancialAmountType value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the paymentOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentOrderType }
     *     
     */
    public PaymentOrderType getPaymentOrder() {
        return paymentOrder;
    }

    /**
     * Sets the value of the paymentOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentOrderType }
     *     
     */
    public void setPaymentOrder(PaymentOrderType value) {
        this.paymentOrder = value;
    }

    /**
     * Gets the value of the remittanceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remittanceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemittanceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RemittanceLineItemType }
     * 
     * 
     */
    public List<RemittanceLineItemType> getRemittanceLineItem() {
        if (remittanceLineItem == null) {
            remittanceLineItem = new ArrayList<RemittanceLineItemType>();
        }
        return this.remittanceLineItem;
    }

    /**
     * Gets the value of the uniqueRemittanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRemittanceIdentifier() {
        return uniqueRemittanceIdentifier;
    }

    /**
     * Sets the value of the uniqueRemittanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRemittanceIdentifier(String value) {
        this.uniqueRemittanceIdentifier = value;
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
