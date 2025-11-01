
package io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastIdentifierReference;
import io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02.PlanningReleaseForecastTransportEvent;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


/**
 * <p>Java class for PlanningReleaseForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlanningReleaseForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element name="ForecastGeneration" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsFinalForecast" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="PlanningReleaseForecastRevision" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:PlanningReleaseForecastTransportEvent:xsd:codelist:01.02}PlanningReleaseForecastTransportEvent"/&gt;
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
@XmlType(name = "PlanningReleaseForecastType", propOrder = {
    "forecastEvent",
    "forecastGeneration",
    "forecastIdentifierReference",
    "isFinalForecast",
    "partnerProductForecast",
    "planningReleaseForecastRevision",
    "planningReleaseForecastTransportEvent"
})
public class PlanningReleaseForecastType {

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElement(name = "ForecastGeneration", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar forecastGeneration;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElement(name = "IsFinalForecast")
    protected boolean isFinalForecast;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlElement(name = "PlanningReleaseForecastRevision")
    protected BusinessDocumentReferenceType planningReleaseForecastRevision;
    @XmlElementRef(name = "PlanningReleaseForecastTransportEvent", namespace = "urn:rosettanet:specification:interchange:PlanningReleaseForecastTransportEvent:xsd:codelist:01.02", type = PlanningReleaseForecastTransportEvent.class)
    protected PlanningReleaseForecastTransportEvent planningReleaseForecastTransportEvent;
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
     * Gets the value of the planningReleaseForecastRevision property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPlanningReleaseForecastRevision() {
        return planningReleaseForecastRevision;
    }

    /**
     * Sets the value of the planningReleaseForecastRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPlanningReleaseForecastRevision(BusinessDocumentReferenceType value) {
        this.planningReleaseForecastRevision = value;
    }

    /**
     * Gets the value of the planningReleaseForecastTransportEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PlanningReleaseForecastTransportEvent }
     *     
     */
    public PlanningReleaseForecastTransportEvent getPlanningReleaseForecastTransportEvent() {
        return planningReleaseForecastTransportEvent;
    }

    /**
     * Sets the value of the planningReleaseForecastTransportEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlanningReleaseForecastTransportEvent }
     *     
     */
    public void setPlanningReleaseForecastTransportEvent(PlanningReleaseForecastTransportEvent value) {
        this.planningReleaseForecastTransportEvent = value;
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
