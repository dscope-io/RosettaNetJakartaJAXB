
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.codelist.level.v01_03.LevelType;
import io.dscope.rosettanet.domain.design.design.v02_23.ToleranceType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_05.UnitOfMeasure;


/**
 * <p>Java class for QualityDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LowerTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.23}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="NegativeTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.23}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="PositiveTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.23}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="Result" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.03}LevelType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.05}UnitOfMeasure"/&gt;
 *         &lt;element name="UpperTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.23}ToleranceType" minOccurs="0"/&gt;
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
@XmlType(name = "QualityDataType", propOrder = {
    "lowerTolerance",
    "negativeTolerance",
    "positiveTolerance",
    "result",
    "type",
    "unitOfMeasure",
    "upperTolerance"
})
public class QualityDataType {

    @XmlElement(name = "LowerTolerance")
    protected ToleranceType lowerTolerance;
    @XmlElement(name = "NegativeTolerance")
    protected ToleranceType negativeTolerance;
    @XmlElement(name = "PositiveTolerance")
    protected ToleranceType positiveTolerance;
    @XmlElement(name = "Result", required = true)
    protected String result;
    @XmlElement(name = "Type")
    protected LevelType type;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.05", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UpperTolerance")
    protected ToleranceType upperTolerance;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lowerTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceType }
     *     
     */
    public ToleranceType getLowerTolerance() {
        return lowerTolerance;
    }

    /**
     * Sets the value of the lowerTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceType }
     *     
     */
    public void setLowerTolerance(ToleranceType value) {
        this.lowerTolerance = value;
    }

    /**
     * Gets the value of the negativeTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceType }
     *     
     */
    public ToleranceType getNegativeTolerance() {
        return negativeTolerance;
    }

    /**
     * Sets the value of the negativeTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceType }
     *     
     */
    public void setNegativeTolerance(ToleranceType value) {
        this.negativeTolerance = value;
    }

    /**
     * Gets the value of the positiveTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceType }
     *     
     */
    public ToleranceType getPositiveTolerance() {
        return positiveTolerance;
    }

    /**
     * Sets the value of the positiveTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceType }
     *     
     */
    public void setPositiveTolerance(ToleranceType value) {
        this.positiveTolerance = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResult(String value) {
        this.result = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link LevelType }
     *     
     */
    public LevelType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link LevelType }
     *     
     */
    public void setType(LevelType value) {
        this.type = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the upperTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link ToleranceType }
     *     
     */
    public ToleranceType getUpperTolerance() {
        return upperTolerance;
    }

    /**
     * Sets the value of the upperTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToleranceType }
     *     
     */
    public void setUpperTolerance(ToleranceType value) {
        this.upperTolerance = value;
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
