
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

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
import io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_03.FreightPaymentTerms;
import io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_03.RouteLocation;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


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
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03}FreightPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.03}RouteLocation" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}TrackingReference" minOccurs="0"/&gt;
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
    "description",
    "freightPaymentTerms",
    "partnerDescription",
    "routeLocation",
    "sequenceNumber",
    "shipmentMode",
    "shippingServiceLevel",
    "specialHandlingInstruction",
    "trackingReference"
})
public class RoutingInformationType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "FreightPaymentTerms", namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.03", type = FreightPaymentTerms.class, required = false)
    protected FreightPaymentTerms freightPaymentTerms;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "RouteLocation", namespace = "urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.03", type = RouteLocation.class, required = false)
    protected RouteLocation routeLocation;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class, required = false)
    protected ShipmentMode shipmentMode;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the freightPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public FreightPaymentTerms getFreightPaymentTerms() {
        return freightPaymentTerms;
    }

    /**
     * Sets the value of the freightPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public void setFreightPaymentTerms(FreightPaymentTerms value) {
        this.freightPaymentTerms = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the routeLocation property.
     * 
     * @return
     *     possible object is
     *     {@link RouteLocation }
     *     
     */
    public RouteLocation getRouteLocation() {
        return routeLocation;
    }

    /**
     * Sets the value of the routeLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteLocation }
     *     
     */
    public void setRouteLocation(RouteLocation value) {
        this.routeLocation = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
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
