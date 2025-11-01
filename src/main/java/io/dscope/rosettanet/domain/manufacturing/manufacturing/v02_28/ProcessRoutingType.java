
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DateTimePeriodType;


/**
 * <p>Java class for ProcessRoutingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessRoutingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationLotDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousProcessRoutingDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousProcessRoutingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28}WorkInProcessStage"/&gt;
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
@XmlType(name = "ProcessRoutingType", propOrder = {
    "description",
    "identifier",
    "operationLotDate",
    "previousProcessRoutingDescription",
    "previousProcessRoutingIdentifier",
    "workInProcessStage"
})
public class ProcessRoutingType {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "OperationLotDate")
    protected DateTimePeriodType operationLotDate;
    @XmlElement(name = "PreviousProcessRoutingDescription")
    protected String previousProcessRoutingDescription;
    @XmlElement(name = "PreviousProcessRoutingIdentifier")
    protected String previousProcessRoutingIdentifier;
    @XmlElementRef(name = "WorkInProcessStage", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", type = WorkInProcessStage.class)
    protected WorkInProcessStage workInProcessStage;
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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the operationLotDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getOperationLotDate() {
        return operationLotDate;
    }

    /**
     * Sets the value of the operationLotDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setOperationLotDate(DateTimePeriodType value) {
        this.operationLotDate = value;
    }

    /**
     * Gets the value of the previousProcessRoutingDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousProcessRoutingDescription() {
        return previousProcessRoutingDescription;
    }

    /**
     * Sets the value of the previousProcessRoutingDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousProcessRoutingDescription(String value) {
        this.previousProcessRoutingDescription = value;
    }

    /**
     * Gets the value of the previousProcessRoutingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousProcessRoutingIdentifier() {
        return previousProcessRoutingIdentifier;
    }

    /**
     * Sets the value of the previousProcessRoutingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousProcessRoutingIdentifier(String value) {
        this.previousProcessRoutingIdentifier = value;
    }

    /**
     * Gets the value of the workInProcessStage property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInProcessStage }
     *     
     */
    public WorkInProcessStage getWorkInProcessStage() {
        return workInProcessStage;
    }

    /**
     * Sets the value of the workInProcessStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInProcessStage }
     *     
     */
    public void setWorkInProcessStage(WorkInProcessStage value) {
        this.workInProcessStage = value;
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
