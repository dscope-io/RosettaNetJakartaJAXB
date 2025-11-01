
package io.dscope.rosettanet.interchange.purchaseorderconfirmation.v02_05;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04.PurchaseOrderAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.AncillaryDocument;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.CustomerInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.MapReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.MilestoneDate;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.OrderQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.PortalAccess;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.ShippedQuantityInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SpecialDiscount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SubstituteProductReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TransportationEventType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedNewPartnerType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dct="urn:rosettanet:specification:domain:Procurement:ConfirmationType:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29" xmlns:dpoar="urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpos="urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01" xmlns:p379083_="http://java.sun.com/xml/ns/jaxb" xmlns:p653837_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.05" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductLineItem, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}AncillaryDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuyerLineItem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}CustomerInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpediteReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAtPartnerLine" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedNewPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}MapReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}MilestoneDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}OrderQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}PortalAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ProductSubLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.05}ProductSubLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04}PurchaseOrderAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatus"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TransportationEventType"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ShippedQuantityInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TaxSummary" type="{urn:rosettanet:specification:interchange:PurchaseOrderConfirmation:xsd:schema:02.05}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
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
    "ancillaryDocument",
    "businessDocumentReference",
    "buyerLineItem",
    "comments",
    "contractInformation",
    "countryOfOrigin",
    "customerInformation",
    "expediteReferenceIdentifier",
    "identifier",
    "information",
    "installAtPartnerLine",
    "isDropShip",
    "lineNumber",
    "listPrice",
    "mapReference",
    "milestoneDate",
    "orderQuantity",
    "orderShippingInformation",
    "partnerDescription",
    "portalAccess",
    "productIdentification",
    "productSubLineItem",
    "purchaseOrderAcknowledgmentReason",
    "purchaseOrderFillPriority",
    "purchaseOrderStatus",
    "requestedEvent",
    "requestedShipFrom",
    "requestedUnitPrice",
    "responseDescription",
    "scheduledEvent",
    "shippedQuantityInformation",
    "specialDiscount",
    "substituteProductReference",
    "taxExemptStatus",
    "taxSummary",
    "totalLineItemAmount",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductLineItemType {

    @XmlElementRef(name = "AncillaryDocument", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = AncillaryDocument.class, required = false)
    protected List<AncillaryDocument> ancillaryDocument;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "BuyerLineItem", required = true)
    protected String buyerLineItem;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = CustomerInformation.class, required = false)
    protected List<CustomerInformation> customerInformation;
    @XmlElement(name = "ExpediteReferenceIdentifier")
    protected String expediteReferenceIdentifier;
    @XmlElement(name = "Identifier")
    protected List<String> identifier;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "InstallAtPartnerLine")
    protected SpecifiedNewPartnerType installAtPartnerLine;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "MapReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = MapReference.class, required = false)
    protected List<MapReference> mapReference;
    @XmlElementRef(name = "MilestoneDate", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = MilestoneDate.class, required = false)
    protected List<MilestoneDate> milestoneDate;
    @XmlElementRef(name = "OrderQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = OrderQuantity.class)
    protected OrderQuantity orderQuantity;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PortalAccess", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = PortalAccess.class, required = false)
    protected List<PortalAccess> portalAccess;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductSubLineItem")
    protected List<ProductSubLineItemType> productSubLineItem;
    @XmlElementRef(name = "PurchaseOrderAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", type = PurchaseOrderAcknowledgmentReason.class, required = false)
    protected List<PurchaseOrderAcknowledgmentReason> purchaseOrderAcknowledgmentReason;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElementRef(name = "PurchaseOrderStatus", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06", type = PurchaseOrderStatus.class)
    protected PurchaseOrderStatus purchaseOrderStatus;
    @XmlElement(name = "RequestedEvent", required = true)
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RequestedUnitPrice")
    protected MonetaryAmountType requestedUnitPrice;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElementRef(name = "ShippedQuantityInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = ShippedQuantityInformation.class, required = false)
    protected List<ShippedQuantityInformation> shippedQuantityInformation;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TaxSummary")
    protected TaxSummaryType taxSummary;
    @XmlElement(name = "TotalLineItemAmount")
    protected MonetaryAmountType totalLineItemAmount;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected MonetaryAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the buyerLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerLineItem() {
        return buyerLineItem;
    }

    /**
     * Sets the value of the buyerLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerLineItem(String value) {
        this.buyerLineItem = value;
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
     * Gets the value of the customerInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerInformation }
     * 
     * 
     */
    public List<CustomerInformation> getCustomerInformation() {
        if (customerInformation == null) {
            customerInformation = new ArrayList<CustomerInformation>();
        }
        return this.customerInformation;
    }

    /**
     * Gets the value of the expediteReferenceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpediteReferenceIdentifier() {
        return expediteReferenceIdentifier;
    }

    /**
     * Sets the value of the expediteReferenceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpediteReferenceIdentifier(String value) {
        this.expediteReferenceIdentifier = value;
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
     * Gets the value of the installAtPartnerLine property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public SpecifiedNewPartnerType getInstallAtPartnerLine() {
        return installAtPartnerLine;
    }

    /**
     * Sets the value of the installAtPartnerLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public void setInstallAtPartnerLine(SpecifiedNewPartnerType value) {
        this.installAtPartnerLine = value;
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
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantity }
     *     
     */
    public OrderQuantity getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantity }
     *     
     */
    public void setOrderQuantity(OrderQuantity value) {
        this.orderQuantity = value;
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
     * Gets the value of the productSubLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSubLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSubLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductSubLineItemType }
     * 
     * 
     */
    public List<ProductSubLineItemType> getProductSubLineItem() {
        if (productSubLineItem == null) {
            productSubLineItem = new ArrayList<ProductSubLineItemType>();
        }
        return this.productSubLineItem;
    }

    /**
     * Gets the value of the purchaseOrderAcknowledgmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purchaseOrderAcknowledgmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurchaseOrderAcknowledgmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PurchaseOrderAcknowledgmentReason }
     * 
     * 
     */
    public List<PurchaseOrderAcknowledgmentReason> getPurchaseOrderAcknowledgmentReason() {
        if (purchaseOrderAcknowledgmentReason == null) {
            purchaseOrderAcknowledgmentReason = new ArrayList<PurchaseOrderAcknowledgmentReason>();
        }
        return this.purchaseOrderAcknowledgmentReason;
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
     * Gets the value of the purchaseOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatus }
     *     
     */
    public PurchaseOrderStatus getPurchaseOrderStatus() {
        return purchaseOrderStatus;
    }

    /**
     * Sets the value of the purchaseOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatus }
     *     
     */
    public void setPurchaseOrderStatus(PurchaseOrderStatus value) {
        this.purchaseOrderStatus = value;
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
     * Gets the value of the requestedShipFrom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedShipFrom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedShipFrom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationType }
     * 
     * 
     */
    public List<LocationType> getRequestedShipFrom() {
        if (requestedShipFrom == null) {
            requestedShipFrom = new ArrayList<LocationType>();
        }
        return this.requestedShipFrom;
    }

    /**
     * Gets the value of the requestedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setRequestedUnitPrice(MonetaryAmountType value) {
        this.requestedUnitPrice = value;
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
     * Gets the value of the scheduledEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationEventType }
     *     
     */
    public TransportationEventType getScheduledEvent() {
        return scheduledEvent;
    }

    /**
     * Sets the value of the scheduledEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationEventType }
     *     
     */
    public void setScheduledEvent(TransportationEventType value) {
        this.scheduledEvent = value;
    }

    /**
     * Gets the value of the shippedQuantityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippedQuantityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippedQuantityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippedQuantityInformation }
     * 
     * 
     */
    public List<ShippedQuantityInformation> getShippedQuantityInformation() {
        if (shippedQuantityInformation == null) {
            shippedQuantityInformation = new ArrayList<ShippedQuantityInformation>();
        }
        return this.shippedQuantityInformation;
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
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setTaxSummary(TaxSummaryType value) {
        this.taxSummary = value;
    }

    /**
     * Gets the value of the totalLineItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalLineItemAmount(MonetaryAmountType value) {
        this.totalLineItemAmount = value;
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
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setUnitPrice(MonetaryAmountType value) {
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
