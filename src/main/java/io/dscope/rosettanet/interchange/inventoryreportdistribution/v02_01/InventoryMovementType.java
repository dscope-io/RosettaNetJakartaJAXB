
package io.dscope.rosettanet.interchange.inventoryreportdistribution.v02_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.inventorytype.v01_03.InventoryTypeType;


/**
 * <p>Java class for InventoryMovementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryMovementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FromStatus" type="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryTypeType" minOccurs="0"/&gt;
 *         &lt;element name="ToStatus" type="{urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03}InventoryTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryMovementType", propOrder = {
    "fromStatus",
    "toStatus",
    "type"
})
public class InventoryMovementType {

    @XmlElement(name = "FromStatus")
    protected InventoryTypeType fromStatus;
    @XmlElement(name = "ToStatus")
    protected InventoryTypeType toStatus;
    @XmlElement(name = "Type")
    protected String type;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fromStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTypeType }
     *     
     */
    public InventoryTypeType getFromStatus() {
        return fromStatus;
    }

    /**
     * Sets the value of the fromStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTypeType }
     *     
     */
    public void setFromStatus(InventoryTypeType value) {
        this.fromStatus = value;
    }

    /**
     * Gets the value of the toStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryTypeType }
     *     
     */
    public InventoryTypeType getToStatus() {
        return toStatus;
    }

    /**
     * Sets the value of the toStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryTypeType }
     *     
     */
    public void setToStatus(InventoryTypeType value) {
        this.toStatus = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
