
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for QuantityDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OverallQuantityIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OverallQuantityOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProjectedPackagedYield" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QuantityIn" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QuantityOut" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="QuantityRejected" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WaferQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "QuantityDetailType", propOrder = {
    "overallQuantityIn",
    "overallQuantityOut",
    "projectedPackagedYield",
    "quantityIn",
    "quantityOut",
    "quantityRejected",
    "waferQuantity"
})
public class QuantityDetailType {

    @XmlElement(name = "OverallQuantityIn")
    protected BigInteger overallQuantityIn;
    @XmlElement(name = "OverallQuantityOut")
    protected BigInteger overallQuantityOut;
    @XmlElement(name = "ProjectedPackagedYield")
    protected BigInteger projectedPackagedYield;
    @XmlElement(name = "QuantityIn")
    protected BigInteger quantityIn;
    @XmlElement(name = "QuantityOut")
    protected BigInteger quantityOut;
    @XmlElement(name = "QuantityRejected")
    protected BigInteger quantityRejected;
    @XmlElement(name = "WaferQuantity")
    protected BigInteger waferQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the overallQuantityIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverallQuantityIn() {
        return overallQuantityIn;
    }

    /**
     * Sets the value of the overallQuantityIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverallQuantityIn(BigInteger value) {
        this.overallQuantityIn = value;
    }

    /**
     * Gets the value of the overallQuantityOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverallQuantityOut() {
        return overallQuantityOut;
    }

    /**
     * Sets the value of the overallQuantityOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverallQuantityOut(BigInteger value) {
        this.overallQuantityOut = value;
    }

    /**
     * Gets the value of the projectedPackagedYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProjectedPackagedYield() {
        return projectedPackagedYield;
    }

    /**
     * Sets the value of the projectedPackagedYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProjectedPackagedYield(BigInteger value) {
        this.projectedPackagedYield = value;
    }

    /**
     * Gets the value of the quantityIn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityIn() {
        return quantityIn;
    }

    /**
     * Sets the value of the quantityIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityIn(BigInteger value) {
        this.quantityIn = value;
    }

    /**
     * Gets the value of the quantityOut property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityOut() {
        return quantityOut;
    }

    /**
     * Sets the value of the quantityOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityOut(BigInteger value) {
        this.quantityOut = value;
    }

    /**
     * Gets the value of the quantityRejected property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityRejected() {
        return quantityRejected;
    }

    /**
     * Sets the value of the quantityRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityRejected(BigInteger value) {
        this.quantityRejected = value;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaferQuantity(BigInteger value) {
        this.waferQuantity = value;
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
