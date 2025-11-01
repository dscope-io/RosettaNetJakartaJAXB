
package io.dscope.rosettanet.domain.procurement.procurement.v02_21;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrderQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RemainingQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RequestedQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="ScheduledShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TotalReceivedQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "OrderQuantityType", propOrder = {
    "remainingQuantity",
    "requestedQuantity",
    "scheduledShipQuantity",
    "totalReceivedQuantity"
})
public class OrderQuantityType {

    @XmlElement(name = "RemainingQuantity")
    protected Float remainingQuantity;
    @XmlElement(name = "RequestedQuantity")
    protected float requestedQuantity;
    @XmlElement(name = "ScheduledShipQuantity")
    protected Float scheduledShipQuantity;
    @XmlElement(name = "TotalReceivedQuantity")
    protected Float totalReceivedQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the remainingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRemainingQuantity() {
        return remainingQuantity;
    }

    /**
     * Sets the value of the remainingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRemainingQuantity(Float value) {
        this.remainingQuantity = value;
    }

    /**
     * Gets the value of the requestedQuantity property.
     * 
     */
    public float getRequestedQuantity() {
        return requestedQuantity;
    }

    /**
     * Sets the value of the requestedQuantity property.
     * 
     */
    public void setRequestedQuantity(float value) {
        this.requestedQuantity = value;
    }

    /**
     * Gets the value of the scheduledShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getScheduledShipQuantity() {
        return scheduledShipQuantity;
    }

    /**
     * Sets the value of the scheduledShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setScheduledShipQuantity(Float value) {
        this.scheduledShipQuantity = value;
    }

    /**
     * Gets the value of the totalReceivedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTotalReceivedQuantity() {
        return totalReceivedQuantity;
    }

    /**
     * Sets the value of the totalReceivedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTotalReceivedQuantity(Float value) {
        this.totalReceivedQuantity = value;
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
