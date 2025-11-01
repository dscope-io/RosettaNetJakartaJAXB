
package io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ForecastIdentifierReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.IsFinalForecast;
import io.dscope.rosettanet.interchange.codelist.forecasttype.v01_01.ForecastType;


/**
 * <p>Java class for StrategicForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategicForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ForecastIdentifierReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:ForecastType:xsd:codelist:01.01}ForecastType"/&gt;
 *         &lt;element name="GenerationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsFinalForecast"/&gt;
 *         &lt;element name="PartnerProductForecast" type="{urn:rosettanet:specification:interchange:StrategicForecastNotification:xsd:schema:02.00}PartnerProductForecastType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "StrategicForecastType", propOrder = {
    "forecastEvent",
    "forecastIdentifierReference",
    "forecastType",
    "generationDateTime",
    "isFinalForecast",
    "partnerProductForecast",
    "revisionNumber"
})
public class StrategicForecastType {

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElementRef(name = "ForecastIdentifierReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ForecastIdentifierReference.class, required = false)
    protected List<ForecastIdentifierReference> forecastIdentifierReference;
    @XmlElementRef(name = "ForecastType", namespace = "urn:rosettanet:specification:interchange:ForecastType:xsd:codelist:01.01", type = ForecastType.class)
    protected ForecastType forecastType;
    @XmlElement(name = "GenerationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generationDateTime;
    @XmlElementRef(name = "IsFinalForecast", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsFinalForecast.class)
    protected IsFinalForecast isFinalForecast;
    @XmlElement(name = "PartnerProductForecast", required = true)
    protected List<PartnerProductForecastType> partnerProductForecast;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
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
     * Gets the value of the forecastType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastType }
     *     
     */
    public ForecastType getForecastType() {
        return forecastType;
    }

    /**
     * Sets the value of the forecastType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastType }
     *     
     */
    public void setForecastType(ForecastType value) {
        this.forecastType = value;
    }

    /**
     * Gets the value of the generationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGenerationDateTime() {
        return generationDateTime;
    }

    /**
     * Sets the value of the generationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGenerationDateTime(XMLGregorianCalendar value) {
        this.generationDateTime = value;
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
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
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
