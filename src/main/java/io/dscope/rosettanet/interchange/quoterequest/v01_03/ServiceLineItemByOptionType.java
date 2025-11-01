
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
import io.dscope.rosettanet.domain.procurement.codelist.quotetype.v01_03.QuoteType;
import io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_00.RequestOption;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.ContractInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.ProductPricingType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.SpecialDiscount;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_04.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_02.ProductIdentification;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15" xmlns:dqs="urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.01" xmlns:dqt="urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03" xmlns:dra="urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.02" xmlns:isi="urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00" xmlns:p538687_="http://annox.dev.java.net" xmlns:p869145_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ServiceLineItemByOption, .&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15" xmlns:dqs="urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.01" xmlns:dqt="urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03" xmlns:dra="urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.02" xmlns:isi="urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00" xmlns:p538687_="http://annox.dev.java.net" xmlns:p869145_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ServiceLineItemByOption, if the value of RequestOption is equal to 'CON' then the occurence of ContractInformation MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dgpr="urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.02" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:01.09" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15" xmlns:dqs="urn:rosettanet:specification:domain:Procurement:QuoteStatus:xsd:codelist:01.01" xmlns:dqt="urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03" xmlns:dra="urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02" xmlns:dro="urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.02" xmlns:isi="urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00" xmlns:p538687_="http://annox.dev.java.net" xmlns:p869145_="http://java.sun.com/xml/ns/jaxb" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ServiceLineItemByOption, if the value of RequestOption is equal to 'SIT' then the occurence of InstallAt MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ServiceLineItemByOptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceLineItemByOptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element name="ExpiringBy" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductSerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03}QuoteType"/&gt;
 *         &lt;element name="RequestedProductQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="RequestedServiceQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductQuantityType"/&gt;
 *         &lt;element name="RequestedUnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00}RequestOption"/&gt;
 *         &lt;element name="RequoteLineStatus" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03}RequoteLineStatusType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}DatePeriodAndDurationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}SpecialDiscount" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "expiringBy",
    "handlingInstruction",
    "installAt",
    "isRequiredToResponseAtDetailLevel",
    "lineNumber",
    "productIdentification",
    "productLineNumber",
    "productSerialIdentifier",
    "quoteType",
    "requestedProductQuantity",
    "requestedServiceQuantity",
    "requestedUnitPrice",
    "requestOption",
    "requoteLineStatus",
    "serviceIdentification",
    "serviceLevel",
    "servicePeriod",
    "specialDiscount"
})
public class ServiceLineItemByOptionType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.01", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElement(name = "ExpiringBy")
    protected DatePeriodAndDurationType expiringBy;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected Boolean isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductLineNumber")
    protected String productLineNumber;
    @XmlElement(name = "ProductSerialIdentifier")
    protected List<String> productSerialIdentifier;
    @XmlElementRef(name = "QuoteType", namespace = "urn:rosettanet:specification:domain:Procurement:QuoteType:xsd:codelist:01.03", type = QuoteType.class)
    protected QuoteType quoteType;
    @XmlElement(name = "RequestedProductQuantity")
    protected Float requestedProductQuantity;
    @XmlElement(name = "RequestedServiceQuantity")
    protected float requestedServiceQuantity;
    @XmlElement(name = "RequestedUnitPrice")
    protected List<ProductPricingType> requestedUnitPrice;
    @XmlElementRef(name = "RequestOption", namespace = "urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.00", type = RequestOption.class)
    protected RequestOption requestOption;
    @XmlElement(name = "RequoteLineStatus")
    protected RequoteLineStatusType requoteLineStatus;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "ServicePeriod", required = true)
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElementRef(name = "SpecialDiscount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = SpecialDiscount.class, required = false)
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
     */
    public float getRequestedServiceQuantity() {
        return requestedServiceQuantity;
    }

    /**
     * Sets the value of the requestedServiceQuantity property.
     * 
     */
    public void setRequestedServiceQuantity(float value) {
        this.requestedServiceQuantity = value;
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
