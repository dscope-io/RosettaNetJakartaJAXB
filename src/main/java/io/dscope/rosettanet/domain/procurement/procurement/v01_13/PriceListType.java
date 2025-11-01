
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.pricingtypecode.v01_03.PricingTypeCode;


/**
 * <p>Java class for PriceListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PricingTypeCode:xsd:codelist:01.03}PricingTypeCode" minOccurs="0"/&gt;
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
@XmlType(name = "PriceListType", propOrder = {
    "monetaryAmount",
    "priceListIdentifier",
    "pricingTypeCode"
})
public class PriceListType {

    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = MonetaryAmount.class, required = false)
    protected MonetaryAmount monetaryAmount;
    @XmlElement(name = "PriceListIdentifier", required = true)
    protected String priceListIdentifier;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Procurement:PricingTypeCode:xsd:codelist:01.03", type = PricingTypeCode.class, required = false)
    protected PricingTypeCode pricingTypeCode;
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
     * Gets the value of the priceListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIdentifier() {
        return priceListIdentifier;
    }

    /**
     * Sets the value of the priceListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIdentifier(String value) {
        this.priceListIdentifier = value;
    }

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
