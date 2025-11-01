
package io.dscope.rosettanet.domain.procurement.procurement.v02_24;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03.InventoryType;


/**
 * <p>Java class for ForecastProductInventoryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastProductInventoryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryType"/&gt;
 *         &lt;element name="ProductInventory" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "ForecastProductInventoryType", propOrder = {
    "inventoryType",
    "productInventory"
})
public class ForecastProductInventoryType {

    @XmlElementRef(name = "InventoryType", namespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03", type = InventoryType.class)
    protected InventoryType inventoryType;
    @XmlElement(name = "ProductInventory")
    protected float productInventory;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the inventoryType property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryType }
     *     
     */
    public InventoryType getInventoryType() {
        return inventoryType;
    }

    /**
     * Sets the value of the inventoryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryType }
     *     
     */
    public void setInventoryType(InventoryType value) {
        this.inventoryType = value;
    }

    /**
     * Gets the value of the productInventory property.
     * 
     */
    public float getProductInventory() {
        return productInventory;
    }

    /**
     * Sets the value of the productInventory property.
     * 
     */
    public void setProductInventory(float value) {
        this.productInventory = value;
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
