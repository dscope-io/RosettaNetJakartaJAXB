
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.manufacturing.codelist.coordinateflag.v01_02.CoordinateFlag;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12.Dimension;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12.TestSetup;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12.Tester;


/**
 * <p>Java class for SetupReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SetupReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPeriodicity" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}ChipPeriodicityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:CoordinateFlag:xsd:codelist:01.02}CoordinateFlag" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12}Dimension" maxOccurs="unbounded"/&gt;
 *         &lt;element name="HeadID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ParallelTest" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProbeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Quadrant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SampleRate" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.02}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12}Tester"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12}TestSetup"/&gt;
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
@XmlType(name = "SetupReportType", propOrder = {
    "chipPeriodicity",
    "coordinateFlag",
    "dimension",
    "headID",
    "notch",
    "parallelTest",
    "probeName",
    "quadrant",
    "sampleRate",
    "tester",
    "testSetup"
})
public class SetupReportType {

    @XmlElement(name = "ChipPeriodicity")
    protected ChipPeriodicityType chipPeriodicity;
    @XmlElementRef(name = "CoordinateFlag", namespace = "urn:rosettanet:specification:domain:Manufacturing:CoordinateFlag:xsd:codelist:01.02", type = CoordinateFlag.class, required = false)
    protected CoordinateFlag coordinateFlag;
    @XmlElementRef(name = "Dimension", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", type = Dimension.class)
    protected List<Dimension> dimension;
    @XmlElement(name = "HeadID")
    protected String headID;
    @XmlElement(name = "Notch")
    protected String notch;
    @XmlElement(name = "ParallelTest")
    protected BigInteger parallelTest;
    @XmlElement(name = "ProbeName")
    protected String probeName;
    @XmlElement(name = "Quadrant")
    protected String quadrant;
    @XmlElement(name = "SampleRate")
    protected BigDecimal sampleRate;
    @XmlElementRef(name = "Tester", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", type = Tester.class)
    protected Tester tester;
    @XmlElementRef(name = "TestSetup", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", type = TestSetup.class)
    protected TestSetup testSetup;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the chipPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link ChipPeriodicityType }
     *     
     */
    public ChipPeriodicityType getChipPeriodicity() {
        return chipPeriodicity;
    }

    /**
     * Sets the value of the chipPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipPeriodicityType }
     *     
     */
    public void setChipPeriodicity(ChipPeriodicityType value) {
        this.chipPeriodicity = value;
    }

    /**
     * Gets the value of the coordinateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link CoordinateFlag }
     *     
     */
    public CoordinateFlag getCoordinateFlag() {
        return coordinateFlag;
    }

    /**
     * Sets the value of the coordinateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoordinateFlag }
     *     
     */
    public void setCoordinateFlag(CoordinateFlag value) {
        this.coordinateFlag = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dimension property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDimension().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Dimension }
     * 
     * 
     */
    public List<Dimension> getDimension() {
        if (dimension == null) {
            dimension = new ArrayList<Dimension>();
        }
        return this.dimension;
    }

    /**
     * Gets the value of the headID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeadID() {
        return headID;
    }

    /**
     * Sets the value of the headID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeadID(String value) {
        this.headID = value;
    }

    /**
     * Gets the value of the notch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotch() {
        return notch;
    }

    /**
     * Sets the value of the notch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotch(String value) {
        this.notch = value;
    }

    /**
     * Gets the value of the parallelTest property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getParallelTest() {
        return parallelTest;
    }

    /**
     * Sets the value of the parallelTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setParallelTest(BigInteger value) {
        this.parallelTest = value;
    }

    /**
     * Gets the value of the probeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProbeName() {
        return probeName;
    }

    /**
     * Sets the value of the probeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProbeName(String value) {
        this.probeName = value;
    }

    /**
     * Gets the value of the quadrant property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuadrant() {
        return quadrant;
    }

    /**
     * Sets the value of the quadrant property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuadrant(String value) {
        this.quadrant = value;
    }

    /**
     * Gets the value of the sampleRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSampleRate() {
        return sampleRate;
    }

    /**
     * Sets the value of the sampleRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSampleRate(BigDecimal value) {
        this.sampleRate = value;
    }

    /**
     * Gets the value of the tester property.
     * 
     * @return
     *     possible object is
     *     {@link Tester }
     *     
     */
    public Tester getTester() {
        return tester;
    }

    /**
     * Sets the value of the tester property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tester }
     *     
     */
    public void setTester(Tester value) {
        this.tester = value;
    }

    /**
     * Gets the value of the testSetup property.
     * 
     * @return
     *     possible object is
     *     {@link TestSetup }
     *     
     */
    public TestSetup getTestSetup() {
        return testSetup;
    }

    /**
     * Sets the value of the testSetup property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestSetup }
     *     
     */
    public void setTestSetup(TestSetup value) {
        this.testSetup = value;
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
