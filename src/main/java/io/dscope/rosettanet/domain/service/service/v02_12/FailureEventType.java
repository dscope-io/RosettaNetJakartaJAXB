
package io.dscope.rosettanet.domain.service.service.v02_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.failuretype.v01_02.FailureType;


/**
 * <p>Java class for FailureEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:FailureType:xsd:codelist:01.02}FailureType" minOccurs="0"/&gt;
 *         &lt;element name="IncidentFailureCodeValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FailureEventType", propOrder = {
    "failureType",
    "incidentFailureCodeValue"
})
public class FailureEventType {

    @XmlElementRef(name = "FailureType", namespace = "urn:rosettanet:specification:domain:Service:FailureType:xsd:codelist:01.02", type = FailureType.class, required = false)
    protected FailureType failureType;
    @XmlElement(name = "IncidentFailureCodeValue")
    protected String incidentFailureCodeValue;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the failureType property.
     * 
     * @return
     *     possible object is
     *     {@link FailureType }
     *     
     */
    public FailureType getFailureType() {
        return failureType;
    }

    /**
     * Sets the value of the failureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureType }
     *     
     */
    public void setFailureType(FailureType value) {
        this.failureType = value;
    }

    /**
     * Gets the value of the incidentFailureCodeValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncidentFailureCodeValue() {
        return incidentFailureCodeValue;
    }

    /**
     * Sets the value of the incidentFailureCodeValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncidentFailureCodeValue(String value) {
        this.incidentFailureCodeValue = value;
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
