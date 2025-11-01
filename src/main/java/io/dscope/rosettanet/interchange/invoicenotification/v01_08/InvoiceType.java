
package io.dscope.rosettanet.interchange.invoicenotification.v01_08;

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
import io.dscope.rosettanet.domain.procurement.codelist.documenttype.v01_04.DocumentType;
import io.dscope.rosettanet.domain.procurement.codelist.purchasetype.v01_03.PurchaseType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.Financing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.InvoiceAmountType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.SpecifiedBusinessDocumentReferenceType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_04.TaxSummaryType;
import io.dscope.rosettanet.universal.partneridentification.v01_06.PartnerDescriptionType;
import io.dscope.rosettanet.universal.partneridentification.v01_06.SpecifiedPartnerDescriptionType;


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
 *         &lt;element name="AncillaryAmount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}InvoiceAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}PartnerDescriptionType"/&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}PartnerDescriptionType"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:DocumentType:xsd:codelist:01.04}DocumentType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.08}InvoiceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsLockBoxUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRebill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OriginalInvoiceNumber" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.08}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.03}PurchaseType" minOccurs="0"/&gt;
 *         &lt;element name="RemitTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}PartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RemitToAccount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}AccountSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="SalesOrderIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}SpecifiedBusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="SoldToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalInvoiceAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.08}AmountType"/&gt;
 *         &lt;element name="TransferTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
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
    "billFrom",
    "billTo",
    "billToAccount",
    "comments",
    "documentType",
    "financing",
    "invoiceLineItem",
    "isLockBoxUsed",
    "isRebill",
    "originalInvoiceNumber",
    "paymentTerms",
    "preTaxAmount",
    "purchaseOrderNumber",
    "purchaseType",
    "remitTo",
    "remitToAccount",
    "remitToTax",
    "salesOrderIdentifier",
    "soldTo",
    "soldToAccount",
    "soldToTax",
    "totalInvoiceAmount",
    "transferTo",
    "transferToAccount"
})
public class InvoiceType {

    @XmlElement(name = "AncillaryAmount")
    protected List<InvoiceAmountType> ancillaryAmount;
    @XmlElement(name = "BillFrom", required = true)
    protected PartnerDescriptionType billFrom;
    @XmlElement(name = "BillTo", required = true)
    protected PartnerDescriptionType billTo;
    @XmlElement(name = "BillToAccount")
    protected List<String> billToAccount;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "DocumentType", namespace = "urn:rosettanet:specification:domain:Procurement:DocumentType:xsd:codelist:01.04", type = DocumentType.class)
    protected DocumentType documentType;
    @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", type = Financing.class, required = false)
    protected Financing financing;
    @XmlElement(name = "InvoiceLineItem", required = true)
    protected List<InvoiceLineItemType> invoiceLineItem;
    @XmlElement(name = "IsLockBoxUsed")
    protected boolean isLockBoxUsed;
    @XmlElement(name = "IsRebill")
    protected boolean isRebill;
    @XmlElement(name = "OriginalInvoiceNumber")
    protected SpecifiedBusinessDocumentReferenceType originalInvoiceNumber;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.04", type = PaymentTerms.class, required = false)
    protected PaymentTerms paymentTerms;
    @XmlElement(name = "PreTaxAmount")
    protected AmountType preTaxAmount;
    @XmlElement(name = "PurchaseOrderNumber")
    protected SpecifiedBusinessDocumentReferenceType purchaseOrderNumber;
    @XmlElementRef(name = "PurchaseType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseType:xsd:codelist:01.03", type = PurchaseType.class, required = false)
    protected PurchaseType purchaseType;
    @XmlElement(name = "RemitTo")
    protected PartnerDescriptionType remitTo;
    @XmlElement(name = "RemitToAccount")
    protected List<AccountSummaryType> remitToAccount;
    @XmlElement(name = "RemitToTax")
    protected TaxSummaryType remitToTax;
    @XmlElement(name = "SalesOrderIdentifier")
    protected List<SpecifiedBusinessDocumentReferenceType> salesOrderIdentifier;
    @XmlElement(name = "SoldTo")
    protected SpecifiedPartnerDescriptionType soldTo;
    @XmlElement(name = "SoldToAccount")
    protected List<String> soldToAccount;
    @XmlElement(name = "SoldToTax")
    protected TaxSummaryType soldToTax;
    @XmlElement(name = "TotalInvoiceAmount", required = true)
    protected AmountType totalInvoiceAmount;
    @XmlElement(name = "TransferTo")
    protected SpecifiedPartnerDescriptionType transferTo;
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
     * {@link InvoiceAmountType }
     * 
     * 
     */
    public List<InvoiceAmountType> getAncillaryAmount() {
        if (ancillaryAmount == null) {
            ancillaryAmount = new ArrayList<InvoiceAmountType>();
        }
        return this.ancillaryAmount;
    }

    /**
     * Gets the value of the billFrom property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getBillFrom() {
        return billFrom;
    }

    /**
     * Sets the value of the billFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setBillFrom(PartnerDescriptionType value) {
        this.billFrom = value;
    }

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setBillTo(PartnerDescriptionType value) {
        this.billTo = value;
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
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
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
     * Gets the value of the originalInvoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getOriginalInvoiceNumber() {
        return originalInvoiceNumber;
    }

    /**
     * Sets the value of the originalInvoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setOriginalInvoiceNumber(SpecifiedBusinessDocumentReferenceType value) {
        this.originalInvoiceNumber = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms }
     *     
     */
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms }
     *     
     */
    public void setPaymentTerms(PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the preTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreTaxAmount() {
        return preTaxAmount;
    }

    /**
     * Sets the value of the preTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreTaxAmount(AmountType value) {
        this.preTaxAmount = value;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderNumber(SpecifiedBusinessDocumentReferenceType value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the purchaseType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseType }
     *     
     */
    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    /**
     * Sets the value of the purchaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseType }
     *     
     */
    public void setPurchaseType(PurchaseType value) {
        this.purchaseType = value;
    }

    /**
     * Gets the value of the remitTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getRemitTo() {
        return remitTo;
    }

    /**
     * Sets the value of the remitTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setRemitTo(PartnerDescriptionType value) {
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
     * Gets the value of the salesOrderIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOrderIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOrderIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedBusinessDocumentReferenceType }
     * 
     * 
     */
    public List<SpecifiedBusinessDocumentReferenceType> getSalesOrderIdentifier() {
        if (salesOrderIdentifier == null) {
            salesOrderIdentifier = new ArrayList<SpecifiedBusinessDocumentReferenceType>();
        }
        return this.salesOrderIdentifier;
    }

    /**
     * Gets the value of the soldTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getSoldTo() {
        return soldTo;
    }

    /**
     * Sets the value of the soldTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setSoldTo(SpecifiedPartnerDescriptionType value) {
        this.soldTo = value;
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
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalInvoiceAmount() {
        return totalInvoiceAmount;
    }

    /**
     * Sets the value of the totalInvoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalInvoiceAmount(AmountType value) {
        this.totalInvoiceAmount = value;
    }

    /**
     * Gets the value of the transferTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransferTo() {
        return transferTo;
    }

    /**
     * Sets the value of the transferTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransferTo(SpecifiedPartnerDescriptionType value) {
        this.transferTo = value;
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
