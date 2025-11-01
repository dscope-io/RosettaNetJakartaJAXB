
package io.dscope.rosettanet.interchange.shippingorderrequest.v02_01;

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
import io.dscope.rosettanet.domain.logistics.codelist.inventoryownership.v01_01.InventoryOwnership;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.HazardousMaterialDescription;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.IsDeliveryRequired;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.IsHazardousMaterial;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.ReturnLabel;
import io.dscope.rosettanet.domain.logistics.logistics.v02_09.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_08.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.procurement.procurement.v02_08.WarehouseLocation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_03.TextualDescriptionType;


/**
 * <p>Java class for ShipmentLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}HazardousMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.01}InventoryOwnership" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}IsDeliveryRequired" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}IsHazardousMaterial"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LineReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification"/&gt;
 *         &lt;element name="QuantityInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.01}QuantityInformationType"/&gt;
 *         &lt;element name="RequestingOrderLineItemReference" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.01}RequestingOrderLineItemReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}ReturnLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.01}ShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09}TrackingReference" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08}WarehouseLocation" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentLineItemType", propOrder = {
    "businessDocumentReference",
    "hazardousMaterialDescription",
    "inventoryOwnership",
    "isDeliveryRequired",
    "isHazardousMaterial",
    "lineNumber",
    "lineReference",
    "productDescription",
    "productIdentification",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "returnLabel",
    "shippingContainer",
    "specialHandlingInstruction",
    "trackingReference",
    "unitOfMeasure",
    "warehouseLocation"
})
public class ShipmentLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.04", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElementRef(name = "HazardousMaterialDescription", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = HazardousMaterialDescription.class, required = false)
    protected List<HazardousMaterialDescription> hazardousMaterialDescription;
    @XmlElementRef(name = "InventoryOwnership", namespace = "urn:rosettanet:specification:domain:Logistics:InventoryOwnership:xsd:codelist:01.01", type = InventoryOwnership.class, required = false)
    protected InventoryOwnership inventoryOwnership;
    @XmlElementRef(name = "IsDeliveryRequired", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = IsDeliveryRequired.class, required = false)
    protected IsDeliveryRequired isDeliveryRequired;
    @XmlElementRef(name = "IsHazardousMaterial", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = IsHazardousMaterial.class)
    protected IsHazardousMaterial isHazardousMaterial;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "LineReference")
    protected List<BusinessDocumentReferenceType> lineReference;
    @XmlElement(name = "ProductDescription")
    protected TextualDescriptionType productDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "QuantityInformation", required = true)
    protected QuantityInformationType quantityInformation;
    @XmlElement(name = "RequestingOrderLineItemReference")
    protected List<RequestingOrderLineItemReferenceType> requestingOrderLineItemReference;
    @XmlElementRef(name = "ReturnLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = ReturnLabel.class, required = false)
    protected List<ReturnLabel> returnLabel;
    @XmlElement(name = "ShippingContainer")
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.09", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElementRef(name = "WarehouseLocation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.08", type = WarehouseLocation.class, required = false)
    protected WarehouseLocation warehouseLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the hazardousMaterialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterialDescription }
     * 
     * 
     */
    public List<HazardousMaterialDescription> getHazardousMaterialDescription() {
        if (hazardousMaterialDescription == null) {
            hazardousMaterialDescription = new ArrayList<HazardousMaterialDescription>();
        }
        return this.hazardousMaterialDescription;
    }

    /**
     * Gets the value of the inventoryOwnership property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryOwnership }
     *     
     */
    public InventoryOwnership getInventoryOwnership() {
        return inventoryOwnership;
    }

    /**
     * Sets the value of the inventoryOwnership property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryOwnership }
     *     
     */
    public void setInventoryOwnership(InventoryOwnership value) {
        this.inventoryOwnership = value;
    }

    /**
     * Gets the value of the isDeliveryRequired property.
     * 
     * @return
     *     possible object is
     *     {@link IsDeliveryRequired }
     *     
     */
    public IsDeliveryRequired getIsDeliveryRequired() {
        return isDeliveryRequired;
    }

    /**
     * Sets the value of the isDeliveryRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDeliveryRequired }
     *     
     */
    public void setIsDeliveryRequired(IsDeliveryRequired value) {
        this.isDeliveryRequired = value;
    }

    /**
     * Gets the value of the isHazardousMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public IsHazardousMaterial getIsHazardousMaterial() {
        return isHazardousMaterial;
    }

    /**
     * Sets the value of the isHazardousMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public void setIsHazardousMaterial(IsHazardousMaterial value) {
        this.isHazardousMaterial = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the lineReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getLineReference() {
        if (lineReference == null) {
            lineReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.lineReference;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setProductDescription(TextualDescriptionType value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the quantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInformationType }
     *     
     */
    public QuantityInformationType getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformationType }
     *     
     */
    public void setQuantityInformation(QuantityInformationType value) {
        this.quantityInformation = value;
    }

    /**
     * Gets the value of the requestingOrderLineItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingOrderLineItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingOrderLineItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingOrderLineItemReferenceType }
     * 
     * 
     */
    public List<RequestingOrderLineItemReferenceType> getRequestingOrderLineItemReference() {
        if (requestingOrderLineItemReference == null) {
            requestingOrderLineItemReference = new ArrayList<RequestingOrderLineItemReferenceType>();
        }
        return this.requestingOrderLineItemReference;
    }

    /**
     * Gets the value of the returnLabel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the returnLabel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReturnLabel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnLabel }
     * 
     * 
     */
    public List<ReturnLabel> getReturnLabel() {
        if (returnLabel == null) {
            returnLabel = new ArrayList<ReturnLabel>();
        }
        return this.returnLabel;
    }

    /**
     * Gets the value of the shippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerType }
     * 
     * 
     */
    public List<ShippingContainerType> getShippingContainer() {
        if (shippingContainer == null) {
            shippingContainer = new ArrayList<ShippingContainerType>();
        }
        return this.shippingContainer;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public SpecialHandlingInstruction getSpecialHandlingInstruction() {
        return specialHandlingInstruction;
    }

    /**
     * Sets the value of the specialHandlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public void setSpecialHandlingInstruction(SpecialHandlingInstruction value) {
        this.specialHandlingInstruction = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

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
