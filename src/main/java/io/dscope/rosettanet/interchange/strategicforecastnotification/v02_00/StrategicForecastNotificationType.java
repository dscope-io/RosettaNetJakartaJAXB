
package io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.standarddocumentheader.v01_16.DocumentHeader;


/**
 * <p>Java class for StrategicForecastNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StrategicForecastNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="StrategicForecast" type="{urn:rosettanet:specification:interchange:StrategicForecastNotification:xsd:schema:02.00}StrategicForecastType"/&gt;
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
@XmlType(name = "StrategicForecastNotificationType", propOrder = {
    "documentHeader",
    "strategicForecast"
})
public class StrategicForecastNotificationType {

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "StrategicForecast", required = true)
    protected StrategicForecastType strategicForecast;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the strategicForecast property.
     * 
     * @return
     *     possible object is
     *     {@link StrategicForecastType }
     *     
     */
    public StrategicForecastType getStrategicForecast() {
        return strategicForecast;
    }

    /**
     * Sets the value of the strategicForecast property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategicForecastType }
     *     
     */
    public void setStrategicForecast(StrategicForecastType value) {
        this.strategicForecast = value;
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
