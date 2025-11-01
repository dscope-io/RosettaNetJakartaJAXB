
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.codelist.designwinstatusreason.v01_03.DesignWinStatusReason;
import io.dscope.rosettanet.domain.marketing.codelist.disposition.v01_02.Disposition;


/**
 * <p>Java class for RegistrationDispositionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationDispositionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03}DesignWinStatusReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignWinStatusReasonCodeExplanation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:Disposition:xsd:codelist:01.02}Disposition"/&gt;
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
@XmlType(name = "RegistrationDispositionType", propOrder = {
    "designWinStatusReason",
    "designWinStatusReasonCodeExplanation",
    "disposition"
})
public class RegistrationDispositionType {

    @XmlElementRef(name = "DesignWinStatusReason", namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinStatusReason:xsd:codelist:01.03", type = DesignWinStatusReason.class, required = false)
    protected DesignWinStatusReason designWinStatusReason;
    @XmlElementRef(name = "DesignWinStatusReasonCodeExplanation", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignWinStatusReasonCodeExplanation.class, required = false)
    protected DesignWinStatusReasonCodeExplanation designWinStatusReasonCodeExplanation;
    @XmlElementRef(name = "Disposition", namespace = "urn:rosettanet:specification:domain:Marketing:Disposition:xsd:codelist:01.02", type = Disposition.class)
    protected Disposition disposition;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designWinStatusReason property.
     * 
     * @return
     *     possible object is
     *     {@link DesignWinStatusReason }
     *     
     */
    public DesignWinStatusReason getDesignWinStatusReason() {
        return designWinStatusReason;
    }

    /**
     * Sets the value of the designWinStatusReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignWinStatusReason }
     *     
     */
    public void setDesignWinStatusReason(DesignWinStatusReason value) {
        this.designWinStatusReason = value;
    }

    /**
     * Gets the value of the designWinStatusReasonCodeExplanation property.
     * 
     * @return
     *     possible object is
     *     {@link DesignWinStatusReasonCodeExplanation }
     *     
     */
    public DesignWinStatusReasonCodeExplanation getDesignWinStatusReasonCodeExplanation() {
        return designWinStatusReasonCodeExplanation;
    }

    /**
     * Sets the value of the designWinStatusReasonCodeExplanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignWinStatusReasonCodeExplanation }
     *     
     */
    public void setDesignWinStatusReasonCodeExplanation(DesignWinStatusReasonCodeExplanation value) {
        this.designWinStatusReasonCodeExplanation = value;
    }

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link Disposition }
     *     
     */
    public Disposition getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Disposition }
     *     
     */
    public void setDisposition(Disposition value) {
        this.disposition = value;
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
