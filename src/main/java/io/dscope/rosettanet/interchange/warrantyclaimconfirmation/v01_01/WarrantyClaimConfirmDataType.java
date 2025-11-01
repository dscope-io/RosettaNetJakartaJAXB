
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

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
import io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02.ClaimType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for WarrantyClaimConfirmDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyClaimConfirmDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ClaimData" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01}ClaimDataType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02}ClaimType"/&gt;
 *         &lt;element name="ServiceDelivery" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01}ServiceDeliveryType" minOccurs="0"/&gt;
 *         &lt;element name="ServicedUnit" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01}ServicedUnitType"/&gt;
 *         &lt;element name="ServiceLocation" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
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
@XmlType(name = "WarrantyClaimConfirmDataType", propOrder = {
    "businessDocumentReference",
    "claimData",
    "claimType",
    "serviceDelivery",
    "servicedUnit",
    "serviceLocation",
    "statusInformation",
    "submissionDate"
})
public class WarrantyClaimConfirmDataType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "ClaimData", required = true)
    protected ClaimDataType claimData;
    @XmlElementRef(name = "ClaimType", namespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", type = ClaimType.class)
    protected ClaimType claimType;
    @XmlElement(name = "ServiceDelivery")
    protected ServiceDeliveryType serviceDelivery;
    @XmlElement(name = "ServicedUnit", required = true)
    protected ServicedUnitType servicedUnit;
    @XmlElement(name = "ServiceLocation")
    protected SpecifiedPartnerDescriptionType serviceLocation;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElement(name = "SubmissionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar submissionDate;
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
     * Gets the value of the claimData property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimDataType }
     *     
     */
    public ClaimDataType getClaimData() {
        return claimData;
    }

    /**
     * Sets the value of the claimData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimDataType }
     *     
     */
    public void setClaimData(ClaimDataType value) {
        this.claimData = value;
    }

    /**
     * Gets the value of the claimType property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimType }
     *     
     */
    public ClaimType getClaimType() {
        return claimType;
    }

    /**
     * Sets the value of the claimType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimType }
     *     
     */
    public void setClaimType(ClaimType value) {
        this.claimType = value;
    }

    /**
     * Gets the value of the serviceDelivery property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryType }
     *     
     */
    public ServiceDeliveryType getServiceDelivery() {
        return serviceDelivery;
    }

    /**
     * Sets the value of the serviceDelivery property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryType }
     *     
     */
    public void setServiceDelivery(ServiceDeliveryType value) {
        this.serviceDelivery = value;
    }

    /**
     * Gets the value of the servicedUnit property.
     * 
     * @return
     *     possible object is
     *     {@link ServicedUnitType }
     *     
     */
    public ServicedUnitType getServicedUnit() {
        return servicedUnit;
    }

    /**
     * Sets the value of the servicedUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServicedUnitType }
     *     
     */
    public void setServicedUnit(ServicedUnitType value) {
        this.servicedUnit = value;
    }

    /**
     * Gets the value of the serviceLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getServiceLocation() {
        return serviceLocation;
    }

    /**
     * Sets the value of the serviceLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setServiceLocation(SpecifiedPartnerDescriptionType value) {
        this.serviceLocation = value;
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
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
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
