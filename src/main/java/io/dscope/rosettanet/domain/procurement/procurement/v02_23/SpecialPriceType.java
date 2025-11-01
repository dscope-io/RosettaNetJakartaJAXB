
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.shared.v01_16.DatePeriodAndDurationType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_05.ProductPricing;


/**
 * <p>Java class for SpecialPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmountIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EligiblePeriod" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.16}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="EligibleUnits" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.16}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}ProductPricing"/&gt;
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
@XmlType(name = "SpecialPriceType", propOrder = {
    "amountIdentifier",
    "eligiblePeriod",
    "eligibleUnits",
    "productPricing"
})
public class SpecialPriceType {

    @XmlElement(name = "AmountIdentifier")
    protected String amountIdentifier;
    @XmlElement(name = "EligiblePeriod")
    protected DatePeriodAndDurationType eligiblePeriod;
    @XmlElement(name = "EligibleUnits")
    protected Float eligibleUnits;
    @XmlElementRef(name = "ProductPricing", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05", type = ProductPricing.class)
    protected ProductPricing productPricing;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the amountIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmountIdentifier() {
        return amountIdentifier;
    }

    /**
     * Sets the value of the amountIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountIdentifier(String value) {
        this.amountIdentifier = value;
    }

    /**
     * Gets the value of the eligiblePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getEligiblePeriod() {
        return eligiblePeriod;
    }

    /**
     * Sets the value of the eligiblePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setEligiblePeriod(DatePeriodAndDurationType value) {
        this.eligiblePeriod = value;
    }

    /**
     * Gets the value of the eligibleUnits property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEligibleUnits() {
        return eligibleUnits;
    }

    /**
     * Sets the value of the eligibleUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEligibleUnits(Float value) {
        this.eligibleUnits = value;
    }

    /**
     * Gets the value of the productPricing property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricing }
     *     
     */
    public ProductPricing getProductPricing() {
        return productPricing;
    }

    /**
     * Sets the value of the productPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricing }
     *     
     */
    public void setProductPricing(ProductPricing value) {
        this.productPricing = value;
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
