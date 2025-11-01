
package io.dscope.rosettanet.domain.shared.shared.v01_19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.datatype.v01_04.PercentAmount;


/**
 * <p>Java class for RateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RateType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.01}RateType" minOccurs="0"/&gt;
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
@XmlType(name = "RateType", propOrder = {
    "percentAmount",
    "rateType"
})
public class RateType {

    @XmlElementRef(name = "PercentAmount", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = PercentAmount.class)
    protected PercentAmount percentAmount;
    @XmlElementRef(name = "RateType", namespace = "urn:rosettanet:specification:domain:Shared:RateType:xsd:codelist:01.01", type = io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType.class, required = false)
    protected io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType rateType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the percentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PercentAmount }
     *     
     */
    public PercentAmount getPercentAmount() {
        return percentAmount;
    }

    /**
     * Sets the value of the percentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PercentAmount }
     *     
     */
    public void setPercentAmount(PercentAmount value) {
        this.percentAmount = value;
    }

    /**
     * Gets the value of the rateType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType }
     *     
     */
    public io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType getRateType() {
        return rateType;
    }

    /**
     * Sets the value of the rateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType }
     *     
     */
    public void setRateType(io.dscope.rosettanet.domain.shared.codelist.ratetype.v01_01.RateType value) {
        this.rateType = value;
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
