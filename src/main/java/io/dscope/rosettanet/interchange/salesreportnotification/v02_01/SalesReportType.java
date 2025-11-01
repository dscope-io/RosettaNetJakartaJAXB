
package io.dscope.rosettanet.interchange.salesreportnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_04.ReportType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ContractDetails;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ProductSummary;
import io.dscope.rosettanet.universal.dates.v01_03.DateTimePeriodType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;


/**
 * <p>Java class for SalesReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccountManagerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ContractDetails" minOccurs="0"/&gt;
 *         &lt;element name="ExportReferenceNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrderType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OrganizationalCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ProductSummary" minOccurs="0"/&gt;
 *         &lt;element name="ProductTransfer" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:02.01}ProductTransferType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReportPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:01.04}ReportType"/&gt;
 *         &lt;element name="SalesTerritoryNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "SalesReportType", propOrder = {
    "accountManagerCode",
    "comment",
    "contractDetails",
    "exportReferenceNumber",
    "marketType",
    "orderType",
    "organizationalCoverage",
    "partnerDescription",
    "productSummary",
    "productTransfer",
    "reportPeriod",
    "reportType",
    "salesTerritoryNumber"
})
public class SalesReportType {

    @XmlElement(name = "AccountManagerCode")
    protected String accountManagerCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "ContractDetails", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ContractDetails.class, required = false)
    protected ContractDetails contractDetails;
    @XmlElement(name = "ExportReferenceNumber")
    protected BusinessDocumentReferenceType exportReferenceNumber;
    @XmlElement(name = "MarketType")
    protected String marketType;
    @XmlElement(name = "OrderType")
    protected String orderType;
    @XmlElement(name = "OrganizationalCoverage")
    protected String organizationalCoverage;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductSummary", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ProductSummary.class, required = false)
    protected ProductSummary productSummary;
    @XmlElement(name = "ProductTransfer", required = true)
    protected List<ProductTransferType> productTransfer;
    @XmlElement(name = "ReportPeriod")
    protected DateTimePeriodType reportPeriod;
    @XmlElementRef(name = "ReportType", namespace = "urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:01.04", type = ReportType.class)
    protected ReportType reportType;
    @XmlElement(name = "SalesTerritoryNumber")
    protected BusinessDocumentReferenceType salesTerritoryNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accountManagerCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountManagerCode() {
        return accountManagerCode;
    }

    /**
     * Sets the value of the accountManagerCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountManagerCode(String value) {
        this.accountManagerCode = value;
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
     * Gets the value of the contractDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ContractDetails }
     *     
     */
    public ContractDetails getContractDetails() {
        return contractDetails;
    }

    /**
     * Sets the value of the contractDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractDetails }
     *     
     */
    public void setContractDetails(ContractDetails value) {
        this.contractDetails = value;
    }

    /**
     * Gets the value of the exportReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getExportReferenceNumber() {
        return exportReferenceNumber;
    }

    /**
     * Sets the value of the exportReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setExportReferenceNumber(BusinessDocumentReferenceType value) {
        this.exportReferenceNumber = value;
    }

    /**
     * Gets the value of the marketType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketType() {
        return marketType;
    }

    /**
     * Sets the value of the marketType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketType(String value) {
        this.marketType = value;
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
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the productSummary property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSummary }
     *     
     */
    public ProductSummary getProductSummary() {
        return productSummary;
    }

    /**
     * Sets the value of the productSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSummary }
     *     
     */
    public void setProductSummary(ProductSummary value) {
        this.productSummary = value;
    }

    /**
     * Gets the value of the productTransfer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productTransfer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductTransfer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductTransferType }
     * 
     * 
     */
    public List<ProductTransferType> getProductTransfer() {
        if (productTransfer == null) {
            productTransfer = new ArrayList<ProductTransferType>();
        }
        return this.productTransfer;
    }

    /**
     * Gets the value of the reportPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getReportPeriod() {
        return reportPeriod;
    }

    /**
     * Sets the value of the reportPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setReportPeriod(DateTimePeriodType value) {
        this.reportPeriod = value;
    }

    /**
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportType }
     *     
     */
    public ReportType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportType }
     *     
     */
    public void setReportType(ReportType value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the salesTerritoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getSalesTerritoryNumber() {
        return salesTerritoryNumber;
    }

    /**
     * Sets the value of the salesTerritoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setSalesTerritoryNumber(BusinessDocumentReferenceType value) {
        this.salesTerritoryNumber = value;
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
