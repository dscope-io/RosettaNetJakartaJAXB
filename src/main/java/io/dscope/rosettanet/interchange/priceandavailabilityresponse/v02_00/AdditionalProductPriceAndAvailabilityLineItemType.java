
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v02_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_03.CustomerAuthorizationCode;
import io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03.ProductAvailabilityCode;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.StepPricing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.SubstituteProductReference;


/**
 * <p>Java class for AdditionalProductPriceAndAvailabilityLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdditionalProductPriceAndAvailabilityLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.03}CustomerAuthorizationCode" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ManufacturerMinimumPackageQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="PackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03}ProductAvailabilityCode" minOccurs="0"/&gt;
 *         &lt;element name="SmallestPackingQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}StepPricing" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AdditionalProductPriceAndAvailabilityLineItemType", propOrder = {
    "customerAuthorizationCode",
    "description",
    "manufacturerMinimumPackageQuantity",
    "packingQuantity",
    "productAvailabilityCode",
    "smallestPackingQuantity",
    "stepPricing",
    "substituteProductReference"
})
public class AdditionalProductPriceAndAvailabilityLineItemType {

    @XmlElementRef(name = "CustomerAuthorizationCode", namespace = "urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:01.03", type = CustomerAuthorizationCode.class, required = false)
    protected CustomerAuthorizationCode customerAuthorizationCode;
    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "ManufacturerMinimumPackageQuantity")
    protected Float manufacturerMinimumPackageQuantity;
    @XmlElement(name = "PackingQuantity")
    protected Float packingQuantity;
    @XmlElementRef(name = "ProductAvailabilityCode", namespace = "urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", type = ProductAvailabilityCode.class, required = false)
    protected ProductAvailabilityCode productAvailabilityCode;
    @XmlElement(name = "SmallestPackingQuantity")
    protected Float smallestPackingQuantity;
    @XmlElementRef(name = "StepPricing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = StepPricing.class, required = false)
    protected List<StepPricing> stepPricing;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerAuthorizationCode property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerAuthorizationCode }
     *     
     */
    public CustomerAuthorizationCode getCustomerAuthorizationCode() {
        return customerAuthorizationCode;
    }

    /**
     * Sets the value of the customerAuthorizationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerAuthorizationCode }
     *     
     */
    public void setCustomerAuthorizationCode(CustomerAuthorizationCode value) {
        this.customerAuthorizationCode = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getManufacturerMinimumPackageQuantity() {
        return manufacturerMinimumPackageQuantity;
    }

    /**
     * Sets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setManufacturerMinimumPackageQuantity(Float value) {
        this.manufacturerMinimumPackageQuantity = value;
    }

    /**
     * Gets the value of the packingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackingQuantity() {
        return packingQuantity;
    }

    /**
     * Sets the value of the packingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackingQuantity(Float value) {
        this.packingQuantity = value;
    }

    /**
     * Gets the value of the productAvailabilityCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductAvailabilityCode }
     *     
     */
    public ProductAvailabilityCode getProductAvailabilityCode() {
        return productAvailabilityCode;
    }

    /**
     * Sets the value of the productAvailabilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductAvailabilityCode }
     *     
     */
    public void setProductAvailabilityCode(ProductAvailabilityCode value) {
        this.productAvailabilityCode = value;
    }

    /**
     * Gets the value of the smallestPackingQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSmallestPackingQuantity() {
        return smallestPackingQuantity;
    }

    /**
     * Sets the value of the smallestPackingQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSmallestPackingQuantity(Float value) {
        this.smallestPackingQuantity = value;
    }

    /**
     * Gets the value of the stepPricing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stepPricing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStepPricing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StepPricing }
     * 
     * 
     */
    public List<StepPricing> getStepPricing() {
        if (stepPricing == null) {
            stepPricing = new ArrayList<StepPricing>();
        }
        return this.stepPricing;
    }

    /**
     * Gets the value of the substituteProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReference }
     * 
     * 
     */
    public List<SubstituteProductReference> getSubstituteProductReference() {
        if (substituteProductReference == null) {
            substituteProductReference = new ArrayList<SubstituteProductReference>();
        }
        return this.substituteProductReference;
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
