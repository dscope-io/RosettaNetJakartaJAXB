
package io.dscope.rosettanet.domain.procurement.procurement.v02_19;

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
import io.dscope.rosettanet.domain.procurement.codelist.datetype.v01_00.DateType;
import io.dscope.rosettanet.domain.procurement.codelist.event.v01_00.Event;


/**
 * <p>Java class for MilestoneDateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MilestoneDateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:DateType:xsd:codelist:01.00}DateType"/&gt;
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}AlternativeEvent"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00}Event"/&gt;
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
@XmlType(name = "MilestoneDateType", propOrder = {
    "dateType",
    "eventDate",
    "alternativeEvent",
    "event"
})
public class MilestoneDateType {

    @XmlElementRef(name = "DateType", namespace = "urn:rosettanet:specification:domain:Procurement:DateType:xsd:codelist:01.00", type = DateType.class)
    protected DateType dateType;
    @XmlElement(name = "EventDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar eventDate;
    @XmlElementRef(name = "AlternativeEvent", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = AlternativeEvent.class, required = false)
    protected AlternativeEvent alternativeEvent;
    @XmlElementRef(name = "Event", namespace = "urn:rosettanet:specification:domain:Procurement:Event:xsd:codelist:01.00", type = Event.class, required = false)
    protected Event event;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateType property.
     * 
     * @return
     *     possible object is
     *     {@link DateType }
     *     
     */
    public DateType getDateType() {
        return dateType;
    }

    /**
     * Sets the value of the dateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateType }
     *     
     */
    public void setDateType(DateType value) {
        this.dateType = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the alternativeEvent property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeEvent }
     *     
     */
    public AlternativeEvent getAlternativeEvent() {
        return alternativeEvent;
    }

    /**
     * Sets the value of the alternativeEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeEvent }
     *     
     */
    public void setAlternativeEvent(AlternativeEvent value) {
        this.alternativeEvent = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link Event }
     *     
     */
    public Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event }
     *     
     */
    public void setEvent(Event value) {
        this.event = value;
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
