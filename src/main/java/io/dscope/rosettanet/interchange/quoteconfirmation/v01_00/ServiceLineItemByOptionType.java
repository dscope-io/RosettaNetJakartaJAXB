
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.codelist.quoteacknowledgmentreason.v01_01.QuoteAcknowledgmentReason;
import io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_05.QuoteType;
import io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_01.RequestOption;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.SpecialDiscount;
import io.dscope.rosettanet.domain.shared.shared.v01_17.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ServiceLineItemByOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineItemByOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailableProductQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailableServiceQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
 *         &lt;element name="ExpiringBy" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ListPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductSerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01}QuoteAcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QuoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="QuoteStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatusType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.05}QuoteType"/&gt;
 *         &lt;element name="RequestedProductQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedServiceQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductPricingType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01}RequestOption"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteConfirmationNotification:xsd:schema:01.00}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}DatePeriodAndDurationType"/&gt;
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
@XmlType(name = "ServiceLineItemByOptionType", propOrder = {
    "businessDocumentReference",
    "contractInformation",
    "estimatedAvailableProductQuantity",
    "estimatedAvailableServiceQuantity",
    "expiringBy",
    "handlingInstruction",
    "lineNumber",
    "listPrice",
    "partnerDescription",
    "productIdentification",
    "productLineNumber",
    "productSerialIdentifier",
    "quoteAcknowledgmentReason",
    "quoteReference",
    "quoteStatus",
    "quoteType",
    "requestedProductQuantity",
    "requestedServiceQuantity",
    "requestedUnitPrice",
    "requestOption",
    "requoteLineStatus",
    "responseDescription",
    "serviceIdentification",
    "serviceLevel",
    "servicePeriod",
    "specialDiscount"
})
public class ServiceLineItemByOptionType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElement(name = "EstimatedAvailableProductQuantity")
    protected Float estimatedAvailableProductQuantity;
    @XmlElement(name = "EstimatedAvailableServiceQuantity")
    protected float estimatedAvailableServiceQuantity;
    @XmlElement(name = "ExpiringBy")
    protected DatePeriodAndDurationType expiringBy;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ListPrice")
    protected ProductPricingType listPrice;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductLineNumber")
    protected String productLineNumber;
    @XmlElement(name = "ProductSerialIdentifier")
    protected List<String> productSerialIdentifier;
    @XmlElementRef(name = "QuoteAcknowledgmentReason", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteAcknowledgmentReason:xsd:codelist:01.01", type = QuoteAcknowledgmentReason.class, required = false)
    protected List<QuoteAcknowledgmentReason> quoteAcknowledgmentReason;
    @XmlElement(name = "QuoteReference", required = true)
    protected BusinessDocumentReferenceType quoteReference;
    @XmlElement(name = "QuoteStatus", required = true)
    protected PurchaseOrderStatusType quoteStatus;
    @XmlElementRef(name = "QuoteType", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.05", type = QuoteType.class)
    protected QuoteType quoteType;
    @XmlElement(name = "RequestedProductQuantity")
    protected Float requestedProductQuantity;
    @XmlElement(name = "RequestedServiceQuantity")
    protected Float requestedServiceQuantity;
    @XmlElement(name = "RequestedUnitPrice", required = true)
    protected ProductPricingType requestedUnitPrice;
    @XmlElementRef(name = "RequestOption", namespace = "urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01", type = RequestOption.class)
    protected RequestOption requestOption;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "ServicePeriod", required = true)
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
     * Gets the value of the estimatedAvailableProductQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimatedAvailableProductQuantity() {
        return estimatedAvailableProductQuantity;
    }

    /**
     * Sets the value of the estimatedAvailableProductQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimatedAvailableProductQuantity(Float value) {
        this.estimatedAvailableProductQuantity = value;
    }

    /**
     * Gets the value of the estimatedAvailableServiceQuantity property.
     * 
     */
    public float getEstimatedAvailableServiceQuantity() {
        return estimatedAvailableServiceQuantity;
    }

    /**
     * Sets the value of the estimatedAvailableServiceQuantity property.
     * 
     */
    public void setEstimatedAvailableServiceQuantity(float value) {
        this.estimatedAvailableServiceQuantity = value;
    }

    /**
     * Gets the value of the expiringBy property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getExpiringBy() {
        return expiringBy;
    }

    /**
     * Sets the value of the expiringBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setExpiringBy(DatePeriodAndDurationType value) {
        this.expiringBy = value;
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
     * Gets the value of the quoteType property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteType }
     *     
     */
    public QuoteType getQuoteType() {
        return quoteType;
    }

    /**
     * Sets the value of the quoteType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteType }
     *     
     */
    public void setQuoteType(QuoteType value) {
        this.quoteType = value;
    }

    /**
     * Gets the value of the requestedProductQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedProductQuantity() {
        return requestedProductQuantity;
    }

    /**
     * Sets the value of the requestedProductQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedProductQuantity(Float value) {
        this.requestedProductQuantity = value;
    }

    /**
     * Gets the value of the requestedServiceQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedServiceQuantity() {
        return requestedServiceQuantity;
    }

    /**
     * Sets the value of the requestedServiceQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedServiceQuantity(Float value) {
        this.requestedServiceQuantity = value;
    }

    /**
     * Gets the value of the requestedUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getRequestedUnitPrice() {
        return requestedUnitPrice;
    }

    /**
     * Sets the value of the requestedUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setRequestedUnitPrice(ProductPricingType value) {
        this.requestedUnitPrice = value;
    }

    /**
     * Gets the value of the requestOption property.
     * 
     * @return
     *     possible object is
     *     {@link RequestOption }
     *     
     */
    public RequestOption getRequestOption() {
        return requestOption;
    }

    /**
     * Sets the value of the requestOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestOption }
     *     
     */
    public void setRequestOption(RequestOption value) {
        this.requestOption = value;
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
