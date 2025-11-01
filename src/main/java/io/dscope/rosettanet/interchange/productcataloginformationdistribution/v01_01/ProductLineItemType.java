
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_03.ActionCode;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03}ActionCode"/&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="PricingGroup" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentificationInformation" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductIdentificationInformationType"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.01}ProductInformationType"/&gt;
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
@XmlType(name = "ProductLineItemType", propOrder = {
    "actionCode",
    "effectiveDate",
    "pricingGroup",
    "productIdentification",
    "productIdentificationInformation",
    "productInformation"
})
public class ProductLineItemType {

    @XmlElementRef(name = "ActionCode", namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03", type = ActionCode.class)
    protected ActionCode actionCode;
    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElement(name = "PricingGroup", required = true)
    protected String pricingGroup;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProductIdentificationInformation", required = true)
    protected ProductIdentificationInformationType productIdentificationInformation;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getActionCode() {
        return actionCode;
    }

    /**
     * Sets the value of the actionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setActionCode(ActionCode value) {
        this.actionCode = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the pricingGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricingGroup() {
        return pricingGroup;
    }

    /**
     * Sets the value of the pricingGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricingGroup(String value) {
        this.pricingGroup = value;
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
     * Gets the value of the productIdentificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationInformationType }
     *     
     */
    public ProductIdentificationInformationType getProductIdentificationInformation() {
        return productIdentificationInformation;
    }

    /**
     * Sets the value of the productIdentificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationInformationType }
     *     
     */
    public void setProductIdentificationInformation(ProductIdentificationInformationType value) {
        this.productIdentificationInformation = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationType }
     *     
     */
    public ProductInformationType getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationType }
     *     
     */
    public void setProductInformation(ProductInformationType value) {
        this.productInformation = value;
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
