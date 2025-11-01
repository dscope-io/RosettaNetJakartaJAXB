
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_01;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_18.LotReference;
import io.dscope.rosettanet.domain.logistics.logistics.v02_18.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_20.PartPayment;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_09.BusinessDocumentReference;
import io.dscope.rosettanet.universal.monetaryexpression.v01_05.FinancialAmountType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20" xmlns:drd="urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03" xmlns:drdr="urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03" xmlns:p362485_="http://annox.dev.java.net" xmlns:p646761_="http://java.sun.com/xml/ns/jaxb" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.13" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.19" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.09" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ShipmentReceiptLineItem, at least one occurrence of ManufacturerProfile/CountryOfOrigin, ManufacturerProfile/ManufactureDate or ManufacturerProfile/ProductSerialIdentifier.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ShipmentReceiptLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentReceiptLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.09}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DiscrepancyInformation" type="{urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01}DiscrepancyInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}LotReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20}PartPayment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="QuantityInformation" type="{urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01}QuantityInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.05}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentReceiptLineItemType", propOrder = {
    "businessDocumentReference",
    "discrepancyInformation",
    "lotReference",
    "manufacturerProfile",
    "partPayment",
    "productIdentification",
    "quantityInformation",
    "unitOfMeasure",
    "unitPrice"
})
public class ShipmentReceiptLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.09", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DiscrepancyInformation")
    protected DiscrepancyInformationType discrepancyInformation;
    @XmlElementRef(name = "LotReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = LotReference.class, required = false)
    protected List<LotReference> lotReference;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElementRef(name = "PartPayment", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", type = PartPayment.class, required = false)
    protected PartPayment partPayment;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "QuantityInformation", required = true)
    protected QuantityInformationType quantityInformation;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the discrepancyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DiscrepancyInformationType }
     *     
     */
    public DiscrepancyInformationType getDiscrepancyInformation() {
        return discrepancyInformation;
    }

    /**
     * Sets the value of the discrepancyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DiscrepancyInformationType }
     *     
     */
    public void setDiscrepancyInformation(DiscrepancyInformationType value) {
        this.discrepancyInformation = value;
    }

    /**
     * Gets the value of the lotReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotReference }
     * 
     * 
     */
    public List<LotReference> getLotReference() {
        if (lotReference == null) {
            lotReference = new ArrayList<LotReference>();
        }
        return this.lotReference;
    }

    /**
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the partPayment property.
     * 
     * @return
     *     possible object is
     *     {@link PartPayment }
     *     
     */
    public PartPayment getPartPayment() {
        return partPayment;
    }

    /**
     * Sets the value of the partPayment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartPayment }
     *     
     */
    public void setPartPayment(PartPayment value) {
        this.partPayment = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
