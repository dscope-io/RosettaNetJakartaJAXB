
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.FacilityLocationType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13.QuantityDetail;


/**
 * <p>Java class for IncomingWaferLotReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IncomingWaferLotReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}CarrierReportType" minOccurs="0"/&gt;
 *         &lt;element name="Chip" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.02}ChipType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="FabLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element name="OtherLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}QuantityDetail" minOccurs="0"/&gt;
 *         &lt;element name="WaferLotID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WaferSortLocation" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13}FacilityLocationType" minOccurs="0"/&gt;
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
@XmlType(name = "IncomingWaferLotReportType", propOrder = {
    "carrierReport",
    "chip",
    "fabLocation",
    "otherLocation",
    "quantityDetail",
    "waferLotID",
    "waferSortLocation"
})
public class IncomingWaferLotReportType {

    @XmlElement(name = "CarrierReport")
    protected CarrierReportType carrierReport;
    @XmlElement(name = "Chip")
    protected List<ChipType> chip;
    @XmlElement(name = "FabLocation")
    protected FacilityLocationType fabLocation;
    @XmlElement(name = "OtherLocation")
    protected FacilityLocationType otherLocation;
    @XmlElementRef(name = "QuantityDetail", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", type = QuantityDetail.class, required = false)
    protected QuantityDetail quantityDetail;
    @XmlElement(name = "WaferLotID")
    protected String waferLotID;
    @XmlElement(name = "WaferSortLocation")
    protected FacilityLocationType waferSortLocation;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChipType }
     * 
     * 
     */
    public List<ChipType> getChip() {
        if (chip == null) {
            chip = new ArrayList<ChipType>();
        }
        return this.chip;
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
     * Gets the value of the otherLocation property.
     * 
     * @return
     *     possible object is
     *     {@link FacilityLocationType }
     *     
     */
    public FacilityLocationType getOtherLocation() {
        return otherLocation;
    }

    /**
     * Sets the value of the otherLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityLocationType }
     *     
     */
    public void setOtherLocation(FacilityLocationType value) {
        this.otherLocation = value;
    }

    /**
     * Gets the value of the quantityDetail property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityDetail }
     *     
     */
    public QuantityDetail getQuantityDetail() {
        return quantityDetail;
    }

    /**
     * Sets the value of the quantityDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityDetail }
     *     
     */
    public void setQuantityDetail(QuantityDetail value) {
        this.quantityDetail = value;
    }

    /**
     * Gets the value of the waferLotID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWaferLotID() {
        return waferLotID;
    }

    /**
     * Sets the value of the waferLotID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWaferLotID(String value) {
        this.waferLotID = value;
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
