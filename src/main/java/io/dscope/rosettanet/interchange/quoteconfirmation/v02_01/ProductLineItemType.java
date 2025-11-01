
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01.QuoteAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.StepPricing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SubstituteProductReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.TaxSummary;
import io.dscope.rosettanet.domain.shared.shared.v01_12.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.productterms.v01_01.ProductTerms;
import io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_01.QuoteLineItemStatus;
import io.dscope.rosettanet.interchange.codelist.stockindicator.v01_01.StockIndicator;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompetitorReference" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}CompetitorReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailableQuantity" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}QuoteQuantityType"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element name="OrderLeadTime" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}OrderLeadTimeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.01}ProductTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01}QuoteAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteCustomerInformation" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}QuoteCustomerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01}QuoteLineItemStatus"/&gt;
 *         &lt;element name="QuoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="QuoteStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatusType"/&gt;
 *         &lt;element name="RequestedQuantity" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}QuoteQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledQuantity" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.01}QuoteQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}StepPricing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01}StockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}TaxSummary" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductPricingType"/&gt;
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
@XmlType(name = "ProductLineItemType", propOrder = {
    "businessDocumentReference",
    "comments",
    "competitorReference",
    "countryOfOrigin",
    "designRegistrationIdentifier",
    "estimatedAvailableQuantity",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "identifier",
    "lineNumber",
    "listPrice",
    "orderLeadTime",
    "partnerDescription",
    "productIdentification",
    "productTerms",
    "quoteAcknowledgmentReason",
    "quoteCustomerInformation",
    "quoteLineItemStatus",
    "quoteReference",
    "quoteStatus",
    "requestedQuantity",
    "requestedUnitPrice",
    "requoteLineStatus",
    "responseDescription",
    "scheduledQuantity",
    "specialDiscount",
    "stepPricing",
    "stockIndicator",
    "substituteProductReference",
    "taxExemptStatus",
    "taxSummary",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CompetitorReference")
    protected List<CompetitorReferenceType> competitorReference;
    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "EstimatedAvailableQuantity", required = true)
    protected QuoteQuantityType estimatedAvailableQuantity;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Identifier")
    protected List<String> identifier;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElement(name = "OrderLeadTime")
    protected OrderLeadTimeType orderLeadTime;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductTerms", namespace = "urn:rosettanet:specification:interchange:ProductTerms:xsd:codelist:01.01", type = ProductTerms.class, required = false)
    protected List<ProductTerms> productTerms;
    @XmlElementRef(name = "QuoteAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", type = QuoteAcknowledgmentReason.class, required = false)
    protected List<QuoteAcknowledgmentReason> quoteAcknowledgmentReason;
    @XmlElement(name = "QuoteCustomerInformation")
    protected List<QuoteCustomerInformationType> quoteCustomerInformation;
    @XmlElementRef(name = "QuoteLineItemStatus", namespace = "urn:rosettanet:specification:interchange:QuoteLineItemStatus:xsd:codelist:01.01", type = QuoteLineItemStatus.class)
    protected QuoteLineItemStatus quoteLineItemStatus;
    @XmlElement(name = "QuoteReference")
    protected BusinessDocumentReferenceType quoteReference;
    @XmlElement(name = "QuoteStatus", required = true)
    protected PurchaseOrderStatusType quoteStatus;
    @XmlElement(name = "RequestedQuantity")
    protected QuoteQuantityType requestedQuantity;
    @XmlElement(name = "RequestedUnitPrice")
    protected List<ProductPricingType> requestedUnitPrice;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ScheduledQuantity")
    protected QuoteQuantityType scheduledQuantity;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "StepPricing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = StepPricing.class, required = false)
    protected List<StepPricing> stepPricing;
    @XmlElementRef(name = "StockIndicator", namespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.01", type = StockIndicator.class, required = false)
    protected StockIndicator stockIndicator;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "TaxSummary", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = TaxSummary.class, required = false)
    protected TaxSummary taxSummary;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice", required = true)
    protected ProductPricingType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
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
     * Gets the value of the competitorReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitorReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitorReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitorReferenceType }
     * 
     * 
     */
    public List<CompetitorReferenceType> getCompetitorReference() {
        if (competitorReference == null) {
            competitorReference = new ArrayList<CompetitorReferenceType>();
        }
        return this.competitorReference;
    }

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfOrigin(CountryType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the estimatedAvailableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteQuantityType }
     *     
     */
    public QuoteQuantityType getEstimatedAvailableQuantity() {
        return estimatedAvailableQuantity;
    }

    /**
     * Sets the value of the estimatedAvailableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteQuantityType }
     *     
     */
    public void setEstimatedAvailableQuantity(QuoteQuantityType value) {
        this.estimatedAvailableQuantity = value;
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
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<String>();
        }
        return this.identifier;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
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
     * Gets the value of the orderLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link OrderLeadTimeType }
     *     
     */
    public OrderLeadTimeType getOrderLeadTime() {
        return orderLeadTime;
    }

    /**
     * Sets the value of the orderLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderLeadTimeType }
     *     
     */
    public void setOrderLeadTime(OrderLeadTimeType value) {
        this.orderLeadTime = value;
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
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the productTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTerms }
     * 
     * 
     */
    public List<ProductTerms> getProductTerms() {
        if (productTerms == null) {
            productTerms = new ArrayList<ProductTerms>();
        }
        return this.productTerms;
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
     * Gets the value of the quoteLineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteLineItemStatus }
     *     
     */
    public QuoteLineItemStatus getQuoteLineItemStatus() {
        return quoteLineItemStatus;
    }

    /**
     * Sets the value of the quoteLineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteLineItemStatus }
     *     
     */
    public void setQuoteLineItemStatus(QuoteLineItemStatus value) {
        this.quoteLineItemStatus = value;
    }

    /**
     * Gets the value of the quoteReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getQuoteReference() {
        return quoteReference;
    }

    /**
     * Sets the value of the quoteReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setQuoteReference(BusinessDocumentReferenceType value) {
        this.quoteReference = value;
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
     * Gets the value of the requestedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteQuantityType }
     *     
     */
    public QuoteQuantityType getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteQuantityType }
     *     
     */
    public void setRequestedQuantity(QuoteQuantityType value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the requestedUnitPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedUnitPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedUnitPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getRequestedUnitPrice() {
        if (requestedUnitPrice == null) {
            requestedUnitPrice = new ArrayList<ProductPricingType>();
        }
        return this.requestedUnitPrice;
    }

    /**
     * Gets the value of the requoteLineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RequoteLineStatusType }
     *     
     */
    public RequoteLineStatusType getRequoteLineStatus() {
        return requoteLineStatus;
    }

    /**
     * Sets the value of the requoteLineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequoteLineStatusType }
     *     
     */
    public void setRequoteLineStatus(RequoteLineStatusType value) {
        this.requoteLineStatus = value;
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
     * Gets the value of the scheduledQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteQuantityType }
     *     
     */
    public QuoteQuantityType getScheduledQuantity() {
        return scheduledQuantity;
    }

    /**
     * Sets the value of the scheduledQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteQuantityType }
     *     
     */
    public void setScheduledQuantity(QuoteQuantityType value) {
        this.scheduledQuantity = value;
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
     * Gets the value of the stepPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepPricing }
     * 
     * 
     */
    public List<StepPricing> getStepPricing() {
        if (stepPricing == null) {
            stepPricing = new ArrayList<StepPricing>();
        }
        return this.stepPricing;
    }

    /**
     * Gets the value of the stockIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link StockIndicator }
     *     
     */
    public StockIndicator getStockIndicator() {
        return stockIndicator;
    }

    /**
     * Sets the value of the stockIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link StockIndicator }
     *     
     */
    public void setStockIndicator(StockIndicator value) {
        this.stockIndicator = value;
    }

    /**
     * Gets the value of the substituteProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReference }
     * 
     * 
     */
    public List<SubstituteProductReference> getSubstituteProductReference() {
        if (substituteProductReference == null) {
            substituteProductReference = new ArrayList<SubstituteProductReference>();
        }
        return this.substituteProductReference;
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
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummary }
     *     
     */
    public TaxSummary getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummary }
     *     
     */
    public void setTaxSummary(TaxSummary value) {
        this.taxSummary = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setUnitPrice(ProductPricingType value) {
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
