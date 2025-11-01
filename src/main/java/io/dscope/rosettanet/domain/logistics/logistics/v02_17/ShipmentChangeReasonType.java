
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_03.ShipmentChangeDisposition;


/**
 * <p>Java class for ShipmentChangeReasonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentChangeReasonType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.03}ShipmentChangeDisposition" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentChangeReasonType", propOrder = {
    "description",
    "shipmentChangeDisposition"
})
public class ShipmentChangeReasonType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "ShipmentChangeDisposition", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.03", type = ShipmentChangeDisposition.class, required = false)
    protected ShipmentChangeDisposition shipmentChangeDisposition;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the shipmentChangeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChangeDisposition }
     *     
     */
    public ShipmentChangeDisposition getShipmentChangeDisposition() {
        return shipmentChangeDisposition;
    }

    /**
     * Sets the value of the shipmentChangeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChangeDisposition }
     *     
     */
    public void setShipmentChangeDisposition(ShipmentChangeDisposition value) {
        this.shipmentChangeDisposition = value;
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
