
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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.Lot;


/**
 * <p>Java class for CarrierReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CarrierReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierSlot" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}CarrierSlotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CarrierType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}Lot"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}OrientationType" minOccurs="0"/&gt;
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
@XmlType(name = "CarrierReportType", propOrder = {
    "carrierID",
    "carrierSlot",
    "carrierType",
    "lot",
    "orientation"
})
public class CarrierReportType {

    @XmlElement(name = "CarrierID")
    protected List<String> carrierID;
    @XmlElement(name = "CarrierSlot")
    protected List<CarrierSlotType> carrierSlot;
    @XmlElement(name = "CarrierType")
    protected String carrierType;
    @XmlElementRef(name = "Lot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = Lot.class)
    protected Lot lot;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarrierID() {
        if (carrierID == null) {
            carrierID = new ArrayList<String>();
        }
        return this.carrierID;
    }

    /**
     * Gets the value of the carrierSlot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierSlot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierSlot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CarrierSlotType }
     * 
     * 
     */
    public List<CarrierSlotType> getCarrierSlot() {
        if (carrierSlot == null) {
            carrierSlot = new ArrayList<CarrierSlotType>();
        }
        return this.carrierSlot;
    }

    /**
     * Gets the value of the carrierType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarrierType() {
        return carrierType;
    }

    /**
     * Sets the value of the carrierType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarrierType(String value) {
        this.carrierType = value;
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
