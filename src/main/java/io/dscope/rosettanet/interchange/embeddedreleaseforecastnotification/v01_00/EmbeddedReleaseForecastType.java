
package io.dscope.rosettanet.interchange.embeddedreleaseforecastnotification.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_03.ForecastEvent;
import io.dscope.rosettanet.domain.procurement.codelist.transportevent.v01_03.TransportEventType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ForecastIdentifierReference;


/**
 * <p>Java class for EmbeddedReleaseForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EmbeddedReleaseForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EmbeddedReleaseForecastTransportEvent" type="{urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03}TransportEventType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsFinalForecast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:EmbeddedReleaseForecastNotification:xsd:schema:01.00}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "EmbeddedReleaseForecastType", propOrder = {
    "embeddedReleaseForecastTransportEvent",
    "forecastEvent",
    "forecastIdentifierReference",
    "isFinalForecast",
    "partnerProductForecast"
})
public class EmbeddedReleaseForecastType {

    @XmlElement(name = "EmbeddedReleaseForecastTransportEvent", required = true)
    protected TransportEventType embeddedReleaseForecastTransportEvent;
    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElement(name = "IsFinalForecast")
    protected boolean isFinalForecast;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the embeddedReleaseForecastTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TransportEventType }
     *     
     */
    public TransportEventType getEmbeddedReleaseForecastTransportEvent() {
        return embeddedReleaseForecastTransportEvent;
    }

    /**
     * Sets the value of the embeddedReleaseForecastTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportEventType }
     *     
     */
    public void setEmbeddedReleaseForecastTransportEvent(TransportEventType value) {
        this.embeddedReleaseForecastTransportEvent = value;
    }

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
     */
    public boolean isIsFinalForecast() {
        return isFinalForecast;
    }

    /**
     * Sets the value of the isFinalForecast property.
     * 
     */
    public void setIsFinalForecast(boolean value) {
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
