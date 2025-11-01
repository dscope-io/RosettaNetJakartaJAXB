
package io.dscope.rosettanet.interchange.shipmentstatusdistribution.v01_02;

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
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.CustomsInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ProofOfDeliveryInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.SCAC;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ShipmentDate;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.ShippingRoutingPointType;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.TrackingReference;
import io.dscope.rosettanet.domain.logistics.logistics.v01_07.TransportInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v01_06.SpecialHandlingInstruction;
import io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00.ShipmentStatusReportingLevel;
import io.dscope.rosettanet.universal.partneridentification.v01_03.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for RoutingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RoutingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}CustomsInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ProofOfDeliveryInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}SCAC" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ShipmentDate" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentStatusEvent" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}ShipmentStatusEventType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00}ShipmentStatusReportingLevel" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipmentTransportationEvent" type="{urn:rosettanet:specification:interchange:ShipmentStatusDistribution:xsd:schema:01.02}ShipmentTransportationEventType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipVia" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}ShippingRoutingPointType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06}SpecialHandlingInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}TrackingReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.03}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07}TransportInformation"/&gt;
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
@XmlType(name = "RoutingInformationType", propOrder = {
    "customsInformation",
    "proofOfDeliveryInformation",
    "scac",
    "shipmentDate",
    "shipmentStatusEvent",
    "shipmentStatusReportingLevel",
    "shipmentTransportationEvent",
    "shipVia",
    "specialHandlingInstruction",
    "trackingReference",
    "transportedBy",
    "transportInformation"
})
public class RoutingInformationType {

    @XmlElementRef(name = "CustomsInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = CustomsInformation.class, required = false)
    protected CustomsInformation customsInformation;
    @XmlElementRef(name = "ProofOfDeliveryInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = ProofOfDeliveryInformation.class, required = false)
    protected ProofOfDeliveryInformation proofOfDeliveryInformation;
    @XmlElementRef(name = "SCAC", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = SCAC.class, required = false)
    protected SCAC scac;
    @XmlElementRef(name = "ShipmentDate", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = ShipmentDate.class, required = false)
    protected List<ShipmentDate> shipmentDate;
    @XmlElement(name = "ShipmentStatusEvent", required = true)
    protected List<ShipmentStatusEventType> shipmentStatusEvent;
    @XmlElementRef(name = "ShipmentStatusReportingLevel", namespace = "urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00", type = ShipmentStatusReportingLevel.class)
    protected List<ShipmentStatusReportingLevel> shipmentStatusReportingLevel;
    @XmlElement(name = "ShipmentTransportationEvent")
    protected List<ShipmentTransportationEventType> shipmentTransportationEvent;
    @XmlElement(name = "ShipVia")
    protected ShippingRoutingPointType shipVia;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.06", type = SpecialHandlingInstruction.class, required = false)
    protected List<SpecialHandlingInstruction> specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = TrackingReference.class)
    protected List<TrackingReference> trackingReference;
    @XmlElement(name = "TransportedBy")
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlElementRef(name = "TransportInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.07", type = TransportInformation.class)
    protected TransportInformation transportInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsInformation }
     *     
     */
    public CustomsInformation getCustomsInformation() {
        return customsInformation;
    }

    /**
     * Sets the value of the customsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsInformation }
     *     
     */
    public void setCustomsInformation(CustomsInformation value) {
        this.customsInformation = value;
    }

    /**
     * Gets the value of the proofOfDeliveryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProofOfDeliveryInformation }
     *     
     */
    public ProofOfDeliveryInformation getProofOfDeliveryInformation() {
        return proofOfDeliveryInformation;
    }

    /**
     * Sets the value of the proofOfDeliveryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofOfDeliveryInformation }
     *     
     */
    public void setProofOfDeliveryInformation(ProofOfDeliveryInformation value) {
        this.proofOfDeliveryInformation = value;
    }

    /**
     * Gets the value of the scac property.
     * 
     * @return
     *     possible object is
     *     {@link SCAC }
     *     
     */
    public SCAC getSCAC() {
        return scac;
    }

    /**
     * Sets the value of the scac property.
     * 
     * @param value
     *     allowed object is
     *     {@link SCAC }
     *     
     */
    public void setSCAC(SCAC value) {
        this.scac = value;
    }

    /**
     * Gets the value of the shipmentDate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentDate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentDate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentDate }
     * 
     * 
     */
    public List<ShipmentDate> getShipmentDate() {
        if (shipmentDate == null) {
            shipmentDate = new ArrayList<ShipmentDate>();
        }
        return this.shipmentDate;
    }

    /**
     * Gets the value of the shipmentStatusEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusEventType }
     * 
     * 
     */
    public List<ShipmentStatusEventType> getShipmentStatusEvent() {
        if (shipmentStatusEvent == null) {
            shipmentStatusEvent = new ArrayList<ShipmentStatusEventType>();
        }
        return this.shipmentStatusEvent;
    }

    /**
     * Gets the value of the shipmentStatusReportingLevel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentStatusReportingLevel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentStatusReportingLevel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentStatusReportingLevel }
     * 
     * 
     */
    public List<ShipmentStatusReportingLevel> getShipmentStatusReportingLevel() {
        if (shipmentStatusReportingLevel == null) {
            shipmentStatusReportingLevel = new ArrayList<ShipmentStatusReportingLevel>();
        }
        return this.shipmentStatusReportingLevel;
    }

    /**
     * Gets the value of the shipmentTransportationEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentTransportationEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentTransportationEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentTransportationEventType }
     * 
     * 
     */
    public List<ShipmentTransportationEventType> getShipmentTransportationEvent() {
        if (shipmentTransportationEvent == null) {
            shipmentTransportationEvent = new ArrayList<ShipmentTransportationEventType>();
        }
        return this.shipmentTransportationEvent;
    }

    /**
     * Gets the value of the shipVia property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingRoutingPointType }
     *     
     */
    public ShippingRoutingPointType getShipVia() {
        return shipVia;
    }

    /**
     * Sets the value of the shipVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingRoutingPointType }
     *     
     */
    public void setShipVia(ShippingRoutingPointType value) {
        this.shipVia = value;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingInstruction }
     * 
     * 
     */
    public List<SpecialHandlingInstruction> getSpecialHandlingInstruction() {
        if (specialHandlingInstruction == null) {
            specialHandlingInstruction = new ArrayList<SpecialHandlingInstruction>();
        }
        return this.specialHandlingInstruction;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trackingReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrackingReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReference }
     * 
     * 
     */
    public List<TrackingReference> getTrackingReference() {
        if (trackingReference == null) {
            trackingReference = new ArrayList<TrackingReference>();
        }
        return this.trackingReference;
    }

    /**
     * Gets the value of the transportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransportedBy(SpecifiedPartnerDescriptionType value) {
        this.transportedBy = value;
    }

    /**
     * Gets the value of the transportInformation property.
     * 
     * @return
     *     possible object is
     *     {@link TransportInformation }
     *     
     */
    public TransportInformation getTransportInformation() {
        return transportInformation;
    }

    /**
     * Sets the value of the transportInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportInformation }
     *     
     */
    public void setTransportInformation(TransportInformation value) {
        this.transportInformation = value;
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
