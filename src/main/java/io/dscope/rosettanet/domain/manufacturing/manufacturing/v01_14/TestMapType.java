
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14;

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
 * <p>Java class for TestMapType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestMapType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CenterX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CenterY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="LogicalMax" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="LogicalMin" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}MeasurementUnit" minOccurs="0"/&gt;
 *         &lt;element name="PosDirX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="PosDirY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDieRelationX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDieRelationY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDimensionX" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="RetDimensionY" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}WaferCoordinate" minOccurs="0"/&gt;
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
@XmlType(name = "TestMapType", propOrder = {
    "centerX",
    "centerY",
    "logicalMax",
    "logicalMin",
    "measurementUnit",
    "posDirX",
    "posDirY",
    "retDieRelationX",
    "retDieRelationY",
    "retDimensionX",
    "retDimensionY",
    "waferCoordinate"
})
public class TestMapType {

    @XmlElement(name = "CenterX")
    protected Float centerX;
    @XmlElement(name = "CenterY")
    protected Float centerY;
    @XmlElement(name = "LogicalMax")
    protected Float logicalMax;
    @XmlElement(name = "LogicalMin")
    protected Float logicalMin;
    @XmlElementRef(name = "MeasurementUnit", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = MeasurementUnit.class, required = false)
    protected MeasurementUnit measurementUnit;
    @XmlElement(name = "PosDirX")
    protected Float posDirX;
    @XmlElement(name = "PosDirY")
    protected Float posDirY;
    @XmlElement(name = "RetDieRelationX")
    protected Float retDieRelationX;
    @XmlElement(name = "RetDieRelationY")
    protected Float retDieRelationY;
    @XmlElement(name = "RetDimensionX")
    protected Float retDimensionX;
    @XmlElement(name = "RetDimensionY")
    protected Float retDimensionY;
    @XmlElementRef(name = "WaferCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = WaferCoordinate.class, required = false)
    protected WaferCoordinate waferCoordinate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the centerX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCenterX() {
        return centerX;
    }

    /**
     * Sets the value of the centerX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCenterX(Float value) {
        this.centerX = value;
    }

    /**
     * Gets the value of the centerY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCenterY() {
        return centerY;
    }

    /**
     * Sets the value of the centerY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCenterY(Float value) {
        this.centerY = value;
    }

    /**
     * Gets the value of the logicalMax property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLogicalMax() {
        return logicalMax;
    }

    /**
     * Sets the value of the logicalMax property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLogicalMax(Float value) {
        this.logicalMax = value;
    }

    /**
     * Gets the value of the logicalMin property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getLogicalMin() {
        return logicalMin;
    }

    /**
     * Sets the value of the logicalMin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setLogicalMin(Float value) {
        this.logicalMin = value;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementUnit }
     *     
     */
    public MeasurementUnit getMeasurementUnit() {
        return measurementUnit;
    }

    /**
     * Sets the value of the measurementUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementUnit }
     *     
     */
    public void setMeasurementUnit(MeasurementUnit value) {
        this.measurementUnit = value;
    }

    /**
     * Gets the value of the posDirX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPosDirX() {
        return posDirX;
    }

    /**
     * Sets the value of the posDirX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPosDirX(Float value) {
        this.posDirX = value;
    }

    /**
     * Gets the value of the posDirY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPosDirY() {
        return posDirY;
    }

    /**
     * Sets the value of the posDirY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPosDirY(Float value) {
        this.posDirY = value;
    }

    /**
     * Gets the value of the retDieRelationX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDieRelationX() {
        return retDieRelationX;
    }

    /**
     * Sets the value of the retDieRelationX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDieRelationX(Float value) {
        this.retDieRelationX = value;
    }

    /**
     * Gets the value of the retDieRelationY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDieRelationY() {
        return retDieRelationY;
    }

    /**
     * Sets the value of the retDieRelationY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDieRelationY(Float value) {
        this.retDieRelationY = value;
    }

    /**
     * Gets the value of the retDimensionX property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDimensionX() {
        return retDimensionX;
    }

    /**
     * Sets the value of the retDimensionX property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDimensionX(Float value) {
        this.retDimensionX = value;
    }

    /**
     * Gets the value of the retDimensionY property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRetDimensionY() {
        return retDimensionY;
    }

    /**
     * Sets the value of the retDimensionY property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRetDimensionY(Float value) {
        this.retDimensionY = value;
    }

    /**
     * Gets the value of the waferCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link WaferCoordinate }
     *     
     */
    public WaferCoordinate getWaferCoordinate() {
        return waferCoordinate;
    }

    /**
     * Sets the value of the waferCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferCoordinate }
     *     
     */
    public void setWaferCoordinate(WaferCoordinate value) {
        this.waferCoordinate = value;
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
