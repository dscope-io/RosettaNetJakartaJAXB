
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ProductAttribute;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.MarketingInstruction;


/**
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}MarketingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ProductAttribute"/&gt;
 *         &lt;element name="ProductLifeCycle" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductLifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ProductPriceAndAvailability" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductPriceAndAvailabilityType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductProcurement" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductProcurementType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductInformationType", propOrder = {
    "marketingInstruction",
    "productAttribute",
    "productLifeCycle",
    "productPriceAndAvailability",
    "productProcurement"
})
public class ProductInformationType {

    @XmlElementRef(name = "MarketingInstruction", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = MarketingInstruction.class, required = false)
    protected MarketingInstruction marketingInstruction;
    @XmlElementRef(name = "ProductAttribute", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ProductAttribute.class)
    protected ProductAttribute productAttribute;
    @XmlElement(name = "ProductLifeCycle")
    protected ProductLifeCycleType productLifeCycle;
    @XmlElement(name = "ProductPriceAndAvailability")
    protected List<ProductPriceAndAvailabilityType> productPriceAndAvailability;
    @XmlElement(name = "ProductProcurement")
    protected ProductProcurementType productProcurement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the marketingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link MarketingInstruction }
     *     
     */
    public MarketingInstruction getMarketingInstruction() {
        return marketingInstruction;
    }

    /**
     * Sets the value of the marketingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarketingInstruction }
     *     
     */
    public void setMarketingInstruction(MarketingInstruction value) {
        this.marketingInstruction = value;
    }

    /**
     * Gets the value of the productAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttribute }
     *     
     */
    public ProductAttribute getProductAttribute() {
        return productAttribute;
    }

    /**
     * Sets the value of the productAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttribute }
     *     
     */
    public void setProductAttribute(ProductAttribute value) {
        this.productAttribute = value;
    }

    /**
     * Gets the value of the productLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLifeCycleType }
     *     
     */
    public ProductLifeCycleType getProductLifeCycle() {
        return productLifeCycle;
    }

    /**
     * Sets the value of the productLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLifeCycleType }
     *     
     */
    public void setProductLifeCycle(ProductLifeCycleType value) {
        this.productLifeCycle = value;
    }

    /**
     * Gets the value of the productPriceAndAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPriceAndAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPriceAndAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPriceAndAvailabilityType }
     * 
     * 
     */
    public List<ProductPriceAndAvailabilityType> getProductPriceAndAvailability() {
        if (productPriceAndAvailability == null) {
            productPriceAndAvailability = new ArrayList<ProductPriceAndAvailabilityType>();
        }
        return this.productPriceAndAvailability;
    }

    /**
     * Gets the value of the productProcurement property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProcurementType }
     *     
     */
    public ProductProcurementType getProductProcurement() {
        return productProcurement;
    }

    /**
     * Sets the value of the productProcurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProcurementType }
     *     
     */
    public void setProductProcurement(ProductProcurementType value) {
        this.productProcurement = value;
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
