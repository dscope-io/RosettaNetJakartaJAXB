
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ChangeIndicatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeIndicatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryDocumentChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="DateChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="EquipmentOrderChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PurchaseOrderValueChangeIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "ChangeIndicatorType", propOrder = {
    "ancillaryDocumentChangeIndicator",
    "dateChangeIndicator",
    "equipmentOrderChangeIndicator",
    "purchaseOrderValueChangeIndicator"
})
public class ChangeIndicatorType {

    @XmlElement(name = "AncillaryDocumentChangeIndicator")
    protected boolean ancillaryDocumentChangeIndicator;
    @XmlElement(name = "DateChangeIndicator")
    protected boolean dateChangeIndicator;
    @XmlElement(name = "EquipmentOrderChangeIndicator")
    protected boolean equipmentOrderChangeIndicator;
    @XmlElement(name = "PurchaseOrderValueChangeIndicator")
    protected boolean purchaseOrderValueChangeIndicator;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the ancillaryDocumentChangeIndicator property.
     * 
     */
    public boolean isAncillaryDocumentChangeIndicator() {
        return ancillaryDocumentChangeIndicator;
    }

    /**
     * Sets the value of the ancillaryDocumentChangeIndicator property.
     * 
     */
    public void setAncillaryDocumentChangeIndicator(boolean value) {
        this.ancillaryDocumentChangeIndicator = value;
    }

    /**
     * Gets the value of the dateChangeIndicator property.
     * 
     */
    public boolean isDateChangeIndicator() {
        return dateChangeIndicator;
    }

    /**
     * Sets the value of the dateChangeIndicator property.
     * 
     */
    public void setDateChangeIndicator(boolean value) {
        this.dateChangeIndicator = value;
    }

    /**
     * Gets the value of the equipmentOrderChangeIndicator property.
     * 
     */
    public boolean isEquipmentOrderChangeIndicator() {
        return equipmentOrderChangeIndicator;
    }

    /**
     * Sets the value of the equipmentOrderChangeIndicator property.
     * 
     */
    public void setEquipmentOrderChangeIndicator(boolean value) {
        this.equipmentOrderChangeIndicator = value;
    }

    /**
     * Gets the value of the purchaseOrderValueChangeIndicator property.
     * 
     */
    public boolean isPurchaseOrderValueChangeIndicator() {
        return purchaseOrderValueChangeIndicator;
    }

    /**
     * Sets the value of the purchaseOrderValueChangeIndicator property.
     * 
     */
    public void setPurchaseOrderValueChangeIndicator(boolean value) {
        this.purchaseOrderValueChangeIndicator = value;
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
