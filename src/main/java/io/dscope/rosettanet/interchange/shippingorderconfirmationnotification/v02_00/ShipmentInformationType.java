
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.DateInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.IsPartialShipment;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.PhysicalDimensionType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;


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
 *         &lt;element name="ConsolidationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}DateInformation"/&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="FreightTotalPhysicalDimension" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}PhysicalDimensionType" minOccurs="0"/&gt;
 *         &lt;element name="ImportBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="IsOrderConsolidated" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsOrderMerged" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}IsPartialShipment"/&gt;
 *         &lt;element name="ManifestNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
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
    "consolidationNumber",
    "containerTotalCount",
    "dateInformation",
    "freightReference",
    "freightTotalPhysicalDimension",
    "importBy",
    "isOrderConsolidated",
    "isOrderMerged",
    "isPartialShipment",
    "manifestNumber",
    "routingInformation",
    "shipFrom",
    "shipTo"
})
public class ShipmentInformationType {

    @XmlElement(name = "ConsolidationNumber")
    protected BusinessDocumentReferenceType consolidationNumber;
    @XmlElement(name = "ContainerTotalCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElementRef(name = "DateInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = DateInformation.class)
    protected DateInformation dateInformation;
    @XmlElement(name = "FreightReference")
    protected BusinessDocumentReferenceType freightReference;
    @XmlElement(name = "FreightTotalPhysicalDimension")
    protected PhysicalDimensionType freightTotalPhysicalDimension;
    @XmlElement(name = "ImportBy")
    protected SpecifiedPartnerDescriptionType importBy;
    @XmlElement(name = "IsOrderConsolidated")
    protected boolean isOrderConsolidated;
    @XmlElement(name = "IsOrderMerged")
    protected boolean isOrderMerged;
    @XmlElementRef(name = "IsPartialShipment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = IsPartialShipment.class)
    protected IsPartialShipment isPartialShipment;
    @XmlElement(name = "ManifestNumber")
    protected BusinessDocumentReferenceType manifestNumber;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "ShipFrom")
    protected SpecifiedPartnerDescriptionType shipFrom;
    @XmlElement(name = "ShipTo")
    protected SpecifiedPartnerDescriptionType shipTo;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the consolidationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getConsolidationNumber() {
        return consolidationNumber;
    }

    /**
     * Sets the value of the consolidationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setConsolidationNumber(BusinessDocumentReferenceType value) {
        this.consolidationNumber = value;
    }

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
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformation }
     *     
     */
    public DateInformation getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformation }
     *     
     */
    public void setDateInformation(DateInformation value) {
        this.dateInformation = value;
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
     * Gets the value of the freightTotalPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public PhysicalDimensionType getFreightTotalPhysicalDimension() {
        return freightTotalPhysicalDimension;
    }

    /**
     * Sets the value of the freightTotalPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public void setFreightTotalPhysicalDimension(PhysicalDimensionType value) {
        this.freightTotalPhysicalDimension = value;
    }

    /**
     * Gets the value of the importBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getImportBy() {
        return importBy;
    }

    /**
     * Sets the value of the importBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setImportBy(SpecifiedPartnerDescriptionType value) {
        this.importBy = value;
    }

    /**
     * Gets the value of the isOrderConsolidated property.
     * 
     */
    public boolean isIsOrderConsolidated() {
        return isOrderConsolidated;
    }

    /**
     * Sets the value of the isOrderConsolidated property.
     * 
     */
    public void setIsOrderConsolidated(boolean value) {
        this.isOrderConsolidated = value;
    }

    /**
     * Gets the value of the isOrderMerged property.
     * 
     */
    public boolean isIsOrderMerged() {
        return isOrderMerged;
    }

    /**
     * Sets the value of the isOrderMerged property.
     * 
     */
    public void setIsOrderMerged(boolean value) {
        this.isOrderMerged = value;
    }

    /**
     * Gets the value of the isPartialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link IsPartialShipment }
     *     
     */
    public IsPartialShipment getIsPartialShipment() {
        return isPartialShipment;
    }

    /**
     * Sets the value of the isPartialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPartialShipment }
     *     
     */
    public void setIsPartialShipment(IsPartialShipment value) {
        this.isPartialShipment = value;
    }

    /**
     * Gets the value of the manifestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getManifestNumber() {
        return manifestNumber;
    }

    /**
     * Sets the value of the manifestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setManifestNumber(BusinessDocumentReferenceType value) {
        this.manifestNumber = value;
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
