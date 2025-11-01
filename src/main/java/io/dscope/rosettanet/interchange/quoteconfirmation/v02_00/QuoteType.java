
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_03.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01.QuoteAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.PriceCondition;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_05.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_04.CarrierInformation;
import io.dscope.rosettanet.domain.shared.shared.v01_04.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_04.ProductPricingType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_03.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_07.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for QuoteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReference" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}CarrierInformation" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="DistributedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="FinancedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="FreightCharges" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="HandlingCharges" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="IsPendingItemsExist" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}PriceCondition" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01}QuoteAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteCustomerInformation" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.00}QuoteCustomerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteLineItem" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.00}QuoteLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.03}PurchaseOrderStatusType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.05}QuoteType"/&gt;
 *         &lt;element name="ReferQuoteTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedResponseDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="RequoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.03}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RespondTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TermsAndConditions" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.00}TermsAndConditionsType" minOccurs="0"/&gt;
 *         &lt;element name="TotalPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}MonetaryAmountType"/&gt;
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
@XmlType(name = "QuoteType", propOrder = {
    "billTo",
    "businessDocumentReference",
    "carrierInformation",
    "comments",
    "contractOwner",
    "distributedBy",
    "effectiveDate",
    "financedBy",
    "freightCharges",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "handlingCharges",
    "isPendingItemsExist",
    "listPrice",
    "priceCondition",
    "quoteAcknowledgmentReason",
    "quoteCustomerInformation",
    "quoteLineItem",
    "quoteStatus",
    "quoteType",
    "referQuoteTo",
    "requestedResponseDate",
    "requoteReference",
    "respondTo",
    "responseDescription",
    "specialDiscount",
    "taxExemptStatus",
    "termsAndConditions",
    "totalPrice"
})
public class QuoteType {

