
package io.dscope.rosettanet.interchange.purchaseorderchangerequest.v02_04;

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
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_03.ActionCode;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.AncillaryDocument;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.CustomerInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.MapReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.MilestoneDate;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.OrderQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PortalAccess;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TransportationEventType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dac="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27" xmlns:dpoct="urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05" xmlns:p217060_="http://java.sun.com/xml/ns/jaxb" xmlns:p50995_="http://annox.dev.java.net" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.04" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.12" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.04" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductSubLineItem, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductSubLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductSubLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03}ActionCode"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}AncillaryDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuyerSubLineItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}CustomerInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpediteReferenceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}MapReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}MilestoneDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PortalAccess" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="SubLineItem" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
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
@XmlType(name = "ProductSubLineItemType", propOrder = {
    "actionCode",
    "ancillaryDocument",
    "buyerSubLineItem",
    "comments",
    "contractInformation",
    "countryOfOrigin",
    "customerInformation",
    "expediteReferenceIdentifier",
    "isDropShip",
    "mapReference",
    "milestoneDate",
    "orderQuantity",
    "orderShippingInformation",
    "originalScheduledEvent",
    "partnerDescription",
    "portalAccess",
    "productInformation",
    "purchaseOrderFillPriority",
    "requestedEvent",
    "requestedShipFrom",
    "requestedUnitPrice",
    "revisionNumber",
    "scheduledEvent",
    "subLineItem",
    "unitOfMeasure"
})
public class ProductSubLineItemType {

    @XmlElementRef(name = "ActionCode", namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03", type = ActionCode.class)
    protected ActionCode actionCode;
    @XmlElementRef(name = "AncillaryDocument", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = AncillaryDocument.class, required = false)
    protected List<AncillaryDocument> ancillaryDocument;
    @XmlElement(name = "BuyerSubLineItem")
    protected String buyerSubLineItem;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "CountryOfOrigin")
    protected List<CountryType> countryOfOrigin;
    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = CustomerInformation.class, required = false)
    protected List<CustomerInformation> customerInformation;
    @XmlElement(name = "ExpediteReferenceIdentifier")
    protected String expediteReferenceIdentifier;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElementRef(name = "MapReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = MapReference.class, required = false)
    protected List<MapReference> mapReference;
    @XmlElementRef(name = "MilestoneDate", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = MilestoneDate.class, required = false)
    protected List<MilestoneDate> milestoneDate;
    @XmlElementRef(name = "OrderQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = OrderQuantity.class)
    protected OrderQuantity orderQuantity;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PortalAccess", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PortalAccess.class, required = false)
    protected List<PortalAccess> portalAccess;
    @XmlElement(name = "ProductInformation")
    protected String productInformation;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "RequestedEvent", required = true)
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RequestedUnitPrice")
    protected FinancialAmountType requestedUnitPrice;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElement(name = "SubLineItem", required = true)
    protected String subLineItem;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
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
     * Gets the value of the buyerSubLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuyerSubLineItem() {
        return buyerSubLineItem;
    }

    /**
     * Sets the value of the buyerSubLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuyerSubLineItem(String value) {
        this.buyerSubLineItem = value;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfOrigin() {
        if (countryOfOrigin == null) {
            countryOfOrigin = new ArrayList<CountryType>();
        }
        return this.countryOfOrigin;
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
     * Gets the value of the originalScheduledEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originalScheduledEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginalScheduledEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransportationEventType }
     * 
     * 
     */
    public List<TransportationEventType> getOriginalScheduledEvent() {
        if (originalScheduledEvent == null) {
            originalScheduledEvent = new ArrayList<TransportationEventType>();
        }
        return this.originalScheduledEvent;
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
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInformation(String value) {
        this.productInformation = value;
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
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setRequestedUnitPrice(FinancialAmountType value) {
        this.requestedUnitPrice = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
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
     * Gets the value of the subLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLineItem() {
        return subLineItem;
    }

    /**
     * Sets the value of the subLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLineItem(String value) {
        this.subLineItem = value;
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
