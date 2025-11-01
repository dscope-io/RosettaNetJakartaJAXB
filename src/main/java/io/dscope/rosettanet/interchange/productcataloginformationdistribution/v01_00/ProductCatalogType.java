
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
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_03.ActionCode;
import io.dscope.rosettanet.domain.design.codelist.catalogtype.v01_00.CatalogType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.GeographicRegion;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformation;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerIdentification;


/**
 * <p>Java class for ProductCatalogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductCatalogType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03}ActionCode"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CatalogDisclaimer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.00}CatalogType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformation" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationCoverageIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerIdentification"/&gt;
 *         &lt;element name="ProductLineItem" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00}ProductLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductCatalogType", propOrder = {
    "actionCode",
    "businessDocumentReference",
    "catalogDisclaimer",
    "catalogType",
    "contactInformation",
    "description",
    "effectiveDate",
    "geographicRegion",
    "organizationCoverageIdentifier",
    "partnerIdentification",
    "productLineItem"
})
public class ProductCatalogType {

    @XmlElementRef(name = "ActionCode", namespace = "urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.03", type = ActionCode.class)
    protected ActionCode actionCode;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "CatalogDisclaimer")
    protected String catalogDisclaimer;
    @XmlElementRef(name = "CatalogType", namespace = "urn:rosettanet:specification:domain:Design:CatalogType:xsd:codelist:01.00", type = CatalogType.class)
    protected CatalogType catalogType;
    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03", type = ContactInformation.class, required = false)
    protected ContactInformation contactInformation;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "OrganizationCoverageIdentifier")
    protected String organizationCoverageIdentifier;
    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerIdentification.class)
    protected PartnerIdentification partnerIdentification;
    @XmlElement(name = "ProductLineItem", required = true)
    protected List<ProductLineItemType> productLineItem;
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
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the catalogDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCatalogDisclaimer() {
        return catalogDisclaimer;
    }

    /**
     * Sets the value of the catalogDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCatalogDisclaimer(String value) {
        this.catalogDisclaimer = value;
    }

    /**
     * Gets the value of the catalogType property.
     * 
     * @return
     *     possible object is
     *     {@link CatalogType }
     *     
     */
    public CatalogType getCatalogType() {
        return catalogType;
    }

    /**
     * Sets the value of the catalogType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CatalogType }
     *     
     */
    public void setCatalogType(CatalogType value) {
        this.catalogType = value;
    }

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
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
     * Gets the value of the geographicRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegion }
     *     
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /**
     * Sets the value of the geographicRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegion }
     *     
     */
    public void setGeographicRegion(GeographicRegion value) {
        this.geographicRegion = value;
    }

    /**
     * Gets the value of the organizationCoverageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationCoverageIdentifier() {
        return organizationCoverageIdentifier;
    }

    /**
     * Sets the value of the organizationCoverageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationCoverageIdentifier(String value) {
        this.organizationCoverageIdentifier = value;
    }

    /**
     * Gets the value of the partnerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentification }
     *     
     */
    public PartnerIdentification getPartnerIdentification() {
        return partnerIdentification;
    }

    /**
     * Sets the value of the partnerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentification }
     *     
     */
    public void setPartnerIdentification(PartnerIdentification value) {
        this.partnerIdentification = value;
    }

    /**
     * Gets the value of the productLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLineItemType }
     * 
     * 
     */
    public List<ProductLineItemType> getProductLineItem() {
        if (productLineItem == null) {
            productLineItem = new ArrayList<ProductLineItemType>();
        }
        return this.productLineItem;
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
