
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

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
import io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_03.PricingTypeCode;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;


/**
 * <p>Java class for ProductPricingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPricingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssociatedProduct" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}SubstituteProductReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsCallFactory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsCostChange"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsPriceProtect"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsSuggestedResaleChange"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}PricingDetail" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03}PricingTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "ProductPricingType", propOrder = {
    "associatedProduct",
    "isCallFactory",
    "isCostChange",
    "isPriceProtect",
    "isSuggestedResaleChange",
    "pricingDetail",
    "pricingTypeCode",
    "unitOfMeasure"
})
public class ProductPricingType {

    @XmlElement(name = "AssociatedProduct")
    protected List<SubstituteProductReferenceType> associatedProduct;
    @XmlElementRef(name = "IsCallFactory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsCallFactory.class, required = false)
    protected IsCallFactory isCallFactory;
    @XmlElementRef(name = "IsCostChange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsCostChange.class)
    protected IsCostChange isCostChange;
    @XmlElementRef(name = "IsPriceProtect", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsPriceProtect.class)
    protected IsPriceProtect isPriceProtect;
    @XmlElementRef(name = "IsSuggestedResaleChange", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsSuggestedResaleChange.class)
    protected IsSuggestedResaleChange isSuggestedResaleChange;
    @XmlElementRef(name = "PricingDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = PricingDetail.class, required = false)
    protected List<PricingDetail> pricingDetail;
    @XmlElementRef(name = "PricingTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.03", type = PricingTypeCode.class, required = false)
    protected List<PricingTypeCode> pricingTypeCode;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the associatedProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the associatedProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssociatedProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReferenceType }
     * 
     * 
     */
    public List<SubstituteProductReferenceType> getAssociatedProduct() {
        if (associatedProduct == null) {
            associatedProduct = new ArrayList<SubstituteProductReferenceType>();
        }
        return this.associatedProduct;
    }

    /**
     * Gets the value of the isCallFactory property.
     * 
     * @return
     *     possible object is
     *     {@link IsCallFactory }
     *     
     */
    public IsCallFactory getIsCallFactory() {
        return isCallFactory;
    }

    /**
     * Sets the value of the isCallFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCallFactory }
     *     
     */
    public void setIsCallFactory(IsCallFactory value) {
        this.isCallFactory = value;
    }

    /**
     * Gets the value of the isCostChange property.
     * 
     * @return
     *     possible object is
     *     {@link IsCostChange }
     *     
     */
    public IsCostChange getIsCostChange() {
        return isCostChange;
    }

    /**
     * Sets the value of the isCostChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCostChange }
     *     
     */
    public void setIsCostChange(IsCostChange value) {
        this.isCostChange = value;
    }

    /**
     * Gets the value of the isPriceProtect property.
     * 
     * @return
     *     possible object is
     *     {@link IsPriceProtect }
     *     
     */
    public IsPriceProtect getIsPriceProtect() {
        return isPriceProtect;
    }

    /**
     * Sets the value of the isPriceProtect property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPriceProtect }
     *     
     */
    public void setIsPriceProtect(IsPriceProtect value) {
        this.isPriceProtect = value;
    }

    /**
     * Gets the value of the isSuggestedResaleChange property.
     * 
     * @return
     *     possible object is
     *     {@link IsSuggestedResaleChange }
     *     
     */
    public IsSuggestedResaleChange getIsSuggestedResaleChange() {
        return isSuggestedResaleChange;
    }

    /**
     * Sets the value of the isSuggestedResaleChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsSuggestedResaleChange }
     *     
     */
    public void setIsSuggestedResaleChange(IsSuggestedResaleChange value) {
        this.isSuggestedResaleChange = value;
    }

    /**
     * Gets the value of the pricingDetail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricingDetail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricingDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricingDetail }
     * 
     * 
     */
    public List<PricingDetail> getPricingDetail() {
        if (pricingDetail == null) {
            pricingDetail = new ArrayList<PricingDetail>();
        }
        return this.pricingDetail;
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
