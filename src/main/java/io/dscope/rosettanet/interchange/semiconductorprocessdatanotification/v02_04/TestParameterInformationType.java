
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.MeasurementUnit;


/**
 * <p>Java class for TestParameterInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestParameterInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Calculation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CensorHLim" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CensorLLim" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HighLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LowLimit" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}MeasurementUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Target" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
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
@XmlType(name = "TestParameterInformationType", propOrder = {
    "calculation",
    "censorHLim",
    "censorLLim",
    "condition",
    "highLimit",
    "label",
    "lowLimit",
    "measurementUnit",
    "target"
})
public class TestParameterInformationType {

    @XmlElement(name = "Calculation")
    protected String calculation;
    @XmlElement(name = "CensorHLim")
    protected Float censorHLim;
    @XmlElement(name = "CensorLLim")
    protected Float censorLLim;
    @XmlElement(name = "Condition")
    protected String condition;
    @XmlElement(name = "HighLimit")
    protected Float highLimit;
    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "LowLimit")
    protected Float lowLimit;
    @XmlElementRef(name = "MeasurementUnit", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = MeasurementUnit.class, required = false)
    protected List<MeasurementUnit> measurementUnit;
    @XmlElement(name = "Target")
    protected Float target;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the calculation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCalculation() {
        return calculation;
    }

    /**
     * Sets the value of the calculation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalculation(String value) {
        this.calculation = value;
    }

    /**
     * Gets the value of the censorHLim property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCensorHLim() {
        return censorHLim;
    }

    /**
     * Sets the value of the censorHLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCensorHLim(Float value) {
        this.censorHLim = value;
    }

    /**
     * Gets the value of the censorLLim property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCensorLLim() {
        return censorLLim;
    }

    /**
     * Sets the value of the censorLLim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCensorLLim(Float value) {
        this.censorLLim = value;
    }

    /**
     * Gets the value of the condition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCondition() {
        return condition;
    }

    /**
     * Sets the value of the condition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCondition(String value) {
        this.condition = value;
    }

    /**
     * Gets the value of the highLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getHighLimit() {
        return highLimit;
    }

    /**
     * Sets the value of the highLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setHighLimit(Float value) {
        this.highLimit = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the lowLimit property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLowLimit() {
        return lowLimit;
    }

    /**
     * Sets the value of the lowLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLowLimit(Float value) {
        this.lowLimit = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementUnit }
     * 
     * 
     */
    public List<MeasurementUnit> getMeasurementUnit() {
        if (measurementUnit == null) {
            measurementUnit = new ArrayList<MeasurementUnit>();
        }
        return this.measurementUnit;
    }

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTarget() {
        return target;
    }

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTarget(Float value) {
        this.target = value;
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
