
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.ProcessRouting;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for WorkInProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkInProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="IsPreviousNotificationSuperceded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ManufacturedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="ManufacturingLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturingLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}ManufacturingLotType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}ProcessRouting"/&gt;
 *         &lt;element name="QuantityChangeDescription" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}QuantityChangeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="StatusChangeDescription" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}StatusChangeDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WorkInProcessType:xsd:codelist:01.04}WorkInProcessType"/&gt;
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
@XmlType(name = "WorkInProcessType", propOrder = {
    "eventDateTime",
    "isPreviousNotificationSuperceded",
    "manufacturedBy",
    "manufacturingLine",
    "manufacturingLot",
    "processRouting",
    "quantityChangeDescription",
    "statusChangeDescription",
    "workInProcessType"
})
public class WorkInProcessType {

    @XmlElement(name = "EventDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDateTime;
    @XmlElement(name = "IsPreviousNotificationSuperceded")
    protected boolean isPreviousNotificationSuperceded;
    @XmlElement(name = "ManufacturedBy", required = true)
    protected SpecifiedPartnerDescriptionType manufacturedBy;
    @XmlElement(name = "ManufacturingLine")
    protected String manufacturingLine;
    @XmlElement(name = "ManufacturingLot", required = true)
    protected ManufacturingLotType manufacturingLot;
    @XmlElementRef(name = "ProcessRouting", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = ProcessRouting.class)
    protected ProcessRouting processRouting;
    @XmlElement(name = "QuantityChangeDescription")
    protected QuantityChangeDescriptionType quantityChangeDescription;
    @XmlElement(name = "StatusChangeDescription")
    protected StatusChangeDescriptionType statusChangeDescription;
    @XmlElementRef(name = "WorkInProcessType", namespace = "urn:rosettanet:specification:domain:Manufacturing:WorkInProcessType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType.class)
    protected io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType workInProcessType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the eventDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDateTime() {
        return eventDateTime;
    }

    /**
     * Sets the value of the eventDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDateTime(XMLGregorianCalendar value) {
        this.eventDateTime = value;
    }

    /**
     * Gets the value of the isPreviousNotificationSuperceded property.
     * 
     */
    public boolean isIsPreviousNotificationSuperceded() {
        return isPreviousNotificationSuperceded;
    }

    /**
     * Sets the value of the isPreviousNotificationSuperceded property.
     * 
     */
    public void setIsPreviousNotificationSuperceded(boolean value) {
        this.isPreviousNotificationSuperceded = value;
    }

    /**
     * Gets the value of the manufacturedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getManufacturedBy() {
        return manufacturedBy;
    }

    /**
     * Sets the value of the manufacturedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setManufacturedBy(SpecifiedPartnerDescriptionType value) {
        this.manufacturedBy = value;
    }

    /**
     * Gets the value of the manufacturingLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingLine() {
        return manufacturingLine;
    }

    /**
     * Sets the value of the manufacturingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingLine(String value) {
        this.manufacturingLine = value;
    }

    /**
     * Gets the value of the manufacturingLot property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturingLotType }
     *     
     */
    public ManufacturingLotType getManufacturingLot() {
        return manufacturingLot;
    }

    /**
     * Sets the value of the manufacturingLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturingLotType }
     *     
     */
    public void setManufacturingLot(ManufacturingLotType value) {
        this.manufacturingLot = value;
    }

    /**
     * Gets the value of the processRouting property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRouting }
     *     
     */
    public ProcessRouting getProcessRouting() {
        return processRouting;
    }

    /**
     * Sets the value of the processRouting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRouting }
     *     
     */
    public void setProcessRouting(ProcessRouting value) {
        this.processRouting = value;
    }

    /**
     * Gets the value of the quantityChangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityChangeDescriptionType }
     *     
     */
    public QuantityChangeDescriptionType getQuantityChangeDescription() {
        return quantityChangeDescription;
    }

    /**
     * Sets the value of the quantityChangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityChangeDescriptionType }
     *     
     */
    public void setQuantityChangeDescription(QuantityChangeDescriptionType value) {
        this.quantityChangeDescription = value;
    }

    /**
     * Gets the value of the statusChangeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link StatusChangeDescriptionType }
     *     
     */
    public StatusChangeDescriptionType getStatusChangeDescription() {
        return statusChangeDescription;
    }

    /**
     * Sets the value of the statusChangeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusChangeDescriptionType }
     *     
     */
    public void setStatusChangeDescription(StatusChangeDescriptionType value) {
        this.statusChangeDescription = value;
    }

    /**
     * Gets the value of the workInProcessType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType }
     *     
     */
    public io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType getWorkInProcessType() {
        return workInProcessType;
    }

    /**
     * Sets the value of the workInProcessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType }
     *     
     */
    public void setWorkInProcessType(io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesstype.v01_04.WorkInProcessType value) {
        this.workInProcessType = value;
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
