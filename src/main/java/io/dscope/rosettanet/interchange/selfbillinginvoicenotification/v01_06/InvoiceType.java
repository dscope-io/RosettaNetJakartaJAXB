
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_06;

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
import io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_04.SaleType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.Financing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.shared.v01_05.MonetaryAmountType;
import io.dscope.rosettanet.universal.codelist.documenttype.v01_05.DocumentType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.05}DocumentType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.06}InvoiceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsLockBoxUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRebill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchasedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="RemitToAccount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}AccountSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04}SaleType" minOccurs="0"/&gt;
 *         &lt;element name="SelfBillingFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="SelfBillingTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SoldBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SoldToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalInvoiceAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmountType"/&gt;
 *         &lt;element name="TransferToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceType", propOrder = {
    "ancillaryAmount",
    "billToAccount",
    "documentType",
    "financing",
    "invoiceLineItem",
    "isLockBoxUsed",
    "isRebill",
    "paymentTerms",
    "purchasedBy",
    "remitTo",
    "remitToAccount",
    "remitToTax",
    "saleType",
    "selfBillingFrom",
    "selfBillingTo",
    "shipFrom",
    "shipTo",
    "soldBy",
    "soldToAccount",
    "soldToTax",
    "totalInvoiceAmount",
    "transferToAccount"
})
public class InvoiceType {

