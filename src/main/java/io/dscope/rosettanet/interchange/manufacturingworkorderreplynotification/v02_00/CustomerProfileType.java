
package io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasureType;


/**
 * <p>Java class for CustomerProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerProfileType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LineItemQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="LineItemQuantityUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasureType"/&gt;
 *         &lt;element name="RequestedEvent" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RequestedStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ShipToIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerProfileType", propOrder = {
    "lineItemQuantity",
    "lineItemQuantityUOM",
    "requestedEvent",
    "requestedStartDate",
    "shipToIdentifier"
})
public class CustomerProfileType {

    @XmlElement(name = "LineItemQuantity")
    protected float lineItemQuantity;
    @XmlElement(name = "LineItemQuantityUOM", required = true)
    protected UnitOfMeasureType lineItemQuantityUOM;
    @XmlElement(name = "RequestedEvent")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedEvent;
    @XmlElement(name = "RequestedStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedStartDate;
    @XmlElement(name = "ShipToIdentifier")
    protected String shipToIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lineItemQuantity property.
     * 
     */
    public float getLineItemQuantity() {
        return lineItemQuantity;
    }

    /**
     * Sets the value of the lineItemQuantity property.
     * 
     */
    public void setLineItemQuantity(float value) {
        this.lineItemQuantity = value;
    }

    /**
     * Gets the value of the lineItemQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getLineItemQuantityUOM() {
        return lineItemQuantityUOM;
    }

    /**
     * Sets the value of the lineItemQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setLineItemQuantityUOM(UnitOfMeasureType value) {
        this.lineItemQuantityUOM = value;
    }

    /**
     * Gets the value of the requestedEvent property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedEvent() {
        return requestedEvent;
    }

    /**
     * Sets the value of the requestedEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedEvent(XMLGregorianCalendar value) {
        this.requestedEvent = value;
    }

    /**
     * Gets the value of the requestedStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedStartDate() {
        return requestedStartDate;
    }

    /**
     * Sets the value of the requestedStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedStartDate(XMLGregorianCalendar value) {
        this.requestedStartDate = value;
    }

    /**
     * Gets the value of the shipToIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipToIdentifier() {
        return shipToIdentifier;
    }

    /**
     * Sets the value of the shipToIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipToIdentifier(String value) {
        this.shipToIdentifier = value;
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
