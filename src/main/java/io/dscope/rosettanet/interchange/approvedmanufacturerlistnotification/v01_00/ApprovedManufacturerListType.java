
package io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00;

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
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ApprovedManufacturerListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ApprovedManufacturerListType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedManufacturerListItem" type="{urn:rosettanet:specification:interchange:ApprovedManufacturerListNotification:xsd:schema:01.00}ApprovedManufacturerListItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="EffectiveDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element name="InternalBusinessEntity" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreviousNotification" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
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
@XmlType(name = "ApprovedManufacturerListType", propOrder = {
    "approvedManufacturerListItem",
    "effectiveDatePeriod",
    "internalBusinessEntity",
    "previousNotification",
    "productIdentification"
})
public class ApprovedManufacturerListType {

    @XmlElement(name = "ApprovedManufacturerListItem", required = true)
    protected List<ApprovedManufacturerListItemType> approvedManufacturerListItem;
    @XmlElement(name = "EffectiveDatePeriod", required = true)
    protected DatePeriodType effectiveDatePeriod;
    @XmlElement(name = "InternalBusinessEntity")
    protected List<SpecifiedPartnerDescriptionType> internalBusinessEntity;
    @XmlElement(name = "PreviousNotification")
    protected BusinessDocumentReferenceType previousNotification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvedManufacturerListItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approvedManufacturerListItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApprovedManufacturerListItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApprovedManufacturerListItemType }
     * 
     * 
     */
    public List<ApprovedManufacturerListItemType> getApprovedManufacturerListItem() {
        if (approvedManufacturerListItem == null) {
            approvedManufacturerListItem = new ArrayList<ApprovedManufacturerListItemType>();
        }
        return this.approvedManufacturerListItem;
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
     * Gets the value of the internalBusinessEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalBusinessEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalBusinessEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getInternalBusinessEntity() {
        if (internalBusinessEntity == null) {
            internalBusinessEntity = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.internalBusinessEntity;
    }

    /**
     * Gets the value of the previousNotification property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPreviousNotification() {
        return previousNotification;
    }

    /**
     * Sets the value of the previousNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPreviousNotification(BusinessDocumentReferenceType value) {
        this.previousNotification = value;
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
