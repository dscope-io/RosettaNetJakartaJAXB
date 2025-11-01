
package io.dscope.rosettanet.domain.logistics.logistics.v02_17;

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
import io.dscope.rosettanet.domain.logistics.codelist.returnlabelcode.v01_03.ReturnLabelCode;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for ReturnLabelType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReturnLabelType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="PartIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReturnBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}ReturnInstructions" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.03}ReturnLabelCode"/&gt;
 *         &lt;element name="ReturnTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="RMAIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TagIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}TrackingReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ReturnLabelType", propOrder = {
    "dateTime",
    "partIdentifier",
    "returnBy",
    "returnInstructions",
    "returnLabelCode",
    "returnTo",
    "rmaIdentifier",
    "tagIdentifier",
    "trackingReference"
})
public class ReturnLabelType {

    @XmlElement(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlElement(name = "PartIdentifier")
    protected String partIdentifier;
    @XmlElement(name = "ReturnBy")
    protected SpecifiedPartnerDescriptionType returnBy;
    @XmlElementRef(name = "ReturnInstructions", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = ReturnInstructions.class, required = false)
    protected ReturnInstructions returnInstructions;
    @XmlElementRef(name = "ReturnLabelCode", namespace = "urn:rosettanet:specification:domain:Logistics:ReturnLabelCode:xsd:codelist:01.03", type = ReturnLabelCode.class)
    protected ReturnLabelCode returnLabelCode;
    @XmlElement(name = "ReturnTo")
    protected SpecifiedPartnerDescriptionType returnTo;
    @XmlElement(name = "RMAIdentifier")
    protected String rmaIdentifier;
    @XmlElement(name = "TagIdentifier")
    protected String tagIdentifier;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = TrackingReference.class, required = false)
    protected List<TrackingReference> trackingReference;
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
     * Gets the value of the partIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartIdentifier() {
        return partIdentifier;
    }

    /**
     * Sets the value of the partIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartIdentifier(String value) {
        this.partIdentifier = value;
    }

    /**
     * Gets the value of the returnBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReturnBy() {
        return returnBy;
    }

    /**
     * Sets the value of the returnBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReturnBy(SpecifiedPartnerDescriptionType value) {
        this.returnBy = value;
    }

    /**
     * Gets the value of the returnInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnInstructions }
     *     
     */
    public ReturnInstructions getReturnInstructions() {
        return returnInstructions;
    }

    /**
     * Sets the value of the returnInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnInstructions }
     *     
     */
    public void setReturnInstructions(ReturnInstructions value) {
        this.returnInstructions = value;
    }

    /**
     * Gets the value of the returnLabelCode property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnLabelCode }
     *     
     */
    public ReturnLabelCode getReturnLabelCode() {
        return returnLabelCode;
    }

    /**
     * Sets the value of the returnLabelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnLabelCode }
     *     
     */
    public void setReturnLabelCode(ReturnLabelCode value) {
        this.returnLabelCode = value;
    }

    /**
     * Gets the value of the returnTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getReturnTo() {
        return returnTo;
    }

    /**
     * Sets the value of the returnTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setReturnTo(SpecifiedPartnerDescriptionType value) {
        this.returnTo = value;
    }

    /**
     * Gets the value of the rmaIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRMAIdentifier() {
        return rmaIdentifier;
    }

    /**
     * Sets the value of the rmaIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRMAIdentifier(String value) {
        this.rmaIdentifier = value;
    }

    /**
     * Gets the value of the tagIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTagIdentifier() {
        return tagIdentifier;
    }

    /**
     * Sets the value of the tagIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTagIdentifier(String value) {
        this.tagIdentifier = value;
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
