
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00;

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
import io.dscope.rosettanet.domain.design.codelist.abccode.v01_02.ABCCode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ExportLicense;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.IsHazardousMaterial;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.ProductLicenseRequired;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductQuantityRange;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for ProductProcurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductProcurementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02}ABCCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ExportLicense" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}IsHazardousMaterial" minOccurs="0"/&gt;
 *         &lt;element name="IsLeadFree" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="OrderSizeRounding" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}ProductLicenseRequired" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03}ProductProcurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductQuantityRange"/&gt;
 *         &lt;element name="RestrictedCountry" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SampleOrder" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="StandardClassificationIdentification" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductProcurementType", propOrder = {
    "abcCode",
    "exportLicense",
    "isHazardousMaterial",
    "isLeadFree",
    "orderSizeRounding",
    "productLicenseRequired",
    "productProcurementType",
    "productQuantityRange",
    "restrictedCountry",
    "sampleOrder",
    "standardClassificationIdentification",
    "unitOfMeasure"
})
public class ProductProcurementType {

    @XmlElementRef(name = "ABCCode", namespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", type = ABCCode.class, required = false)
    protected ABCCode abcCode;
    @XmlElementRef(name = "ExportLicense", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ExportLicense.class, required = false)
    protected List<ExportLicense> exportLicense;
    @XmlElementRef(name = "IsHazardousMaterial", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = IsHazardousMaterial.class, required = false)
    protected IsHazardousMaterial isHazardousMaterial;
    @XmlElement(name = "IsLeadFree")
    protected Boolean isLeadFree;
    @XmlElement(name = "OrderSizeRounding")
    protected Float orderSizeRounding;
    @XmlElementRef(name = "ProductLicenseRequired", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = ProductLicenseRequired.class, required = false)
    protected ProductLicenseRequired productLicenseRequired;
    @XmlElementRef(name = "ProductProcurementType", namespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03", type = io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType.class, required = false)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> productProcurementType;
    @XmlElementRef(name = "ProductQuantityRange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductQuantityRange.class)
    protected ProductQuantityRange productQuantityRange;
    @XmlElement(name = "RestrictedCountry")
    protected List<CountryType> restrictedCountry;
    @XmlElement(name = "SampleOrder")
    protected Float sampleOrder;
    @XmlElement(name = "StandardClassificationIdentification")
    protected List<ProductIdentificationType> standardClassificationIdentification;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the abcCode property.
     * 
     * @return
     *     possible object is
     *     {@link ABCCode }
     *     
     */
    public ABCCode getABCCode() {
        return abcCode;
    }

    /**
     * Sets the value of the abcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABCCode }
     *     
     */
    public void setABCCode(ABCCode value) {
        this.abcCode = value;
    }

    /**
     * Gets the value of the exportLicense property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exportLicense property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExportLicense().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExportLicense }
     * 
     * 
     */
    public List<ExportLicense> getExportLicense() {
        if (exportLicense == null) {
            exportLicense = new ArrayList<ExportLicense>();
        }
        return this.exportLicense;
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
     * Gets the value of the isLeadFree property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsLeadFree() {
        return isLeadFree;
    }

    /**
     * Sets the value of the isLeadFree property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLeadFree(Boolean value) {
        this.isLeadFree = value;
    }

    /**
     * Gets the value of the orderSizeRounding property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOrderSizeRounding() {
        return orderSizeRounding;
    }

    /**
     * Sets the value of the orderSizeRounding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOrderSizeRounding(Float value) {
        this.orderSizeRounding = value;
    }

    /**
     * Gets the value of the productLicenseRequired property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLicenseRequired }
     *     
     */
    public ProductLicenseRequired getProductLicenseRequired() {
        return productLicenseRequired;
    }

    /**
     * Sets the value of the productLicenseRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLicenseRequired }
     *     
     */
    public void setProductLicenseRequired(ProductLicenseRequired value) {
        this.productLicenseRequired = value;
    }

    /**
     * Gets the value of the productProcurementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productProcurementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductProcurementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> getProductProcurementType() {
        if (productProcurementType == null) {
            productProcurementType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType>();
        }
        return this.productProcurementType;
    }

    /**
     * Gets the value of the productQuantityRange property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantityRange }
     *     
     */
    public ProductQuantityRange getProductQuantityRange() {
        return productQuantityRange;
    }

    /**
     * Sets the value of the productQuantityRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantityRange }
     *     
     */
    public void setProductQuantityRange(ProductQuantityRange value) {
        this.productQuantityRange = value;
    }

    /**
     * Gets the value of the restrictedCountry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restrictedCountry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestrictedCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getRestrictedCountry() {
        if (restrictedCountry == null) {
            restrictedCountry = new ArrayList<CountryType>();
        }
        return this.restrictedCountry;
    }

    /**
     * Gets the value of the sampleOrder property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSampleOrder() {
        return sampleOrder;
    }

    /**
     * Sets the value of the sampleOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSampleOrder(Float value) {
        this.sampleOrder = value;
    }

    /**
     * Gets the value of the standardClassificationIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardClassificationIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardClassificationIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getStandardClassificationIdentification() {
        if (standardClassificationIdentification == null) {
            standardClassificationIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.standardClassificationIdentification;
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
