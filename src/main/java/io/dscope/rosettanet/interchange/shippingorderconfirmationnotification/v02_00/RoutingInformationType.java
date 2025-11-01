
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.FreightPaymentInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;


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
 *         &lt;element name="DeliveryPriorityIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FreightEquipmentNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}FreightPaymentInformation" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="ShipVia" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}TrackingReference" minOccurs="0"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType"/&gt;
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
    "deliveryPriorityIdentifier",
    "freightEquipmentNumber",
    "freightPaymentInformation",
    "sequenceNumber",
    "shipmentMode",
    "shippingServiceLevel",
    "shipVia",
    "specialHandlingInstruction",
    "trackingReference",
    "transportedBy"
})
public class RoutingInformationType {

    @XmlElement(name = "DeliveryPriorityIdentifier")
    protected String deliveryPriorityIdentifier;
    @XmlElement(name = "FreightEquipmentNumber")
    protected BusinessDocumentReferenceType freightEquipmentNumber;
    @XmlElementRef(name = "FreightPaymentInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = FreightPaymentInformation.class, required = false)
    protected FreightPaymentInformation freightPaymentInformation;
    @XmlElement(name = "SequenceNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class)
    protected ShipmentMode shipmentMode;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "ShipVia")
    protected SpecifiedPartnerDescriptionType shipVia;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlElement(name = "TransportedBy", required = true)
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the deliveryPriorityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryPriorityIdentifier() {
        return deliveryPriorityIdentifier;
    }

    /**
     * Sets the value of the deliveryPriorityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryPriorityIdentifier(String value) {
        this.deliveryPriorityIdentifier = value;
    }

    /**
     * Gets the value of the freightEquipmentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightEquipmentNumber() {
        return freightEquipmentNumber;
    }

    /**
     * Sets the value of the freightEquipmentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightEquipmentNumber(BusinessDocumentReferenceType value) {
        this.freightEquipmentNumber = value;
    }

    /**
     * Gets the value of the freightPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentInformation }
     *     
     */
    public FreightPaymentInformation getFreightPaymentInformation() {
        return freightPaymentInformation;
    }

    /**
     * Sets the value of the freightPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentInformation }
     *     
     */
    public void setFreightPaymentInformation(FreightPaymentInformation value) {
        this.freightPaymentInformation = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the shipmentMode property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentMode }
     *     
     */
    public ShipmentMode getShipmentMode() {
        return shipmentMode;
    }

    /**
     * Sets the value of the shipmentMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentMode }
     *     
     */
    public void setShipmentMode(ShipmentMode value) {
        this.shipmentMode = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
    }

    /**
     * Gets the value of the shipVia property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getShipVia() {
        return shipVia;
    }

    /**
     * Sets the value of the shipVia property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setShipVia(SpecifiedPartnerDescriptionType value) {
        this.shipVia = value;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public SpecialHandlingInstruction getSpecialHandlingInstruction() {
        return specialHandlingInstruction;
    }

    /**
     * Sets the value of the specialHandlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public void setSpecialHandlingInstruction(SpecialHandlingInstruction value) {
        this.specialHandlingInstruction = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
