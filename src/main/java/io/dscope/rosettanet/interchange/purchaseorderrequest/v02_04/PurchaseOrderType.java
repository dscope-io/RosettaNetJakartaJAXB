
package io.dscope.rosettanet.interchange.purchaseorderrequest.v02_04;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.AccountDescription;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.AncillaryDocument;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.FinancingTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.MapReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.MilestoneDate;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.PortalAccess;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.SecondaryBuyer;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_25.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_04.Location;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p813143_="http://annox.dev.java.net" xmlns:p955288_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of FinancingTerms/PaymentTerms/NetTerms/Day or FinancingTerms/PaymentTerms/NetTerms/Days.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p813143_="http://annox.dev.java.net" xmlns:p955288_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}AccountDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}AncillaryDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuildingSecurityAccessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}FinancingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRequiredToRespondAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}MapReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}MilestoneDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderRequest:xsd:schema:02.04}OrderLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}PortalAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05}PurchaseOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}SecondaryBuyer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "PurchaseOrderType", propOrder = {
    "accountDescription",
    "ancillaryDocument",
    "buildingSecurityAccessCode",
    "businessDocumentReference",
    "comments",
    "contractInformation",
    "financingTerms",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "information",
    "isDropShip",
    "isRequiredToRespondAtDetailLevel",
    "listPrice",
    "location",
    "mapReference",
    "milestoneDate",
    "orderLineItem",
    "orderShippingInformation",
    "partnerDescription",
    "portalAccess",
    "purchaseOrderFillPriority",
    "purchaseOrderType",
    "requestedEvent",
    "secondaryBuyer",
    "specialDiscount",
    "taxExemptStatus",
    "totalAmount"
})
public class PurchaseOrderType {

    @XmlElementRef(name = "AccountDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = AccountDescription.class, required = false)
    protected AccountDescription accountDescription;
    @XmlElementRef(name = "AncillaryDocument", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = AncillaryDocument.class, required = false)
    protected List<AncillaryDocument> ancillaryDocument;
    @XmlElement(name = "BuildingSecurityAccessCode")
    protected String buildingSecurityAccessCode;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElementRef(name = "FinancingTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = FinancingTerms.class, required = false)
    protected List<FinancingTerms> financingTerms;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElement(name = "IsRequiredToRespondAtDetailLevel")
    protected Boolean isRequiredToRespondAtDetailLevel;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = Location.class, required = false)
    protected List<Location> location;
    @XmlElementRef(name = "MapReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = MapReference.class, required = false)
    protected List<MapReference> mapReference;
    @XmlElementRef(name = "MilestoneDate", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = MilestoneDate.class, required = false)
    protected List<MilestoneDate> milestoneDate;
    @XmlElement(name = "OrderLineItem", required = true)
    protected List<OrderLineItemType> orderLineItem;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PortalAccess", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = PortalAccess.class, required = false)
    protected List<PortalAccess> portalAccess;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05", type = io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType.class)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> purchaseOrderType;
    @XmlElement(name = "RequestedEvent")
    protected TransportationEventType requestedEvent;
    @XmlElementRef(name = "SecondaryBuyer", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = SecondaryBuyer.class, required = false)
    protected SecondaryBuyer secondaryBuyer;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.25", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TotalAmount")
    protected MonetaryAmountType totalAmount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDescription }
     *     
     */
    public AccountDescription getAccountDescription() {
        return accountDescription;
    }

    /**
     * Sets the value of the accountDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDescription }
     *     
     */
    public void setAccountDescription(AccountDescription value) {
        this.accountDescription = value;
    }

    /**
     * Gets the value of the ancillaryDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDocument }
     * 
     * 
     */
    public List<AncillaryDocument> getAncillaryDocument() {
        if (ancillaryDocument == null) {
            ancillaryDocument = new ArrayList<AncillaryDocument>();
        }
        return this.ancillaryDocument;
    }

    /**
     * Gets the value of the buildingSecurityAccessCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildingSecurityAccessCode() {
        return buildingSecurityAccessCode;
    }

    /**
     * Sets the value of the buildingSecurityAccessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildingSecurityAccessCode(String value) {
        this.buildingSecurityAccessCode = value;
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
     * Gets the value of the contractInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContractInformation }
     * 
     * 
     */
    public List<ContractInformation> getContractInformation() {
        if (contractInformation == null) {
            contractInformation = new ArrayList<ContractInformation>();
        }
        return this.contractInformation;
    }

