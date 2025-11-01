
package io.dscope.rosettanet.interchange.quoterequest.v01_03;

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
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_02.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.ProductPricingType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.TaxExemptStatus;
import io.dscope.rosettanet.interchange.codelist.stockindicator.v01_00.StockIndicator;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_01.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_04.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_02.ProductIdentification;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15" xmlns:dqs="urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.01" xmlns:dqt="urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03" xmlns:dra="urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.02" xmlns:isi="urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00" xmlns:p538687_="http://annox.dev.java.net" xmlns:p869145_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductLineItem, if the value of TaxExemptStatus/IsTaxExempt is equal to true then the occurence of TaxExemptStatus/TaxExemption MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CompetitorReference" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03}CompetitorReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSubstituteProductAcceptable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02}ProductIdentification"/&gt;
 *         &lt;element name="QuoteCustomerInformation" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03}QuoteCustomerInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03}QuoteQuantityType"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00}StockIndicator" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01}UnitOfMeasure"/&gt;
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
    "designRegistrationIdentifier",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "identifier",
    "isRequiredToResponseAtDetailLevel",
    "isSubstituteProductAcceptable",
    "lineNumber",
    "productIdentification",
    "quoteCustomerInformation",
    "requestedQuantity",
    "requestedShipFrom",
    "requestedUnitPrice",
    "requoteLineStatus",
    "shipTo",
    "specialDiscount",
    "stockIndicator",
    "taxExemptStatus",
    "unitOfMeasure"
})
public class ProductLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.01", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "CompetitorReference")
    protected List<CompetitorReferenceType> competitorReference;
    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Identifier")
    protected List<String> identifier;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected Boolean isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "IsSubstituteProductAcceptable")
    protected boolean isSubstituteProductAcceptable;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "QuoteCustomerInformation")
    protected List<QuoteCustomerInformationType> quoteCustomerInformation;
    @XmlElement(name = "RequestedQuantity", required = true)
    protected QuoteQuantityType requestedQuantity;
    @XmlElement(name = "RequestedShipFrom")
    protected SpecifiedPartnerDescriptionType requestedShipFrom;
    @XmlElement(name = "RequestedUnitPrice")
    protected List<ProductPricingType> requestedUnitPrice;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "StockIndicator", namespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00", type = StockIndicator.class, required = false)
    protected StockIndicator stockIndicator;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequiredToResponseAtDetailLevel() {
        return isRequiredToResponseAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequiredToResponseAtDetailLevel(Boolean value) {
        this.isRequiredToResponseAtDetailLevel = value;
    }

    /**
     * Gets the value of the isSubstituteProductAcceptable property.
     * 
     */
    public boolean isIsSubstituteProductAcceptable() {
        return isSubstituteProductAcceptable;
    }

    /**
     * Sets the value of the isSubstituteProductAcceptable property.
     * 
     */
    public void setIsSubstituteProductAcceptable(boolean value) {
        this.isSubstituteProductAcceptable = value;
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
     * Gets the value of the requestedShipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getRequestedShipFrom() {
        return requestedShipFrom;
    }

    /**
     * Sets the value of the requestedShipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setRequestedShipFrom(SpecifiedPartnerDescriptionType value) {
        this.requestedShipFrom = value;
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
