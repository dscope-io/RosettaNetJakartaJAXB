
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;


/**
 * <p>Java class for ProductDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAvailableToShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsWaiverRequiredToShip" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SafetyStockQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductQuantityRangeType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingAvailability" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductDistributionType", propOrder = {
    "isAvailableToShip",
    "isWaiverRequiredToShip",
    "safetyStockQuantity",
    "shippingAvailability"
})
public class ProductDistributionType {

    @XmlElement(name = "IsAvailableToShip")
    protected boolean isAvailableToShip;
    @XmlElement(name = "IsWaiverRequiredToShip")
    protected boolean isWaiverRequiredToShip;
    @XmlElement(name = "SafetyStockQuantity")
    protected ProductQuantityRangeType safetyStockQuantity;
    @XmlElement(name = "ShippingAvailability")
    protected DatePeriodType shippingAvailability;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isAvailableToShip property.
     * 
     */
    public boolean isIsAvailableToShip() {
        return isAvailableToShip;
    }

    /**
     * Sets the value of the isAvailableToShip property.
     * 
     */
    public void setIsAvailableToShip(boolean value) {
        this.isAvailableToShip = value;
    }

    /**
     * Gets the value of the isWaiverRequiredToShip property.
     * 
     */
    public boolean isIsWaiverRequiredToShip() {
        return isWaiverRequiredToShip;
    }

    /**
     * Sets the value of the isWaiverRequiredToShip property.
     * 
     */
    public void setIsWaiverRequiredToShip(boolean value) {
        this.isWaiverRequiredToShip = value;
    }

    /**
     * Gets the value of the safetyStockQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public ProductQuantityRangeType getSafetyStockQuantity() {
        return safetyStockQuantity;
    }

    /**
     * Sets the value of the safetyStockQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public void setSafetyStockQuantity(ProductQuantityRangeType value) {
        this.safetyStockQuantity = value;
    }

    /**
     * Gets the value of the shippingAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getShippingAvailability() {
        return shippingAvailability;
    }

    /**
     * Sets the value of the shippingAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setShippingAvailability(DatePeriodType value) {
        this.shippingAvailability = value;
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
