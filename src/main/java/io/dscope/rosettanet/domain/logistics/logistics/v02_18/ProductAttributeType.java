
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

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
import io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01.PackageTypeCode;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasure;


/**
 * <p>Java class for ProductAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.13}ProductQuantityType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}ProductPackaging" minOccurs="0"/&gt;
 *         &lt;element name="SmallestPackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.13}ProductQuantityType"/&gt;
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
@XmlType(name = "ProductAttributeType", propOrder = {
    "packageTypeCode",
    "packingQuantity",
    "productPackaging",
    "smallestPackingQuantity",
    "unitOfMeasure"
})
public class ProductAttributeType {

    @XmlElementRef(name = "PackageTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", type = PackageTypeCode.class, required = false)
    protected List<PackageTypeCode> packageTypeCode;
    @XmlElement(name = "PackingQuantity")
    protected float packingQuantity;
    @XmlElementRef(name = "ProductPackaging", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = ProductPackaging.class, required = false)
    protected ProductPackaging productPackaging;
    @XmlElement(name = "SmallestPackingQuantity")
    protected float smallestPackingQuantity;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the packingQuantity property.
     * 
     */
    public float getPackingQuantity() {
        return packingQuantity;
    }

    /**
     * Sets the value of the packingQuantity property.
     * 
     */
    public void setPackingQuantity(float value) {
        this.packingQuantity = value;
    }

    /**
     * Gets the value of the productPackaging property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPackaging }
     *     
     */
    public ProductPackaging getProductPackaging() {
        return productPackaging;
    }

    /**
     * Sets the value of the productPackaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPackaging }
     *     
     */
    public void setProductPackaging(ProductPackaging value) {
        this.productPackaging = value;
    }

    /**
     * Gets the value of the smallestPackingQuantity property.
     * 
     */
    public float getSmallestPackingQuantity() {
        return smallestPackingQuantity;
    }

    /**
     * Sets the value of the smallestPackingQuantity property.
     * 
     */
    public void setSmallestPackingQuantity(float value) {
        this.smallestPackingQuantity = value;
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
