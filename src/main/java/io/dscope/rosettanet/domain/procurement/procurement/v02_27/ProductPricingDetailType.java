
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04.PricingTypeCode;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;


/**
 * <p>Java class for ProductPricingDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPricingDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04}PricingTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType"/&gt;
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
@XmlType(name = "ProductPricingDetailType", propOrder = {
    "pricingTypeCode",
    "unitPrice"
})
public class ProductPricingDetailType {

    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", type = PricingTypeCode.class, required = false)
    protected PricingTypeCode pricingTypeCode;
    @XmlElement(name = "UnitPrice", required = true)
    protected MonetaryAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the pricingTypeCode property.
     * 
     * @return
     *     possible object is
     *     {@link PricingTypeCode }
     *     
     */
    public PricingTypeCode getPricingTypeCode() {
        return pricingTypeCode;
    }

    /**
     * Sets the value of the pricingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTypeCode }
     *     
     */
    public void setPricingTypeCode(PricingTypeCode value) {
        this.pricingTypeCode = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setUnitPrice(MonetaryAmountType value) {
        this.unitPrice = value;
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
