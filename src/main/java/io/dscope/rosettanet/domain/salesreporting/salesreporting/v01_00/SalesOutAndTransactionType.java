
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.codelist.paymentmethod.v01_00.PaymentMethodType;
import io.dscope.rosettanet.domain.salesreporting.codelist.purchasemethod.v01_00.PurchaseMethodType;
import io.dscope.rosettanet.domain.salesreporting.codelist.transactiontype.v01_00.TransactionTypeType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_00.FinancialAmountType;


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
 *         &lt;element name="BookUnitPrice" type="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}BookPriceType" minOccurs="0"/&gt;
 *         &lt;element name="LeaseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentMethod" type="{urn:rosettanet:specification:domain:PaymentMethod:xsd:codelist:1.0}PaymentMethodType" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseMethod" type="{urn:rosettanet:specification:domain:PurchaseMethod:xsd:codelist:1.0}PurchaseMethodType" minOccurs="0"/&gt;
 *         &lt;element name="ResaleUnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}SalesOut"/&gt;
 *         &lt;element name="TransactionType" type="{urn:rosettanet:specification:domain:TransactionType:xsd:codelist:1.0}TransactionTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
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
    "bookUnitPrice",
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
    @XmlElement(name = "BookUnitPrice")
    protected BookPriceType bookUnitPrice;
    @XmlElement(name = "LeaseDescription")
    protected String leaseDescription;
    @XmlElement(name = "PaymentMethod")
    protected PaymentMethodType paymentMethod;
    @XmlElement(name = "PriceListIdentifier")
    protected String priceListIdentifier;
    @XmlElement(name = "PurchaseMethod")
    protected PurchaseMethodType purchaseMethod;
    @XmlElement(name = "ResaleUnitPrice")
    protected FinancialAmountType resaleUnitPrice;
    @XmlElementRef(name = "SalesOut", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = SalesOut.class)
    protected SalesOut salesOut;
    @XmlElement(name = "TransactionType")
    protected TransactionTypeType transactionType;
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
     * Gets the value of the bookUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link BookPriceType }
     *     
     */
    public BookPriceType getBookUnitPrice() {
        return bookUnitPrice;
    }

    /**
     * Sets the value of the bookUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPriceType }
     *     
     */
    public void setBookUnitPrice(BookPriceType value) {
        this.bookUnitPrice = value;
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
     *     {@link PaymentMethodType }
     *     
     */
    public PaymentMethodType getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentMethodType }
     *     
     */
    public void setPaymentMethod(PaymentMethodType value) {
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
     *     {@link PurchaseMethodType }
     *     
     */
    public PurchaseMethodType getPurchaseMethod() {
        return purchaseMethod;
    }

    /**
     * Sets the value of the purchaseMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseMethodType }
     *     
     */
    public void setPurchaseMethod(PurchaseMethodType value) {
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
     *     {@link TransactionTypeType }
     *     
     */
    public TransactionTypeType getTransactionType() {
        return transactionType;
    }

    /**
     * Sets the value of the transactionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionTypeType }
     *     
     */
    public void setTransactionType(TransactionTypeType value) {
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
