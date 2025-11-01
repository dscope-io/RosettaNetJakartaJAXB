
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ShipmentStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ShipmentInformation" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}ShipmentInformationType"/&gt;
 *         &lt;element name="ShipmentLineItem" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}ShipmentLineItemType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentStatusType", propOrder = {
    "shipmentInformation",
    "shipmentLineItem"
})
public class ShipmentStatusType {

    @XmlElement(name = "ShipmentInformation", required = true)
    protected ShipmentInformationType shipmentInformation;
    @XmlElement(name = "ShipmentLineItem")
    protected ShipmentLineItemType shipmentLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInformationType }
     *     
     */
    public ShipmentInformationType getShipmentInformation() {
        return shipmentInformation;
    }

    /**
     * Sets the value of the shipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInformationType }
     *     
     */
    public void setShipmentInformation(ShipmentInformationType value) {
        this.shipmentInformation = value;
    }

    /**
     * Gets the value of the shipmentLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public ShipmentLineItemType getShipmentLineItem() {
        return shipmentLineItem;
    }

    /**
     * Sets the value of the shipmentLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentLineItemType }
     *     
     */
    public void setShipmentLineItem(ShipmentLineItemType value) {
        this.shipmentLineItem = value;
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
