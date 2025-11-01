
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.BALocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.FabLocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.FinalTestLocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.OtherLocationType;
import io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03.WaferSortLocationType;
import io.dscope.rosettanet.universal.locations.v01_02.Location;
import io.dscope.rosettanet.universal.locations.v01_02.PhysicalAddress;


/**
 * <p>Java class for FacilityLocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FacilityLocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GlobalWorkInProcessLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}Location" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}PhysicalAddress" minOccurs="0"/&gt;
 *         &lt;element name="ProprietaryLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "FacilityLocationType", propOrder = {
    "globalWorkInProcessLocationCode",
    "location",
    "physicalAddress",
    "proprietaryLabel"
})
@XmlSeeAlso({
    BALocationType.class,
    FabLocationType.class,
    FinalTestLocationType.class,
    OtherLocationType.class,
    WaferSortLocationType.class
})
public class FacilityLocationType {

    @XmlElement(name = "GlobalWorkInProcessLocationCode")
    protected String globalWorkInProcessLocationCode;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = Location.class, required = false)
    protected Location location;
    @XmlElementRef(name = "PhysicalAddress", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = PhysicalAddress.class, required = false)
    protected PhysicalAddress physicalAddress;
    @XmlElement(name = "ProprietaryLabel")
    protected String proprietaryLabel;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the globalWorkInProcessLocationCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalWorkInProcessLocationCode() {
        return globalWorkInProcessLocationCode;
    }

    /**
     * Sets the value of the globalWorkInProcessLocationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalWorkInProcessLocationCode(String value) {
        this.globalWorkInProcessLocationCode = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
    }

    /**
     * Gets the value of the proprietaryLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryLabel() {
        return proprietaryLabel;
    }

    /**
     * Sets the value of the proprietaryLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryLabel(String value) {
        this.proprietaryLabel = value;
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
