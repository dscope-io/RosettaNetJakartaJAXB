
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_04.TestResult;


/**
 * <p>Java class for FPReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BufferNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ComponentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FailLimExceeded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.04}TestResult" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="UsingPatternCnts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="VectorReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:02.02}VectorReportType" minOccurs="0"/&gt;
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
@XmlType(name = "FPReportType", propOrder = {
    "bufferNumber",
    "componentNumber",
    "failLimExceeded",
    "primaryIdentifier",
    "testResult",
    "userSite",
    "usingPatternCnts",
    "vectorReport"
})
public class FPReportType {

    @XmlElement(name = "BufferNumber")
    protected BigInteger bufferNumber;
    @XmlElement(name = "ComponentNumber")
    protected BigInteger componentNumber;
    @XmlElement(name = "FailLimExceeded")
    protected Boolean failLimExceeded;
    @XmlElement(name = "PrimaryIdentifier", required = true)
    protected BigInteger primaryIdentifier;
    @XmlElementRef(name = "TestResult", namespace = "urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:01.04", type = TestResult.class, required = false)
    protected TestResult testResult;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlElement(name = "UsingPatternCnts")
    protected Boolean usingPatternCnts;
    @XmlElement(name = "VectorReport")
    protected VectorReportType vectorReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bufferNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBufferNumber() {
        return bufferNumber;
    }

    /**
     * Sets the value of the bufferNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBufferNumber(BigInteger value) {
        this.bufferNumber = value;
    }

    /**
     * Gets the value of the componentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentNumber(BigInteger value) {
        this.componentNumber = value;
    }

    /**
     * Gets the value of the failLimExceeded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailLimExceeded() {
        return failLimExceeded;
    }

    /**
     * Sets the value of the failLimExceeded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailLimExceeded(Boolean value) {
        this.failLimExceeded = value;
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
     * Gets the value of the usingPatternCnts property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsingPatternCnts() {
        return usingPatternCnts;
    }

    /**
     * Sets the value of the usingPatternCnts property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsingPatternCnts(Boolean value) {
        this.usingPatternCnts = value;
    }

    /**
     * Gets the value of the vectorReport property.
     * 
     * @return
     *     possible object is
     *     {@link VectorReportType }
     *     
     */
    public VectorReportType getVectorReport() {
        return vectorReport;
    }

    /**
     * Sets the value of the vectorReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link VectorReportType }
     *     
     */
    public void setVectorReport(VectorReportType value) {
        this.vectorReport = value;
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
