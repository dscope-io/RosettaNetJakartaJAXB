
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.confidentiality.v01_03.Confidentiality;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.FacilityLocationType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.Lot;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.Wafer;


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
 *         &lt;element name="BALocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.03}Confidentiality" minOccurs="0"/&gt;
 *         &lt;element name="FabLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element name="FileDataVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="GlobalLotStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}Lot"/&gt;
 *         &lt;element name="LotTimeStamp" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}LotTimeStampType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="QualityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}Wafer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WaferQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="WaferSortLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AssemblyProcess" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}AssemblyProcessType" maxOccurs="unbounded"/&gt;
 *           &lt;element name="InlineProcess" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}InlineProcessType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "LotReportType", propOrder = {
    "baLocation",
    "confidentiality",
    "fabLocation",
    "fileDataVersion",
    "globalLotStatusCode",
    "lot",
    "lotTimeStamp",
    "otherLocation",
    "qualityCode",
    "wafer",
    "waferQuantity",
    "waferSortLocation",
    "assemblyProcess",
    "inlineProcess"
})
public class LotReportType {

    @XmlElement(name = "BALocation")
    protected FacilityLocationType baLocation;
    @XmlElementRef(name = "Confidentiality", namespace = "urn:rosettanet:specification:domain:Manufacturing:Confidentiality:xsd:codelist:01.03", type = Confidentiality.class, required = false)
    protected Confidentiality confidentiality;
    @XmlElement(name = "FabLocation")
    protected FacilityLocationType fabLocation;
    @XmlElement(name = "FileDataVersion")
    protected String fileDataVersion;
    @XmlElement(name = "GlobalLotStatusCode")
    protected String globalLotStatusCode;
    @XmlElementRef(name = "Lot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = Lot.class)
    protected Lot lot;
    @XmlElement(name = "LotTimeStamp")
    protected LotTimeStampType lotTimeStamp;
    @XmlElement(name = "OtherLocation")
    protected List<FacilityLocationType> otherLocation;
    @XmlElement(name = "QualityCode")
    protected String qualityCode;
    @XmlElementRef(name = "Wafer", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = Wafer.class, required = false)
    protected List<Wafer> wafer;
    @XmlElement(name = "WaferQuantity")
    protected BigInteger waferQuantity;
    @XmlElement(name = "WaferSortLocation")
    protected FacilityLocationType waferSortLocation;
    @XmlElement(name = "AssemblyProcess")
    protected List<AssemblyProcessType> assemblyProcess;
    @XmlElement(name = "InlineProcess")
    protected List<InlineProcessType> inlineProcess;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the baLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getBALocation() {
        return baLocation;
    }

    /**
     * Sets the value of the baLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setBALocation(FacilityLocationType value) {
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
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getFabLocation() {
        return fabLocation;
    }

    /**
     * Sets the value of the fabLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setFabLocation(FacilityLocationType value) {
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
     * {@link FacilityLocationType }
     * 
     * 
     */
    public List<FacilityLocationType> getOtherLocation() {
        if (otherLocation == null) {
            otherLocation = new ArrayList<FacilityLocationType>();
        }
        return this.otherLocation;
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
     * Gets the value of the waferQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaferQuantity() {
        return waferQuantity;
    }

    /**
     * Sets the value of the waferQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaferQuantity(BigInteger value) {
        this.waferQuantity = value;
    }

    /**
     * Gets the value of the waferSortLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getWaferSortLocation() {
        return waferSortLocation;
    }

    /**
     * Sets the value of the waferSortLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setWaferSortLocation(FacilityLocationType value) {
        this.waferSortLocation = value;
    }

    /**
     * Gets the value of the assemblyProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyProcessType }
     * 
     * 
     */
    public List<AssemblyProcessType> getAssemblyProcess() {
        if (assemblyProcess == null) {
            assemblyProcess = new ArrayList<AssemblyProcessType>();
        }
        return this.assemblyProcess;
    }

    /**
     * Gets the value of the inlineProcess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inlineProcess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInlineProcess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InlineProcessType }
     * 
     * 
     */
    public List<InlineProcessType> getInlineProcess() {
        if (inlineProcess == null) {
            inlineProcess = new ArrayList<InlineProcessType>();
        }
        return this.inlineProcess;
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
