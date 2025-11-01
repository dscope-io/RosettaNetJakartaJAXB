
package io.dscope.rosettanet.domain.logistics.logistics.v02_20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TrackingReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackingReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentTrackingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.06}TrackingReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "TrackingReferenceType", propOrder = {
    "shipmentTrackingIdentifier",
    "trackingReferenceType"
})
public class TrackingReferenceType {

    @XmlElement(name = "ShipmentTrackingIdentifier")
    protected String shipmentTrackingIdentifier;
    @XmlElementRef(name = "TrackingReferenceType", namespace = "urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.06", type = io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType.class, required = false)
    protected io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType trackingReferenceType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shipmentTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentTrackingIdentifier() {
        return shipmentTrackingIdentifier;
    }

    /**
     * Sets the value of the shipmentTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentTrackingIdentifier(String value) {
        this.shipmentTrackingIdentifier = value;
    }

    /**
     * Gets the value of the trackingReferenceType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType }
     *     
     */
    public io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType getTrackingReferenceType() {
        return trackingReferenceType;
    }

    /**
     * Sets the value of the trackingReferenceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType }
     *     
     */
    public void setTrackingReferenceType(io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_06.TrackingReferenceType value) {
        this.trackingReferenceType = value;
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
