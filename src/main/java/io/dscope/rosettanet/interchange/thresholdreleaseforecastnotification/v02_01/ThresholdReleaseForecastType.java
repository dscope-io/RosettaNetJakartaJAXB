
package io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_03.ForecastEvent;
import io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_03.TransportEvent;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastIdentifierReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.IsFinalForecast;


/**
 * <p>Java class for ThresholdReleaseForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ThresholdReleaseForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element name="ForecastGeneration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}IsFinalForecast"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:ThresholdReleaseForecastNotification:xsd:schema:02.01}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03}TransportEvent"/&gt;
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
@XmlType(name = "ThresholdReleaseForecastType", propOrder = {
    "forecastEvent",
    "forecastGeneration",
    "forecastIdentifierReference",
    "isFinalForecast",
    "partnerProductForecast",
    "revision",
    "transportEvent"
})
public class ThresholdReleaseForecastType {

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElement(name = "ForecastGeneration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastGeneration;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElementRef(name = "IsFinalForecast", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = IsFinalForecast.class)
    protected IsFinalForecast isFinalForecast;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElementRef(name = "TransportEvent", namespace = "urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03", type = TransportEvent.class)
    protected TransportEvent transportEvent;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastEvent }
     *     
     */
    public ForecastEvent getForecastEvent() {
        return forecastEvent;
    }

    /**
     * Sets the value of the forecastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastEvent }
     *     
     */
    public void setForecastEvent(ForecastEvent value) {
        this.forecastEvent = value;
    }

    /**
     * Gets the value of the forecastGeneration property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getForecastGeneration() {
        return forecastGeneration;
    }

    /**
     * Sets the value of the forecastGeneration property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setForecastGeneration(XMLGregorianCalendar value) {
        this.forecastGeneration = value;
    }

    /**
     * Gets the value of the forecastIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastIdentifierReference }
     * 
     * 
     */
    public List<ForecastIdentifierReference> getForecastIdentifierReference() {
        if (forecastIdentifierReference == null) {
            forecastIdentifierReference = new ArrayList<ForecastIdentifierReference>();
        }
        return this.forecastIdentifierReference;
    }

    /**
     * Gets the value of the isFinalForecast property.
     * 
     * @return
     *     possible object is
     *     {@link IsFinalForecast }
     *     
     */
    public IsFinalForecast getIsFinalForecast() {
        return isFinalForecast;
    }

    /**
     * Sets the value of the isFinalForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsFinalForecast }
     *     
     */
    public void setIsFinalForecast(IsFinalForecast value) {
        this.isFinalForecast = value;
    }

    /**
     * Gets the value of the partnerProductForecast property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProductForecast property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProductForecast().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerProductForecastType }
     * 
     * 
     */
    public List<PartnerProductForecastType> getPartnerProductForecast() {
        if (partnerProductForecast == null) {
            partnerProductForecast = new ArrayList<PartnerProductForecastType>();
        }
        return this.partnerProductForecast;
    }

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the transportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEvent }
     *     
     */
    public TransportEvent getTransportEvent() {
        return transportEvent;
    }

    /**
     * Sets the value of the transportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEvent }
     *     
     */
    public void setTransportEvent(TransportEvent value) {
        this.transportEvent = value;
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
