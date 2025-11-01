
package io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_01;

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
import io.dscope.rosettanet.domain.shared.shared.v01_12.DatePeriodAndDurationType;
import io.dscope.rosettanet.domain.shared.shared.v01_12.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.requesttype.v01_02.RequestType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifierType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;


/**
 * <p>Java class for ServiceContractLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceContractLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CancellationDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="FromContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="HandlingInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredToResponseAtDetailLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Product" type="{urn:rosettanet:specification:interchange:ServiceContractRequestNotification:xsd:schema:02.01}ProductType" minOccurs="0"/&gt;
 *         &lt;element name="Quantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.02}RequestType"/&gt;
 *         &lt;element name="ServiceIdentification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ServicePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="ToContractReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductPricingType" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceContractLineItemType", propOrder = {
    "businessDocumentReference",
    "cancellationDate",
    "contractReference",
    "fromContractReference",
    "handlingInstruction",
    "isRequiredToResponseAtDetailLevel",
    "label",
    "lineNumber",
    "notes",
    "partnerDescription",
    "product",
    "quantity",
    "requestType",
    "serviceIdentification",
    "serviceLevel",
    "servicePeriod",
    "toContractReference",
    "unitPrice"
})
public class ServiceContractLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CancellationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cancellationDate;
    @XmlElement(name = "ContractReference")
    protected BusinessDocumentReferenceType contractReference;
    @XmlElement(name = "FromContractReference")
    protected BusinessDocumentReferenceType fromContractReference;
    @XmlElement(name = "HandlingInstruction")
    protected String handlingInstruction;
    @XmlElement(name = "IsRequiredToResponseAtDetailLevel")
    protected String isRequiredToResponseAtDetailLevel;
    @XmlElement(name = "Label")
    protected AlternativeIdentifierType label;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "Product")
    protected ProductType product;
    @XmlElement(name = "Quantity")
    protected Float quantity;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.02", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "ServiceIdentification")
    protected List<String> serviceIdentification;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "ServicePeriod")
    protected DatePeriodAndDurationType servicePeriod;
    @XmlElement(name = "ToContractReference")
    protected List<BusinessDocumentReferenceType> toContractReference;
    @XmlElement(name = "UnitPrice")
    protected ProductPricingType unitPrice;
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
     * Gets the value of the contractReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getContractReference() {
        return contractReference;
    }

    /**
     * Sets the value of the contractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setContractReference(BusinessDocumentReferenceType value) {
        this.contractReference = value;
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
     * Gets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsRequiredToResponseAtDetailLevel() {
        return isRequiredToResponseAtDetailLevel;
    }

    /**
     * Sets the value of the isRequiredToResponseAtDetailLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsRequiredToResponseAtDetailLevel(String value) {
        this.isRequiredToResponseAtDetailLevel = value;
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
     * Gets the value of the product property.
     * 
     * @return
     *     possible object is
     *     {@link ProductType }
     *     
     */
    public ProductType getProduct() {
        return product;
    }

    /**
     * Sets the value of the product property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductType }
     *     
     */
    public void setProduct(ProductType value) {
        this.product = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setQuantity(Float value) {
        this.quantity = value;
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
     * Gets the value of the toContractReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the toContractReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getToContractReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getToContractReference() {
        if (toContractReference == null) {
            toContractReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.toContractReference;
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
