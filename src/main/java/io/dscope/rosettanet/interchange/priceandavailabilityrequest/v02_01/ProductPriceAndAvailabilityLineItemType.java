
package io.dscope.rosettanet.interchange.priceandavailabilityrequest.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.PriceList;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductAvailability;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.ProductPricingDetail;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.WarehouseInformation;
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
 *         &lt;element name="EstimatedAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}PriceList" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04}PricingTypeCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductAvailability" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}ProductPricingDetail" minOccurs="0"/&gt;
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
    "estimatedAvailabilityDate",
    "lineNumber",
    "priceList",
    "pricingTypeCode",
    "productAvailability",
    "productIdentification",
    "productPricingDetail",
    "productStatusCode",
    "unitOfMeasure",
    "warehouseInformation"
})
public class ProductPriceAndAvailabilityLineItemType {

    @XmlElement(name = "EstimatedAvailabilityDate")
    protected DatePeriodType estimatedAvailabilityDate;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PriceList", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = PriceList.class, required = false)
    protected List<PriceList> priceList;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.04", type = PricingTypeCode.class, required = false)
    protected PricingTypeCode pricingTypeCode;
    @XmlElementRef(name = "ProductAvailability", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductAvailability.class)
    protected List<ProductAvailability> productAvailability;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductPricingDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = ProductPricingDetail.class, required = false)
    protected ProductPricingDetail productPricingDetail;
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
     * @return
     *     possible object is
     *     {@link PricingTypeCode }
     *     
     */
    public PricingTypeCode getPricingTypeCode() {
        return pricingTypeCode;
    }

    /**
     * Sets the value of the pricingTypeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingTypeCode }
     *     
     */
    public void setPricingTypeCode(PricingTypeCode value) {
        this.pricingTypeCode = value;
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
     * Gets the value of the productPricingDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingDetail }
     *     
     */
    public ProductPricingDetail getProductPricingDetail() {
        return productPricingDetail;
    }

    /**
     * Sets the value of the productPricingDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingDetail }
     *     
     */
    public void setProductPricingDetail(ProductPricingDetail value) {
        this.productPricingDetail = value;
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