    /**
     * Gets the value of the financingTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the financingTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinancingTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancingTerms }
     * 
     * 
     */
    public List<FinancingTerms> getFinancingTerms() {
        if (financingTerms == null) {
            financingTerms = new ArrayList<FinancingTerms>();
        }
        return this.financingTerms;
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
     * Gets the value of the information property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * Sets the value of the information property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Gets the value of the isDropShip property.
     * 
     */
    public boolean isIsDropShip() {
        return isDropShip;
    }

    /**
     * Sets the value of the isDropShip property.
     * 
     */
    public void setIsDropShip(boolean value) {
        this.isDropShip = value;
    }

    /**
     * Gets the value of the isRequiredToRespondAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequiredToRespondAtDetailLevel() {
        return isRequiredToRespondAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToRespondAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequiredToRespondAtDetailLevel(Boolean value) {
        this.isRequiredToRespondAtDetailLevel = value;
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
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Location }
     * 
     * 
     */
    public List<Location> getLocation() {
        if (location == null) {
            location = new ArrayList<Location>();
        }
        return this.location;
    }

    /**
     * Gets the value of the mapReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MapReference }
     * 
     * 
     */
    public List<MapReference> getMapReference() {
        if (mapReference == null) {
            mapReference = new ArrayList<MapReference>();
        }
        return this.mapReference;
    }

    /**
     * Gets the value of the milestoneDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the milestoneDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMilestoneDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MilestoneDate }
     * 
     * 
     */
    public List<MilestoneDate> getMilestoneDate() {
        if (milestoneDate == null) {
            milestoneDate = new ArrayList<MilestoneDate>();
        }
        return this.milestoneDate;
    }

    /**
     * Gets the value of the orderLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderLineItemType }
     * 
     * 
     */
    public List<OrderLineItemType> getOrderLineItem() {
        if (orderLineItem == null) {
            orderLineItem = new ArrayList<OrderLineItemType>();
        }
        return this.orderLineItem;
    }

    /**
     * Gets the value of the orderShippingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderShippingInformation }
     *     
     */
    public OrderShippingInformation getOrderShippingInformation() {
        return orderShippingInformation;
    }

    /**
     * Sets the value of the orderShippingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderShippingInformation }
     *     
     */
    public void setOrderShippingInformation(OrderShippingInformation value) {
        this.orderShippingInformation = value;
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
     * Gets the value of the portalAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portalAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortalAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortalAccess }
     * 
     * 
     */
    public List<PortalAccess> getPortalAccess() {
        if (portalAccess == null) {
            portalAccess = new ArrayList<PortalAccess>();
        }
        return this.portalAccess;
    }

    /**
     * Gets the value of the purchaseOrderFillPriority property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderFillPriority }
     *     
     */
    public PurchaseOrderFillPriority getPurchaseOrderFillPriority() {
        return purchaseOrderFillPriority;
    }

    /**
     * Sets the value of the purchaseOrderFillPriority property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderFillPriority }
     *     
     */
    public void setPurchaseOrderFillPriority(PurchaseOrderFillPriority value) {
        this.purchaseOrderFillPriority = value;
    }

    /**
     * Gets the value of the purchaseOrderType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType> getPurchaseOrderType() {
        if (purchaseOrderType == null) {
            purchaseOrderType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType>();
        }
        return this.purchaseOrderType;
    }

    /**
     * Gets the value of the requestedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationEventType }
     *     
     */
    public TransportationEventType getRequestedEvent() {
        return requestedEvent;
    }

    /**
     * Sets the value of the requestedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationEventType }
     *     
     */
    public void setRequestedEvent(TransportationEventType value) {
        this.requestedEvent = value;
    }

    /**
     * Gets the value of the secondaryBuyer property.
     * 
     * @return
     *     possible object is
     *     {@link SecondaryBuyer }
     *     
     */
    public SecondaryBuyer getSecondaryBuyer() {
        return secondaryBuyer;
    }

    /**
     * Sets the value of the secondaryBuyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecondaryBuyer }
     *     
     */
    public void setSecondaryBuyer(SecondaryBuyer value) {
        this.secondaryBuyer = value;
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
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalAmount(MonetaryAmountType value) {
        this.totalAmount = value;
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
