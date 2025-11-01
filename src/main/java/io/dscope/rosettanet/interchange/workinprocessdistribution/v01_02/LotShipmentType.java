
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.locations.v01_04.LocationType;


/**
 * <p>Java class for LotShipmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotShipmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualCompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ActualShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="ActualShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledCompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="CurrentScheduledShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledCompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledCompletionQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledShipDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="OriginalScheduledShipQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ShipToLocation" type="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}LocationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
@XmlType(name = "LotShipmentType", propOrder = {
    "actualCompletionDate",
    "actualCompletionQuantity",
    "actualShipDate",
    "actualShipQuantity",
    "businessDocumentReference",
    "currentScheduledCompletionDate",
    "currentScheduledCompletionQuantity",
    "currentScheduledShipDate",
    "currentScheduledShipQuantity",
    "originalScheduledCompletionDate",
    "originalScheduledCompletionQuantity",
    "originalScheduledShipDate",
    "originalScheduledShipQuantity",
    "shipToLocation",
    "unitOfMeasure"
})
public class LotShipmentType {

    @XmlElement(name = "ActualCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualCompletionDate;
    @XmlElement(name = "ActualCompletionQuantity")
    protected Float actualCompletionQuantity;
    @XmlElement(name = "ActualShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar actualShipDate;
    @XmlElement(name = "ActualShipQuantity")
    protected Float actualShipQuantity;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "CurrentScheduledCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentScheduledCompletionDate;
    @XmlElement(name = "CurrentScheduledCompletionQuantity")
    protected Float currentScheduledCompletionQuantity;
    @XmlElement(name = "CurrentScheduledShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar currentScheduledShipDate;
    @XmlElement(name = "CurrentScheduledShipQuantity")
    protected Float currentScheduledShipQuantity;
    @XmlElement(name = "OriginalScheduledCompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalScheduledCompletionDate;
    @XmlElement(name = "OriginalScheduledCompletionQuantity")
    protected Float originalScheduledCompletionQuantity;
    @XmlElement(name = "OriginalScheduledShipDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar originalScheduledShipDate;
    @XmlElement(name = "OriginalScheduledShipQuantity")
    protected Float originalScheduledShipQuantity;
    @XmlElement(name = "ShipToLocation")
    protected LocationType shipToLocation;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualCompletionDate() {
        return actualCompletionDate;
    }

    /**
     * Sets the value of the actualCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualCompletionDate(XMLGregorianCalendar value) {
        this.actualCompletionDate = value;
    }

    /**
     * Gets the value of the actualCompletionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getActualCompletionQuantity() {
        return actualCompletionQuantity;
    }

    /**
     * Sets the value of the actualCompletionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setActualCompletionQuantity(Float value) {
        this.actualCompletionQuantity = value;
    }

    /**
     * Gets the value of the actualShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActualShipDate() {
        return actualShipDate;
    }

    /**
     * Sets the value of the actualShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActualShipDate(XMLGregorianCalendar value) {
        this.actualShipDate = value;
    }

    /**
     * Gets the value of the actualShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getActualShipQuantity() {
        return actualShipQuantity;
    }

    /**
     * Sets the value of the actualShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setActualShipQuantity(Float value) {
        this.actualShipQuantity = value;
    }

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the currentScheduledCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentScheduledCompletionDate() {
        return currentScheduledCompletionDate;
    }

    /**
     * Sets the value of the currentScheduledCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentScheduledCompletionDate(XMLGregorianCalendar value) {
        this.currentScheduledCompletionDate = value;
    }

    /**
     * Gets the value of the currentScheduledCompletionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentScheduledCompletionQuantity() {
        return currentScheduledCompletionQuantity;
    }

    /**
     * Sets the value of the currentScheduledCompletionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentScheduledCompletionQuantity(Float value) {
        this.currentScheduledCompletionQuantity = value;
    }

    /**
     * Gets the value of the currentScheduledShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCurrentScheduledShipDate() {
        return currentScheduledShipDate;
    }

    /**
     * Sets the value of the currentScheduledShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCurrentScheduledShipDate(XMLGregorianCalendar value) {
        this.currentScheduledShipDate = value;
    }

    /**
     * Gets the value of the currentScheduledShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCurrentScheduledShipQuantity() {
        return currentScheduledShipQuantity;
    }

    /**
     * Sets the value of the currentScheduledShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCurrentScheduledShipQuantity(Float value) {
        this.currentScheduledShipQuantity = value;
    }

    /**
     * Gets the value of the originalScheduledCompletionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalScheduledCompletionDate() {
        return originalScheduledCompletionDate;
    }

    /**
     * Sets the value of the originalScheduledCompletionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalScheduledCompletionDate(XMLGregorianCalendar value) {
        this.originalScheduledCompletionDate = value;
    }

    /**
     * Gets the value of the originalScheduledCompletionQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginalScheduledCompletionQuantity() {
        return originalScheduledCompletionQuantity;
    }

    /**
     * Sets the value of the originalScheduledCompletionQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginalScheduledCompletionQuantity(Float value) {
        this.originalScheduledCompletionQuantity = value;
    }

    /**
     * Gets the value of the originalScheduledShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOriginalScheduledShipDate() {
        return originalScheduledShipDate;
    }

    /**
     * Sets the value of the originalScheduledShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOriginalScheduledShipDate(XMLGregorianCalendar value) {
        this.originalScheduledShipDate = value;
    }

    /**
     * Gets the value of the originalScheduledShipQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginalScheduledShipQuantity() {
        return originalScheduledShipQuantity;
    }

    /**
     * Sets the value of the originalScheduledShipQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginalScheduledShipQuantity(Float value) {
        this.originalScheduledShipQuantity = value;
    }

    /**
     * Gets the value of the shipToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getShipToLocation() {
        return shipToLocation;
    }

    /**
     * Sets the value of the shipToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setShipToLocation(LocationType value) {
        this.shipToLocation = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
