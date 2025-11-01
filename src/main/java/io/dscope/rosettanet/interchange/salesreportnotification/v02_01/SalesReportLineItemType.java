
package io.dscope.rosettanet.interchange.salesreportnotification.v02_01;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SalesOutAndTransaction;
import io.dscope.rosettanet.domain.shared.shared.v01_12.ProductQuantity;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedNewPartnerType;


/**
 * <p>Java class for SalesReportLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReportLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallLocation" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedNewPartnerType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="OpportunityNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationalCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01}ProductInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}ProductQuantity"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SalesOutAndTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaim" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01}SpecialPriceClaimType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ValueAddedEnhancement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "SalesReportLineItemType", propOrder = {
    "businessDocumentReference",
    "comment",
    "installLocation",
    "lineNumber",
    "opportunityNumber",
    "orderType",
    "organizationalCoverage",
    "productInformation",
    "productQuantity",
    "salesOutAndTransaction",
    "specialPriceClaim",
    "valueAddedEnhancement"
})
public class SalesReportLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "InstallLocation")
    protected SpecifiedNewPartnerType installLocation;
    @XmlElement(name = "LineNumber", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger lineNumber;
    @XmlElement(name = "OpportunityNumber")
    protected String opportunityNumber;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "OrganizationalCoverage")
    protected String organizationalCoverage;
    @XmlElement(name = "ProductInformation", required = true)
    protected ProductInformationType productInformation;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "SalesOutAndTransaction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SalesOutAndTransaction.class, required = false)
    protected List<SalesOutAndTransaction> salesOutAndTransaction;
    @XmlElement(name = "SpecialPriceClaim")
    protected List<SpecialPriceClaimType> specialPriceClaim;
    @XmlElement(name = "ValueAddedEnhancement")
    protected String valueAddedEnhancement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the installLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public SpecifiedNewPartnerType getInstallLocation() {
        return installLocation;
    }

    /**
     * Sets the value of the installLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartnerType }
     *     
     */
    public void setInstallLocation(SpecifiedNewPartnerType value) {
        this.installLocation = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLineNumber(BigInteger value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the opportunityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpportunityNumber() {
        return opportunityNumber;
    }

    /**
     * Sets the value of the opportunityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpportunityNumber(String value) {
        this.opportunityNumber = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the organizationalCoverage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationalCoverage() {
        return organizationalCoverage;
    }

    /**
     * Sets the value of the organizationalCoverage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationalCoverage(String value) {
        this.organizationalCoverage = value;
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
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the salesOutAndTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOutAndTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOutAndTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOutAndTransaction }
     * 
     * 
     */
    public List<SalesOutAndTransaction> getSalesOutAndTransaction() {
        if (salesOutAndTransaction == null) {
            salesOutAndTransaction = new ArrayList<SalesOutAndTransaction>();
        }
        return this.salesOutAndTransaction;
    }

    /**
     * Gets the value of the specialPriceClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPriceClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPriceClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialPriceClaimType }
     * 
     * 
     */
    public List<SpecialPriceClaimType> getSpecialPriceClaim() {
        if (specialPriceClaim == null) {
            specialPriceClaim = new ArrayList<SpecialPriceClaimType>();
        }
        return this.specialPriceClaim;
    }

    /**
     * Gets the value of the valueAddedEnhancement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValueAddedEnhancement() {
        return valueAddedEnhancement;
    }

    /**
     * Sets the value of the valueAddedEnhancement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValueAddedEnhancement(String value) {
        this.valueAddedEnhancement = value;
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
