
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.IntCoordinate;


/**
 * <p>Java class for GangTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GangTestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}IntCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="StripTestID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="StripTestOrientation" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "GangTestType", propOrder = {
    "intCoordinate",
    "stripTestID",
    "stripTestOrientation"
})
public class GangTestType {

    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = IntCoordinate.class, required = false)
    protected IntCoordinate intCoordinate;
    @XmlElement(name = "StripTestID", required = true)
    protected String stripTestID;
    @XmlElement(name = "StripTestOrientation", required = true)
    protected BigInteger stripTestOrientation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the intCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link IntCoordinate }
     *     
     */
    public IntCoordinate getIntCoordinate() {
        return intCoordinate;
    }

    /**
     * Sets the value of the intCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCoordinate }
     *     
     */
    public void setIntCoordinate(IntCoordinate value) {
        this.intCoordinate = value;
    }

    /**
     * Gets the value of the stripTestID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStripTestID() {
        return stripTestID;
    }

    /**
     * Sets the value of the stripTestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStripTestID(String value) {
        this.stripTestID = value;
    }

    /**
     * Gets the value of the stripTestOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStripTestOrientation() {
        return stripTestOrientation;
    }

    /**
     * Sets the value of the stripTestOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStripTestOrientation(BigInteger value) {
        this.stripTestOrientation = value;
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
