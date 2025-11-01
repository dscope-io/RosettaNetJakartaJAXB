
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
import io.dscope.rosettanet.domain.manufacturing.codelist.processtype.v01_03.ProcessType;
import io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_03.WorkInProcessLocation;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriod;


/**
 * <p>Java class for ProcessInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="MachinePlatform" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlatformHandle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PlatformSoftwareProgram" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessingInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03}ProcessType"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03}WorkInProcessLocation" minOccurs="0"/&gt;
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
@XmlType(name = "ProcessInformationType", propOrder = {
    "datePeriod",
    "machinePlatform",
    "platformHandle",
    "platformSoftwareProgram",
    "processingInstructions",
    "processType",
    "sequenceNumber",
    "workInProcessLocation"
})
public class ProcessInformationType {

    @XmlElementRef(name = "DatePeriod", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = DatePeriod.class, required = false)
    protected DatePeriod datePeriod;
    @XmlElement(name = "MachinePlatform")
    protected String machinePlatform;
    @XmlElement(name = "PlatformHandle")
    protected String platformHandle;
    @XmlElement(name = "PlatformSoftwareProgram")
    protected String platformSoftwareProgram;
    @XmlElement(name = "ProcessingInstructions")
    protected String processingInstructions;
    @XmlElementRef(name = "ProcessType", namespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03", type = ProcessType.class)
    protected ProcessType processType;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElementRef(name = "WorkInProcessLocation", namespace = "urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03", type = WorkInProcessLocation.class, required = false)
    protected WorkInProcessLocation workInProcessLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setDatePeriod(DatePeriod value) {
        this.datePeriod = value;
    }

    /**
     * Gets the value of the machinePlatform property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMachinePlatform() {
        return machinePlatform;
    }

    /**
     * Sets the value of the machinePlatform property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMachinePlatform(String value) {
        this.machinePlatform = value;
    }

    /**
     * Gets the value of the platformHandle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformHandle() {
        return platformHandle;
    }

    /**
     * Sets the value of the platformHandle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformHandle(String value) {
        this.platformHandle = value;
    }

    /**
     * Gets the value of the platformSoftwareProgram property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatformSoftwareProgram() {
        return platformSoftwareProgram;
    }

    /**
     * Sets the value of the platformSoftwareProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatformSoftwareProgram(String value) {
        this.platformSoftwareProgram = value;
    }

    /**
     * Gets the value of the processingInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingInstructions() {
        return processingInstructions;
    }

    /**
     * Sets the value of the processingInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingInstructions(String value) {
        this.processingInstructions = value;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessType }
     *     
     */
    public ProcessType getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessType }
     *     
     */
    public void setProcessType(ProcessType value) {
        this.processType = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the workInProcessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public WorkInProcessLocation getWorkInProcessLocation() {
        return workInProcessLocation;
    }

    /**
     * Sets the value of the workInProcessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public void setWorkInProcessLocation(WorkInProcessLocation value) {
        this.workInProcessLocation = value;
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
