
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.IsPartialShipment;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ReturnLabel;
import io.dscope.rosettanet.domain.shared.shared.v01_10.QuantityInformation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescriptionType;


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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}IsPartialShipment"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}QuantityInformation"/&gt;
 *         &lt;element name="RequestingOrderLineItemReference" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}RequestingOrderLineItemReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ReturnLabel" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}ShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
    "isPartialShipment",
    "lineNumber",
    "productDescription",
    "productIdentification",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "returnLabel",
    "shippingContainer",
    "unitOfMeasure"
})
public class ShipmentLineItemType {

    @XmlElementRef(name = "IsPartialShipment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = IsPartialShipment.class)
    protected IsPartialShipment isPartialShipment;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "ProductDescription")
    protected TextualDescriptionType productDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "QuantityInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = QuantityInformation.class)
    protected QuantityInformation quantityInformation;
    @XmlElement(name = "RequestingOrderLineItemReference")
    protected List<RequestingOrderLineItemReferenceType> requestingOrderLineItemReference;
    @XmlElementRef(name = "ReturnLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ReturnLabel.class, required = false)
    protected List<ReturnLabel> returnLabel;
    @XmlElement(name = "ShippingContainer")
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isPartialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link IsPartialShipment }
     *     
     */
    public IsPartialShipment getIsPartialShipment() {
        return isPartialShipment;
    }

    /**
     * Sets the value of the isPartialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPartialShipment }
     *     
     */
    public void setIsPartialShipment(IsPartialShipment value) {
        this.isPartialShipment = value;
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
     *     {@link QuantityInformation }
     *     
     */
    public QuantityInformation getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformation }
     *     
     */
    public void setQuantityInformation(QuantityInformation value) {
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
