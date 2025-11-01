
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PriceCondition;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04.PricingTypeCode;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dcac="urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.03" xmlns:dltcc="urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27" xmlns:dpac="urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03" xmlns:p594315_="http://annox.dev.java.net" xmlns:p962663_="http://java.sun.com/xml/ns/jaxb" xmlns:rpktc="urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01" xmlns:rpsc="urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.01" xmlns:rptc="urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.17" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:PriceAndAvailabilityResponse:xsd:schema:02.01" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductPriceAndAvailability, if the value of IsSpecialPricingExists is equal to 'true' then the occurence of PriceCondition/SpecialPricingDatePeriod MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductPriceAndAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceAndAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAdditionalInformationIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSpecialPricingExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PriceCondition" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductPriceAndAvailabilityLineItem" type="{urn:rosettanet:specification:interchange:PriceAndAvailabilityResponse:xsd:schema:02.01}ProductPriceAndAvailabilityLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductPriceAndAvailabilityType", propOrder = {
    "isAdditionalInformationIncluded",
    "isSpecialPricingExists",
    "priceCondition",
    "priceListIdentifier",
    "pricingTypeCode",
    "productPriceAndAvailabilityLineItem"
})
public class ProductPriceAndAvailabilityType {

    @XmlElement(name = "IsAdditionalInformationIncluded")
    protected boolean isAdditionalInformationIncluded;
    @XmlElement(name = "IsSpecialPricingExists")
    protected boolean isSpecialPricingExists;
    @XmlElementRef(name = "PriceCondition", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PriceCondition.class, required = false)
    protected PriceCondition priceCondition;
    @XmlElement(name = "PriceListIdentifier", required = true)
    protected String priceListIdentifier;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElement(name = "ProductPriceAndAvailabilityLineItem", required = true)
    protected List<ProductPriceAndAvailabilityLineItemType> productPriceAndAvailabilityLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isAdditionalInformationIncluded property.
     * 
     */
    public boolean isIsAdditionalInformationIncluded() {
        return isAdditionalInformationIncluded;
    }

    /**
     * Sets the value of the isAdditionalInformationIncluded property.
     * 
     */
    public void setIsAdditionalInformationIncluded(boolean value) {
        this.isAdditionalInformationIncluded = value;
    }

    /**
     * Gets the value of the isSpecialPricingExists property.
     * 
     */
    public boolean isIsSpecialPricingExists() {
        return isSpecialPricingExists;
    }

    /**
     * Sets the value of the isSpecialPricingExists property.
     * 
     */
    public void setIsSpecialPricingExists(boolean value) {
        this.isSpecialPricingExists = value;
    }

    /**
     * Gets the value of the priceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link PriceCondition }
     *     
     */
    public PriceCondition getPriceCondition() {
        return priceCondition;
    }

    /**
     * Sets the value of the priceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceCondition }
     *     
     */
    public void setPriceCondition(PriceCondition value) {
        this.priceCondition = value;
    }

    /**
     * Gets the value of the priceListIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceListIdentifier() {
        return priceListIdentifier;
    }

    /**
     * Sets the value of the priceListIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceListIdentifier(String value) {
        this.priceListIdentifier = value;
    }

    /**
     * Gets the value of the pricingTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingTypeCode }
     * 
     * 
     */
    public List<PricingTypeCode> getPricingTypeCode() {
        if (pricingTypeCode == null) {
            pricingTypeCode = new ArrayList<PricingTypeCode>();
        }
        return this.pricingTypeCode;
    }

    /**
     * Gets the value of the productPriceAndAvailabilityLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPriceAndAvailabilityLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPriceAndAvailabilityLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPriceAndAvailabilityLineItemType }
     * 
     * 
     */
    public List<ProductPriceAndAvailabilityLineItemType> getProductPriceAndAvailabilityLineItem() {
        if (productPriceAndAvailabilityLineItem == null) {
            productPriceAndAvailabilityLineItem = new ArrayList<ProductPriceAndAvailabilityLineItemType>();
        }
        return this.productPriceAndAvailabilityLineItem;
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
