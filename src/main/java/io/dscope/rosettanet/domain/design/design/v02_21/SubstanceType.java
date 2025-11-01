
package io.dscope.rosettanet.domain.design.design.v02_21;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SubstanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.21}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Exempt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExemptListVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.21}Radioactivity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.21}SubstanceIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.21}SubstanceMass" minOccurs="0"/&gt;
 *         &lt;element name="SubstanceNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.21}NoteType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.21}Threshold" minOccurs="0"/&gt;
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
@XmlType(name = "SubstanceType", propOrder = {
    "classification",
    "dependentCondition",
    "exempt",
    "exemptListVersion",
    "name",
    "radioactivity",
    "substanceIdentification",
    "substanceMass",
    "substanceNote",
    "threshold"
})
public class SubstanceType {

    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.21", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElement(name = "Exempt")
    protected String exempt;
    @XmlElement(name = "ExemptListVersion")
    protected String exemptListVersion;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementRef(name = "Radioactivity", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.21", type = Radioactivity.class, required = false)
    protected List<Radioactivity> radioactivity;
    @XmlElementRef(name = "SubstanceIdentification", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.21", type = SubstanceIdentification.class)
    protected SubstanceIdentification substanceIdentification;
    @XmlElementRef(name = "SubstanceMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.21", type = SubstanceMass.class, required = false)
    protected SubstanceMass substanceMass;
    @XmlElement(name = "SubstanceNote")
    protected String substanceNote;
    @XmlElementRef(name = "Threshold", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.21", type = Threshold.class, required = false)
    protected Threshold threshold;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the classification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassification() {
        return classification;
    }

    /**
     * Sets the value of the classification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassification(String value) {
        this.classification = value;
    }

    /**
     * Gets the value of the dependentCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentCondition }
     * 
     * 
     */
    public List<DependentCondition> getDependentCondition() {
        if (dependentCondition == null) {
            dependentCondition = new ArrayList<DependentCondition>();
        }
        return this.dependentCondition;
    }

    /**
     * Gets the value of the exempt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExempt() {
        return exempt;
    }

    /**
     * Sets the value of the exempt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExempt(String value) {
        this.exempt = value;
    }

    /**
     * Gets the value of the exemptListVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExemptListVersion() {
        return exemptListVersion;
    }

    /**
     * Sets the value of the exemptListVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExemptListVersion(String value) {
        this.exemptListVersion = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the radioactivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the radioactivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRadioactivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Radioactivity }
     * 
     * 
     */
    public List<Radioactivity> getRadioactivity() {
        if (radioactivity == null) {
            radioactivity = new ArrayList<Radioactivity>();
        }
        return this.radioactivity;
    }

    /**
     * Gets the value of the substanceIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceIdentification }
     *     
     */
    public SubstanceIdentification getSubstanceIdentification() {
        return substanceIdentification;
    }

    /**
     * Sets the value of the substanceIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceIdentification }
     *     
     */
    public void setSubstanceIdentification(SubstanceIdentification value) {
        this.substanceIdentification = value;
    }

    /**
     * Gets the value of the substanceMass property.
     * 
     * @return
     *     possible object is
     *     {@link SubstanceMass }
     *     
     */
    public SubstanceMass getSubstanceMass() {
        return substanceMass;
    }

    /**
     * Sets the value of the substanceMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstanceMass }
     *     
     */
    public void setSubstanceMass(SubstanceMass value) {
        this.substanceMass = value;
    }

    /**
     * Gets the value of the substanceNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstanceNote() {
        return substanceNote;
    }

    /**
     * Sets the value of the substanceNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstanceNote(String value) {
        this.substanceNote = value;
    }

    /**
     * Gets the value of the threshold property.
     * 
     * @return
     *     possible object is
     *     {@link Threshold }
     *     
     */
    public Threshold getThreshold() {
        return threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link Threshold }
     *     
     */
    public void setThreshold(Threshold value) {
        this.threshold = value;
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
