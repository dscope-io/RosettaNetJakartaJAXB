
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.LinearType;


/**
 * <p>Java class for SourceLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BondingPadSize" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}LinearType" minOccurs="0"/&gt;
 *         &lt;element name="DieSize" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}LinearType" minOccurs="0"/&gt;
 *         &lt;element name="IsInking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMappingFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType" minOccurs="0"/&gt;
 *         &lt;element name="MappingFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceLotNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}WaferInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}WaferLotQuantity"/&gt;
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
@XmlType(name = "SourceLotType", propOrder = {
    "bondingPadSize",
    "dieSize",
    "isInking",
    "isMappingFile",
    "lotType",
    "mappingFileName",
    "sourceLotNumber",
    "waferInformation",
    "waferLotQuantity"
})
public class SourceLotType {

    @XmlElement(name = "BondingPadSize")
    protected LinearType bondingPadSize;
    @XmlElement(name = "DieSize")
    protected LinearType dieSize;
    @XmlElement(name = "IsInking")
    protected Boolean isInking;
    @XmlElement(name = "IsMappingFile")
    protected Boolean isMappingFile;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = LotType.class, required = false)
    protected LotType lotType;
    @XmlElement(name = "MappingFileName")
    protected String mappingFileName;
    @XmlElement(name = "SourceLotNumber", required = true)
    protected String sourceLotNumber;
    @XmlElementRef(name = "WaferInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = WaferInformation.class, required = false)
    protected List<WaferInformation> waferInformation;
    @XmlElementRef(name = "WaferLotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = WaferLotQuantity.class)
    protected WaferLotQuantity waferLotQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bondingPadSize property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getBondingPadSize() {
        return bondingPadSize;
    }

    /**
     * Sets the value of the bondingPadSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setBondingPadSize(LinearType value) {
        this.bondingPadSize = value;
    }

    /**
     * Gets the value of the dieSize property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getDieSize() {
        return dieSize;
    }

    /**
     * Sets the value of the dieSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setDieSize(LinearType value) {
        this.dieSize = value;
    }

    /**
     * Gets the value of the isInking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInking() {
        return isInking;
    }

    /**
     * Sets the value of the isInking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInking(Boolean value) {
        this.isInking = value;
    }

    /**
     * Gets the value of the isMappingFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMappingFile() {
        return isMappingFile;
    }

    /**
     * Sets the value of the isMappingFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMappingFile(Boolean value) {
        this.isMappingFile = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setLotType(LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the mappingFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingFileName() {
        return mappingFileName;
    }

    /**
     * Sets the value of the mappingFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingFileName(String value) {
        this.mappingFileName = value;
    }

    /**
     * Gets the value of the sourceLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLotNumber() {
        return sourceLotNumber;
    }

    /**
     * Sets the value of the sourceLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLotNumber(String value) {
        this.sourceLotNumber = value;
    }

    /**
     * Gets the value of the waferInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waferInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaferInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaferInformation }
     * 
     * 
     */
    public List<WaferInformation> getWaferInformation() {
        if (waferInformation == null) {
            waferInformation = new ArrayList<WaferInformation>();
        }
        return this.waferInformation;
    }

    /**
     * Gets the value of the waferLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link WaferLotQuantity }
     *     
     */
    public WaferLotQuantity getWaferLotQuantity() {
        return waferLotQuantity;
    }

    /**
     * Sets the value of the waferLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferLotQuantity }
     *     
     */
    public void setWaferLotQuantity(WaferLotQuantity value) {
        this.waferLotQuantity = value;
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
