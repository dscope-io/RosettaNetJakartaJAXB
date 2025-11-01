
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductDistribution;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.partneridentification.v01_12.KnownPartnerContact;


/**
 * <p>Java class for ProductMasterLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMasterLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}KnownPartnerContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductAttribute" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductAttributeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductDistribution" minOccurs="0"/&gt;
 *         &lt;element name="ProductLifeCycle" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductLifeCycleType" minOccurs="0"/&gt;
 *         &lt;element name="ProductProcurement" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductProcurementType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductMasterLineItemType", propOrder = {
    "knownPartnerContact",
    "productAttribute",
    "productDistribution",
    "productLifeCycle",
    "productProcurement",
    "unitOfMeasure"
})
public class ProductMasterLineItemType {

    @XmlElementRef(name = "KnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = KnownPartnerContact.class, required = false)
    protected List<KnownPartnerContact> knownPartnerContact;
    @XmlElement(name = "ProductAttribute", required = true)
    protected ProductAttributeType productAttribute;
    @XmlElementRef(name = "ProductDistribution", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductDistribution.class, required = false)
    protected ProductDistribution productDistribution;
    @XmlElement(name = "ProductLifeCycle")
    protected ProductLifeCycleType productLifeCycle;
    @XmlElement(name = "ProductProcurement")
    protected ProductProcurementType productProcurement;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the knownPartnerContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the knownPartnerContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKnownPartnerContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KnownPartnerContact }
     * 
     * 
     */
    public List<KnownPartnerContact> getKnownPartnerContact() {
        if (knownPartnerContact == null) {
            knownPartnerContact = new ArrayList<KnownPartnerContact>();
        }
        return this.knownPartnerContact;
    }

    /**
     * Gets the value of the productAttribute property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAttributeType }
     *     
     */
    public ProductAttributeType getProductAttribute() {
        return productAttribute;
    }

    /**
     * Sets the value of the productAttribute property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAttributeType }
     *     
     */
    public void setProductAttribute(ProductAttributeType value) {
        this.productAttribute = value;
    }

    /**
     * Gets the value of the productDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDistribution }
     *     
     */
    public ProductDistribution getProductDistribution() {
        return productDistribution;
    }

    /**
     * Sets the value of the productDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDistribution }
     *     
     */
    public void setProductDistribution(ProductDistribution value) {
        this.productDistribution = value;
    }

    /**
     * Gets the value of the productLifeCycle property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLifeCycleType }
     *     
     */
    public ProductLifeCycleType getProductLifeCycle() {
        return productLifeCycle;
    }

    /**
     * Sets the value of the productLifeCycle property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLifeCycleType }
     *     
     */
    public void setProductLifeCycle(ProductLifeCycleType value) {
        this.productLifeCycle = value;
    }

    /**
     * Gets the value of the productProcurement property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProcurementType }
     *     
     */
    public ProductProcurementType getProductProcurement() {
        return productProcurement;
    }

    /**
     * Sets the value of the productProcurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProcurementType }
     *     
     */
    public void setProductProcurement(ProductProcurementType value) {
        this.productProcurement = value;
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
