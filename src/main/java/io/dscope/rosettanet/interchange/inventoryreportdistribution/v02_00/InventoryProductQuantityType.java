
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03.InventoryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.InventoryItemIdentification;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;


/**
 * <p>Java class for InventoryProductQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryProductQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeviceNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}InventoryItemIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity"/&gt;
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
@XmlType(name = "InventoryProductQuantityType", propOrder = {
    "deviceNumber",
    "inventoryItemIdentification",
    "inventoryType",
    "productQuantity"
})
public class InventoryProductQuantityType {

    @XmlElement(name = "DeviceNumber")
    protected List<String> deviceNumber;
    @XmlElementRef(name = "InventoryItemIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = InventoryItemIdentification.class, required = false)
    protected List<InventoryItemIdentification> inventoryItemIdentification;
    @XmlElementRef(name = "InventoryType", namespace = "urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03", type = InventoryType.class)
    protected InventoryType inventoryType;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deviceNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDeviceNumber() {
        if (deviceNumber == null) {
            deviceNumber = new ArrayList<String>();
        }
        return this.deviceNumber;
    }

    /**
     * Gets the value of the inventoryItemIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryItemIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryItemIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryItemIdentification }
     * 
     * 
     */
    public List<InventoryItemIdentification> getInventoryItemIdentification() {
        if (inventoryItemIdentification == null) {
            inventoryItemIdentification = new ArrayList<InventoryItemIdentification>();
        }
        return this.inventoryItemIdentification;
    }

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
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
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