    @XmlElement(name = "AncillaryAmount")
    protected List<MonetaryAmountType> ancillaryAmount;
    @XmlElement(name = "BillToAccount")
    protected List<String> billToAccount;
    @XmlElementRef(name = "DocumentType", namespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.05", type = DocumentType.class)
    protected DocumentType documentType;
    @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = Financing.class, required = false)
    protected Financing financing;
    @XmlElement(name = "InvoiceLineItem", required = true)
    protected List<InvoiceLineItemType> invoiceLineItem;
    @XmlElement(name = "IsLockBoxUsed")
    protected boolean isLockBoxUsed;
    @XmlElement(name = "IsRebill")
    protected boolean isRebill;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = PaymentTerms.class, required = false)
    protected List<PaymentTerms> paymentTerms;
    @XmlElement(name = "PurchasedBy")
    protected List<SpecifiedPartnerDescriptionType> purchasedBy;
    @XmlElement(name = "RemitTo", required = true)
    protected SpecifiedPartnerDescriptionType remitTo;
    @XmlElement(name = "RemitToAccount")
    protected List<AccountSummaryType> remitToAccount;
    @XmlElement(name = "RemitToTax")
    protected TaxSummaryType remitToTax;
    @XmlElementRef(name = "SaleType", namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04", type = SaleType.class, required = false)
    protected SaleType saleType;
    @XmlElement(name = "SelfBillingFrom", required = true)
    protected SpecifiedPartnerDescriptionType selfBillingFrom;
    @XmlElement(name = "SelfBillingTo", required = true)
    protected SpecifiedPartnerDescriptionType selfBillingTo;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElement(name = "SoldBy")
    protected SpecifiedPartnerDescriptionType soldBy;
    @XmlElement(name = "SoldToAccount")
    protected List<String> soldToAccount;
    @XmlElement(name = "SoldToTax")
    protected TaxSummaryType soldToTax;
    @XmlElement(name = "TotalInvoiceAmount", required = true)
    protected MonetaryAmountType totalInvoiceAmount;
    @XmlElement(name = "TransferToAccount")
    protected List<String> transferToAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the ancillaryAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAmountType }
     * 
     * 
     */
    public List<MonetaryAmountType> getAncillaryAmount() {
        if (ancillaryAmount == null) {
            ancillaryAmount = new ArrayList<MonetaryAmountType>();
        }
        return this.ancillaryAmount;
    }

    /**
     * Gets the value of the billToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBillToAccount() {
        if (billToAccount == null) {
            billToAccount = new ArrayList<String>();
        }
        return this.billToAccount;
    }

    /**
     * Gets the value of the documentType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentType }
     *     
     */
    public DocumentType getDocumentType() {
        return documentType;
    }

    /**
     * Sets the value of the documentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentType }
     *     
     */
    public void setDocumentType(DocumentType value) {
        this.documentType = value;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link Financing }
     *     
     */
    public Financing getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financing }
     *     
     */
    public void setFinancing(Financing value) {
        this.financing = value;
    }

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItemType }
     * 
     * 
     */
    public List<InvoiceLineItemType> getInvoiceLineItem() {
        if (invoiceLineItem == null) {
            invoiceLineItem = new ArrayList<InvoiceLineItemType>();
        }
        return this.invoiceLineItem;
    }

    /**
     * Gets the value of the isLockBoxUsed property.
     * 
     */
    public boolean isIsLockBoxUsed() {
        return isLockBoxUsed;
    }

    /**
     * Sets the value of the isLockBoxUsed property.
     * 
     */
    public void setIsLockBoxUsed(boolean value) {
        this.isLockBoxUsed = value;
    }

    /**
     * Gets the value of the isRebill property.
     * 
     */
    public boolean isIsRebill() {
        return isRebill;
    }

    /**
     * Sets the value of the isRebill property.
     * 
     */
    public void setIsRebill(boolean value) {
        this.isRebill = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms }
     * 
     * 
     */
    public List<PaymentTerms> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTerms>();
        }
        return this.paymentTerms;
    }

    /**
     * Gets the value of the purchasedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchasedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchasedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getPurchasedBy() {
        if (purchasedBy == null) {
            purchasedBy = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.purchasedBy;
    }

    /**
     * Gets the value of the remitTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getRemitTo() {
        return remitTo;
    }

    /**
     * Sets the value of the remitTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setRemitTo(SpecifiedPartnerDescriptionType value) {
        this.remitTo = value;
    }

    /**
     * Gets the value of the remitToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the remitToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemitToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSummaryType }
     * 
     * 
     */
    public List<AccountSummaryType> getRemitToAccount() {
        if (remitToAccount == null) {
            remitToAccount = new ArrayList<AccountSummaryType>();
        }
        return this.remitToAccount;
    }

    /**
     * Gets the value of the remitToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getRemitToTax() {
        return remitToTax;
    }

    /**
     * Sets the value of the remitToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setRemitToTax(TaxSummaryType value) {
        this.remitToTax = value;
    }

    /**
     * Gets the value of the saleType property.
     * 
     * @return
     *     possible object is
     *     {@link SaleType }
     *     
     */
    public SaleType getSaleType() {
        return saleType;
    }

    /**
     * Sets the value of the saleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleType }
     *     
     */
    public void setSaleType(SaleType value) {
        this.saleType = value;
    }

    /**
     * Gets the value of the selfBillingFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSelfBillingFrom() {
        return selfBillingFrom;
    }

    /**
     * Sets the value of the selfBillingFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSelfBillingFrom(SpecifiedPartnerDescriptionType value) {
        this.selfBillingFrom = value;
    }

    /**
     * Gets the value of the selfBillingTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSelfBillingTo() {
        return selfBillingTo;
    }

    /**
     * Sets the value of the selfBillingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSelfBillingTo(SpecifiedPartnerDescriptionType value) {
        this.selfBillingTo = value;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipTo(SpecifiedPartnerDescriptionType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the soldBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSoldBy() {
        return soldBy;
    }

    /**
     * Sets the value of the soldBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSoldBy(SpecifiedPartnerDescriptionType value) {
        this.soldBy = value;
    }

    /**
     * Gets the value of the soldToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soldToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoldToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSoldToAccount() {
        if (soldToAccount == null) {
            soldToAccount = new ArrayList<String>();
        }
        return this.soldToAccount;
    }

    /**
     * Gets the value of the soldToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getSoldToTax() {
        return soldToTax;
    }

    /**
     * Sets the value of the soldToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setSoldToTax(TaxSummaryType value) {
        this.soldToTax = value;
    }

    /**
     * Gets the value of the totalInvoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Sets the value of the totalInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalInvoiceAmount(MonetaryAmountType value) {
        this.totalInvoiceAmount = value;
    }

    /**
     * Gets the value of the transferToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transferToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransferToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransferToAccount() {
        if (transferToAccount == null) {
            transferToAccount = new ArrayList<String>();
        }
        return this.transferToAccount;
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
