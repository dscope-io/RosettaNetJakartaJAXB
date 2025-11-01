
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_02.ShippingDocument;


/**
 * <p>Java class for ShippingBusinessDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingBusinessDocumentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DeclarationMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HeaderInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}HeaderInformationType"/&gt;
 *         &lt;element name="Remarks" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShipmentInformationType"/&gt;
 *         &lt;element name="ShipmentLineItem" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShipmentLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.02}ShippingDocument"/&gt;
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
@XmlType(name = "ShippingBusinessDocumentType", propOrder = {
    "declarationMode",
    "headerInformation",
    "remarks",
    "shipmentInformation",
    "shipmentLineItem",
    "shippingDocument"
})
public class ShippingBusinessDocumentType {

    @XmlElement(name = "DeclarationMode")
    protected String declarationMode;
    @XmlElement(name = "HeaderInformation", required = true)
    protected HeaderInformationType headerInformation;
    @XmlElement(name = "Remarks")
    protected String remarks;
    @XmlElement(name = "ShipmentInformation", required = true)
    protected ShipmentInformationType shipmentInformation;
    @XmlElement(name = "ShipmentLineItem", required = true)
    protected List<ShipmentLineItemType> shipmentLineItem;
    @XmlElementRef(name = "ShippingDocument", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.02", type = ShippingDocument.class)
    protected ShippingDocument shippingDocument;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the declarationMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclarationMode() {
        return declarationMode;
    }

    /**
     * Sets the value of the declarationMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclarationMode(String value) {
        this.declarationMode = value;
    }

    /**
     * Gets the value of the headerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link HeaderInformationType }
     *     
     */
    public HeaderInformationType getHeaderInformation() {
        return headerInformation;
    }

    /**
     * Sets the value of the headerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link HeaderInformationType }
     *     
     */
    public void setHeaderInformation(HeaderInformationType value) {
        this.headerInformation = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the shipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInformationType }
     *     
     */
    public ShipmentInformationType getShipmentInformation() {
        return shipmentInformation;
    }

    /**
     * Sets the value of the shipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInformationType }
     *     
     */
    public void setShipmentInformation(ShipmentInformationType value) {
        this.shipmentInformation = value;
    }

    /**
     * Gets the value of the shipmentLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentLineItemType }
     * 
     * 
     */
    public List<ShipmentLineItemType> getShipmentLineItem() {
        if (shipmentLineItem == null) {
            shipmentLineItem = new ArrayList<ShipmentLineItemType>();
        }
        return this.shipmentLineItem;
    }

    /**
     * Gets the value of the shippingDocument property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingDocument }
     *     
     */
    public ShippingDocument getShippingDocument() {
        return shippingDocument;
    }

    /**
     * Sets the value of the shippingDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingDocument }
     *     
     */
    public void setShippingDocument(ShippingDocument value) {
        this.shippingDocument = value;
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
