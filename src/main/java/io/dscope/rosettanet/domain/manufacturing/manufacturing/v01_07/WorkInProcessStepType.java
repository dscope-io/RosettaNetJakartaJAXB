
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.equipmenttype.v01_02.EquipmentType;


/**
 * <p>Java class for WorkInProcessStepType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkInProcessStepType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CurrentStepName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02}EquipmentType" minOccurs="0"/&gt;
 *         &lt;element name="InverseYield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element name="MaximumStepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreviousStepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StepNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Yield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}PercentAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "WorkInProcessStepType", propOrder = {
    "alternateResourceIdentifier",
    "currentStepName",
    "equipmentType",
    "inverseYield",
    "maximumStepNumber",
    "previousStepNumber",
    "resourceIdentifier",
    "resourceType",
    "stepNumber",
    "yield"
})
public class WorkInProcessStepType {

    @XmlElement(name = "AlternateResourceIdentifier")
    protected String alternateResourceIdentifier;
    @XmlElement(name = "CurrentStepName")
    protected String currentStepName;
    @XmlElementRef(name = "EquipmentType", namespace = "urn:rosettanet:specification:domain:Manufacturing:EquipmentType:xsd:codelist:01.02", type = EquipmentType.class, required = false)
    protected EquipmentType equipmentType;
    @XmlElement(name = "InverseYield")
    protected BigDecimal inverseYield;
    @XmlElement(name = "MaximumStepNumber")
    protected String maximumStepNumber;
    @XmlElement(name = "PreviousStepNumber")
    protected String previousStepNumber;
    @XmlElement(name = "ResourceIdentifier")
    protected String resourceIdentifier;
    @XmlElement(name = "ResourceType")
    protected String resourceType;
    @XmlElement(name = "StepNumber")
    protected String stepNumber;
    @XmlElement(name = "Yield")
    protected BigDecimal yield;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternateResourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternateResourceIdentifier() {
        return alternateResourceIdentifier;
    }

    /**
     * Sets the value of the alternateResourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternateResourceIdentifier(String value) {
        this.alternateResourceIdentifier = value;
    }

    /**
     * Gets the value of the currentStepName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentStepName() {
        return currentStepName;
    }

    /**
     * Sets the value of the currentStepName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentStepName(String value) {
        this.currentStepName = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link EquipmentType }
     *     
     */
    public EquipmentType getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquipmentType }
     *     
     */
    public void setEquipmentType(EquipmentType value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the inverseYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getInverseYield() {
        return inverseYield;
    }

    /**
     * Sets the value of the inverseYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setInverseYield(BigDecimal value) {
        this.inverseYield = value;
    }

    /**
     * Gets the value of the maximumStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStepNumber() {
        return maximumStepNumber;
    }

    /**
     * Sets the value of the maximumStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStepNumber(String value) {
        this.maximumStepNumber = value;
    }

    /**
     * Gets the value of the previousStepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreviousStepNumber() {
        return previousStepNumber;
    }

    /**
     * Sets the value of the previousStepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreviousStepNumber(String value) {
        this.previousStepNumber = value;
    }

    /**
     * Gets the value of the resourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * Sets the value of the resourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceIdentifier(String value) {
        this.resourceIdentifier = value;
    }

    /**
     * Gets the value of the resourceType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceType() {
        return resourceType;
    }

    /**
     * Sets the value of the resourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceType(String value) {
        this.resourceType = value;
    }

    /**
     * Gets the value of the stepNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStepNumber() {
        return stepNumber;
    }

    /**
     * Sets the value of the stepNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStepNumber(String value) {
        this.stepNumber = value;
    }

    /**
     * Gets the value of the yield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getYield() {
        return yield;
    }

    /**
     * Sets the value of the yield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setYield(BigDecimal value) {
        this.yield = value;
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
