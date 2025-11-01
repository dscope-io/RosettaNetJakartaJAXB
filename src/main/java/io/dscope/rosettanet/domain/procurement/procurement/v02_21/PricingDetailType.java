
package io.dscope.rosettanet.domain.procurement.procurement.v02_21;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;


/**
 * <p>Java class for PricingDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.14}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousUnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21}PriceListType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21}ProductQuantityRange"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21}PriceListType" minOccurs="0"/&gt;
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
@XmlType(name = "PricingDetailType", propOrder = {
    "effectiveDate",
    "orderSizeRounding",
    "previousUnitPrice",
    "productQuantityRange",
    "unitPrice"
})
public class PricingDetailType {

    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElement(name = "PreviousUnitPrice")
    protected PriceListType previousUnitPrice;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.21", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElement(name = "UnitPrice")
    protected PriceListType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the orderSizeRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRounding() {
        return orderSizeRounding;
    }

    /**
     * Sets the value of the orderSizeRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRounding(Float value) {
        this.orderSizeRounding = value;
    }

    /**
     * Gets the value of the previousUnitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getPreviousUnitPrice() {
        return previousUnitPrice;
    }

    /**
     * Sets the value of the previousUnitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setPreviousUnitPrice(PriceListType value) {
        this.previousUnitPrice = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link PriceListType }
     *     
     */
    public PriceListType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceListType }
     *     
     */
    public void setUnitPrice(PriceListType value) {
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
