
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for WarehouseInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarehouseInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20}WarehouseLocation"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20}WarehouseQuantityInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "WarehouseInformationType", propOrder = {
    "warehouseLocation",
    "warehouseQuantityInformation"
})
public class WarehouseInformationType {

    @XmlElementRef(name = "WarehouseLocation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", type = WarehouseLocation.class)
    protected WarehouseLocation warehouseLocation;
    @XmlElementRef(name = "WarehouseQuantityInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", type = WarehouseQuantityInformation.class, required = false)
    protected List<WarehouseQuantityInformation> warehouseQuantityInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the warehouseLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WarehouseLocation }
     *     
     */
    public WarehouseLocation getWarehouseLocation() {
        return warehouseLocation;
    }

    /**
     * Sets the value of the warehouseLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarehouseLocation }
     *     
     */
    public void setWarehouseLocation(WarehouseLocation value) {
        this.warehouseLocation = value;
    }

    /**
     * Gets the value of the warehouseQuantityInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseQuantityInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseQuantityInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseQuantityInformation }
     * 
     * 
     */
    public List<WarehouseQuantityInformation> getWarehouseQuantityInformation() {
        if (warehouseQuantityInformation == null) {
            warehouseQuantityInformation = new ArrayList<WarehouseQuantityInformation>();
        }
        return this.warehouseQuantityInformation;
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
