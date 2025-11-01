
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.codelist.reporttype.v01_00.ReportTypeType;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ContractDetails;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ParticipatingPartner;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ProductSummary;


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
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ContractDetails" minOccurs="0"/&gt;
 *         &lt;element name="ExportReferenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MarketType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ParticipatingPartner" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ProductSummary" minOccurs="0"/&gt;
 *         &lt;element name="ProductTransfer" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0}ProductTransferType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReportType" type="{urn:rosettanet:specification:domain:ReportType:xsd:codelist:1.0}ReportTypeType"/&gt;
 *         &lt;element name="SalesTerritoryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
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
    "participatingPartner",
    "productSummary",
    "productTransfer",
    "reportType",
    "salesTerritoryNumber"
})
public class SalesReportType {

    @XmlElement(name = "AccountManagerCode")
    protected String accountManagerCode;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "ContractDetails", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ContractDetails.class, required = false)
    protected ContractDetails contractDetails;
    @XmlElement(name = "ExportReferenceNumber")
    protected String exportReferenceNumber;
    @XmlElement(name = "MarketType")
    protected String marketType;
    @XmlElementRef(name = "ParticipatingPartner", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ParticipatingPartner.class)
    protected List<ParticipatingPartner> participatingPartner;
    @XmlElementRef(name = "ProductSummary", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ProductSummary.class, required = false)
    protected ProductSummary productSummary;
    @XmlElement(name = "ProductTransfer", required = true)
    protected List<ProductTransferType> productTransfer;
    @XmlElement(name = "ReportType", required = true)
    protected ReportTypeType reportType;
    @XmlElement(name = "SalesTerritoryNumber")
    protected String salesTerritoryNumber;
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
     *     {@link String }
     *     
     */
    public String getExportReferenceNumber() {
        return exportReferenceNumber;
    }

    /**
     * Sets the value of the exportReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExportReferenceNumber(String value) {
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
     * Gets the value of the participatingPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participatingPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipatingPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParticipatingPartner }
     * 
     * 
     */
    public List<ParticipatingPartner> getParticipatingPartner() {
        if (participatingPartner == null) {
            participatingPartner = new ArrayList<ParticipatingPartner>();
        }
        return this.participatingPartner;
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
     * Gets the value of the reportType property.
     * 
     * @return
     *     possible object is
     *     {@link ReportTypeType }
     *     
     */
    public ReportTypeType getReportType() {
        return reportType;
    }

    /**
     * Sets the value of the reportType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportTypeType }
     *     
     */
    public void setReportType(ReportTypeType value) {
        this.reportType = value;
    }

    /**
     * Gets the value of the salesTerritoryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesTerritoryNumber() {
        return salesTerritoryNumber;
    }

    /**
     * Sets the value of the salesTerritoryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesTerritoryNumber(String value) {
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
