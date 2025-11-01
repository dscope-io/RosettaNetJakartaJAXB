
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RejectCaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RejectCaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FieldRejected" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "RejectCaseType", propOrder = {
    "fieldRejected",
    "reason",
    "sr"
})
public class RejectCaseType {

    @XmlElement(name = "FieldRejected", required = true)
    protected String fieldRejected;
    @XmlElement(name = "Reason", required = true)
    protected String reason;
    @XmlElement(name = "SR", required = true)
    protected String sr;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fieldRejected property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFieldRejected() {
        return fieldRejected;
    }

    /**
     * Sets the value of the fieldRejected property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFieldRejected(String value) {
        this.fieldRejected = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the sr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSR() {
        return sr;
    }

    /**
     * Sets the value of the sr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSR(String value) {
        this.sr = value;
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
