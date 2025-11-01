
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02.MeasurementType;


/**
 * <p>Java class for MeasurementFeatureReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementFeatureReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AreaType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChannelType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChipPN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieReticlePN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FeatureType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LayerDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02}MeasurementType" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}OrientationType" minOccurs="0"/&gt;
 *         &lt;element name="Pitch" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRecipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestStructureLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "MeasurementFeatureReportType", propOrder = {
    "areaType",
    "channelType",
    "chipPN",
    "dieReticlePN",
    "featureType",
    "layerDescription",
    "measurementType",
    "orientation",
    "pitch",
    "primaryIdentifier",
    "processRecipe",
    "testStructureLocation"
})
public class MeasurementFeatureReportType {

    @XmlElement(name = "AreaType")
    protected String areaType;
    @XmlElement(name = "ChannelType")
    protected String channelType;
    @XmlElement(name = "ChipPN")
    protected String chipPN;
    @XmlElement(name = "DieReticlePN")
    protected String dieReticlePN;
    @XmlElement(name = "FeatureType")
    protected String featureType;
    @XmlElement(name = "LayerDescription")
    protected String layerDescription;
    @XmlElementRef(name = "MeasurementType", namespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", type = MeasurementType.class, required = false)
    protected MeasurementType measurementType;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "Pitch")
    protected String pitch;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "ProcessRecipe")
    protected String processRecipe;
    @XmlElement(name = "TestStructureLocation")
    protected String testStructureLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the areaType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaType() {
        return areaType;
    }

    /**
     * Sets the value of the areaType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaType(String value) {
        this.areaType = value;
    }

    /**
     * Gets the value of the channelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * Sets the value of the channelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelType(String value) {
        this.channelType = value;
    }

    /**
     * Gets the value of the chipPN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPN() {
        return chipPN;
    }

    /**
     * Sets the value of the chipPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPN(String value) {
        this.chipPN = value;
    }

    /**
     * Gets the value of the dieReticlePN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDieReticlePN() {
        return dieReticlePN;
    }

    /**
     * Sets the value of the dieReticlePN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDieReticlePN(String value) {
        this.dieReticlePN = value;
    }

    /**
     * Gets the value of the featureType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeatureType() {
        return featureType;
    }

    /**
     * Sets the value of the featureType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeatureType(String value) {
        this.featureType = value;
    }

    /**
     * Gets the value of the layerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayerDescription() {
        return layerDescription;
    }

    /**
     * Sets the value of the layerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayerDescription(String value) {
        this.layerDescription = value;
    }

    /**
     * Gets the value of the measurementType property.
     * 
     * @return
     *     possible object is
     *     {@link MeasurementType }
     *     
     */
    public MeasurementType getMeasurementType() {
        return measurementType;
    }

    /**
     * Sets the value of the measurementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasurementType }
     *     
     */
    public void setMeasurementType(MeasurementType value) {
        this.measurementType = value;
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
     * Gets the value of the pitch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPitch() {
        return pitch;
    }

    /**
     * Sets the value of the pitch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPitch(String value) {
        this.pitch = value;
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
     * Gets the value of the processRecipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessRecipe() {
        return processRecipe;
    }

    /**
     * Sets the value of the processRecipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessRecipe(String value) {
        this.processRecipe = value;
    }

    /**
     * Gets the value of the testStructureLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestStructureLocation() {
        return testStructureLocation;
    }

    /**
     * Sets the value of the testStructureLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestStructureLocation(String value) {
        this.testStructureLocation = value;
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
