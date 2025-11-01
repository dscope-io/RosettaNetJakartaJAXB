
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DieType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DieType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieReticlePN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PartText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:1.0}TestReportType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "DieType", propOrder = {
    "chipPN",
    "dieReticlePN",
    "packageDescription",
    "partText",
    "serialNumber",
    "testReport"
})
public class DieType {

    @XmlElement(name = "ChipPN")
    protected String chipPN;
    @XmlElement(name = "DieReticlePN")
    protected String dieReticlePN;
    @XmlElement(name = "PackageDescription")
    protected String packageDescription;
    @XmlElement(name = "PartText")
    protected String partText;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElement(name = "TestReport", required = true)
    protected List<TestReportType> testReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPN() {
        return chipPN;
    }

    /**
     * Sets the value of the chipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPN(String value) {
        this.chipPN = value;
    }

    /**
     * Gets the value of the dieReticlePN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieReticlePN() {
        return dieReticlePN;
    }

    /**
     * Sets the value of the dieReticlePN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieReticlePN(String value) {
        this.dieReticlePN = value;
    }

    /**
     * Gets the value of the packageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * Sets the value of the packageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescription(String value) {
        this.packageDescription = value;
    }

    /**
     * Gets the value of the partText property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartText() {
        return partText;
    }

    /**
     * Sets the value of the partText property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartText(String value) {
        this.partText = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the testReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestReportType }
     * 
     * 
     */
    public List<TestReportType> getTestReport() {
        if (testReport == null) {
            testReport = new ArrayList<TestReportType>();
        }
        return this.testReport;
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
