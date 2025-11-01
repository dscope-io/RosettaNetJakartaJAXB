
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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.logistics.codelist.shipdatecode.v01_00.ShipDateCode;


/**
 * <p>Java class for ShipmentDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:1.0}ShipDateCode"/&gt;
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
@XmlType(name = "ShipmentDateType", propOrder = {
    "dateTimeStamp",
    "shipDateCode"
})
public class ShipmentDateType {

    @XmlElement(name = "DateTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStamp;
    @XmlElementRef(name = "ShipDateCode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipDateCode:xsd:codelist:1.0", type = ShipDateCode.class)
    protected ShipDateCode shipDateCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStamp(XMLGregorianCalendar value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the shipDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipDateCode }
     *     
     */
    public ShipDateCode getShipDateCode() {
        return shipDateCode;
    }

    /**
     * Sets the value of the shipDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipDateCode }
     *     
     */
    public void setShipDateCode(ShipDateCode value) {
        this.shipDateCode = value;
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
