
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_02.Confidentiality;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.Lot;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.Pin;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.TestSpecificationReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.Wafer;


/**
 * <p>Java class for LotReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BALocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}BALocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.02}Confidentiality" minOccurs="0"/&gt;
 *         &lt;element name="FabLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}FabLocationType" minOccurs="0"/&gt;
 *         &lt;element name="FileDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FinalTestLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}FinalTestLocationType" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLotStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}Lot"/&gt;
 *         &lt;element name="OtherLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}OtherLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}Pin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QualityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RetestType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sort" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}SortType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestOperationDescription" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}TestOperationDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}TestSpecificationReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}Wafer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaferSortLocation" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}WaferSortLocationType" minOccurs="0"/&gt;
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
@XmlType(name = "LotReportType", propOrder = {
    "baLocation",
    "confidentiality",
    "fabLocation",
    "fileDataVersion",
    "finalTestLocation",
    "globalLotStatusCode",
    "lot",
    "otherLocation",
    "pin",
    "qualityCode",
    "retestType",
    "sort",
    "testOperationDescription",
    "testSpecificationReport",
    "wafer",
    "waferSortLocation"
})
public class LotReportType {

    @XmlElement(name = "BALocation")
    protected BALocationType baLocation;
    @XmlElementRef(name = "Confidentiality", namespace = "urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.02", type = Confidentiality.class, required = false)
    protected Confidentiality confidentiality;
    @XmlElement(name = "FabLocation")
    protected FabLocationType fabLocation;
    @XmlElement(name = "FileDataVersion")
    protected String fileDataVersion;
    @XmlElement(name = "FinalTestLocation")
    protected FinalTestLocationType finalTestLocation;
    @XmlElement(name = "GlobalLotStatusCode")
    protected String globalLotStatusCode;
    @XmlElementRef(name = "Lot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = Lot.class)
    protected Lot lot;
    @XmlElement(name = "OtherLocation")
    protected List<OtherLocationType> otherLocation;
    @XmlElementRef(name = "Pin", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = Pin.class, required = false)
    protected List<Pin> pin;
    @XmlElement(name = "QualityCode")
    protected String qualityCode;
    @XmlElement(name = "RetestType")
    protected String retestType;
    @XmlElement(name = "Sort")
    protected List<SortType> sort;
    @XmlElement(name = "TestOperationDescription", required = true)
    protected TestOperationDescriptionType testOperationDescription;
    @XmlElementRef(name = "TestSpecificationReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = TestSpecificationReport.class, required = false)
    protected List<TestSpecificationReport> testSpecificationReport;
    @XmlElementRef(name = "Wafer", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = Wafer.class, required = false)
    protected List<Wafer> wafer;
    @XmlElement(name = "WaferSortLocation")
    protected WaferSortLocationType waferSortLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the baLocation property.
     * 
     * @return
     *     possible object is
     *     {@link BALocationType }
     *     
     */
    public BALocationType getBALocation() {
        return baLocation;
    }

    /**
     * Sets the value of the baLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BALocationType }
     *     
     */
    public void setBALocation(BALocationType value) {
        this.baLocation = value;
    }

    /**
     * Gets the value of the confidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link Confidentiality }
     *     
     */
    public Confidentiality getConfidentiality() {
        return confidentiality;
    }

    /**
     * Sets the value of the confidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Confidentiality }
     *     
     */
    public void setConfidentiality(Confidentiality value) {
        this.confidentiality = value;
    }

    /**
     * Gets the value of the fabLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FabLocationType }
     *     
     */
    public FabLocationType getFabLocation() {
        return fabLocation;
    }

    /**
     * Sets the value of the fabLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FabLocationType }
     *     
     */
    public void setFabLocation(FabLocationType value) {
        this.fabLocation = value;
    }

    /**
     * Gets the value of the fileDataVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileDataVersion() {
        return fileDataVersion;
    }

    /**
     * Sets the value of the fileDataVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileDataVersion(String value) {
        this.fileDataVersion = value;
    }

    /**
     * Gets the value of the finalTestLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FinalTestLocationType }
     *     
     */
    public FinalTestLocationType getFinalTestLocation() {
        return finalTestLocation;
    }

    /**
     * Sets the value of the finalTestLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinalTestLocationType }
     *     
     */
    public void setFinalTestLocation(FinalTestLocationType value) {
        this.finalTestLocation = value;
    }

    /**
     * Gets the value of the globalLotStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalLotStatusCode() {
        return globalLotStatusCode;
    }

    /**
     * Sets the value of the globalLotStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalLotStatusCode(String value) {
        this.globalLotStatusCode = value;
    }

    /**
     * Gets the value of the lot property.
     * 
     * @return
     *     possible object is
     *     {@link Lot }
     *     
     */
    public Lot getLot() {
        return lot;
    }

    /**
     * Sets the value of the lot property.
     * 
     * @param value
     *     allowed object is
     *     {@link Lot }
     *     
     */
    public void setLot(Lot value) {
        this.lot = value;
    }

    /**
     * Gets the value of the otherLocation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherLocation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherLocationType }
     * 
     * 
     */
    public List<OtherLocationType> getOtherLocation() {
        if (otherLocation == null) {
            otherLocation = new ArrayList<OtherLocationType>();
        }
        return this.otherLocation;
    }

    /**
     * Gets the value of the pin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Pin }
     * 
     * 
     */
    public List<Pin> getPin() {
        if (pin == null) {
            pin = new ArrayList<Pin>();
        }
        return this.pin;
    }

    /**
     * Gets the value of the qualityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityCode() {
        return qualityCode;
    }

    /**
     * Sets the value of the qualityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityCode(String value) {
        this.qualityCode = value;
    }

    /**
     * Gets the value of the retestType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetestType() {
        return retestType;
    }

    /**
     * Sets the value of the retestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetestType(String value) {
        this.retestType = value;
    }

    /**
     * Gets the value of the sort property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sort property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSort().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortType }
     * 
     * 
     */
    public List<SortType> getSort() {
        if (sort == null) {
            sort = new ArrayList<SortType>();
        }
        return this.sort;
    }

    /**
     * Gets the value of the testOperationDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TestOperationDescriptionType }
     *     
     */
    public TestOperationDescriptionType getTestOperationDescription() {
        return testOperationDescription;
    }

    /**
     * Sets the value of the testOperationDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestOperationDescriptionType }
     *     
     */
    public void setTestOperationDescription(TestOperationDescriptionType value) {
        this.testOperationDescription = value;
    }

    /**
     * Gets the value of the testSpecificationReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSpecificationReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSpecificationReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSpecificationReport }
     * 
     * 
     */
    public List<TestSpecificationReport> getTestSpecificationReport() {
        if (testSpecificationReport == null) {
            testSpecificationReport = new ArrayList<TestSpecificationReport>();
        }
        return this.testSpecificationReport;
    }

    /**
     * Gets the value of the wafer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wafer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWafer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Wafer }
     * 
     * 
     */
    public List<Wafer> getWafer() {
        if (wafer == null) {
            wafer = new ArrayList<Wafer>();
        }
        return this.wafer;
    }

    /**
     * Gets the value of the waferSortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferSortLocationType }
     *     
     */
    public WaferSortLocationType getWaferSortLocation() {
        return waferSortLocation;
    }

    /**
     * Sets the value of the waferSortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferSortLocationType }
     *     
     */
    public void setWaferSortLocation(WaferSortLocationType value) {
        this.waferSortLocation = value;
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
