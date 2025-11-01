
package io.dscope.rosettanet.interchange.purchaseorderchangerequest.v02_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.logistics.logistics.v02_08.DeliveryInformationType;
import io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03.GovernmentPriorityRating;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderchangetype.v01_03.PurchaseOrderChangeType;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderfillpriority.v01_03.PurchaseOrderFillPriority;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.AccountDescription;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.FinancingTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.OrderShippingInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.SecondaryBuyer;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TaxExemptStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.TransportationEventType;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_03.LocationType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_03.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dac="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07" xmlns:dpoct="urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03" xmlns:dpofp="urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03" xmlns:dpot="urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04" xmlns:p407062_="http://annox.dev.java.net" xmlns:p707611_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.01" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.04" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In PurchaseOrder, at least one occurrence of OrderShippingInformation/SpecialHandlingInstruction/Text or OrderShippingInformation/SpecialHandlingInstruction/SpecialHandling.&lt;/urss:Constraint&gt;
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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}AccountDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ContractInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}FinancingTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GeneralServicesAdministrationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03}GovernmentPriorityRating" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsDropShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}OrderShippingInformation" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderChangeRequest:xsd:schema:02.01}ProductLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03}PurchaseOrderChangeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03}PurchaseOrderFillPriority" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04}PurchaseOrderType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReceivedQuantityInformation" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08}DeliveryInformationType"/&gt;
 *         &lt;element name="RequestedEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipFrom" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}LocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledEvent" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TransportationEventType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SecondaryBuyer" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element name="TotalAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.03}FinancialAmountType" minOccurs="0"/&gt;
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
    "businessDocumentReference",
    "comments",
    "contractInformation",
    "date",
    "financingTerms",
    "generalServicesAdministrationNumber",
    "governmentContractIdentifier",
    "governmentPriorityRating",
    "installAt",
    "isDropShip",
    "orderShippingInformation",
    "originalScheduledEvent",
    "productInformation",
    "productLineItem",
    "purchaseOrderChangeType",
    "purchaseOrderFillPriority",
    "purchaseOrderIdentifier",
    "purchaseOrderType",
    "receivedQuantityInformation",
    "requestedEvent",
    "requestedShipFrom",
    "revisionNumber",
    "scheduledEvent",
    "secondaryBuyer",
    "shipTo",
    "taxExemptStatus",
    "totalAmount"
})
public class PurchaseOrderType {

    @XmlElementRef(name = "AccountDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = AccountDescription.class, required = false)
    protected AccountDescription accountDescription;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ContractInformation.class, required = false)
    protected List<ContractInformation> contractInformation;
    @XmlElement(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlElementRef(name = "FinancingTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = FinancingTerms.class, required = false)
    protected List<FinancingTerms> financingTerms;
    @XmlElement(name = "GeneralServicesAdministrationNumber")
    protected BusinessDocumentReferenceType generalServicesAdministrationNumber;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElementRef(name = "GovernmentPriorityRating", namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", type = GovernmentPriorityRating.class, required = false)
    protected GovernmentPriorityRating governmentPriorityRating;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsDropShip")
    protected boolean isDropShip;
    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = OrderShippingInformation.class, required = false)
    protected OrderShippingInformation orderShippingInformation;
    @XmlElement(name = "OriginalScheduledEvent")
    protected List<TransportationEventType> originalScheduledEvent;
    @XmlElement(name = "ProductInformation")
    protected String productInformation;
    @XmlElement(name = "ProductLineItem")
    protected List<ProductLineItemType> productLineItem;
    @XmlElementRef(name = "PurchaseOrderChangeType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderChangeType:xsd:codelist:01.03", type = PurchaseOrderChangeType.class)
    protected PurchaseOrderChangeType purchaseOrderChangeType;
    @XmlElementRef(name = "PurchaseOrderFillPriority", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderFillPriority:xsd:codelist:01.03", type = PurchaseOrderFillPriority.class, required = false)
    protected PurchaseOrderFillPriority purchaseOrderFillPriority;
    @XmlElement(name = "PurchaseOrderIdentifier", required = true)
    protected BusinessDocumentReferenceType purchaseOrderIdentifier;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType.class)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> purchaseOrderType;
    @XmlElement(name = "ReceivedQuantityInformation", required = true)
    protected DeliveryInformationType receivedQuantityInformation;
    @XmlElement(name = "RequestedEvent")
    protected TransportationEventType requestedEvent;
    @XmlElement(name = "RequestedShipFrom")
    protected List<LocationType> requestedShipFrom;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "ScheduledEvent")
    protected TransportationEventType scheduledEvent;
    @XmlElementRef(name = "SecondaryBuyer", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = SecondaryBuyer.class, required = false)
    protected SecondaryBuyer secondaryBuyer;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElement(name = "TotalAmount")
    protected FinancialAmountType totalAmount;
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
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
     * Gets the value of the generalServicesAdministrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGeneralServicesAdministrationNumber() {
        return generalServicesAdministrationNumber;
    }

    /**
     * Sets the value of the generalServicesAdministrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGeneralServicesAdministrationNumber(BusinessDocumentReferenceType value) {
        this.generalServicesAdministrationNumber = value;
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
     * Gets the value of the installAt property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getInstallAt() {
        return installAt;
    }

    /**
     * Sets the value of the installAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setInstallAt(SpecifiedPartnerDescriptionType value) {
        this.installAt = value;
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
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItemType }
     * 
     * 
     */
    public List<ProductLineItemType> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItemType>();
        }
        return this.productLineItem;
    }

    /**
     * Gets the value of the purchaseOrderChangeType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderChangeType }
     *     
     */
    public PurchaseOrderChangeType getPurchaseOrderChangeType() {
        return purchaseOrderChangeType;
    }

    /**
     * Sets the value of the purchaseOrderChangeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderChangeType }
     *     
     */
    public void setPurchaseOrderChangeType(PurchaseOrderChangeType value) {
        this.purchaseOrderChangeType = value;
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
     * Gets the value of the purchaseOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrderIdentifier() {
        return purchaseOrderIdentifier;
    }

    /**
     * Sets the value of the purchaseOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderIdentifier(BusinessDocumentReferenceType value) {
        this.purchaseOrderIdentifier = value;
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
     * {@link io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType> getPurchaseOrderType() {
        if (purchaseOrderType == null) {
            purchaseOrderType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_04.PurchaseOrderType>();
        }
        return this.purchaseOrderType;
    }

    /**
     * Gets the value of the receivedQuantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryInformationType }
     *     
     */
    public DeliveryInformationType getReceivedQuantityInformation() {
        return receivedQuantityInformation;
    }

    /**
     * Sets the value of the receivedQuantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryInformationType }
     *     
     */
    public void setReceivedQuantityInformation(DeliveryInformationType value) {
        this.receivedQuantityInformation = value;
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
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalAmount(FinancialAmountType value) {
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
