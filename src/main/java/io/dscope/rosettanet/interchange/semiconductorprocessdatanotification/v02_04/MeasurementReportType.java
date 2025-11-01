
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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.ChipPeriodicity;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.Dimension;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.FloatCoordinate;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.IntCoordinate;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.MeasurementUnit;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestMap;
import io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02.MeasurementType;


/**
 * <p>Java class for MeasurementReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CensorFailCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}ChipPeriodicity" minOccurs="0"/&gt;
 *         &lt;element name="ChipX" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChipY" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CpK" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}Dimension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExecutionCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="FailCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}FloatCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}IntCoordinate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaxMeasurement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Mean" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Measurement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MeasurementFeatureReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}MeasurementFeatureReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02}MeasurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}MeasurementUnit" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MinMeasurement" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Parameter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Range" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SampleCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="StdDev" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="SumOfSquares" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestParameterInformation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}TestParameterInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementReportType", propOrder = {
    "censorFailCount",
    "chipPeriodicity",
    "chipX",
    "chipY",
    "cpK",
    "dimension",
    "executionCount",
    "failCount",
    "floatCoordinate",
    "intCoordinate",
    "maxMeasurement",
    "mean",
    "measurement",
    "measurementFeatureReport",
    "measurementType",
    "measurementUnit",
    "minMeasurement",
    "parameter",
    "primaryIdentifier",
    "range",
    "sampleCount",
    "stdDev",
    "sum",
    "sumOfSquares",
    "testMap",
    "testParameterInformation"
})
public class MeasurementReportType {

    @XmlElement(name = "CensorFailCount")
    protected BigInteger censorFailCount;
    @XmlElementRef(name = "ChipPeriodicity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = ChipPeriodicity.class, required = false)
    protected ChipPeriodicity chipPeriodicity;
    @XmlElement(name = "ChipX")
    protected BigInteger chipX;
    @XmlElement(name = "ChipY")
    protected BigInteger chipY;
    @XmlElement(name = "CpK")
    protected Float cpK;
    @XmlElementRef(name = "Dimension", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = Dimension.class, required = false)
    protected List<Dimension> dimension;
    @XmlElement(name = "ExecutionCount")
    protected BigInteger executionCount;
    @XmlElement(name = "FailCount")
    protected BigInteger failCount;
    @XmlElementRef(name = "FloatCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = FloatCoordinate.class, required = false)
    protected List<FloatCoordinate> floatCoordinate;
    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = IntCoordinate.class, required = false)
    protected List<IntCoordinate> intCoordinate;
    @XmlElement(name = "MaxMeasurement")
    protected Float maxMeasurement;
    @XmlElement(name = "Mean")
    protected Float mean;
    @XmlElement(name = "Measurement")
    protected Float measurement;
    @XmlElement(name = "MeasurementFeatureReport")
    protected List<MeasurementFeatureReportType> measurementFeatureReport;
    @XmlElementRef(name = "MeasurementType", namespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", type = MeasurementType.class, required = false)
    protected List<MeasurementType> measurementType;
    @XmlElementRef(name = "MeasurementUnit", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = MeasurementUnit.class, required = false)
    protected List<MeasurementUnit> measurementUnit;
    @XmlElement(name = "MinMeasurement")
    protected Float minMeasurement;
    @XmlElement(name = "Parameter")
    protected String parameter;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "Range")
    protected Float range;
    @XmlElement(name = "SampleCount")
    protected BigInteger sampleCount;
    @XmlElement(name = "StdDev")
    protected Float stdDev;
    @XmlElement(name = "Sum")
    protected Float sum;
    @XmlElement(name = "SumOfSquares")
    protected Float sumOfSquares;
    @XmlElementRef(name = "TestMap", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestMap.class, required = false)
    protected List<TestMap> testMap;
    @XmlElement(name = "TestParameterInformation")
    protected List<TestParameterInformationType> testParameterInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the censorFailCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCensorFailCount() {
        return censorFailCount;
    }

    /**
     * Sets the value of the censorFailCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCensorFailCount(BigInteger value) {
        this.censorFailCount = value;
    }

    /**
     * Gets the value of the chipPeriodicity property.
     * 
     * @return
     *     possible object is
     *     {@link ChipPeriodicity }
     *     
     */
    public ChipPeriodicity getChipPeriodicity() {
        return chipPeriodicity;
    }

    /**
     * Sets the value of the chipPeriodicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipPeriodicity }
     *     
     */
    public void setChipPeriodicity(ChipPeriodicity value) {
        this.chipPeriodicity = value;
    }

    /**
     * Gets the value of the chipX property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChipX() {
        return chipX;
    }

    /**
     * Sets the value of the chipX property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChipX(BigInteger value) {
        this.chipX = value;
    }

    /**
     * Gets the value of the chipY property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChipY() {
        return chipY;
    }

    /**
     * Sets the value of the chipY property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChipY(BigInteger value) {
        this.chipY = value;
    }

    /**
     * Gets the value of the cpK property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCpK() {
        return cpK;
    }

    /**
     * Sets the value of the cpK property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCpK(Float value) {
        this.cpK = value;
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
     * Gets the value of the executionCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExecutionCount() {
        return executionCount;
    }

    /**
     * Sets the value of the executionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExecutionCount(BigInteger value) {
        this.executionCount = value;
    }

    /**
     * Gets the value of the failCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFailCount() {
        return failCount;
    }

    /**
     * Sets the value of the failCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFailCount(BigInteger value) {
        this.failCount = value;
    }

    /**
     * Gets the value of the floatCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the floatCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFloatCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FloatCoordinate }
     * 
     * 
     */
    public List<FloatCoordinate> getFloatCoordinate() {
        if (floatCoordinate == null) {
            floatCoordinate = new ArrayList<FloatCoordinate>();
        }
        return this.floatCoordinate;
    }

    /**
     * Gets the value of the intCoordinate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the intCoordinate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIntCoordinate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IntCoordinate }
     * 
     * 
     */
    public List<IntCoordinate> getIntCoordinate() {
        if (intCoordinate == null) {
            intCoordinate = new ArrayList<IntCoordinate>();
        }
        return this.intCoordinate;
    }

    /**
     * Gets the value of the maxMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaxMeasurement() {
        return maxMeasurement;
    }

    /**
     * Sets the value of the maxMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaxMeasurement(Float value) {
        this.maxMeasurement = value;
    }

    /**
     * Gets the value of the mean property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMean() {
        return mean;
    }

    /**
     * Sets the value of the mean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMean(Float value) {
        this.mean = value;
    }

    /**
     * Gets the value of the measurement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMeasurement() {
        return measurement;
    }

    /**
     * Sets the value of the measurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMeasurement(Float value) {
        this.measurement = value;
    }

    /**
     * Gets the value of the measurementFeatureReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementFeatureReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementFeatureReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementFeatureReportType }
     * 
     * 
     */
    public List<MeasurementFeatureReportType> getMeasurementFeatureReport() {
        if (measurementFeatureReport == null) {
            measurementFeatureReport = new ArrayList<MeasurementFeatureReportType>();
        }
        return this.measurementFeatureReport;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementType }
     * 
     * 
     */
    public List<MeasurementType> getMeasurementType() {
        if (measurementType == null) {
            measurementType = new ArrayList<MeasurementType>();
        }
        return this.measurementType;
    }

    /**
     * Gets the value of the measurementUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasurementUnit }
     * 
     * 
     */
    public List<MeasurementUnit> getMeasurementUnit() {
        if (measurementUnit == null) {
            measurementUnit = new ArrayList<MeasurementUnit>();
        }
        return this.measurementUnit;
    }

    /**
     * Gets the value of the minMeasurement property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinMeasurement() {
        return minMeasurement;
    }

    /**
     * Sets the value of the minMeasurement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinMeasurement(Float value) {
        this.minMeasurement = value;
    }

    /**
     * Gets the value of the parameter property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParameter() {
        return parameter;
    }

    /**
     * Sets the value of the parameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParameter(String value) {
        this.parameter = value;
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
     * Gets the value of the range property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getRange() {
        return range;
    }

    /**
     * Sets the value of the range property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setRange(Float value) {
        this.range = value;
    }

    /**
     * Gets the value of the sampleCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSampleCount() {
        return sampleCount;
    }

    /**
     * Sets the value of the sampleCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSampleCount(BigInteger value) {
        this.sampleCount = value;
    }

    /**
     * Gets the value of the stdDev property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getStdDev() {
        return stdDev;
    }

    /**
     * Sets the value of the stdDev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setStdDev(Float value) {
        this.stdDev = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSum(Float value) {
        this.sum = value;
    }

    /**
     * Gets the value of the sumOfSquares property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSumOfSquares() {
        return sumOfSquares;
    }

    /**
     * Sets the value of the sumOfSquares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSumOfSquares(Float value) {
        this.sumOfSquares = value;
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
     * Gets the value of the testParameterInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testParameterInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestParameterInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestParameterInformationType }
     * 
     * 
     */
    public List<TestParameterInformationType> getTestParameterInformation() {
        if (testParameterInformation == null) {
            testParameterInformation = new ArrayList<TestParameterInformationType>();
        }
        return this.testParameterInformation;
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
