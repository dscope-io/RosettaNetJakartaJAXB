
package io.dscope.rosettanet.domain.service.service.v02_14;

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


/**
 * <p>Java class for IncidentDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncidentDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="IncidentCodeValueDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WorkCenter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.14}FailureEvent"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.14}RepairEvent"/&gt;
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
@XmlType(name = "IncidentDetailType", propOrder = {
    "eventDate",
    "incidentCodeValueDescription",
    "operatorIdentifier",
    "workCenter",
    "failureEvent",
    "repairEvent"
})
public class IncidentDetailType {

    @XmlElement(name = "EventDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(name = "IncidentCodeValueDescription")
    protected String incidentCodeValueDescription;
    @XmlElement(name = "OperatorIdentifier")
    protected String operatorIdentifier;
    @XmlElement(name = "WorkCenter")
    protected String workCenter;
    @XmlElementRef(name = "FailureEvent", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.14", type = FailureEvent.class, required = false)
    protected FailureEvent failureEvent;
    @XmlElementRef(name = "RepairEvent", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.14", type = RepairEvent.class, required = false)
    protected RepairEvent repairEvent;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the incidentCodeValueDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentCodeValueDescription() {
        return incidentCodeValueDescription;
    }

    /**
     * Sets the value of the incidentCodeValueDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentCodeValueDescription(String value) {
        this.incidentCodeValueDescription = value;
    }

    /**
     * Gets the value of the operatorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIdentifier() {
        return operatorIdentifier;
    }

    /**
     * Sets the value of the operatorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIdentifier(String value) {
        this.operatorIdentifier = value;
    }

    /**
     * Gets the value of the workCenter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkCenter() {
        return workCenter;
    }

    /**
     * Sets the value of the workCenter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkCenter(String value) {
        this.workCenter = value;
    }

    /**
     * Gets the value of the failureEvent property.
     * 
     * @return
     *     possible object is
     *     {@link FailureEvent }
     *     
     */
    public FailureEvent getFailureEvent() {
        return failureEvent;
    }

    /**
     * Sets the value of the failureEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureEvent }
     *     
     */
    public void setFailureEvent(FailureEvent value) {
        this.failureEvent = value;
    }

    /**
     * Gets the value of the repairEvent property.
     * 
     * @return
     *     possible object is
     *     {@link RepairEvent }
     *     
     */
    public RepairEvent getRepairEvent() {
        return repairEvent;
    }

    /**
     * Sets the value of the repairEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairEvent }
     *     
     */
    public void setRepairEvent(RepairEvent value) {
        this.repairEvent = value;
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
