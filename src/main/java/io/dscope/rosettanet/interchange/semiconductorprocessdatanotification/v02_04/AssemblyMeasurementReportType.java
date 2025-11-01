
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_04.TestResult;


/**
 * <p>Java class for AssemblyMeasurementReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyMeasurementReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FailureMode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Measurement" type="{http://www.w3.org/2001/XMLSchema}float" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PinInformation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}PinInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TesterAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.04}TestResult" minOccurs="0"/&gt;
 *         &lt;element name="TestType" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "AssemblyMeasurementReportType", propOrder = {
    "failureMode",
    "measurement",
    "pinInformation",
    "primaryIdentifier",
    "testerAlarm",
    "testResult",
    "testType"
})
public class AssemblyMeasurementReportType {

    @XmlElement(name = "FailureMode")
    protected String failureMode;
    @XmlElement(name = "Measurement", type = Float.class)
    protected List<Float> measurement;
    @XmlElement(name = "PinInformation")
    protected List<PinInformationType> pinInformation;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "TesterAlarm")
    protected Boolean testerAlarm;
    @XmlElementRef(name = "TestResult", namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.04", type = TestResult.class, required = false)
    protected TestResult testResult;
    @XmlElement(name = "TestType")
    protected List<String> testType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the failureMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFailureMode() {
        return failureMode;
    }

    /**
     * Sets the value of the failureMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFailureMode(String value) {
        this.failureMode = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Float }
     * 
     * 
     */
    public List<Float> getMeasurement() {
        if (measurement == null) {
            measurement = new ArrayList<Float>();
        }
        return this.measurement;
    }

    /**
     * Gets the value of the pinInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pinInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPinInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PinInformationType }
     * 
     * 
     */
    public List<PinInformationType> getPinInformation() {
        if (pinInformation == null) {
            pinInformation = new ArrayList<PinInformationType>();
        }
        return this.pinInformation;
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
     * Gets the value of the testerAlarm property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTesterAlarm() {
        return testerAlarm;
    }

    /**
     * Sets the value of the testerAlarm property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTesterAlarm(Boolean value) {
        this.testerAlarm = value;
    }

    /**
     * Gets the value of the testResult property.
     * 
     * @return
     *     possible object is
     *     {@link TestResult }
     *     
     */
    public TestResult getTestResult() {
        return testResult;
    }

    /**
     * Sets the value of the testResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestResult }
     *     
     */
    public void setTestResult(TestResult value) {
        this.testResult = value;
    }

    /**
     * Gets the value of the testType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestType() {
        if (testType == null) {
            testType = new ArrayList<String>();
        }
        return this.testType;
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
