
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

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
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateTimeType;


/**
 * <p>Java class for TestOpIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestOpIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SetupReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}SetupReportType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SlotID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestMode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="WaferShortID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaferTestingPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateTimeType" minOccurs="0"/&gt;
 *         &lt;element name="WaferUniqueID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="FinalTest" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}FinalTestType"/&gt;
 *           &lt;element name="PCM" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}PCMType"/&gt;
 *           &lt;element name="WaferSort" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}WaferSortType"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "TestOpIdentificationType", propOrder = {
    "setupReport",
    "slotID",
    "testLevel",
    "testMode",
    "waferShortID",
    "waferTestingPeriod",
    "waferUniqueID",
    "finalTest",
    "pcm",
    "waferSort"
})
public class TestOpIdentificationType {

    @XmlElement(name = "SetupReport", required = true)
    protected List<SetupReportType> setupReport;
    @XmlElement(name = "SlotID")
    protected String slotID;
    @XmlElement(name = "TestLevel")
    protected String testLevel;
    @XmlElement(name = "TestMode", required = true)
    protected String testMode;
    @XmlElement(name = "WaferShortID")
    protected String waferShortID;
    @XmlElement(name = "WaferTestingPeriod")
    protected StartAndEndDateTimeType waferTestingPeriod;
    @XmlElement(name = "WaferUniqueID")
    protected String waferUniqueID;
    @XmlElement(name = "FinalTest")
    protected FinalTestType finalTest;
    @XmlElement(name = "PCM")
    protected PCMType pcm;
    @XmlElement(name = "WaferSort")
    protected WaferSortType waferSort;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the setupReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the setupReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSetupReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetupReportType }
     * 
     * 
     */
    public List<SetupReportType> getSetupReport() {
        if (setupReport == null) {
            setupReport = new ArrayList<SetupReportType>();
        }
        return this.setupReport;
    }

    /**
     * Gets the value of the slotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlotID() {
        return slotID;
    }

    /**
     * Sets the value of the slotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlotID(String value) {
        this.slotID = value;
    }

    /**
     * Gets the value of the testLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestLevel() {
        return testLevel;
    }

    /**
     * Sets the value of the testLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestLevel(String value) {
        this.testLevel = value;
    }

    /**
     * Gets the value of the testMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestMode() {
        return testMode;
    }

    /**
     * Sets the value of the testMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestMode(String value) {
        this.testMode = value;
    }

    /**
     * Gets the value of the waferShortID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferShortID() {
        return waferShortID;
    }

    /**
     * Sets the value of the waferShortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferShortID(String value) {
        this.waferShortID = value;
    }

    /**
     * Gets the value of the waferTestingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateTimeType }
     *     
     */
    public StartAndEndDateTimeType getWaferTestingPeriod() {
        return waferTestingPeriod;
    }

    /**
     * Sets the value of the waferTestingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateTimeType }
     *     
     */
    public void setWaferTestingPeriod(StartAndEndDateTimeType value) {
        this.waferTestingPeriod = value;
    }

    /**
     * Gets the value of the waferUniqueID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferUniqueID() {
        return waferUniqueID;
    }

    /**
     * Sets the value of the waferUniqueID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferUniqueID(String value) {
        this.waferUniqueID = value;
    }

    /**
     * Gets the value of the finalTest property.
     * 
     * @return
     *     possible object is
     *     {@link FinalTestType }
     *     
     */
    public FinalTestType getFinalTest() {
        return finalTest;
    }

    /**
     * Sets the value of the finalTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalTestType }
     *     
     */
    public void setFinalTest(FinalTestType value) {
        this.finalTest = value;
    }

    /**
     * Gets the value of the pcm property.
     * 
     * @return
     *     possible object is
     *     {@link PCMType }
     *     
     */
    public PCMType getPCM() {
        return pcm;
    }

    /**
     * Sets the value of the pcm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PCMType }
     *     
     */
    public void setPCM(PCMType value) {
        this.pcm = value;
    }

    /**
     * Gets the value of the waferSort property.
     * 
     * @return
     *     possible object is
     *     {@link WaferSortType }
     *     
     */
    public WaferSortType getWaferSort() {
        return waferSort;
    }

    /**
     * Sets the value of the waferSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferSortType }
     *     
     */
    public void setWaferSort(WaferSortType value) {
        this.waferSort = value;
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
