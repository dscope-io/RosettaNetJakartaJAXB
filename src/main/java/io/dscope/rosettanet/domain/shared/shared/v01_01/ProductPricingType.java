
package io.dscope.rosettanet.domain.shared.shared.v01_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_00.RNPricingTypeCode;


/**
 * <p>Java class for ProductPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.01}MonetaryAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.00}RN_PricingTypeCode"/&gt;
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
@XmlType(name = "ProductPricingType", propOrder = {
    "monetaryAmount",
    "rnPricingTypeCode"
})
public class ProductPricingType {

    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.01", type = MonetaryAmount.class)
    protected MonetaryAmount monetaryAmount;
    @XmlElementRef(name = "RN_PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.00", type = RNPricingTypeCode.class)
    protected RNPricingTypeCode rnPricingTypeCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setMonetaryAmount(MonetaryAmount value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the rnPricingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link RNPricingTypeCode }
     *     
     */
    public RNPricingTypeCode getRNPricingTypeCode() {
        return rnPricingTypeCode;
    }

    /**
     * Sets the value of the rnPricingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RNPricingTypeCode }
     *     
     */
    public void setRNPricingTypeCode(RNPricingTypeCode value) {
        this.rnPricingTypeCode = value;
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
