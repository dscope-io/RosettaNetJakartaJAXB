
package io.dscope.rosettanet.universal.partneridentification.v01_16;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SpecifiedPartnerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedFullPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedIntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedKnownPartnerContact"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedNewPartner"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "SpecifiedPartnerDescriptionType", propOrder = {
    "specifiedFullPartner",
    "specifiedIntermittentPartner",
    "specifiedKnownPartnerContact",
    "specifiedNewPartner"
})
public class SpecifiedPartnerDescriptionType {

    @XmlElementRef(name = "SpecifiedFullPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = SpecifiedFullPartner.class, required = false)
    protected SpecifiedFullPartner specifiedFullPartner;
    @XmlElementRef(name = "SpecifiedIntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = SpecifiedIntermittentPartner.class, required = false)
    protected SpecifiedIntermittentPartner specifiedIntermittentPartner;
    @XmlElementRef(name = "SpecifiedKnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = SpecifiedKnownPartnerContact.class, required = false)
    protected SpecifiedKnownPartnerContact specifiedKnownPartnerContact;
    @XmlElementRef(name = "SpecifiedNewPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = SpecifiedNewPartner.class, required = false)
    protected SpecifiedNewPartner specifiedNewPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the specifiedFullPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedFullPartner }
     *     
     */
    public SpecifiedFullPartner getSpecifiedFullPartner() {
        return specifiedFullPartner;
    }

    /**
     * Sets the value of the specifiedFullPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedFullPartner }
     *     
     */
    public void setSpecifiedFullPartner(SpecifiedFullPartner value) {
        this.specifiedFullPartner = value;
    }

    /**
     * Gets the value of the specifiedIntermittentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedIntermittentPartner }
     *     
     */
    public SpecifiedIntermittentPartner getSpecifiedIntermittentPartner() {
        return specifiedIntermittentPartner;
    }

    /**
     * Sets the value of the specifiedIntermittentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedIntermittentPartner }
     *     
     */
    public void setSpecifiedIntermittentPartner(SpecifiedIntermittentPartner value) {
        this.specifiedIntermittentPartner = value;
    }

    /**
     * Gets the value of the specifiedKnownPartnerContact property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartnerContact }
     *     
     */
    public SpecifiedKnownPartnerContact getSpecifiedKnownPartnerContact() {
        return specifiedKnownPartnerContact;
    }

    /**
     * Sets the value of the specifiedKnownPartnerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartnerContact }
     *     
     */
    public void setSpecifiedKnownPartnerContact(SpecifiedKnownPartnerContact value) {
        this.specifiedKnownPartnerContact = value;
    }

    /**
     * Gets the value of the specifiedNewPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartner }
     *     
     */
    public SpecifiedNewPartner getSpecifiedNewPartner() {
        return specifiedNewPartner;
    }

    /**
     * Sets the value of the specifiedNewPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartner }
     *     
     */
    public void setSpecifiedNewPartner(SpecifiedNewPartner value) {
        this.specifiedNewPartner = value;
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
