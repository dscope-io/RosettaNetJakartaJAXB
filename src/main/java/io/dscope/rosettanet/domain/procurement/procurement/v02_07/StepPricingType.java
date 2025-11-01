
package io.dscope.rosettanet.domain.procurement.procurement.v02_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_02.PricingTypeCode;
import io.dscope.rosettanet.domain.shared.shared.v01_05.MonetaryAmount;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriod;


/**
 * <p>Java class for StepPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StepPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriod"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.05}MonetaryAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.02}PricingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}ProductQuantityRange"/&gt;
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
@XmlType(name = "StepPricingType", propOrder = {
    "datePeriod",
    "monetaryAmount",
    "pricingTypeCode",
    "productQuantityRange"
})
public class StepPricingType {

    @XmlElementRef(name = "DatePeriod", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = DatePeriod.class)
    protected DatePeriod datePeriod;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", type = MonetaryAmount.class)
    protected MonetaryAmount monetaryAmount;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.02", type = PricingTypeCode.class, required = false)
    protected PricingTypeCode pricingTypeCode;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setDatePeriod(DatePeriod value) {
        this.datePeriod = value;
    }

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
     * Gets the value of the productQuantityRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRange }
     *     
     */
    public ProductQuantityRange getProductQuantityRange() {
        return productQuantityRange;
    }

    /**
     * Sets the value of the productQuantityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRange }
     *     
     */
    public void setProductQuantityRange(ProductQuantityRange value) {
        this.productQuantityRange = value;
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
