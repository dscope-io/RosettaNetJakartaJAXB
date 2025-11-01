
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.OrderProvision;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.ProductPricing;


/**
 * <p>Java class for ProductPriceAndAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceAndAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AvailableQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}OrderProvision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}ProductPricing" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductPriceAndAvailabilityType", propOrder = {
    "availableQuantity",
    "orderProvision",
    "productPricing"
})
public class ProductPriceAndAvailabilityType {

    @XmlElement(name = "AvailableQuantity")
    protected Float availableQuantity;
    @XmlElementRef(name = "OrderProvision", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = OrderProvision.class, required = false)
    protected List<OrderProvision> orderProvision;
    @XmlElementRef(name = "ProductPricing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = ProductPricing.class, required = false)
    protected List<ProductPricing> productPricing;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the availableQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * Sets the value of the availableQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAvailableQuantity(Float value) {
        this.availableQuantity = value;
    }

    /**
     * Gets the value of the orderProvision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderProvision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderProvision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderProvision }
     * 
     * 
     */
    public List<OrderProvision> getOrderProvision() {
        if (orderProvision == null) {
            orderProvision = new ArrayList<OrderProvision>();
        }
        return this.orderProvision;
    }

    /**
     * Gets the value of the productPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricing }
     * 
     * 
     */
    public List<ProductPricing> getProductPricing() {
        if (productPricing == null) {
            productPricing = new ArrayList<ProductPricing>();
        }
        return this.productPricing;
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
