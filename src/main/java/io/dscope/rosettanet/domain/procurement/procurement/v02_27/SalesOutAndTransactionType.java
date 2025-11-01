
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchasemethod.v01_03.PurchaseMethod;
import io.dscope.rosettanet.domain.procurement.codelist.transactiontype.v01_04.TransactionType;
import io.dscope.rosettanet.domain.shared.codelist.paymentmethod.v01_02.PaymentMethod;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;


/**
 * <p>Java class for SalesOutAndTransactionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOutAndTransactionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BookDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}BookPrice" minOccurs="0"/&gt;
 *         &lt;element name="LeaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.02}PaymentMethod" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03}PurchaseMethod" minOccurs="0"/&gt;
 *         &lt;element name="ResaleUnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SalesOut"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.04}TransactionType" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOutAndTransactionType", propOrder = {
    "bookDate",
    "bookPrice",
    "leaseDescription",
    "paymentMethod",
    "priceListIdentifier",
    "purchaseMethod",
    "resaleUnitPrice",
    "salesOut",
    "transactionType"
})
public class SalesOutAndTransactionType {

    @XmlElement(name = "BookDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar bookDate;
    @XmlElementRef(name = "BookPrice", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = BookPrice.class, required = false)
    protected BookPrice bookPrice;
    @XmlElement(name = "LeaseDescription")
    protected String leaseDescription;
    @XmlElementRef(name = "PaymentMethod", namespace = "urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.02", type = PaymentMethod.class, required = false)
    protected PaymentMethod paymentMethod;
    @XmlElement(name = "PriceListIdentifier")
    protected String priceListIdentifier;
    @XmlElementRef(name = "PurchaseMethod", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03", type = PurchaseMethod.class, required = false)
    protected PurchaseMethod purchaseMethod;
    @XmlElement(name = "ResaleUnitPrice")
    protected FinancialAmountType resaleUnitPrice;
    @XmlElementRef(name = "SalesOut", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SalesOut.class)
    protected SalesOut salesOut;
    @XmlElementRef(name = "TransactionType", namespace = "urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.04", type = TransactionType.class, required = false)
    protected TransactionType transactionType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bookDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookDate() {
        return bookDate;
    }

    /**
     * Sets the value of the bookDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookDate(XMLGregorianCalendar value) {
        this.bookDate = value;
    }

    /**
     * Gets the value of the bookPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BookPrice }
     *     
     */
    public BookPrice getBookPrice() {
        return bookPrice;
    }

    /**
     * Sets the value of the bookPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPrice }
     *     
     */
    public void setBookPrice(BookPrice value) {
        this.bookPrice = value;
    }

    /**
     * Gets the value of the leaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaseDescription() {
        return leaseDescription;
    }

    /**
     * Sets the value of the leaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaseDescription(String value) {
        this.leaseDescription = value;
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
     * Gets the value of the priceListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIdentifier() {
        return priceListIdentifier;
    }

    /**
     * Sets the value of the priceListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIdentifier(String value) {
        this.priceListIdentifier = value;
    }

    /**
     * Gets the value of the purchaseMethod property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseMethod }
     *     
     */
    public PurchaseMethod getPurchaseMethod() {
        return purchaseMethod;
    }

    /**
     * Sets the value of the purchaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMethod }
     *     
     */
    public void setPurchaseMethod(PurchaseMethod value) {
        this.purchaseMethod = value;
    }

    /**
     * Gets the value of the resaleUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getResaleUnitPrice() {
        return resaleUnitPrice;
    }

    /**
     * Sets the value of the resaleUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setResaleUnitPrice(FinancialAmountType value) {
        this.resaleUnitPrice = value;
    }

    /**
     * Gets the value of the salesOut property.
     * 
     * @return
     *     possible object is
     *     {@link SalesOut }
     *     
     */
    public SalesOut getSalesOut() {
        return salesOut;
    }

    /**
     * Sets the value of the salesOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesOut }
     *     
     */
    public void setSalesOut(SalesOut value) {
        this.salesOut = value;
    }

    /**
     * Gets the value of the transactionType property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransactionType(TransactionType value) {
        this.transactionType = value;
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
