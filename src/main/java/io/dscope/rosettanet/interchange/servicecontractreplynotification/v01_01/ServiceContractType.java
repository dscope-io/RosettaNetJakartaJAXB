
package io.dscope.rosettanet.interchange.servicecontractreplynotification.v01_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_02.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_16.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_16.MonetaryAmountType;
import io.dscope.rosettanet.interchange.codelist.acknowledgmentreason.v01_00.AcknowledgmentReason;
import io.dscope.rosettanet.interchange.codelist.requesttype.v01_00.RequestType;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_02.AlternativeIdentifierType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_01.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_04.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for ServiceContractType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceContractType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:AcknowledgmentReason:xsd:codelist:01.00}AcknowledgmentReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ChangeRequestStatus" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.02}PurchaseOrderStatusType"/&gt;
 *         &lt;element name="ContractAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.01}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="ContractOwner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FromContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}AlternativeIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PriceChange" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="RequestingDocumentReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.00}RequestType"/&gt;
 *         &lt;element name="ResponseDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServiceContractLineItem" type="{urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:01.01}ServiceContractLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.16}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="ServiceStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceContractType", propOrder = {
    "acknowledgmentReason",
    "billTo",
    "businessDocumentReference",
    "cancellationDate",
    "changeRequestStatus",
    "contractAmount",
    "contractOwner",
    "contractReference",
    "fromContractReference",
    "label",
    "notes",
    "priceChange",
    "requestingDocumentReference",
    "requestType",
    "responseDescription",
    "serviceContractLineItem",
    "servicePeriod",
    "serviceStatus",
    "toContractReference"
})
public class ServiceContractType {

    @XmlElementRef(name = "AcknowledgmentReason", namespace = "urn:rosettanet:specification:interchange:AcknowledgmentReason:xsd:codelist:01.00", type = AcknowledgmentReason.class, required = false)
    protected List<AcknowledgmentReason> acknowledgmentReason;
    @XmlElement(name = "BillTo")
    protected SpecifiedPartnerDescriptionType billTo;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.01", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CancellationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "ChangeRequestStatus", required = true)
    protected PurchaseOrderStatusType changeRequestStatus;
    @XmlElement(name = "ContractAmount")
    protected FinancialAmountType contractAmount;
    @XmlElement(name = "ContractOwner")
    protected SpecifiedPartnerDescriptionType contractOwner;
    @XmlElement(name = "ContractReference")
    protected List<BusinessDocumentReferenceType> contractReference;
    @XmlElement(name = "FromContractReference")
    protected BusinessDocumentReferenceType fromContractReference;
    @XmlElement(name = "Label")
    protected AlternativeIdentifierType label;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "PriceChange")
    protected MonetaryAmountType priceChange;
    @XmlElement(name = "RequestingDocumentReference")
    protected BusinessDocumentReferenceType requestingDocumentReference;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.00", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "ResponseDescription")
    protected String responseDescription;
    @XmlElement(name = "ServiceContractLineItem")
    protected List<ServiceContractLineItemType> serviceContractLineItem;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElement(name = "ServiceStatus")
    protected String serviceStatus;
    @XmlElement(name = "ToContractReference")
    protected BusinessDocumentReferenceType toContractReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the acknowledgmentReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the acknowledgmentReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcknowledgmentReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcknowledgmentReason }
     * 
     * 
     */
    public List<AcknowledgmentReason> getAcknowledgmentReason() {
        if (acknowledgmentReason == null) {
            acknowledgmentReason = new ArrayList<AcknowledgmentReason>();
        }
        return this.acknowledgmentReason;
    }

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
     * Gets the value of the cancellationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * Sets the value of the cancellationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * Gets the value of the changeRequestStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getChangeRequestStatus() {
        return changeRequestStatus;
    }

    /**
     * Sets the value of the changeRequestStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setChangeRequestStatus(PurchaseOrderStatusType value) {
        this.changeRequestStatus = value;
    }

    /**
     * Gets the value of the contractAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getContractAmount() {
        return contractAmount;
    }

    /**
     * Sets the value of the contractAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setContractAmount(FinancialAmountType value) {
        this.contractAmount = value;
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
     * Gets the value of the contractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getContractReference() {
        if (contractReference == null) {
            contractReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.contractReference;
    }

    /**
     * Gets the value of the fromContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFromContractReference() {
        return fromContractReference;
    }

    /**
     * Sets the value of the fromContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFromContractReference(BusinessDocumentReferenceType value) {
        this.fromContractReference = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifierType }
     *     
     */
    public AlternativeIdentifierType getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifierType }
     *     
     */
    public void setLabel(AlternativeIdentifierType value) {
        this.label = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
    }

    /**
     * Gets the value of the priceChange property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getPriceChange() {
        return priceChange;
    }

    /**
     * Sets the value of the priceChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setPriceChange(MonetaryAmountType value) {
        this.priceChange = value;
    }

    /**
     * Gets the value of the requestingDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getRequestingDocumentReference() {
        return requestingDocumentReference;
    }

    /**
     * Sets the value of the requestingDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setRequestingDocumentReference(BusinessDocumentReferenceType value) {
        this.requestingDocumentReference = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
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
     * Gets the value of the serviceContractLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceContractLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceContractLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceContractLineItemType }
     * 
     * 
     */
    public List<ServiceContractLineItemType> getServiceContractLineItem() {
        if (serviceContractLineItem == null) {
            serviceContractLineItem = new ArrayList<ServiceContractLineItemType>();
        }
        return this.serviceContractLineItem;
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
     * Gets the value of the serviceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceStatus() {
        return serviceStatus;
    }

    /**
     * Sets the value of the serviceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceStatus(String value) {
        this.serviceStatus = value;
    }

    /**
     * Gets the value of the toContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getToContractReference() {
        return toContractReference;
    }

    /**
     * Sets the value of the toContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setToContractReference(BusinessDocumentReferenceType value) {
        this.toContractReference = value;
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
