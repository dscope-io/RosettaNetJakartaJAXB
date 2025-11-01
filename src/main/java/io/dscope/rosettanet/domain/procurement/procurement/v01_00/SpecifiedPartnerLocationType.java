
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SpecifiedPartnerLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}LocationDescription"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}SpecifiedPartnerNameIdentification"/&gt;
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
@XmlType(name = "SpecifiedPartnerLocationType", propOrder = {
    "locationDescription",
    "specifiedPartnerNameIdentification"
})
public class SpecifiedPartnerLocationType {

    @XmlElementRef(name = "LocationDescription", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = LocationDescription.class, required = false)
    protected LocationDescription locationDescription;
    @XmlElementRef(name = "SpecifiedPartnerNameIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = SpecifiedPartnerNameIdentification.class, required = false)
    protected SpecifiedPartnerNameIdentification specifiedPartnerNameIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the locationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link LocationDescription }
     *     
     */
    public LocationDescription getLocationDescription() {
        return locationDescription;
    }

    /**
     * Sets the value of the locationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationDescription }
     *     
     */
    public void setLocationDescription(LocationDescription value) {
        this.locationDescription = value;
    }

    /**
     * Gets the value of the specifiedPartnerNameIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerNameIdentification }
     *     
     */
    public SpecifiedPartnerNameIdentification getSpecifiedPartnerNameIdentification() {
        return specifiedPartnerNameIdentification;
    }

    /**
     * Sets the value of the specifiedPartnerNameIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerNameIdentification }
     *     
     */
    public void setSpecifiedPartnerNameIdentification(SpecifiedPartnerNameIdentification value) {
        this.specifiedPartnerNameIdentification = value;
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
