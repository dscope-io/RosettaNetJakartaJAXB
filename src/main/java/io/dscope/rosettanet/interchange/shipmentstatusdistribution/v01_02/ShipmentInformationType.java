
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ShipmentChangeReason;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ShipmentServiceLevel;
import io.dscope.rosettanet.universal.dates.v01_01.DateTimePeriodType;
import io.dscope.rosettanet.universal.partneridentification.v01_03.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.physicaldimension.v01_01.WeightType;


/**
 * <p>Java class for ShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PickupPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ShipmentChangeReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ShipmentServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TotalContainer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="TotalWeight" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}WeightType"/&gt;
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
@XmlType(name = "ShipmentInformationType", propOrder = {
    "dateTime",
    "description",
    "identifier",
    "pickupPeriod",
    "routingInformation",
    "shipFrom",
    "shipmentChangeReason",
    "shipmentServiceLevel",
    "shipTo",
    "totalContainer",
    "totalWeight"
})
public class ShipmentInformationType {

    @XmlElement(name = "DateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "PickupPeriod")
    protected DateTimePeriodType pickupPeriod;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElementRef(name = "ShipmentChangeReason", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = ShipmentChangeReason.class, required = false)
    protected ShipmentChangeReason shipmentChangeReason;
    @XmlElementRef(name = "ShipmentServiceLevel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = ShipmentServiceLevel.class, required = false)
    protected ShipmentServiceLevel shipmentServiceLevel;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElement(name = "TotalContainer")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalContainer;
    @XmlElement(name = "TotalWeight", required = true)
    protected WeightType totalWeight;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the pickupPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getPickupPeriod() {
        return pickupPeriod;
    }

    /**
     * Sets the value of the pickupPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setPickupPeriod(DateTimePeriodType value) {
        this.pickupPeriod = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInformationType }
     * 
     * 
     */
    public List<RoutingInformationType> getRoutingInformation() {
        if (routingInformation == null) {
            routingInformation = new ArrayList<RoutingInformationType>();
        }
        return this.routingInformation;
    }

    /**
     * Gets the value of the shipFrom property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipFrom() {
        return shipFrom;
    }

    /**
     * Sets the value of the shipFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipFrom(SpecifiedPartnerDescriptionType value) {
        this.shipFrom = value;
    }

    /**
     * Gets the value of the shipmentChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChangeReason }
     *     
     */
    public ShipmentChangeReason getShipmentChangeReason() {
        return shipmentChangeReason;
    }

    /**
     * Sets the value of the shipmentChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChangeReason }
     *     
     */
    public void setShipmentChangeReason(ShipmentChangeReason value) {
        this.shipmentChangeReason = value;
    }

    /**
     * Gets the value of the shipmentServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentServiceLevel }
     *     
     */
    public ShipmentServiceLevel getShipmentServiceLevel() {
        return shipmentServiceLevel;
    }

    /**
     * Sets the value of the shipmentServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentServiceLevel }
     *     
     */
    public void setShipmentServiceLevel(ShipmentServiceLevel value) {
        this.shipmentServiceLevel = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipTo(SpecifiedPartnerDescriptionType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the totalContainer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalContainer() {
        return totalContainer;
    }

    /**
     * Sets the value of the totalContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalContainer(BigInteger value) {
        this.totalContainer = value;
    }

    /**
     * Gets the value of the totalWeight property.
     * 
     * @return
     *     possible object is
     *     {@link WeightType }
     *     
     */
    public WeightType getTotalWeight() {
        return totalWeight;
    }

    /**
     * Sets the value of the totalWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightType }
     *     
     */
    public void setTotalWeight(WeightType value) {
        this.totalWeight = value;
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
