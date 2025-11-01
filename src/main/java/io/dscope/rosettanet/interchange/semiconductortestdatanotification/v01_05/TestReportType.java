
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14.ECIDReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_14.TestMap;


/**
 * <p>Java class for TestReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CalcFailReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}CalcFailReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DieReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}DieReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}ECIDReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FPReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}FPReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FunctionalPinReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}FunctionalPinReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PPReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}PPReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PRReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}PRReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14}TestMap" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestReportType", propOrder = {
    "calcFailReport",
    "dieReport",
    "ecidReport",
    "fpReport",
    "functionalPinReport",
    "ppReport",
    "prReport",
    "testMap"
})
public class TestReportType {

    @XmlElement(name = "CalcFailReport")
    protected List<CalcFailReportType> calcFailReport;
    @XmlElement(name = "DieReport")
    protected List<DieReportType> dieReport;
    @XmlElementRef(name = "ECIDReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = ECIDReport.class, required = false)
    protected List<ECIDReport> ecidReport;
    @XmlElement(name = "FPReport")
    protected List<FPReportType> fpReport;
    @XmlElement(name = "FunctionalPinReport")
    protected List<FunctionalPinReportType> functionalPinReport;
    @XmlElement(name = "PPReport")
    protected List<PPReportType> ppReport;
    @XmlElement(name = "PRReport")
    protected List<PRReportType> prReport;
    @XmlElementRef(name = "TestMap", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.14", type = TestMap.class, required = false)
    protected List<TestMap> testMap;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the calcFailReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the calcFailReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCalcFailReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CalcFailReportType }
     * 
     * 
     */
    public List<CalcFailReportType> getCalcFailReport() {
        if (calcFailReport == null) {
            calcFailReport = new ArrayList<CalcFailReportType>();
        }
        return this.calcFailReport;
    }

    /**
     * Gets the value of the dieReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dieReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDieReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DieReportType }
     * 
     * 
     */
    public List<DieReportType> getDieReport() {
        if (dieReport == null) {
            dieReport = new ArrayList<DieReportType>();
        }
        return this.dieReport;
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
     * Gets the value of the fpReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fpReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFPReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FPReportType }
     * 
     * 
     */
    public List<FPReportType> getFPReport() {
        if (fpReport == null) {
            fpReport = new ArrayList<FPReportType>();
        }
        return this.fpReport;
    }

    /**
     * Gets the value of the functionalPinReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the functionalPinReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFunctionalPinReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FunctionalPinReportType }
     * 
     * 
     */
    public List<FunctionalPinReportType> getFunctionalPinReport() {
        if (functionalPinReport == null) {
            functionalPinReport = new ArrayList<FunctionalPinReportType>();
        }
        return this.functionalPinReport;
    }

    /**
     * Gets the value of the ppReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ppReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPPReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PPReportType }
     * 
     * 
     */
    public List<PPReportType> getPPReport() {
        if (ppReport == null) {
            ppReport = new ArrayList<PPReportType>();
        }
        return this.ppReport;
    }

    /**
     * Gets the value of the prReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPRReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PRReportType }
     * 
     * 
     */
    public List<PRReportType> getPRReport() {
        if (prReport == null) {
            prReport = new ArrayList<PRReportType>();
        }
        return this.prReport;
    }

    /**
     * Gets the value of the testMap property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testMap property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestMap().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestMap }
     * 
     * 
     */
    public List<TestMap> getTestMap() {
        if (testMap == null) {
            testMap = new ArrayList<TestMap>();
        }
        return this.testMap;
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
