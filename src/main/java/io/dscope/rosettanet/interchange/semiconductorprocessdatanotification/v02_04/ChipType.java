
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.ECIDReport;


/**
 * <p>Java class for ChipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChipType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieReticlePN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}ECIDReport" minOccurs="0"/&gt;
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
@XmlType(name = "ChipType", propOrder = {
    "chipPN",
    "customerChipPN",
    "dieReticlePN",
    "ecidReport"
})
public class ChipType {

    @XmlElement(name = "ChipPN")
    protected String chipPN;
    @XmlElement(name = "CustomerChipPN")
    protected String customerChipPN;
    @XmlElement(name = "DieReticlePN")
    protected String dieReticlePN;
    @XmlElementRef(name = "ECIDReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = ECIDReport.class, required = false)
    protected ECIDReport ecidReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPN() {
        return chipPN;
    }

    /**
     * Sets the value of the chipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPN(String value) {
        this.chipPN = value;
    }

    /**
     * Gets the value of the customerChipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChipPN() {
        return customerChipPN;
    }

    /**
     * Sets the value of the customerChipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChipPN(String value) {
        this.customerChipPN = value;
    }

    /**
     * Gets the value of the dieReticlePN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieReticlePN() {
        return dieReticlePN;
    }

    /**
     * Sets the value of the dieReticlePN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieReticlePN(String value) {
        this.dieReticlePN = value;
    }

    /**
     * Gets the value of the ecidReport property.
     * 
     * @return
     *     possible object is
     *     {@link ECIDReport }
     *     
     */
    public ECIDReport getECIDReport() {
        return ecidReport;
    }

    /**
     * Sets the value of the ecidReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECIDReport }
     *     
     */
    public void setECIDReport(ECIDReport value) {
        this.ecidReport = value;
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
