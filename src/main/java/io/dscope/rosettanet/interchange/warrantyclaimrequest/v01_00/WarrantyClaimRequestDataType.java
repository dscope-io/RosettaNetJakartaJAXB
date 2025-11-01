
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00;

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
import io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02.ClaimStatus;
import io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02.ClaimType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for WarrantyClaimRequestDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyClaimRequestDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02}ClaimStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02}ClaimType"/&gt;
 *         &lt;element name="EndUser" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ServicedUnit" type="{urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00}ServicedUnitType"/&gt;
 *         &lt;element name="ServiceEvent" type="{urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00}ServiceEventType"/&gt;
 *         &lt;element name="ServiceLocation" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "WarrantyClaimRequestDataType", propOrder = {
    "businessDocumentReference",
    "claimStatus",
    "claimType",
    "endUser",
    "servicedUnit",
    "serviceEvent",
    "serviceLocation"
})
public class WarrantyClaimRequestDataType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ClaimStatus", namespace = "urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02", type = ClaimStatus.class, required = false)
    protected ClaimStatus claimStatus;
    @XmlElementRef(name = "ClaimType", namespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", type = ClaimType.class)
    protected ClaimType claimType;
    @XmlElement(name = "EndUser", required = true)
    protected SpecifiedPartnerDescriptionType endUser;
    @XmlElement(name = "ServicedUnit", required = true)
    protected ServicedUnitType servicedUnit;
    @XmlElement(name = "ServiceEvent", required = true)
    protected ServiceEventType serviceEvent;
    @XmlElement(name = "ServiceLocation", required = true)
    protected SpecifiedPartnerDescriptionType serviceLocation;
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
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatus(ClaimStatus value) {
        this.claimStatus = value;
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
     * Gets the value of the endUser property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getEndUser() {
        return endUser;
    }

    /**
     * Sets the value of the endUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setEndUser(SpecifiedPartnerDescriptionType value) {
        this.endUser = value;
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
     * Gets the value of the serviceEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceEventType }
     *     
     */
    public ServiceEventType getServiceEvent() {
        return serviceEvent;
    }

    /**
     * Sets the value of the serviceEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceEventType }
     *     
     */
    public void setServiceEvent(ServiceEventType value) {
        this.serviceEvent = value;
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
