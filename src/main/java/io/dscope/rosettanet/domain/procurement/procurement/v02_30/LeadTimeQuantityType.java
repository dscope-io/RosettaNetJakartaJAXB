
package io.dscope.rosettanet.domain.procurement.procurement.v02_30;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LeadTimeQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LeadTimeQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderSizeRoundingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.19}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30}ProductQuantityRange"/&gt;
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
@XmlType(name = "LeadTimeQuantityType", propOrder = {
    "orderSizeRoundingQuantity",
    "productQuantityRange"
})
public class LeadTimeQuantityType {

    @XmlElement(name = "OrderSizeRoundingQuantity")
    protected Float orderSizeRoundingQuantity;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderSizeRoundingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRoundingQuantity() {
        return orderSizeRoundingQuantity;
    }

    /**
     * Sets the value of the orderSizeRoundingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRoundingQuantity(Float value) {
        this.orderSizeRoundingQuantity = value;
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
