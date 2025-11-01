
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.ECIDReport;


/**
 * <p>Java class for PackageReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssemblyMeasurementReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}AssemblyMeasurementReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BuildInfoReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}BuildInfoReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}ECIDReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FinalPackageReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}FinalPackageReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageDefectCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="PackageDefectID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PackageText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "PackageReportType", propOrder = {
    "assemblyMeasurementReport",
    "buildInfoReport",
    "ecidReport",
    "finalPackageReport",
    "packageDefectCount",
    "packageDefectID",
    "packageID",
    "packageText",
    "primaryIdentifier"
})
public class PackageReportType {

    @XmlElement(name = "AssemblyMeasurementReport")
    protected List<AssemblyMeasurementReportType> assemblyMeasurementReport;
    @XmlElement(name = "BuildInfoReport")
    protected List<BuildInfoReportType> buildInfoReport;
    @XmlElementRef(name = "ECIDReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = ECIDReport.class, required = false)
    protected List<ECIDReport> ecidReport;
    @XmlElement(name = "FinalPackageReport")
    protected List<FinalPackageReportType> finalPackageReport;
    @XmlElement(name = "PackageDefectCount")
    protected BigInteger packageDefectCount;
    @XmlElement(name = "PackageDefectID")
    protected String packageDefectID;
    @XmlElement(name = "PackageID")
    protected List<String> packageID;
    @XmlElement(name = "PackageText")
    protected List<String> packageText;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyMeasurementReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyMeasurementReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyMeasurementReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyMeasurementReportType }
     * 
     * 
     */
    public List<AssemblyMeasurementReportType> getAssemblyMeasurementReport() {
        if (assemblyMeasurementReport == null) {
            assemblyMeasurementReport = new ArrayList<AssemblyMeasurementReportType>();
        }
        return this.assemblyMeasurementReport;
    }

    /**
     * Gets the value of the buildInfoReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the buildInfoReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBuildInfoReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BuildInfoReportType }
     * 
     * 
     */
    public List<BuildInfoReportType> getBuildInfoReport() {
        if (buildInfoReport == null) {
            buildInfoReport = new ArrayList<BuildInfoReportType>();
        }
        return this.buildInfoReport;
    }

    /**
     * Gets the value of the ecidReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ecidReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getECIDReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ECIDReport }
     * 
     * 
     */
    public List<ECIDReport> getECIDReport() {
        if (ecidReport == null) {
            ecidReport = new ArrayList<ECIDReport>();
        }
        return this.ecidReport;
    }

    /**
     * Gets the value of the finalPackageReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the finalPackageReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinalPackageReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinalPackageReportType }
     * 
     * 
     */
    public List<FinalPackageReportType> getFinalPackageReport() {
        if (finalPackageReport == null) {
            finalPackageReport = new ArrayList<FinalPackageReportType>();
        }
        return this.finalPackageReport;
    }

    /**
     * Gets the value of the packageDefectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPackageDefectCount() {
        return packageDefectCount;
    }

    /**
     * Sets the value of the packageDefectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPackageDefectCount(BigInteger value) {
        this.packageDefectCount = value;
    }

    /**
     * Gets the value of the packageDefectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDefectID() {
        return packageDefectID;
    }

    /**
     * Sets the value of the packageDefectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDefectID(String value) {
        this.packageDefectID = value;
    }

    /**
     * Gets the value of the packageID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageID() {
        if (packageID == null) {
            packageID = new ArrayList<String>();
        }
        return this.packageID;
    }

    /**
     * Gets the value of the packageText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPackageText() {
        if (packageText == null) {
            packageText = new ArrayList<String>();
        }
        return this.packageText;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryIdentifier(BigInteger value) {
        this.primaryIdentifier = value;
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
