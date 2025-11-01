
package io.dscope.rosettanet.interchange.approvedmanufacturerlistconfirmationnotification.v01_00;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.logistics.codelist.manufacturerpartstatus.v01_00.ManufacturerPartStatus;
import io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00.PreferredStatus;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.DateQuantityType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28.Attachment;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for ApprovedManufacturerListItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedManufacturerListItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedSupplierListItem" type="{urn:rosettanet:specification:interchange:ApprovedManufacturerListConfirmationNotification:xsd:schema:01.00}ApprovedSupplierListItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28}Attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Disposition" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}DateQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element name="ManufacturedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescriptionType"/&gt;
 *         &lt;element name="ManufacturerItem" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0}ManufacturerPartStatus"/&gt;
 *         &lt;element name="ManufacturerSplit" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:1.0}PreferredStatus"/&gt;
 *         &lt;element name="Purge" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}DateQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "ApprovedManufacturerListItemType", propOrder = {
    "approvedSupplierListItem",
    "attachment",
    "description",
    "disposition",
    "effectiveDatePeriod",
    "manufacturedBy",
    "manufacturerItem",
    "manufacturerPartStatus",
    "manufacturerSplit",
    "preferredStatus",
    "purge"
})
public class ApprovedManufacturerListItemType {

    @XmlElement(name = "ApprovedSupplierListItem")
    protected List<ApprovedSupplierListItemType> approvedSupplierListItem;
    @XmlElementRef(name = "Attachment", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", type = Attachment.class, required = false)
    protected List<Attachment> attachment;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Disposition")
    protected DateQuantityType disposition;
    @XmlElement(name = "EffectiveDatePeriod", required = true)
    protected DatePeriodType effectiveDatePeriod;
    @XmlElement(name = "ManufacturedBy", required = true)
    protected PartnerDescriptionType manufacturedBy;
    @XmlElement(name = "ManufacturerItem", required = true)
    protected ProductIdentificationType manufacturerItem;
    @XmlElementRef(name = "ManufacturerPartStatus", namespace = "urn:rosettanet:specification:domain:Logistics:ManufacturerPartStatus:xsd:codelist:1.0", type = ManufacturerPartStatus.class)
    protected ManufacturerPartStatus manufacturerPartStatus;
    @XmlElement(name = "ManufacturerSplit")
    protected BigDecimal manufacturerSplit;
    @XmlElementRef(name = "PreferredStatus", namespace = "urn:rosettanet:specification:domain:Logistics:PreferredStatus:xsd:codelist:1.0", type = PreferredStatus.class)
    protected PreferredStatus preferredStatus;
    @XmlElement(name = "Purge")
    protected DateQuantityType purge;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvedSupplierListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvedSupplierListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovedSupplierListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovedSupplierListItemType }
     * 
     * 
     */
    public List<ApprovedSupplierListItemType> getApprovedSupplierListItem() {
        if (approvedSupplierListItem == null) {
            approvedSupplierListItem = new ArrayList<ApprovedSupplierListItemType>();
        }
        return this.approvedSupplierListItem;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
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
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link DateQuantityType }
     *     
     */
    public DateQuantityType getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateQuantityType }
     *     
     */
    public void setDisposition(DateQuantityType value) {
        this.disposition = value;
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
     * Gets the value of the manufacturedBy property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getManufacturedBy() {
        return manufacturedBy;
    }

    /**
     * Sets the value of the manufacturedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setManufacturedBy(PartnerDescriptionType value) {
        this.manufacturedBy = value;
    }

    /**
     * Gets the value of the manufacturerItem property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getManufacturerItem() {
        return manufacturerItem;
    }

    /**
     * Sets the value of the manufacturerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setManufacturerItem(ProductIdentificationType value) {
        this.manufacturerItem = value;
    }

    /**
     * Gets the value of the manufacturerPartStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturerPartStatus }
     *     
     */
    public ManufacturerPartStatus getManufacturerPartStatus() {
        return manufacturerPartStatus;
    }

    /**
     * Sets the value of the manufacturerPartStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturerPartStatus }
     *     
     */
    public void setManufacturerPartStatus(ManufacturerPartStatus value) {
        this.manufacturerPartStatus = value;
    }

    /**
     * Gets the value of the manufacturerSplit property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getManufacturerSplit() {
        return manufacturerSplit;
    }

    /**
     * Sets the value of the manufacturerSplit property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setManufacturerSplit(BigDecimal value) {
        this.manufacturerSplit = value;
    }

    /**
     * Gets the value of the preferredStatus property.
     * 
     * @return
     *     possible object is
     *     {@link PreferredStatus }
     *     
     */
    public PreferredStatus getPreferredStatus() {
        return preferredStatus;
    }

    /**
     * Sets the value of the preferredStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreferredStatus }
     *     
     */
    public void setPreferredStatus(PreferredStatus value) {
        this.preferredStatus = value;
    }

    /**
     * Gets the value of the purge property.
     * 
     * @return
     *     possible object is
     *     {@link DateQuantityType }
     *     
     */
    public DateQuantityType getPurge() {
        return purge;
    }

    /**
     * Sets the value of the purge property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateQuantityType }
     *     
     */
    public void setPurge(DateQuantityType value) {
        this.purge = value;
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
