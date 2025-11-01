
package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for OrderLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ProductLineItemType"/&gt;
 *           &lt;element name="ServiceLineItem" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ServiceLineItemType"/&gt;
 *           &lt;element name="ServiceLineItemByOption" type="{urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01}ServiceLineItemByOptionType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "OrderLineItemType", propOrder = {
    "productLineItem",
    "serviceLineItem",
    "serviceLineItemByOption"
})
public class OrderLineItemType {

    @XmlElement(name = "ProductLineItem")
    protected ProductLineItemType productLineItem;
    @XmlElement(name = "ServiceLineItem")
    protected ServiceLineItemType serviceLineItem;
    @XmlElement(name = "ServiceLineItemByOption")
    protected ServiceLineItemByOptionType serviceLineItemByOption;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the productLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLineItemType }
     *     
     */
    public ProductLineItemType getProductLineItem() {
        return productLineItem;
    }

    /**
     * Sets the value of the productLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLineItemType }
     *     
     */
    public void setProductLineItem(ProductLineItemType value) {
        this.productLineItem = value;
    }

    /**
     * Gets the value of the serviceLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLineItemType }
     *     
     */
    public ServiceLineItemType getServiceLineItem() {
        return serviceLineItem;
    }

    /**
     * Sets the value of the serviceLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLineItemType }
     *     
     */
    public void setServiceLineItem(ServiceLineItemType value) {
        this.serviceLineItem = value;
    }

    /**
     * Gets the value of the serviceLineItemByOption property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceLineItemByOptionType }
     *     
     */
    public ServiceLineItemByOptionType getServiceLineItemByOption() {
        return serviceLineItemByOption;
    }

    /**
     * Sets the value of the serviceLineItemByOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceLineItemByOptionType }
     *     
     */
    public void setServiceLineItemByOption(ServiceLineItemByOptionType value) {
        this.serviceLineItemByOption = value;
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