    @XmlElement(name = "BillTo")
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.03", type = BusinessDocumentReference.class)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "CarrierInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", type = CarrierInformation.class, required = false)
    protected CarrierInformation carrierInformation;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "ContractOwner")
    protected SpecifiedPartnerDescriptionType contractOwner;
    @XmlElement(name = "DistributedBy")
    protected List<SpecifiedPartnerDescriptionType> distributedBy;
    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElement(name = "FinancedBy")
    protected SpecifiedPartnerDescriptionType financedBy;
    @XmlElement(name = "FreightCharges")
    protected MonetaryAmountType freightCharges;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "HandlingCharges")
    protected MonetaryAmountType handlingCharges;
    @XmlElement(name = "IsPendingItemsExist")
    protected boolean isPendingItemsExist;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "PriceCondition", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = PriceCondition.class, required = false)
    protected PriceCondition priceCondition;
    @XmlElementRef(name = "QuoteAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", type = QuoteAcknowledgmentReason.class, required = false)
    protected List<QuoteAcknowledgmentReason> quoteAcknowledgmentReason;
    @XmlElement(name = "QuoteCustomerInformation")
    protected List<QuoteCustomerInformationType> quoteCustomerInformation;
    @XmlElement(name = "QuoteLineItem")
    protected List<QuoteLineItemType> quoteLineItem;
    @XmlElement(name = "QuoteStatus", required = true)
    protected PurchaseOrderStatusType quoteStatus;
    @XmlElementRef(name = "QuoteType", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.05", type = io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType.class)
    protected io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType quoteType;
    @XmlElement(name = "ReferQuoteTo")
    protected SpecifiedPartnerDescriptionType referQuoteTo;
    @XmlElement(name = "RequestedResponseDate")
    protected DatePeriodType requestedResponseDate;
    @XmlElement(name = "RequoteReference")
    protected List<BusinessDocumentReferenceType> requoteReference;
    @XmlElement(name = "RespondTo")
    protected List<SpecifiedPartnerDescriptionType> respondTo;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TermsAndConditions")
    protected TermsAndConditionsType termsAndConditions;
    @XmlElement(name = "TotalPrice", required = true)
    protected MonetaryAmountType totalPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the billTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getBillTo() {
        return billTo;
    }

    /**
     * Sets the value of the billTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setBillTo(SpecifiedPartnerDescriptionType value) {
        this.billTo = value;
    }

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the carrierInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierInformation }
     *     
     */
    public CarrierInformation getCarrierInformation() {
        return carrierInformation;
    }

    /**
     * Sets the value of the carrierInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierInformation }
     *     
     */
    public void setCarrierInformation(CarrierInformation value) {
        this.carrierInformation = value;
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
     * Gets the value of the contractOwner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getContractOwner() {
        return contractOwner;
    }

    /**
     * Sets the value of the contractOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setContractOwner(SpecifiedPartnerDescriptionType value) {
        this.contractOwner = value;
    }

    /**
     * Gets the value of the distributedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getDistributedBy() {
        if (distributedBy == null) {
            distributedBy = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.distributedBy;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the financedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getFinancedBy() {
        return financedBy;
    }

    /**
     * Sets the value of the financedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setFinancedBy(SpecifiedPartnerDescriptionType value) {
        this.financedBy = value;
    }

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setFreightCharges(MonetaryAmountType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the governmentContractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGovernmentContractIdentifier() {
        return governmentContractIdentifier;
    }

    /**
     * Sets the value of the governmentContractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGovernmentContractIdentifier(BusinessDocumentReferenceType value) {
        this.governmentContractIdentifier = value;
    }

    /**
     * Gets the value of the governmentPriorityRating property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentPriorityRating }
     *     
     */
    public GovernmentPriorityRating getGovernmentPriorityRating() {
        return governmentPriorityRating;
    }

    /**
     * Sets the value of the governmentPriorityRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentPriorityRating }
     *     
     */
    public void setGovernmentPriorityRating(GovernmentPriorityRating value) {
        this.governmentPriorityRating = value;
    }

    /**
     * Gets the value of the handlingCharges property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getHandlingCharges() {
        return handlingCharges;
    }

    /**
     * Sets the value of the handlingCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setHandlingCharges(MonetaryAmountType value) {
        this.handlingCharges = value;
    }

    /**
     * Gets the value of the isPendingItemsExist property.
     * 
     */
    public boolean isIsPendingItemsExist() {
        return isPendingItemsExist;
    }

    /**
     * Sets the value of the isPendingItemsExist property.
     * 
     */
    public void setIsPendingItemsExist(boolean value) {
        this.isPendingItemsExist = value;
    }

    /**
     * Gets the value of the listPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getListPrice() {
        return listPrice;
    }

    /**
     * Sets the value of the listPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setListPrice(ProductPricingType value) {
        this.listPrice = value;
    }

    /**
     * Gets the value of the priceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PriceCondition }
     *     
     */
    public PriceCondition getPriceCondition() {
        return priceCondition;
    }

    /**
     * Sets the value of the priceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCondition }
     *     
     */
    public void setPriceCondition(PriceCondition value) {
        this.priceCondition = value;
    }

    /**
     * Gets the value of the quoteAcknowledgmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteAcknowledgmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteAcknowledgmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteAcknowledgmentReason }
     * 
     * 
     */
    public List<QuoteAcknowledgmentReason> getQuoteAcknowledgmentReason() {
        if (quoteAcknowledgmentReason == null) {
            quoteAcknowledgmentReason = new ArrayList<QuoteAcknowledgmentReason>();
        }
        return this.quoteAcknowledgmentReason;
    }

    /**
     * Gets the value of the quoteCustomerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteCustomerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteCustomerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteCustomerInformationType }
     * 
     * 
     */
    public List<QuoteCustomerInformationType> getQuoteCustomerInformation() {
        if (quoteCustomerInformation == null) {
            quoteCustomerInformation = new ArrayList<QuoteCustomerInformationType>();
        }
        return this.quoteCustomerInformation;
    }

    /**
     * Gets the value of the quoteLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the quoteLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuoteLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QuoteLineItemType }
     * 
     * 
     */
    public List<QuoteLineItemType> getQuoteLineItem() {
        if (quoteLineItem == null) {
            quoteLineItem = new ArrayList<QuoteLineItemType>();
        }
        return this.quoteLineItem;
    }

    /**
     * Gets the value of the quoteStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getQuoteStatus() {
        return quoteStatus;
    }

    /**
     * Sets the value of the quoteStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setQuoteStatus(PurchaseOrderStatusType value) {
        this.quoteStatus = value;
    }

    /**
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType }
     *     
     */
    public io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType }
     *     
     */
    public void setQuoteType(io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the referQuoteTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReferQuoteTo() {
        return referQuoteTo;
    }

    /**
     * Sets the value of the referQuoteTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReferQuoteTo(SpecifiedPartnerDescriptionType value) {
        this.referQuoteTo = value;
    }

    /**
     * Gets the value of the requestedResponseDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getRequestedResponseDate() {
        return requestedResponseDate;
    }

    /**
     * Sets the value of the requestedResponseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setRequestedResponseDate(DatePeriodType value) {
        this.requestedResponseDate = value;
    }

    /**
     * Gets the value of the requoteReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requoteReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequoteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getRequoteReference() {
        if (requoteReference == null) {
            requoteReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.requoteReference;
    }

    /**
     * Gets the value of the respondTo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respondTo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespondTo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getRespondTo() {
        if (respondTo == null) {
            respondTo = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.respondTo;
    }

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    /**
     * Gets the value of the specialDiscount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialDiscount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialDiscount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialDiscount }
     * 
     * 
     */
    public List<SpecialDiscount> getSpecialDiscount() {
        if (specialDiscount == null) {
            specialDiscount = new ArrayList<SpecialDiscount>();
        }
        return this.specialDiscount;
    }

    /**
     * Gets the value of the taxExemptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptStatus }
     *     
     */
    public TaxExemptStatus getTaxExemptStatus() {
        return taxExemptStatus;
    }

    /**
     * Sets the value of the taxExemptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptStatus }
     *     
     */
    public void setTaxExemptStatus(TaxExemptStatus value) {
        this.taxExemptStatus = value;
    }

    /**
     * Gets the value of the termsAndConditions property.
     * 
     * @return
     *     possible object is
     *     {@link TermsAndConditionsType }
     *     
     */
    public TermsAndConditionsType getTermsAndConditions() {
        return termsAndConditions;
    }

    /**
     * Sets the value of the termsAndConditions property.
     * 
     * @param value
     *     allowed object is
     *     {@link TermsAndConditionsType }
     *     
     */
    public void setTermsAndConditions(TermsAndConditionsType value) {
        this.termsAndConditions = value;
    }

    /**
     * Gets the value of the totalPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalPrice() {
        return totalPrice;
    }

    /**
     * Sets the value of the totalPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalPrice(MonetaryAmountType value) {
        this.totalPrice = value;
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
