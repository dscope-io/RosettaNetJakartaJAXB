
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_03.CompletionStatus;


/**
 * <p>Java class for LotTimeStampType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotTimeStampType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.03}CompletionStatus" minOccurs="0"/&gt;
 *         &lt;element name="LotEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "LotTimeStampType", propOrder = {
    "completionStatus",
    "lotEndDateTime",
    "lotStartDateTime"
})
public class LotTimeStampType {

    @XmlElementRef(name = "CompletionStatus", namespace = "urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.03", type = CompletionStatus.class, required = false)
    protected CompletionStatus completionStatus;
    @XmlElement(name = "LotEndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotEndDateTime;
    @XmlElement(name = "LotStartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotStartDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CompletionStatus }
     *     
     */
    public CompletionStatus getCompletionStatus() {
        return completionStatus;
    }

    /**
     * Sets the value of the completionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionStatus }
     *     
     */
    public void setCompletionStatus(CompletionStatus value) {
        this.completionStatus = value;
    }

    /**
     * Gets the value of the lotEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLotEndDateTime() {
        return lotEndDateTime;
    }

    /**
     * Sets the value of the lotEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLotEndDateTime(XMLGregorianCalendar value) {
        this.lotEndDateTime = value;
    }

    /**
     * Gets the value of the lotStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLotStartDateTime() {
        return lotStartDateTime;
    }

    /**
     * Sets the value of the lotStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLotStartDateTime(XMLGregorianCalendar value) {
        this.lotStartDateTime = value;
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
