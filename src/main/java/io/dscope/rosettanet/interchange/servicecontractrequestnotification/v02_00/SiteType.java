
package io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_08.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for SiteType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SiteType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromInstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="InstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ToInstallAt" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
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
@XmlType(name = "SiteType", propOrder = {
    "fromInstallAt",
    "installAt",
    "notes",
    "toInstallAt"
})
public class SiteType {

    @XmlElement(name = "FromInstallAt")
    protected SpecifiedPartnerDescriptionType fromInstallAt;
    @XmlElement(name = "InstallAt")
    protected SpecifiedPartnerDescriptionType installAt;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "ToInstallAt")
    protected SpecifiedPartnerDescriptionType toInstallAt;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fromInstallAt property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getFromInstallAt() {
        return fromInstallAt;
    }

    /**
     * Sets the value of the fromInstallAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setFromInstallAt(SpecifiedPartnerDescriptionType value) {
        this.fromInstallAt = value;
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
     * Gets the value of the toInstallAt property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getToInstallAt() {
        return toInstallAt;
    }

    /**
     * Sets the value of the toInstallAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setToInstallAt(SpecifiedPartnerDescriptionType value) {
        this.toInstallAt = value;
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
