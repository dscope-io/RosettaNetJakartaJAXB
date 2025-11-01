
package io.dscope.rosettanet.interchange.priceandavailabilityrequest.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.PriceCondition;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_03.PricingTypeCode;


/**
 * <p>Java class for ProductPriceAndAvailabilityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceAndAvailabilityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsAdditionalInformationAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}PriceCondition" minOccurs="0"/&gt;
 *         &lt;element name="PriceListIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductPriceAndAvailabilityLineItem" type="{urn:rosettanet:specification:interchange:PriceAndAvailabilityRequest:xsd:schema:02.00}ProductPriceAndAvailabilityLineItemType" maxOccurs="unbounded"/&gt;
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
    "isAdditionalInformationAllowed",
    "priceCondition",
    "priceListIdentifier",
    "pricingTypeCode",
    "productPriceAndAvailabilityLineItem"
})
public class ProductPriceAndAvailabilityType {

    @XmlElement(name = "IsAdditionalInformationAllowed")
    protected boolean isAdditionalInformationAllowed;
    @XmlElementRef(name = "PriceCondition", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = PriceCondition.class, required = false)
    protected PriceCondition priceCondition;
    @XmlElement(name = "PriceListIdentifier")
    protected String priceListIdentifier;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElement(name = "ProductPriceAndAvailabilityLineItem", required = true)
    protected List<ProductPriceAndAvailabilityLineItemType> productPriceAndAvailabilityLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isAdditionalInformationAllowed property.
     * 
     */
    public boolean isIsAdditionalInformationAllowed() {
        return isAdditionalInformationAllowed;
    }

    /**
     * Sets the value of the isAdditionalInformationAllowed property.
     * 
     */
    public void setIsAdditionalInformationAllowed(boolean value) {
        this.isAdditionalInformationAllowed = value;
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
