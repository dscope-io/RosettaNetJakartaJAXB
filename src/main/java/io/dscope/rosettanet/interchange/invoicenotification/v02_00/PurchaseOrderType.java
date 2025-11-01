
package io.dscope.rosettanet.interchange.invoicenotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03.ShipmentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.SpecifiedBusinessDocumentReferenceType;


/**
 * <p>Java class for PurchaseOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.00}ProductLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PurchaseOrderNumber" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03}ShipmentTerms" minOccurs="0"/&gt;
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
@XmlType(name = "PurchaseOrderType", propOrder = {
    "governmentContractIdentifier",
    "productLineItem",
    "purchaseOrderNumber",
    "shipmentTerms"
})
public class PurchaseOrderType {

    @XmlElement(name = "GovernmentContractIdentifier")
    protected SpecifiedBusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElement(name = "ProductLineItem", required = true)
    protected List<ProductLineItemType> productLineItem;
    @XmlElement(name = "PurchaseOrderNumber")
    protected SpecifiedBusinessDocumentReferenceType purchaseOrderNumber;
    @XmlElementRef(name = "ShipmentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", type = ShipmentTerms.class, required = false)
    protected ShipmentTerms shipmentTerms;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the governmentContractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getGovernmentContractIdentifier() {
        return governmentContractIdentifier;
    }

    /**
     * Sets the value of the governmentContractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setGovernmentContractIdentifier(SpecifiedBusinessDocumentReferenceType value) {
        this.governmentContractIdentifier = value;
    }

    /**
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItemType }
     * 
     * 
     */
    public List<ProductLineItemType> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItemType>();
        }
        return this.productLineItem;
    }

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderNumber(SpecifiedBusinessDocumentReferenceType value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the shipmentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTerms }
     *     
     */
    public ShipmentTerms getShipmentTerms() {
        return shipmentTerms;
    }

    /**
     * Sets the value of the shipmentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTerms }
     *     
     */
    public void setShipmentTerms(ShipmentTerms value) {
        this.shipmentTerms = value;
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
