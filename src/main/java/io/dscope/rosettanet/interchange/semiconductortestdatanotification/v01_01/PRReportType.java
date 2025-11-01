
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_02.TestResult;


/**
 * <p>Java class for PRReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PRReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Measurement" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TesterAlarm" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.02}TestResult" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "PRReportType", propOrder = {
    "measurement",
    "primaryIdentifier",
    "testerAlarm",
    "testResult",
    "userSite"
})
public class PRReportType {

    @XmlElement(name = "Measurement")
    protected float measurement;
    @XmlElement(name = "PrimaryIdentifier", required = true)
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "TesterAlarm")
    protected Boolean testerAlarm;
    @XmlElementRef(name = "TestResult", namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.02", type = TestResult.class, required = false)
    protected TestResult testResult;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the measurement property.
     * 
     */
    public float getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     */
    public void setMeasurement(float value) {
        this.measurement = value;
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
     * Gets the value of the userSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserSite() {
        return userSite;
    }

    /**
     * Sets the value of the userSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserSite(BigInteger value) {
        this.userSite = value;
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
