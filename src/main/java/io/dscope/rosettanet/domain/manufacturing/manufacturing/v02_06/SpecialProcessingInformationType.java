
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_03.SpecialInstructionCategory;


/**
 * <p>Java class for SpecialProcessingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialProcessingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03}ProcessType" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.03}SpecialInstructionCategory"/&gt;
 *         &lt;element name="SpecialInstructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SpecialProcessingInformationType", propOrder = {
    "processType",
    "sequenceNumber",
    "specialInstructionCategory",
    "specialInstructions"
})
public class SpecialProcessingInformationType {

    @XmlElementRef(name = "ProcessType", namespace = "urn:rosettanet:specification:domain:Manufacturing:ProcessType:xsd:codelist:01.03", type = ProcessType.class, required = false)
    protected ProcessType processType;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElementRef(name = "SpecialInstructionCategory", namespace = "urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.03", type = SpecialInstructionCategory.class)
    protected SpecialInstructionCategory specialInstructionCategory;
    @XmlElement(name = "SpecialInstructions")
    protected String specialInstructions;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the specialInstructionCategory property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialInstructionCategory }
     *     
     */
    public SpecialInstructionCategory getSpecialInstructionCategory() {
        return specialInstructionCategory;
    }

    /**
     * Sets the value of the specialInstructionCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialInstructionCategory }
     *     
     */
    public void setSpecialInstructionCategory(SpecialInstructionCategory value) {
        this.specialInstructionCategory = value;
    }

    /**
     * Gets the value of the specialInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstructions() {
        return specialInstructions;
    }

    /**
     * Sets the value of the specialInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstructions(String value) {
        this.specialInstructions = value;
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
