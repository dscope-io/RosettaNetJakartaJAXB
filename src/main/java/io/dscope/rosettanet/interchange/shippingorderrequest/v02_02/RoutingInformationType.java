
package io.dscope.rosettanet.interchange.shippingorderrequest.v02_02;

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
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.FreightPaymentInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.ShippingLabel;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;


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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}FreightPaymentInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}ShippingLabel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SpecialHandlingInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "freightPaymentInformation",
    "partnerDescription",
    "sequenceNumber",
    "shipmentMode",
    "shippingLabel",
    "shippingServiceLevel",
    "specialHandlingInstruction"
})
public class RoutingInformationType {

    @XmlElement(name = "DeliveryPriorityIdentifier")
    protected String deliveryPriorityIdentifier;
    @XmlElementRef(name = "FreightPaymentInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = FreightPaymentInformation.class, required = false)
    protected FreightPaymentInformation freightPaymentInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "SequenceNumber", required = true)
    protected String sequenceNumber;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class, required = false)
    protected ShipmentMode shipmentMode;
    @XmlElementRef(name = "ShippingLabel", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = ShippingLabel.class, required = false)
    protected ShippingLabel shippingLabel;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SpecialHandlingInstruction.class, required = false)
    protected List<SpecialHandlingInstruction> specialHandlingInstruction;
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
     * Gets the value of the shippingLabel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingLabel }
     *     
     */
    public ShippingLabel getShippingLabel() {
        return shippingLabel;
    }

    /**
     * Sets the value of the shippingLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingLabel }
     *     
     */
    public void setShippingLabel(ShippingLabel value) {
        this.shippingLabel = value;
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
