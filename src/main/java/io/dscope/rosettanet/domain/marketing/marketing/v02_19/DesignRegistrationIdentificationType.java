
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.codelist.designregistrationnotification.v01_02.DesignRegistrationNotification;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;


/**
 * <p>Java class for DesignRegistrationIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignRegistrationIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:DesignRegistrationNotification:xsd:codelist:01.02}DesignRegistrationNotification"/&gt;
 *         &lt;element name="DesignRegistrationRevision" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EffectiveRegistrationDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "DesignRegistrationIdentificationType", propOrder = {
    "designRegistrationIdentifier",
    "designRegistrationNotification",
    "designRegistrationRevision",
    "effectiveRegistrationDate"
})
public class DesignRegistrationIdentificationType {

    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElementRef(name = "DesignRegistrationNotification", namespace = "urn:rosettanet:specification:domain:Marketing:DesignRegistrationNotification:xsd:codelist:01.02", type = DesignRegistrationNotification.class)
    protected DesignRegistrationNotification designRegistrationNotification;
    @XmlElement(name = "DesignRegistrationRevision", required = true)
    protected String designRegistrationRevision;
    @XmlElement(name = "EffectiveRegistrationDate")
    protected DatePeriodType effectiveRegistrationDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the designRegistrationNotification property.
     * 
     * @return
     *     possible object is
     *     {@link DesignRegistrationNotification }
     *     
     */
    public DesignRegistrationNotification getDesignRegistrationNotification() {
        return designRegistrationNotification;
    }

    /**
     * Sets the value of the designRegistrationNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignRegistrationNotification }
     *     
     */
    public void setDesignRegistrationNotification(DesignRegistrationNotification value) {
        this.designRegistrationNotification = value;
    }

    /**
     * Gets the value of the designRegistrationRevision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationRevision() {
        return designRegistrationRevision;
    }

    /**
     * Sets the value of the designRegistrationRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationRevision(String value) {
        this.designRegistrationRevision = value;
    }

    /**
     * Gets the value of the effectiveRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveRegistrationDate() {
        return effectiveRegistrationDate;
    }

    /**
     * Sets the value of the effectiveRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveRegistrationDate(DatePeriodType value) {
        this.effectiveRegistrationDate = value;
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
