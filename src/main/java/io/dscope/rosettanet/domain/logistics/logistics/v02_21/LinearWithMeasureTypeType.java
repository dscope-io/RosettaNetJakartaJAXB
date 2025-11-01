
package io.dscope.rosettanet.domain.logistics.logistics.v02_21;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LinearWithMeasureTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LinearWithMeasureTypeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Height" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.21}MeasureWithTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.21}MeasureWithTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Width" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.21}MeasureWithTypeType" minOccurs="0"/&gt;
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
@XmlType(name = "LinearWithMeasureTypeType", propOrder = {
    "height",
    "length",
    "width"
})
public class LinearWithMeasureTypeType {

    @XmlElement(name = "Height")
    protected MeasureWithTypeType height;
    @XmlElement(name = "Length")
    protected MeasureWithTypeType length;
    @XmlElement(name = "Width")
    protected MeasureWithTypeType width;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the height property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureWithTypeType }
     *     
     */
    public MeasureWithTypeType getHeight() {
        return height;
    }

    /**
     * Sets the value of the height property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureWithTypeType }
     *     
     */
    public void setHeight(MeasureWithTypeType value) {
        this.height = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureWithTypeType }
     *     
     */
    public MeasureWithTypeType getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureWithTypeType }
     *     
     */
    public void setLength(MeasureWithTypeType value) {
        this.length = value;
    }

    /**
     * Gets the value of the width property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureWithTypeType }
     *     
     */
    public MeasureWithTypeType getWidth() {
        return width;
    }

    /**
     * Sets the value of the width property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureWithTypeType }
     *     
     */
    public void setWidth(MeasureWithTypeType value) {
        this.width = value;
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
