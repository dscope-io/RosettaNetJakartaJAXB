
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00;

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
import io.dscope.rosettanet.domain.service.service.v02_20.PurchaseDate;
import io.dscope.rosettanet.domain.service.service.v02_20.WarrantyInformation;
import io.dscope.rosettanet.universal.contactinformation.v01_04.ContactInformationType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for UnitInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}ContractInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EndUser" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EventInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}EventInformationType" minOccurs="0"/&gt;
 *         &lt;element name="IsRequiredContractServiceProvider" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ManufactureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductClassification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductConfiguration" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}PurchaseDate" minOccurs="0"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}WarrantyInformation"/&gt;
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
@XmlType(name = "UnitInformationType", propOrder = {
    "contractInformation",
    "endUser",
    "eventInformation",
    "isRequiredContractServiceProvider",
    "manufactureDate",
    "partInformation",
    "productClassification",
    "productConfiguration",
    "productIdentification",
    "purchaseDate",
    "serialIdentifier",
    "statusInformation",
    "warrantyInformation"
})
public class UnitInformationType {

    @XmlElement(name = "ContractInformation")
    protected List<ContractInformationType> contractInformation;
    @XmlElement(name = "EndUser")
    protected List<ContactInformationType> endUser;
    @XmlElement(name = "EventInformation")
    protected EventInformationType eventInformation;
    @XmlElement(name = "IsRequiredContractServiceProvider")
    protected boolean isRequiredContractServiceProvider;
    @XmlElement(name = "ManufactureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufactureDate;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElement(name = "ProductClassification")
    protected String productClassification;
    @XmlElement(name = "ProductConfiguration")
    protected String productConfiguration;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "PurchaseDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = PurchaseDate.class, required = false)
    protected PurchaseDate purchaseDate;
    @XmlElement(name = "SerialIdentifier", required = true)
    protected String serialIdentifier;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElementRef(name = "WarrantyInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = WarrantyInformation.class)
    protected WarrantyInformation warrantyInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * {@link ContractInformationType }
     * 
     * 
     */
    public List<ContractInformationType> getContractInformation() {
        if (contractInformation == null) {
            contractInformation = new ArrayList<ContractInformationType>();
        }
        return this.contractInformation;
    }

    /**
     * Gets the value of the endUser property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the endUser property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEndUser().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformationType }
     * 
     * 
     */
    public List<ContactInformationType> getEndUser() {
        if (endUser == null) {
            endUser = new ArrayList<ContactInformationType>();
        }
        return this.endUser;
    }

    /**
     * Gets the value of the eventInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EventInformationType }
     *     
     */
    public EventInformationType getEventInformation() {
        return eventInformation;
    }

    /**
     * Sets the value of the eventInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInformationType }
     *     
     */
    public void setEventInformation(EventInformationType value) {
        this.eventInformation = value;
    }

    /**
     * Gets the value of the isRequiredContractServiceProvider property.
     * 
     */
    public boolean isIsRequiredContractServiceProvider() {
        return isRequiredContractServiceProvider;
    }

    /**
     * Sets the value of the isRequiredContractServiceProvider property.
     * 
     */
    public void setIsRequiredContractServiceProvider(boolean value) {
        this.isRequiredContractServiceProvider = value;
    }

    /**
     * Gets the value of the manufactureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufactureDate() {
        return manufactureDate;
    }

    /**
     * Sets the value of the manufactureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufactureDate(XMLGregorianCalendar value) {
        this.manufactureDate = value;
    }

    /**
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassification(String value) {
        this.productClassification = value;
    }

    /**
     * Gets the value of the productConfiguration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductConfiguration() {
        return productConfiguration;
    }

    /**
     * Sets the value of the productConfiguration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductConfiguration(String value) {
        this.productConfiguration = value;
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
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseDate }
     *     
     */
    public PurchaseDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseDate }
     *     
     */
    public void setPurchaseDate(PurchaseDate value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialIdentifier() {
        return serialIdentifier;
    }

    /**
     * Sets the value of the serialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialIdentifier(String value) {
        this.serialIdentifier = value;
    }

    /**
     * Gets the value of the statusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInformationType }
     * 
     * 
     */
    public List<StatusInformationType> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<StatusInformationType>();
        }
        return this.statusInformation;
    }

    /**
     * Gets the value of the warrantyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyInformation }
     *     
     */
    public WarrantyInformation getWarrantyInformation() {
        return warrantyInformation;
    }

    /**
     * Sets the value of the warrantyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyInformation }
     *     
     */
    public void setWarrantyInformation(WarrantyInformation value) {
        this.warrantyInformation = value;
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
