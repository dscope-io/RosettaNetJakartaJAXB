
package io.dscope.rosettanet.domain.design.design.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.codelist.level.v01_00.LevelType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_00.UnitOfMeasure;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drdfl="urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.01" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:drnlv="urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01" xmlns:tns="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:01.01" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the value of type/Level is equal to 'NOM' then the occurence of negativeTolerance MUST be between 1 and 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drdfl="urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.01" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:drnlv="urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01" xmlns:tns="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:01.01" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the value of type/Level is equal to 'NOM' then the occurence of positiveTolerance MUST be between 1 and 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ActualValueType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActualValueType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NegativeTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="PositiveTolerance" type="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}ToleranceType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01}LevelType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01}UnitOfMeasure"/&gt;
 *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "ActualValueType", propOrder = {
    "negativeTolerance",
    "positiveTolerance",
    "type",
    "unitOfMeasure",
    "value"
})
public class ActualValueType {

    @XmlElement(name = "NegativeTolerance")
    protected ToleranceType negativeTolerance;
    @XmlElement(name = "PositiveTolerance")
    protected ToleranceType positiveTolerance;
    @XmlElement(name = "Type")
    protected LevelType type;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "Value")
    protected float value;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the value property.
     * 
     */
    public float getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(float value) {
        this.value = value;
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
