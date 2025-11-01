
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.QuantityDetail;


/**
 * <p>Java class for AssemblyLotReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyLotReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateYield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="AssemblyLotID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Calculation" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IncomingWaferLotReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}IncomingWaferLotReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LotTimeStamp" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}LotTimeStampType"/&gt;
 *         &lt;element name="MfgWorkWeek" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperationInformationReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OperationInformationReportType" minOccurs="0"/&gt;
 *         &lt;element name="OpticalInspectionReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}OpticalInspectionReportType" minOccurs="0"/&gt;
 *         &lt;element name="OverallYield" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element name="Package" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}PackageType"/&gt;
 *         &lt;element name="PackageReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}PackageReportType" minOccurs="0"/&gt;
 *         &lt;element name="ProductCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}QuantityDetail" minOccurs="0"/&gt;
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
@XmlType(name = "AssemblyLotReportType", propOrder = {
    "alternateYield",
    "assemblyLotID",
    "calculation",
    "customerChipPN",
    "incomingWaferLotReport",
    "lotTimeStamp",
    "mfgWorkWeek",
    "operationInformationReport",
    "opticalInspectionReport",
    "overallYield",
    "_package",
    "packageReport",
    "productCategory",
    "quantityDetail"
})
public class AssemblyLotReportType {

    @XmlElement(name = "AlternateYield")
    protected List<BigDecimal> alternateYield;
    @XmlElement(name = "AssemblyLotID")
    protected String assemblyLotID;
    @XmlElement(name = "Calculation")
    protected List<String> calculation;
    @XmlElement(name = "CustomerChipPN")
    protected String customerChipPN;
    @XmlElement(name = "IncomingWaferLotReport")
    protected List<IncomingWaferLotReportType> incomingWaferLotReport;
    @XmlElement(name = "LotTimeStamp", required = true)
    protected LotTimeStampType lotTimeStamp;
    @XmlElement(name = "MfgWorkWeek")
    protected String mfgWorkWeek;
    @XmlElement(name = "OperationInformationReport")
    protected OperationInformationReportType operationInformationReport;
    @XmlElement(name = "OpticalInspectionReport")
    protected OpticalInspectionReportType opticalInspectionReport;
    @XmlElement(name = "OverallYield")
    protected BigDecimal overallYield;
    @XmlElement(name = "Package", required = true)
    protected PackageType _package;
    @XmlElement(name = "PackageReport")
    protected PackageReportType packageReport;
    @XmlElement(name = "ProductCategory")
    protected String productCategory;
    @XmlElementRef(name = "QuantityDetail", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = QuantityDetail.class, required = false)
    protected QuantityDetail quantityDetail;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternateYield property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateYield property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateYield().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getAlternateYield() {
        if (alternateYield == null) {
            alternateYield = new ArrayList<BigDecimal>();
        }
        return this.alternateYield;
    }

    /**
     * Gets the value of the assemblyLotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssemblyLotID() {
        return assemblyLotID;
    }

    /**
     * Sets the value of the assemblyLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssemblyLotID(String value) {
        this.assemblyLotID = value;
    }

    /**
     * Gets the value of the calculation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calculation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalculation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCalculation() {
        if (calculation == null) {
            calculation = new ArrayList<String>();
        }
        return this.calculation;
    }

    /**
     * Gets the value of the customerChipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerChipPN() {
        return customerChipPN;
    }

    /**
     * Sets the value of the customerChipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerChipPN(String value) {
        this.customerChipPN = value;
    }

    /**
     * Gets the value of the incomingWaferLotReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incomingWaferLotReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncomingWaferLotReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncomingWaferLotReportType }
     * 
     * 
     */
    public List<IncomingWaferLotReportType> getIncomingWaferLotReport() {
        if (incomingWaferLotReport == null) {
            incomingWaferLotReport = new ArrayList<IncomingWaferLotReportType>();
        }
        return this.incomingWaferLotReport;
    }

    /**
     * Gets the value of the lotTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link LotTimeStampType }
     *     
     */
    public LotTimeStampType getLotTimeStamp() {
        return lotTimeStamp;
    }

    /**
     * Sets the value of the lotTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotTimeStampType }
     *     
     */
    public void setLotTimeStamp(LotTimeStampType value) {
        this.lotTimeStamp = value;
    }

    /**
     * Gets the value of the mfgWorkWeek property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMfgWorkWeek() {
        return mfgWorkWeek;
    }

    /**
     * Sets the value of the mfgWorkWeek property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMfgWorkWeek(String value) {
        this.mfgWorkWeek = value;
    }

    /**
     * Gets the value of the operationInformationReport property.
     * 
     * @return
     *     possible object is
     *     {@link OperationInformationReportType }
     *     
     */
    public OperationInformationReportType getOperationInformationReport() {
        return operationInformationReport;
    }

    /**
     * Sets the value of the operationInformationReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationInformationReportType }
     *     
     */
    public void setOperationInformationReport(OperationInformationReportType value) {
        this.operationInformationReport = value;
    }

    /**
     * Gets the value of the opticalInspectionReport property.
     * 
     * @return
     *     possible object is
     *     {@link OpticalInspectionReportType }
     *     
     */
    public OpticalInspectionReportType getOpticalInspectionReport() {
        return opticalInspectionReport;
    }

    /**
     * Sets the value of the opticalInspectionReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpticalInspectionReportType }
     *     
     */
    public void setOpticalInspectionReport(OpticalInspectionReportType value) {
        this.opticalInspectionReport = value;
    }

    /**
     * Gets the value of the overallYield property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOverallYield() {
        return overallYield;
    }

    /**
     * Sets the value of the overallYield property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOverallYield(BigDecimal value) {
        this.overallYield = value;
    }

    /**
     * Gets the value of the package property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackage() {
        return _package;
    }

    /**
     * Sets the value of the package property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackage(PackageType value) {
        this._package = value;
    }

    /**
     * Gets the value of the packageReport property.
     * 
     * @return
     *     possible object is
     *     {@link PackageReportType }
     *     
     */
    public PackageReportType getPackageReport() {
        return packageReport;
    }

    /**
     * Sets the value of the packageReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageReportType }
     *     
     */
    public void setPackageReport(PackageReportType value) {
        this.packageReport = value;
    }

    /**
     * Gets the value of the productCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductCategory() {
        return productCategory;
    }

    /**
     * Sets the value of the productCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductCategory(String value) {
        this.productCategory = value;
    }

    /**
     * Gets the value of the quantityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetail }
     *     
     */
    public QuantityDetail getQuantityDetail() {
        return quantityDetail;
    }

    /**
     * Sets the value of the quantityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetail }
     *     
     */
    public void setQuantityDetail(QuantityDetail value) {
        this.quantityDetail = value;
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
