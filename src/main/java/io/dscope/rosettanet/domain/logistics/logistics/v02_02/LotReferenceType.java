
package io.dscope.rosettanet.domain.logistics.logistics.v02_02;

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
import io.dscope.rosettanet.domain.logistics.codelist.lotdiscrepancyreason.v01_02.LotDiscrepancyReason;


/**
 * <p>Java class for LotReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.02}LotDiscrepancyReason" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedLotQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShippedLot" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippedLotQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "LotReferenceType", propOrder = {
    "expiryDate",
    "lotDiscrepancyReason",
    "requestedLot",
    "requestedLotQuantity",
    "shippedLot",
    "shippedLotQuantity"
})
public class LotReferenceType {

    @XmlElement(name = "ExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElementRef(name = "LotDiscrepancyReason", namespace = "urn:rosettanet:specification:domain:Logistics:LotDiscrepancyReason:xsd:codelist:01.02", type = LotDiscrepancyReason.class, required = false)
    protected LotDiscrepancyReason lotDiscrepancyReason;
    @XmlElement(name = "RequestedLot")
    protected String requestedLot;
    @XmlElement(name = "RequestedLotQuantity")
    protected Float requestedLotQuantity;
    @XmlElement(name = "ShippedLot")
    protected String shippedLot;
    @XmlElement(name = "ShippedLotQuantity")
    protected Float shippedLotQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the lotDiscrepancyReason property.
     * 
     * @return
     *     possible object is
     *     {@link LotDiscrepancyReason }
     *     
     */
    public LotDiscrepancyReason getLotDiscrepancyReason() {
        return lotDiscrepancyReason;
    }

    /**
     * Sets the value of the lotDiscrepancyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotDiscrepancyReason }
     *     
     */
    public void setLotDiscrepancyReason(LotDiscrepancyReason value) {
        this.lotDiscrepancyReason = value;
    }

    /**
     * Gets the value of the requestedLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestedLot() {
        return requestedLot;
    }

    /**
     * Sets the value of the requestedLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestedLot(String value) {
        this.requestedLot = value;
    }

    /**
     * Gets the value of the requestedLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRequestedLotQuantity() {
        return requestedLotQuantity;
    }

    /**
     * Sets the value of the requestedLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRequestedLotQuantity(Float value) {
        this.requestedLotQuantity = value;
    }

    /**
     * Gets the value of the shippedLot property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippedLot() {
        return shippedLot;
    }

    /**
     * Sets the value of the shippedLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippedLot(String value) {
        this.shippedLot = value;
    }

    /**
     * Gets the value of the shippedLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getShippedLotQuantity() {
        return shippedLotQuantity;
    }

    /**
     * Sets the value of the shippedLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShippedLotQuantity(Float value) {
        this.shippedLotQuantity = value;
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
