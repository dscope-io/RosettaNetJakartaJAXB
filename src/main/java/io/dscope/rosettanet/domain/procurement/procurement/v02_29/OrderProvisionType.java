
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrderProvisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProvisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductAvailabilityType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="OrderQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductQuantityRangeType"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductLeadTime" minOccurs="0"/&gt;
 *         &lt;element name="SampleAvailability" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderProvisionType", propOrder = {
    "orderQuantity",
    "orderSizeRounding",
    "productLeadTime",
    "sampleAvailability"
})
public class OrderProvisionType
    extends ProductAvailabilityType
{

    @XmlElement(name = "OrderQuantity", required = true)
    protected ProductQuantityRangeType orderQuantity;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = ProductLeadTime.class, required = false)
    protected ProductLeadTime productLeadTime;
    @XmlElement(name = "SampleAvailability", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sampleAvailability;

    /**
     * Gets the value of the orderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public ProductQuantityRangeType getOrderQuantity() {
        return orderQuantity;
    }

    /**
     * Sets the value of the orderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRangeType }
     *     
     */
    public void setOrderQuantity(ProductQuantityRangeType value) {
        this.orderQuantity = value;
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
     * Gets the value of the productLeadTime property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLeadTime }
     *     
     */
    public ProductLeadTime getProductLeadTime() {
        return productLeadTime;
    }

    /**
     * Sets the value of the productLeadTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLeadTime }
     *     
     */
    public void setProductLeadTime(ProductLeadTime value) {
        this.productLeadTime = value;
    }

    /**
     * Gets the value of the sampleAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSampleAvailability() {
        return sampleAvailability;
    }

    /**
     * Sets the value of the sampleAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSampleAvailability(XMLGregorianCalendar value) {
        this.sampleAvailability = value;
    }

}
