
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for DateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GoodsIssuedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestedShipDate" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ShipmentDateType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScheduledDeliveryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "DateInformationType", propOrder = {
    "actualShipDate",
    "goodsIssuedDate",
    "requestedShipDate",
    "scheduledDeliveryDate"
})
public class DateInformationType {

    @XmlElement(name = "ActualShipDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualShipDate;
    @XmlElement(name = "GoodsIssuedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar goodsIssuedDate;
    @XmlElement(name = "RequestedShipDate")
    protected List<ShipmentDateType> requestedShipDate;
    @XmlElement(name = "ScheduledDeliveryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar scheduledDeliveryDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShipDate(XMLGregorianCalendar value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the goodsIssuedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGoodsIssuedDate() {
        return goodsIssuedDate;
    }

    /**
     * Sets the value of the goodsIssuedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGoodsIssuedDate(XMLGregorianCalendar value) {
        this.goodsIssuedDate = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestedShipDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestedShipDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDateType }
     * 
     * 
     */
    public List<ShipmentDateType> getRequestedShipDate() {
        if (requestedShipDate == null) {
            requestedShipDate = new ArrayList<ShipmentDateType>();
        }
        return this.requestedShipDate;
    }

    /**
     * Gets the value of the scheduledDeliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getScheduledDeliveryDate() {
        return scheduledDeliveryDate;
    }

    /**
     * Sets the value of the scheduledDeliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setScheduledDeliveryDate(XMLGregorianCalendar value) {
        this.scheduledDeliveryDate = value;
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
