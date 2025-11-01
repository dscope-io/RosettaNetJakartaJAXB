
package io.dscope.rosettanet.domain.design.design.v02_15;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RadioactivityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RadioactivityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsotopeNameCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MaxActivityLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="RadioactivityNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}NoteType" minOccurs="0"/&gt;
 *         &lt;element name="TypicalActivityLevel" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
@XmlType(name = "RadioactivityType", propOrder = {
    "isotopeNameCode",
    "maxActivityLevel",
    "radioactivityNote",
    "typicalActivityLevel"
})
public class RadioactivityType {

    @XmlElement(name = "IsotopeNameCode", required = true)
    protected String isotopeNameCode;
    @XmlElement(name = "MaxActivityLevel", required = true)
    protected BigDecimal maxActivityLevel;
    @XmlElement(name = "RadioactivityNote")
    protected String radioactivityNote;
    @XmlElement(name = "TypicalActivityLevel", required = true)
    protected BigDecimal typicalActivityLevel;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isotopeNameCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsotopeNameCode() {
        return isotopeNameCode;
    }

    /**
     * Sets the value of the isotopeNameCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsotopeNameCode(String value) {
        this.isotopeNameCode = value;
    }

    /**
     * Gets the value of the maxActivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxActivityLevel() {
        return maxActivityLevel;
    }

    /**
     * Sets the value of the maxActivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxActivityLevel(BigDecimal value) {
        this.maxActivityLevel = value;
    }

    /**
     * Gets the value of the radioactivityNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRadioactivityNote() {
        return radioactivityNote;
    }

    /**
     * Sets the value of the radioactivityNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRadioactivityNote(String value) {
        this.radioactivityNote = value;
    }

    /**
     * Gets the value of the typicalActivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTypicalActivityLevel() {
        return typicalActivityLevel;
    }

    /**
     * Sets the value of the typicalActivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTypicalActivityLevel(BigDecimal value) {
        this.typicalActivityLevel = value;
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
