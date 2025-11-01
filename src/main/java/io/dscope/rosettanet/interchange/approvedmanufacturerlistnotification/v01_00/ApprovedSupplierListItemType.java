
package io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.supplierpartstatus.v01_00.SupplierPartStatus;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for ApprovedSupplierListItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedSupplierListItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element name="SuppliedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescriptionType"/&gt;
 *         &lt;element name="SupplierItem" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:01.00}SupplierPartStatus"/&gt;
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
@XmlType(name = "ApprovedSupplierListItemType", propOrder = {
    "description",
    "effectiveDatePeriod",
    "suppliedBy",
    "supplierItem",
    "supplierPartStatus"
})
public class ApprovedSupplierListItemType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveDatePeriod", required = true)
    protected DatePeriodType effectiveDatePeriod;
    @XmlElement(name = "SuppliedBy", required = true)
    protected PartnerDescriptionType suppliedBy;
    @XmlElement(name = "SupplierItem", required = true)
    protected ProductIdentificationType supplierItem;
    @XmlElementRef(name = "SupplierPartStatus", namespace = "urn:rosettanet:specification:domain:Logistics:SupplierPartStatus:xsd:codelist:01.00", type = SupplierPartStatus.class)
    protected SupplierPartStatus supplierPartStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the effectiveDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDatePeriod() {
        return effectiveDatePeriod;
    }

    /**
     * Sets the value of the effectiveDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDatePeriod(DatePeriodType value) {
        this.effectiveDatePeriod = value;
    }

    /**
     * Gets the value of the suppliedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getSuppliedBy() {
        return suppliedBy;
    }

    /**
     * Sets the value of the suppliedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setSuppliedBy(PartnerDescriptionType value) {
        this.suppliedBy = value;
    }

    /**
     * Gets the value of the supplierItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getSupplierItem() {
        return supplierItem;
    }

    /**
     * Sets the value of the supplierItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setSupplierItem(ProductIdentificationType value) {
        this.supplierItem = value;
    }

    /**
     * Gets the value of the supplierPartStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierPartStatus }
     *     
     */
    public SupplierPartStatus getSupplierPartStatus() {
        return supplierPartStatus;
    }

    /**
     * Sets the value of the supplierPartStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPartStatus }
     *     
     */
    public void setSupplierPartStatus(SupplierPartStatus value) {
        this.supplierPartStatus = value;
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
