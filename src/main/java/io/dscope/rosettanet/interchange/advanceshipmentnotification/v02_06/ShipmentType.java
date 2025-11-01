
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_06;

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
import io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03.Incoterms;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentchangedisposition.v01_03.ShipmentChangeDisposition;
import io.dscope.rosettanet.domain.logistics.codelist.shipmentmode.v01_05.ShipmentMode;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ShipmentDate;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.TrackingReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_30.SpecialHandlingInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.monetaryexpression.v01_07.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for ShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CarrierCode" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.19}SCACType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FreightAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.07}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FreightPaymentAccount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfShippingContainers" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.03}ShipmentChangeDisposition" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentChangeReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ShipmentDate" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05}ShipmentMode" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.06}ShippingContainerType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "ShipmentType", propOrder = {
    "carrierCode",
    "freightAmount",
    "freightPaymentAccount",
    "identifier",
    "incoterms",
    "numberOfShippingContainers",
    "shipmentChangeDisposition",
    "shipmentChangeReason",
    "shipmentDate",
    "shipmentMode",
    "shippingContainer",
    "shippingServiceLevel",
    "shipTo",
    "specialHandlingInstruction",
    "trackingReference",
    "transportedBy"
})
public class ShipmentType {

    @XmlElement(name = "CarrierCode", required = true)
    protected List<String> carrierCode;
    @XmlElement(name = "FreightAmount")
    protected FinancialAmountType freightAmount;
    @XmlElement(name = "FreightPaymentAccount")
    protected String freightPaymentAccount;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "Incoterms", namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", type = Incoterms.class, required = false)
    protected Incoterms incoterms;
    @XmlElement(name = "NumberOfShippingContainers")
    protected float numberOfShippingContainers;
    @XmlElementRef(name = "ShipmentChangeDisposition", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentChangeDisposition:xsd:codelist:01.03", type = ShipmentChangeDisposition.class, required = false)
    protected ShipmentChangeDisposition shipmentChangeDisposition;
    @XmlElement(name = "ShipmentChangeReason")
    protected String shipmentChangeReason;
    @XmlElementRef(name = "ShipmentDate", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ShipmentDate.class)
    protected List<ShipmentDate> shipmentDate;
    @XmlElementRef(name = "ShipmentMode", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentMode:xsd:codelist:01.05", type = ShipmentMode.class, required = false)
    protected ShipmentMode shipmentMode;
    @XmlElement(name = "ShippingContainer", required = true)
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "ShipTo", required = true)
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlElement(name = "TransportedBy", required = true)
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the carrierCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the carrierCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCarrierCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCarrierCode() {
        if (carrierCode == null) {
            carrierCode = new ArrayList<String>();
        }
        return this.carrierCode;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightAmount(FinancialAmountType value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the freightPaymentAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFreightPaymentAccount() {
        return freightPaymentAccount;
    }

    /**
     * Sets the value of the freightPaymentAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFreightPaymentAccount(String value) {
        this.freightPaymentAccount = value;
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
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the numberOfShippingContainers property.
     * 
     */
    public float getNumberOfShippingContainers() {
        return numberOfShippingContainers;
    }

    /**
     * Sets the value of the numberOfShippingContainers property.
     * 
     */
    public void setNumberOfShippingContainers(float value) {
        this.numberOfShippingContainers = value;
    }

    /**
     * Gets the value of the shipmentChangeDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentChangeDisposition }
     *     
     */
    public ShipmentChangeDisposition getShipmentChangeDisposition() {
        return shipmentChangeDisposition;
    }

    /**
     * Sets the value of the shipmentChangeDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentChangeDisposition }
     *     
     */
    public void setShipmentChangeDisposition(ShipmentChangeDisposition value) {
        this.shipmentChangeDisposition = value;
    }

    /**
     * Gets the value of the shipmentChangeReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentChangeReason() {
        return shipmentChangeReason;
    }

    /**
     * Sets the value of the shipmentChangeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentChangeReason(String value) {
        this.shipmentChangeReason = value;
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
     * Gets the value of the shippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerType }
     * 
     * 
     */
    public List<ShippingContainerType> getShippingContainer() {
        if (shippingContainer == null) {
            shippingContainer = new ArrayList<ShippingContainerType>();
        }
        return this.shippingContainer;
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
