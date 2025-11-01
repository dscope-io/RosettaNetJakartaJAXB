
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

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


/**
 * <p>Java class for TestSetupType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSetupType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerTestProgramEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerTestProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="SetupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SetupVersion" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TesterControlSoftware" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TesterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestProgEC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestProgramName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}TestTemperature" minOccurs="0"/&gt;
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
@XmlType(name = "TestSetupType", propOrder = {
    "customerTestProgramEC",
    "customerTestProgramName",
    "primaryIdentifier",
    "setupName",
    "setupVersion",
    "testerControlSoftware",
    "testerType",
    "testProgEC",
    "testProgramName",
    "testTemperature"
})
public class TestSetupType {

    @XmlElement(name = "CustomerTestProgramEC")
    protected String customerTestProgramEC;
    @XmlElement(name = "CustomerTestProgramName")
    protected String customerTestProgramName;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "SetupName")
    protected String setupName;
    @XmlElement(name = "SetupVersion")
    protected Float setupVersion;
    @XmlElement(name = "TesterControlSoftware")
    protected String testerControlSoftware;
    @XmlElement(name = "TesterType")
    protected String testerType;
    @XmlElement(name = "TestProgEC")
    protected String testProgEC;
    @XmlElement(name = "TestProgramName", required = true)
    protected String testProgramName;
    @XmlElementRef(name = "TestTemperature", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26", type = TestTemperature.class, required = false)
    protected TestTemperature testTemperature;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerTestProgramEC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTestProgramEC() {
        return customerTestProgramEC;
    }

    /**
     * Sets the value of the customerTestProgramEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTestProgramEC(String value) {
        this.customerTestProgramEC = value;
    }

    /**
     * Gets the value of the customerTestProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerTestProgramName() {
        return customerTestProgramName;
    }

    /**
     * Sets the value of the customerTestProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerTestProgramName(String value) {
        this.customerTestProgramName = value;
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
     * Gets the value of the setupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSetupName() {
        return setupName;
    }

    /**
     * Sets the value of the setupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSetupName(String value) {
        this.setupName = value;
    }

    /**
     * Gets the value of the setupVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSetupVersion() {
        return setupVersion;
    }

    /**
     * Sets the value of the setupVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSetupVersion(Float value) {
        this.setupVersion = value;
    }

    /**
     * Gets the value of the testerControlSoftware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesterControlSoftware() {
        return testerControlSoftware;
    }

    /**
     * Sets the value of the testerControlSoftware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesterControlSoftware(String value) {
        this.testerControlSoftware = value;
    }

    /**
     * Gets the value of the testerType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTesterType() {
        return testerType;
    }

    /**
     * Sets the value of the testerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTesterType(String value) {
        this.testerType = value;
    }

    /**
     * Gets the value of the testProgEC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestProgEC() {
        return testProgEC;
    }

    /**
     * Sets the value of the testProgEC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestProgEC(String value) {
        this.testProgEC = value;
    }

    /**
     * Gets the value of the testProgramName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestProgramName() {
        return testProgramName;
    }

    /**
     * Sets the value of the testProgramName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestProgramName(String value) {
        this.testProgramName = value;
    }

    /**
     * Gets the value of the testTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TestTemperature }
     *     
     */
    public TestTemperature getTestTemperature() {
        return testTemperature;
    }

    /**
     * Sets the value of the testTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestTemperature }
     *     
     */
    public void setTestTemperature(TestTemperature value) {
        this.testTemperature = value;
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
