
package io.dscope.rosettanet.domain.design.design.v02_22;

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
 * <p>Java class for MaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Classification" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.22}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.22}MaterialMass" minOccurs="0"/&gt;
 *         &lt;element name="StandardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.22}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "MaterialType", propOrder = {
    "classification",
    "dependentCondition",
    "identifier",
    "materialMass",
    "standardNumber",
    "substance",
    "tradeName",
    "type"
})
public class MaterialType {

    @XmlElement(name = "Classification")
    protected String classification;
    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.22", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "MaterialMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.22", type = MaterialMass.class, required = false)
    protected MaterialMass materialMass;
    @XmlElement(name = "StandardNumber")
    protected String standardNumber;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.22", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlElement(name = "TradeName")
    protected String tradeName;
    @XmlElement(name = "Type", required = true)
    protected String type;
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
     * Gets the value of the materialMass property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialMass }
     *     
     */
    public MaterialMass getMaterialMass() {
        return materialMass;
    }

    /**
     * Sets the value of the materialMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialMass }
     *     
     */
    public void setMaterialMass(MaterialMass value) {
        this.materialMass = value;
    }

    /**
     * Gets the value of the standardNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardNumber() {
        return standardNumber;
    }

    /**
     * Sets the value of the standardNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardNumber(String value) {
        this.standardNumber = value;
    }

    /**
     * Gets the value of the substance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Substance }
     * 
     * 
     */
    public List<Substance> getSubstance() {
        if (substance == null) {
            substance = new ArrayList<Substance>();
        }
        return this.substance;
    }

    /**
     * Gets the value of the tradeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeName() {
        return tradeName;
    }

    /**
     * Sets the value of the tradeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeName(String value) {
        this.tradeName = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
