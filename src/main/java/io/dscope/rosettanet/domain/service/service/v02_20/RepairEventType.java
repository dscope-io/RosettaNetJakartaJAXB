
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.repairtype.v01_02.RepairType;


/**
 * <p>Java class for RepairEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IncidentRepairCodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02}RepairType" minOccurs="0"/&gt;
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
@XmlType(name = "RepairEventType", propOrder = {
    "incidentRepairCodeValue",
    "repairType"
})
public class RepairEventType {

    @XmlElement(name = "IncidentRepairCodeValue")
    protected String incidentRepairCodeValue;
    @XmlElementRef(name = "RepairType", namespace = "urn:rosettanet:specification:domain:Service:RepairType:xsd:codelist:01.02", type = RepairType.class, required = false)
    protected RepairType repairType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the incidentRepairCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentRepairCodeValue() {
        return incidentRepairCodeValue;
    }

    /**
     * Sets the value of the incidentRepairCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentRepairCodeValue(String value) {
        this.incidentRepairCodeValue = value;
    }

    /**
     * Gets the value of the repairType property.
     * 
     * @return
     *     possible object is
     *     {@link RepairType }
     *     
     */
    public RepairType getRepairType() {
        return repairType;
    }

    /**
     * Sets the value of the repairType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RepairType }
     *     
     */
    public void setRepairType(RepairType value) {
        this.repairType = value;
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
