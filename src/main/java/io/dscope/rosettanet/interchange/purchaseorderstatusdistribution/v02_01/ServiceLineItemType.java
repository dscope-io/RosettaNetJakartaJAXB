
package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04.NotificationType;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderacknowledgmentreason.v01_04.PurchaseOrderAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatus;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_05.PurchaseOrderType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.OrderQuantityType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SpecialDiscount;
import io.dscope.rosettanet.domain.shared.shared.v01_17.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ServiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04}NotificationType" minOccurs="0"/&gt;
 *         &lt;element name="OrderPricing" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductOrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ProductSerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04}PurchaseOrderAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05}PurchaseOrderType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ServiceOrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}OrderQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceLineItemType", propOrder = {
    "businessDocumentReference",
    "contractInformation",
    "handlingInstruction",
    "lineNumber",
    "listPrice",
    "notificationType",
    "orderPricing",
    "partnerDescription",
    "productIdentification",
    "productLineNumber",
    "productOrderQuantity",
    "productSerialIdentifier",
    "purchaseOrderAcknowledgmentReason",
    "purchaseOrderReference",
    "purchaseOrderStatus",
    "purchaseOrderType",
    "responseDescription",
    "serviceIdentification",
    "serviceLevel",
    "serviceOrderQuantity",
    "servicePeriod",
    "specialDiscount"
})
public class ServiceLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "NotificationType", namespace = "urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", type = NotificationType.class, required = false)
    protected NotificationType notificationType;
    @XmlElement(name = "OrderPricing")
    protected ProductPricingType orderPricing;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductLineNumber")
    protected String productLineNumber;
    @XmlElement(name = "ProductOrderQuantity")
    protected OrderQuantityType productOrderQuantity;
    @XmlElement(name = "ProductSerialIdentifier")
    protected List<String> productSerialIdentifier;
    @XmlElementRef(name = "PurchaseOrderAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderAcknowledgmentReason:xsd:codelist:01.04", type = PurchaseOrderAcknowledgmentReason.class, required = false)
    protected List<PurchaseOrderAcknowledgmentReason> purchaseOrderAcknowledgmentReason;
    @XmlElement(name = "PurchaseOrderReference", required = true)
    protected BusinessDocumentReferenceType purchaseOrderReference;
    @XmlElementRef(name = "PurchaseOrderStatus", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06", type = PurchaseOrderStatus.class)
    protected PurchaseOrderStatus purchaseOrderStatus;
    @XmlElementRef(name = "PurchaseOrderType", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderType:xsd:codelist:01.05", type = PurchaseOrderType.class, required = false)
    protected PurchaseOrderType purchaseOrderType;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel", required = true)
    protected String serviceLevel;
    @XmlElement(name = "ServiceOrderQuantity")
    protected OrderQuantityType serviceOrderQuantity;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = SpecialDiscount.class, required = false)
    protected List<SpecialDiscount> specialDiscount;
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
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInformation(ContractInformation value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the handlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandlingInstruction() {
        return handlingInstruction;
    }

    /**
     * Sets the value of the handlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandlingInstruction(String value) {
        this.handlingInstruction = value;
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
     * Gets the value of the notificationType property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationType }
     *     
     */
    public NotificationType getNotificationType() {
        return notificationType;
    }

    /**
     * Sets the value of the notificationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationType }
     *     
     */
    public void setNotificationType(NotificationType value) {
        this.notificationType = value;
    }

    /**
     * Gets the value of the orderPricing property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getOrderPricing() {
        return orderPricing;
    }

    /**
     * Sets the value of the orderPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setOrderPricing(ProductPricingType value) {
        this.orderPricing = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
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
     * Gets the value of the productLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductLineNumber() {
        return productLineNumber;
    }

    /**
     * Sets the value of the productLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductLineNumber(String value) {
        this.productLineNumber = value;
    }

    /**
     * Gets the value of the productOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType }
     *     
     */
    public OrderQuantityType getProductOrderQuantity() {
        return productOrderQuantity;
    }

    /**
     * Sets the value of the productOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType }
     *     
     */
    public void setProductOrderQuantity(OrderQuantityType value) {
        this.productOrderQuantity = value;
    }

    /**
     * Gets the value of the productSerialIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSerialIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSerialIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProductSerialIdentifier() {
        if (productSerialIdentifier == null) {
            productSerialIdentifier = new ArrayList<String>();
        }
        return this.productSerialIdentifier;
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
     * Gets the value of the purchaseOrderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrderReference() {
        return purchaseOrderReference;
    }

    /**
     * Sets the value of the purchaseOrderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderReference(BusinessDocumentReferenceType value) {
        this.purchaseOrderReference = value;
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
     * Gets the value of the purchaseOrderType property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrderType() {
        return purchaseOrderType;
    }

    /**
     * Sets the value of the purchaseOrderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrderType(PurchaseOrderType value) {
        this.purchaseOrderType = value;
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
     * Gets the value of the serviceIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceIdentification() {
        if (serviceIdentification == null) {
            serviceIdentification = new ArrayList<String>();
        }
        return this.serviceIdentification;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
    }

    /**
     * Gets the value of the serviceOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link OrderQuantityType }
     *     
     */
    public OrderQuantityType getServiceOrderQuantity() {
        return serviceOrderQuantity;
    }

    /**
     * Sets the value of the serviceOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderQuantityType }
     *     
     */
    public void setServiceOrderQuantity(OrderQuantityType value) {
        this.serviceOrderQuantity = value;
    }

    /**
     * Gets the value of the servicePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getServicePeriod() {
        return servicePeriod;
    }

    /**
     * Sets the value of the servicePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setServicePeriod(DatePeriodAndDurationType value) {
        this.servicePeriod = value;
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
