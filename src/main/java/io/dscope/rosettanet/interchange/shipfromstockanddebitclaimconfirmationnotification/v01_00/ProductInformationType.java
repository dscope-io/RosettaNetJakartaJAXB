
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimconfirmationnotification.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatusType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PricingInformationType;
import io.dscope.rosettanet.interchange.codelist.rejectionreason.v01_00.RejectionReason;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignRegistrationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispositionResult" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatusType"/&gt;
 *         &lt;element name="DistributorPricing" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PricingInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:RejectionReason:xsd:codelist:01.00}RejectionReason" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ShippedQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SupplierAuthorizationLineItem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPricing" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PricingInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
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
@XmlType(name = "ProductInformationType", propOrder = {
    "designRegistrationIdentifier",
    "dispositionResult",
    "distributorPricing",
    "productIdentification",
    "rejectionReason",
    "shipDate",
    "shippedQuantity",
    "supplierAuthorizationLineItem",
    "supplierPricing",
    "unitOfMeasure"
})
public class ProductInformationType {

    @XmlElement(name = "DesignRegistrationIdentifier")
    protected String designRegistrationIdentifier;
    @XmlElement(name = "DispositionResult", required = true)
    protected PurchaseOrderStatusType dispositionResult;
    @XmlElement(name = "DistributorPricing")
    protected PricingInformationType distributorPricing;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "RejectionReason", namespace = "urn:rosettanet:specification:interchange:RejectionReason:xsd:codelist:01.00", type = RejectionReason.class, required = false)
    protected RejectionReason rejectionReason;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElement(name = "ShippedQuantity")
    protected Float shippedQuantity;
    @XmlElement(name = "SupplierAuthorizationLineItem")
    protected String supplierAuthorizationLineItem;
    @XmlElement(name = "SupplierPricing")
    protected PricingInformationType supplierPricing;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designRegistrationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignRegistrationIdentifier() {
        return designRegistrationIdentifier;
    }

    /**
     * Sets the value of the designRegistrationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignRegistrationIdentifier(String value) {
        this.designRegistrationIdentifier = value;
    }

    /**
     * Gets the value of the dispositionResult property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getDispositionResult() {
        return dispositionResult;
    }

    /**
     * Sets the value of the dispositionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setDispositionResult(PurchaseOrderStatusType value) {
        this.dispositionResult = value;
    }

    /**
     * Gets the value of the distributorPricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getDistributorPricing() {
        return distributorPricing;
    }

    /**
     * Sets the value of the distributorPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setDistributorPricing(PricingInformationType value) {
        this.distributorPricing = value;
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
     * Gets the value of the rejectionReason property.
     * 
     * @return
     *     possible object is
     *     {@link RejectionReason }
     *     
     */
    public RejectionReason getRejectionReason() {
        return rejectionReason;
    }

    /**
     * Sets the value of the rejectionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectionReason }
     *     
     */
    public void setRejectionReason(RejectionReason value) {
        this.rejectionReason = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shippedQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setShippedQuantity(Float value) {
        this.shippedQuantity = value;
    }

    /**
     * Gets the value of the supplierAuthorizationLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAuthorizationLineItem() {
        return supplierAuthorizationLineItem;
    }

    /**
     * Sets the value of the supplierAuthorizationLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAuthorizationLineItem(String value) {
        this.supplierAuthorizationLineItem = value;
    }

    /**
     * Gets the value of the supplierPricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getSupplierPricing() {
        return supplierPricing;
    }

    /**
     * Sets the value of the supplierPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setSupplierPricing(PricingInformationType value) {
        this.supplierPricing = value;
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
