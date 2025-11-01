
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DeviceProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeviceProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EligibleProductInformation" type="{urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00}EligibleProductInformationType"/&gt;
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
@XmlType(name = "DeviceProductInformationType", propOrder = {
    "eligibleProductInformation"
})
public class DeviceProductInformationType {

    @XmlElement(name = "EligibleProductInformation", required = true)
    protected EligibleProductInformationType eligibleProductInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the eligibleProductInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EligibleProductInformationType }
     *     
     */
    public EligibleProductInformationType getEligibleProductInformation() {
        return eligibleProductInformation;
    }

    /**
     * Sets the value of the eligibleProductInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EligibleProductInformationType }
     *     
     */
    public void setEligibleProductInformation(EligibleProductInformationType value) {
        this.eligibleProductInformation = value;
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
