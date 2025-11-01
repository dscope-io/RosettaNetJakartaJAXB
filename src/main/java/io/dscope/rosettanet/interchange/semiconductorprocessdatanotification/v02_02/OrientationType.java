
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrientationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrientationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Notch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quadrant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OrientationType", propOrder = {
    "notch",
    "quadrant"
})
public class OrientationType {

    @XmlElement(name = "Notch")
    protected String notch;
    @XmlElement(name = "Quadrant")
    protected String quadrant;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the notch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotch() {
        return notch;
    }

    /**
     * Sets the value of the notch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotch(String value) {
        this.notch = value;
    }

    /**
     * Gets the value of the quadrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuadrant() {
        return quadrant;
    }

    /**
     * Sets the value of the quadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadrant(String value) {
        this.quadrant = value;
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
