
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.SoftwareReport;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestMap;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestSetup;


/**
 * <p>Java class for OperationInformationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OperationInformationReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}CarrierReportType" minOccurs="0"/&gt;
 *         &lt;element name="Chip" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}ChipType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}ChipPeriodicity" minOccurs="0"/&gt;
 *         &lt;element name="ConsumableLotNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConsumableType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}Dimension" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InlineProcessMeasurementReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}InlineProcessMeasurementReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="InlineSetupReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}InlineSetupReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LotTimeStamp" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}LotTimeStampType"/&gt;
 *         &lt;element name="OperationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OperatorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}OrientationType" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRecipe" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}SoftwareReport" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestMap" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestSetup" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaferShortID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "OperationInformationReportType", propOrder = {
    "carrierReport",
    "chip",
    "chipPeriodicity",
    "consumableLotNumber",
    "consumableType",
    "dimension",
    "equipmentID",
    "equipmentType",
    "inlineProcessMeasurementReport",
    "inlineSetupReport",
    "lotTimeStamp",
    "operationID",
    "operatorID",
    "orientation",
    "processRecipe",
    "softwareReport",
    "testMap",
    "testSetup",
    "waferShortID"
})
public class OperationInformationReportType {

    @XmlElement(name = "CarrierReport")
    protected CarrierReportType carrierReport;
    @XmlElement(name = "Chip")
    protected ChipType chip;
    @XmlElementRef(name = "ChipPeriodicity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = ChipPeriodicity.class, required = false)
    protected ChipPeriodicity chipPeriodicity;
    @XmlElement(name = "ConsumableLotNumber")
    protected String consumableLotNumber;
    @XmlElement(name = "ConsumableType")
    protected String consumableType;
    @XmlElementRef(name = "Dimension", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = Dimension.class, required = false)
    protected Dimension dimension;
    @XmlElement(name = "EquipmentID")
    protected String equipmentID;
    @XmlElement(name = "EquipmentType")
    protected String equipmentType;
    @XmlElement(name = "InlineProcessMeasurementReport")
    protected List<InlineProcessMeasurementReportType> inlineProcessMeasurementReport;
    @XmlElement(name = "InlineSetupReport")
    protected List<InlineSetupReportType> inlineSetupReport;
    @XmlElement(name = "LotTimeStamp", required = true)
    protected LotTimeStampType lotTimeStamp;
    @XmlElement(name = "OperationID")
    protected String operationID;
    @XmlElement(name = "OperatorID")
    protected String operatorID;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "ProcessRecipe")
    protected List<String> processRecipe;
    @XmlElementRef(name = "SoftwareReport", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = SoftwareReport.class, required = false)
    protected List<SoftwareReport> softwareReport;
    @XmlElementRef(name = "TestMap", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestMap.class, required = false)
    protected List<TestMap> testMap;
    @XmlElementRef(name = "TestSetup", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestSetup.class, required = false)
    protected List<TestSetup> testSetup;
    @XmlElement(name = "WaferShortID")
    protected String waferShortID;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierReport property.
     * 
     * @return
     *     possible object is
     *     {@link CarrierReportType }
     *     
     */
    public CarrierReportType getCarrierReport() {
        return carrierReport;
    }

    /**
     * Sets the value of the carrierReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link CarrierReportType }
     *     
     */
    public void setCarrierReport(CarrierReportType value) {
        this.carrierReport = value;
    }

    /**
     * Gets the value of the chip property.
     * 
     * @return
     *     possible object is
     *     {@link ChipType }
     *     
     */
    public ChipType getChip() {
        return chip;
    }

    /**
     * Sets the value of the chip property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChipType }
     *     
     */
    public void setChip(ChipType value) {
        this.chip = value;
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
     * Gets the value of the consumableLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumableLotNumber() {
        return consumableLotNumber;
    }

    /**
     * Sets the value of the consumableLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumableLotNumber(String value) {
        this.consumableLotNumber = value;
    }

    /**
     * Gets the value of the consumableType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConsumableType() {
        return consumableType;
    }

    /**
     * Sets the value of the consumableType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsumableType(String value) {
        this.consumableType = value;
    }

    /**
     * Gets the value of the dimension property.
     * 
     * @return
     *     possible object is
     *     {@link Dimension }
     *     
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * Sets the value of the dimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dimension }
     *     
     */
    public void setDimension(Dimension value) {
        this.dimension = value;
    }

    /**
     * Gets the value of the equipmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentID() {
        return equipmentID;
    }

    /**
     * Sets the value of the equipmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentID(String value) {
        this.equipmentID = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the inlineProcessMeasurementReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineProcessMeasurementReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineProcessMeasurementReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineProcessMeasurementReportType }
     * 
     * 
     */
    public List<InlineProcessMeasurementReportType> getInlineProcessMeasurementReport() {
        if (inlineProcessMeasurementReport == null) {
            inlineProcessMeasurementReport = new ArrayList<InlineProcessMeasurementReportType>();
        }
        return this.inlineProcessMeasurementReport;
    }

    /**
     * Gets the value of the inlineSetupReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineSetupReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineSetupReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineSetupReportType }
     * 
     * 
     */
    public List<InlineSetupReportType> getInlineSetupReport() {
        if (inlineSetupReport == null) {
            inlineSetupReport = new ArrayList<InlineSetupReportType>();
        }
        return this.inlineSetupReport;
    }

    /**
     * Gets the value of the lotTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link LotTimeStampType }
     *     
     */
    public LotTimeStampType getLotTimeStamp() {
        return lotTimeStamp;
    }

    /**
     * Sets the value of the lotTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotTimeStampType }
     *     
     */
    public void setLotTimeStamp(LotTimeStampType value) {
        this.lotTimeStamp = value;
    }

    /**
     * Gets the value of the operationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperationID() {
        return operationID;
    }

    /**
     * Sets the value of the operationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationID(String value) {
        this.operationID = value;
    }

    /**
     * Gets the value of the operatorID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorID() {
        return operatorID;
    }

    /**
     * Sets the value of the operatorID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorID(String value) {
        this.operatorID = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setOrientation(OrientationType value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the processRecipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processRecipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessRecipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProcessRecipe() {
        if (processRecipe == null) {
            processRecipe = new ArrayList<String>();
        }
        return this.processRecipe;
    }

    /**
     * Gets the value of the softwareReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the softwareReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftwareReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoftwareReport }
     * 
     * 
     */
    public List<SoftwareReport> getSoftwareReport() {
        if (softwareReport == null) {
            softwareReport = new ArrayList<SoftwareReport>();
        }
        return this.softwareReport;
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
     * Gets the value of the testSetup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testSetup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestSetup().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestSetup }
     * 
     * 
     */
    public List<TestSetup> getTestSetup() {
        if (testSetup == null) {
            testSetup = new ArrayList<TestSetup>();
        }
        return this.testSetup;
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
