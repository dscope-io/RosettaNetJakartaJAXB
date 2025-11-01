
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_01.UnitOfMeasureType;


/**
 * <p>Java class for WaferLotQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferLotQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GoodDieQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="GoodDieQuantityUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element name="WaferQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="WaferQuantityUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01}UnitOfMeasureType"/&gt;
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
@XmlType(name = "WaferLotQuantityType", propOrder = {
    "goodDieQuantity",
    "goodDieQuantityUOM",
    "waferQuantity",
    "waferQuantityUOM"
})
public class WaferLotQuantityType {

    @XmlElement(name = "GoodDieQuantity")
    protected Float goodDieQuantity;
    @XmlElement(name = "GoodDieQuantityUOM")
    protected UnitOfMeasureType goodDieQuantityUOM;
    @XmlElement(name = "WaferQuantity")
    protected float waferQuantity;
    @XmlElement(name = "WaferQuantityUOM", required = true)
    protected UnitOfMeasureType waferQuantityUOM;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the goodDieQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getGoodDieQuantity() {
        return goodDieQuantity;
    }

    /**
     * Sets the value of the goodDieQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setGoodDieQuantity(Float value) {
        this.goodDieQuantity = value;
    }

    /**
     * Gets the value of the goodDieQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getGoodDieQuantityUOM() {
        return goodDieQuantityUOM;
    }

    /**
     * Sets the value of the goodDieQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setGoodDieQuantityUOM(UnitOfMeasureType value) {
        this.goodDieQuantityUOM = value;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     */
    public float getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     */
    public void setWaferQuantity(float value) {
        this.waferQuantity = value;
    }

    /**
     * Gets the value of the waferQuantityUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getWaferQuantityUOM() {
        return waferQuantityUOM;
    }

    /**
     * Sets the value of the waferQuantityUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setWaferQuantityUOM(UnitOfMeasureType value) {
        this.waferQuantityUOM = value;
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
