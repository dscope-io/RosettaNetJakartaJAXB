
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_01;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_18.TrackingReference;
import io.dscope.rosettanet.universal.document.v01_09.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedKnownPartnerType;


/**
 * <p>Java class for ShipmentReceiptType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentReceiptType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.09}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReceiptDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ReportDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="ShipmentIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentReceiptLineItem" type="{urn:rosettanet:specification:interchange:ShipmentReceiptNotification:xsd:schema:02.01}ShipmentReceiptLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedKnownPartnerType" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentReceiptType", propOrder = {
    "containerTotalCount",
    "freightReference",
    "partnerDescription",
    "receiptDate",
    "reportDateTime",
    "shipmentIdentifier",
    "shipmentReceiptLineItem",
    "trackingReference",
    "transportedBy"
})
public class ShipmentReceiptType {

    @XmlElement(name = "ContainerTotalCount", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElement(name = "FreightReference")
    protected BusinessDocumentReferenceType freightReference;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "ReceiptDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar receiptDate;
    @XmlElement(name = "ReportDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reportDateTime;
    @XmlElement(name = "ShipmentIdentifier")
    protected String shipmentIdentifier;
    @XmlElement(name = "ShipmentReceiptLineItem", required = true)
    protected List<ShipmentReceiptLineItemType> shipmentReceiptLineItem;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
    @XmlElement(name = "TransportedBy")
    protected SpecifiedKnownPartnerType transportedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContainerTotalCount() {
        return containerTotalCount;
    }

    /**
     * Sets the value of the containerTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContainerTotalCount(BigInteger value) {
        this.containerTotalCount = value;
    }

    /**
     * Gets the value of the freightReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightReference() {
        return freightReference;
    }

    /**
     * Sets the value of the freightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightReference(BusinessDocumentReferenceType value) {
        this.freightReference = value;
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
     * Gets the value of the receiptDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReceiptDate() {
        return receiptDate;
    }

    /**
     * Sets the value of the receiptDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReceiptDate(XMLGregorianCalendar value) {
        this.receiptDate = value;
    }

    /**
     * Gets the value of the reportDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReportDateTime() {
        return reportDateTime;
    }

    /**
     * Sets the value of the reportDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReportDateTime(XMLGregorianCalendar value) {
        this.reportDateTime = value;
    }

    /**
     * Gets the value of the shipmentIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentIdentifier() {
        return shipmentIdentifier;
    }

    /**
     * Sets the value of the shipmentIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentIdentifier(String value) {
        this.shipmentIdentifier = value;
    }

    /**
     * Gets the value of the shipmentReceiptLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentReceiptLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentReceiptLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentReceiptLineItemType }
     * 
     * 
     */
    public List<ShipmentReceiptLineItemType> getShipmentReceiptLineItem() {
        if (shipmentReceiptLineItem == null) {
            shipmentReceiptLineItem = new ArrayList<ShipmentReceiptLineItemType>();
        }
        return this.shipmentReceiptLineItem;
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
     *     {@link SpecifiedKnownPartnerType }
     *     
     */
    public SpecifiedKnownPartnerType getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartnerType }
     *     
     */
    public void setTransportedBy(SpecifiedKnownPartnerType value) {
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
