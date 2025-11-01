
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.FloatCoordinate;


/**
 * <p>Java class for ChipPeriodicityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChipPeriodicityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}FloatCoordinate"/&gt;
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
@XmlType(name = "ChipPeriodicityType", propOrder = {
    "floatCoordinate"
})
public class ChipPeriodicityType {

    @XmlElementRef(name = "FloatCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = FloatCoordinate.class)
    protected FloatCoordinate floatCoordinate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the floatCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link FloatCoordinate }
     *     
     */
    public FloatCoordinate getFloatCoordinate() {
        return floatCoordinate;
    }

    /**
     * Sets the value of the floatCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link FloatCoordinate }
     *     
     */
    public void setFloatCoordinate(FloatCoordinate value) {
        this.floatCoordinate = value;
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
