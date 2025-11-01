
package io.dscope.rosettanet.domain.logistics.logistics.v02_22;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;


/**
 * <p>Java class for OrderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="OrderAllocationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OrderReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItems" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemsAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "OrderInformationType", propOrder = {
    "alternativeIdentifier",
    "orderAllocationDate",
    "orderReference",
    "totalAmount",
    "totalLineItems",
    "totalLineItemsAmount",
    "unitPrice"
})
public class OrderInformationType {

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected AlternativeIdentifier alternativeIdentifier;
    @XmlElement(name = "OrderAllocationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar orderAllocationDate;
    @XmlElement(name = "OrderReference", required = true)
    protected BusinessDocumentReferenceType orderReference;
    @XmlElement(name = "TotalAmount")
    protected FinancialAmountType totalAmount;
    @XmlElement(name = "TotalLineItems")
    protected BigInteger totalLineItems;
    @XmlElement(name = "TotalLineItemsAmount")
    protected FinancialAmountType totalLineItemsAmount;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public AlternativeIdentifier getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    /**
     * Sets the value of the alternativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public void setAlternativeIdentifier(AlternativeIdentifier value) {
        this.alternativeIdentifier = value;
    }

    /**
     * Gets the value of the orderAllocationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOrderAllocationDate() {
        return orderAllocationDate;
    }

    /**
     * Sets the value of the orderAllocationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOrderAllocationDate(XMLGregorianCalendar value) {
        this.orderAllocationDate = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setOrderReference(BusinessDocumentReferenceType value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalAmount(FinancialAmountType value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the totalLineItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalLineItems() {
        return totalLineItems;
    }

    /**
     * Sets the value of the totalLineItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalLineItems(BigInteger value) {
        this.totalLineItems = value;
    }

    /**
     * Gets the value of the totalLineItemsAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalLineItemsAmount() {
        return totalLineItemsAmount;
    }

    /**
     * Sets the value of the totalLineItemsAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalLineItemsAmount(FinancialAmountType value) {
        this.totalLineItemsAmount = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
