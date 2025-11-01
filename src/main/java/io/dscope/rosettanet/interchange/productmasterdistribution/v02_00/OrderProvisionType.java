
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductQuantityRange;


/**
 * <p>Java class for OrderProvisionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderProvisionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MultipleOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductQuantityRange"/&gt;
 *         &lt;element name="SampleOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "OrderProvisionType", propOrder = {
    "multipleOrderQuantity",
    "productQuantityRange",
    "sampleOrderQuantity"
})
public class OrderProvisionType {

    @XmlElement(name = "MultipleOrderQuantity")
    protected Float multipleOrderQuantity;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElement(name = "SampleOrderQuantity")
    protected Float sampleOrderQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the multipleOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMultipleOrderQuantity() {
        return multipleOrderQuantity;
    }

    /**
     * Sets the value of the multipleOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMultipleOrderQuantity(Float value) {
        this.multipleOrderQuantity = value;
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
     * Gets the value of the sampleOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleOrderQuantity() {
        return sampleOrderQuantity;
    }

    /**
     * Sets the value of the sampleOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleOrderQuantity(Float value) {
        this.sampleOrderQuantity = value;
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
