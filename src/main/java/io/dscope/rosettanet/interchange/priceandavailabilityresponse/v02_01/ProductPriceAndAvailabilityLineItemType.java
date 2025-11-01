
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
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_03.LeadTimeClassificationCode;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PriceList;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductAvailability;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductLeadTime;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductPricingDetail;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.WarehouseInformation;
import io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01.PackageTypeCode;
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_04.PricingTypeCode;
import io.dscope.rosettanet.domain.shared.codelist.productstatuscode.v01_01.ProductStatusCode;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ProductPriceAndAvailabilityLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPriceAndAvailabilityLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalProductPriceAndAvailabilityLineItem" type="{urn:rosettanet:specification:interchange:PriceAndAvailabilityResponse:xsd:schema:02.01}AdditionalProductPriceAndAvailabilityLineItemType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="IsAdditionalInformationIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsNonCancelNonReturnable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsSpecialPricingExists" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PriceList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductAvailability" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductLeadTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductPricingDetail" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.01}ProductStatusCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}WarehouseInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductPriceAndAvailabilityLineItemType", propOrder = {
    "additionalProductPriceAndAvailabilityLineItem",
    "estimatedAvailabilityDate",
    "isAdditionalInformationIncluded",
    "isNonCancelNonReturnable",
    "isSpecialPricingExists",
    "leadTimeClassificationCode",
    "lineNumber",
    "packageTypeCode",
    "priceList",
    "pricingTypeCode",
    "productAvailability",
    "productIdentification",
    "productLeadTime",
    "productPricingDetail",
    "productStatusCode",
    "unitOfMeasure",
    "warehouseInformation"
})
public class ProductPriceAndAvailabilityLineItemType {

    @XmlElement(name = "AdditionalProductPriceAndAvailabilityLineItem")
    protected AdditionalProductPriceAndAvailabilityLineItemType additionalProductPriceAndAvailabilityLineItem;
    @XmlElement(name = "EstimatedAvailabilityDate")
    protected DatePeriodType estimatedAvailabilityDate;
    @XmlElement(name = "IsAdditionalInformationIncluded")
    protected boolean isAdditionalInformationIncluded;
    @XmlElement(name = "IsNonCancelNonReturnable")
    protected boolean isNonCancelNonReturnable;
    @XmlElement(name = "IsSpecialPricingExists")
    protected boolean isSpecialPricingExists;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PackageTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", type = PackageTypeCode.class, required = false)
    protected List<PackageTypeCode> packageTypeCode;
    @XmlElementRef(name = "PriceList", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PriceList.class, required = false)
    protected List<PriceList> priceList;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElementRef(name = "ProductAvailability", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductAvailability.class)
    protected List<ProductAvailability> productAvailability;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductLeadTime.class, required = false)
    protected List<ProductLeadTime> productLeadTime;
    @XmlElementRef(name = "ProductPricingDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductPricingDetail.class)
    protected List<ProductPricingDetail> productPricingDetail;
    @XmlElementRef(name = "ProductStatusCode", namespace = "urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.01", type = ProductStatusCode.class, required = false)
    protected ProductStatusCode productStatusCode;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class, required = false)
    protected List<UnitOfMeasure> unitOfMeasure;
    @XmlElementRef(name = "WarehouseInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = WarehouseInformation.class, required = false)
    protected List<WarehouseInformation> warehouseInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the additionalProductPriceAndAvailabilityLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalProductPriceAndAvailabilityLineItemType }
     *     
     */
    public AdditionalProductPriceAndAvailabilityLineItemType getAdditionalProductPriceAndAvailabilityLineItem() {
        return additionalProductPriceAndAvailabilityLineItem;
    }

    /**
     * Sets the value of the additionalProductPriceAndAvailabilityLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalProductPriceAndAvailabilityLineItemType }
     *     
     */
    public void setAdditionalProductPriceAndAvailabilityLineItem(AdditionalProductPriceAndAvailabilityLineItemType value) {
        this.additionalProductPriceAndAvailabilityLineItem = value;
    }

    /**
     * Gets the value of the estimatedAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEstimatedAvailabilityDate() {
        return estimatedAvailabilityDate;
    }

    /**
     * Sets the value of the estimatedAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEstimatedAvailabilityDate(DatePeriodType value) {
        this.estimatedAvailabilityDate = value;
    }

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
     * Gets the value of the isNonCancelNonReturnable property.
     * 
     */
    public boolean isIsNonCancelNonReturnable() {
        return isNonCancelNonReturnable;
    }

    /**
     * Sets the value of the isNonCancelNonReturnable property.
     * 
     */
    public void setIsNonCancelNonReturnable(boolean value) {
        this.isNonCancelNonReturnable = value;
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
     * Gets the value of the leadTimeClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public LeadTimeClassificationCode getLeadTimeClassificationCode() {
        return leadTimeClassificationCode;
    }

    /**
     * Sets the value of the leadTimeClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public void setLeadTimeClassificationCode(LeadTimeClassificationCode value) {
        this.leadTimeClassificationCode = value;
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
     * Gets the value of the packageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageTypeCode }
     * 
     * 
     */
    public List<PackageTypeCode> getPackageTypeCode() {
        if (packageTypeCode == null) {
            packageTypeCode = new ArrayList<PackageTypeCode>();
        }
        return this.packageTypeCode;
    }

    /**
     * Gets the value of the priceList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PriceList }
     * 
     * 
     */
    public List<PriceList> getPriceList() {
        if (priceList == null) {
            priceList = new ArrayList<PriceList>();
        }
        return this.priceList;
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
     * Gets the value of the productAvailability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAvailability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAvailability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAvailability }
     * 
     * 
     */
    public List<ProductAvailability> getProductAvailability() {
        if (productAvailability == null) {
            productAvailability = new ArrayList<ProductAvailability>();
        }
        return this.productAvailability;
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
     * Gets the value of the productLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLeadTime }
     * 
     * 
     */
    public List<ProductLeadTime> getProductLeadTime() {
        if (productLeadTime == null) {
            productLeadTime = new ArrayList<ProductLeadTime>();
        }
        return this.productLeadTime;
    }

    /**
     * Gets the value of the productPricingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productPricingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductPricingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingDetail }
     * 
     * 
     */
    public List<ProductPricingDetail> getProductPricingDetail() {
        if (productPricingDetail == null) {
            productPricingDetail = new ArrayList<ProductPricingDetail>();
        }
        return this.productPricingDetail;
    }

    /**
     * Gets the value of the productStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductStatusCode }
     *     
     */
    public ProductStatusCode getProductStatusCode() {
        return productStatusCode;
    }

    /**
     * Sets the value of the productStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductStatusCode }
     *     
     */
    public void setProductStatusCode(ProductStatusCode value) {
        this.productStatusCode = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitOfMeasure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitOfMeasure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitOfMeasure }
     * 
     * 
     */
    public List<UnitOfMeasure> getUnitOfMeasure() {
        if (unitOfMeasure == null) {
            unitOfMeasure = new ArrayList<UnitOfMeasure>();
        }
        return this.unitOfMeasure;
    }

    /**
     * Gets the value of the warehouseInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warehouseInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarehouseInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarehouseInformation }
     * 
     * 
     */
    public List<WarehouseInformation> getWarehouseInformation() {
        if (warehouseInformation == null) {
            warehouseInformation = new ArrayList<WarehouseInformation>();
        }
        return this.warehouseInformation;
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
