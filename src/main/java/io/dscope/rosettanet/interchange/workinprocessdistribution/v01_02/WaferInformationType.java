
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.LotQuantityType;


/**
 * <p>Java class for WaferInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="WaferIdentification" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}WaferIdentificationType"/&gt;
 *         &lt;element name="WaferQuantity" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}LotQuantityType"/&gt;
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
@XmlType(name = "WaferInformationType", propOrder = {
    "waferIdentification",
    "waferQuantity"
})
public class WaferInformationType {

    @XmlElement(name = "WaferIdentification", required = true)
    protected WaferIdentificationType waferIdentification;
    @XmlElement(name = "WaferQuantity", required = true)
    protected LotQuantityType waferQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the waferIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link WaferIdentificationType }
     *     
     */
    public WaferIdentificationType getWaferIdentification() {
        return waferIdentification;
    }

    /**
     * Sets the value of the waferIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferIdentificationType }
     *     
     */
    public void setWaferIdentification(WaferIdentificationType value) {
        this.waferIdentification = value;
    }

    /**
     * Gets the value of the waferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link LotQuantityType }
     *     
     */
    public LotQuantityType getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotQuantityType }
     *     
     */
    public void setWaferQuantity(LotQuantityType value) {
        this.waferQuantity = value;
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
