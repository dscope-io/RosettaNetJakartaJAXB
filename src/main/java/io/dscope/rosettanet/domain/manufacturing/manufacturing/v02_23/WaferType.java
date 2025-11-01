
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for WaferType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProcessRevision" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShortID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaferUniqueID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "WaferType", propOrder = {
    "processRevision",
    "shortID",
    "waferUniqueID"
})
public class WaferType {

    @XmlElement(name = "ProcessRevision")
    protected Float processRevision;
    @XmlElement(name = "ShortID")
    protected String shortID;
    @XmlElement(name = "WaferUniqueID", required = true)
    protected String waferUniqueID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the processRevision property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getProcessRevision() {
        return processRevision;
    }

    /**
     * Sets the value of the processRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setProcessRevision(Float value) {
        this.processRevision = value;
    }

    /**
     * Gets the value of the shortID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShortID() {
        return shortID;
    }

    /**
     * Sets the value of the shortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShortID(String value) {
        this.shortID = value;
    }

    /**
     * Gets the value of the waferUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferUniqueID() {
        return waferUniqueID;
    }

    /**
     * Sets the value of the waferUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferUniqueID(String value) {
        this.waferUniqueID = value;
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
