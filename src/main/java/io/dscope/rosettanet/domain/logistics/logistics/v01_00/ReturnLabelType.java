
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_00.ReturnLabelCode;
import io.dscope.rosettanet.universal.partneridentification.v01_00.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for ReturnLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ReturnBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:1.0}ReturnLabelCode"/&gt;
 *         &lt;element name="ReturnTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0}TrackingReference" minOccurs="0"/&gt;
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
@XmlType(name = "ReturnLabelType", propOrder = {
    "returnBy",
    "returnLabelCode",
    "returnTo",
    "trackingReference"
})
public class ReturnLabelType {

    @XmlElement(name = "ReturnBy")
    protected SpecifiedPartnerDescriptionType returnBy;
    @XmlElementRef(name = "ReturnLabelCode", namespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:1.0", type = ReturnLabelCode.class)
    protected ReturnLabelCode returnLabelCode;
    @XmlElement(name = "ReturnTo")
    protected SpecifiedPartnerDescriptionType returnTo;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:1.0", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the returnBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReturnBy() {
        return returnBy;
    }

    /**
     * Sets the value of the returnBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReturnBy(SpecifiedPartnerDescriptionType value) {
        this.returnBy = value;
    }

    /**
     * Gets the value of the returnLabelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLabelCode }
     *     
     */
    public ReturnLabelCode getReturnLabelCode() {
        return returnLabelCode;
    }

    /**
     * Sets the value of the returnLabelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLabelCode }
     *     
     */
    public void setReturnLabelCode(ReturnLabelCode value) {
        this.returnLabelCode = value;
    }

    /**
     * Gets the value of the returnTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReturnTo() {
        return returnTo;
    }

    /**
     * Sets the value of the returnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReturnTo(SpecifiedPartnerDescriptionType value) {
        this.returnTo = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
