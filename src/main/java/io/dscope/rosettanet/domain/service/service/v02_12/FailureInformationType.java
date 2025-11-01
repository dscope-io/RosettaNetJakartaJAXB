
package io.dscope.rosettanet.domain.service.service.v02_12;

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


/**
 * <p>Java class for FailureInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FailureInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateTimeStamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.12}FailureAnalysis" minOccurs="0"/&gt;
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
@XmlType(name = "FailureInformationType", propOrder = {
    "comment",
    "dateTimeStamp",
    "failureAnalysis"
})
public class FailureInformationType {

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DateTimeStamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTimeStamp;
    @XmlElementRef(name = "FailureAnalysis", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.12", type = FailureAnalysis.class, required = false)
    protected FailureAnalysis failureAnalysis;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the dateTimeStamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTimeStamp() {
        return dateTimeStamp;
    }

    /**
     * Sets the value of the dateTimeStamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTimeStamp(XMLGregorianCalendar value) {
        this.dateTimeStamp = value;
    }

    /**
     * Gets the value of the failureAnalysis property.
     * 
     * @return
     *     possible object is
     *     {@link FailureAnalysis }
     *     
     */
    public FailureAnalysis getFailureAnalysis() {
        return failureAnalysis;
    }

    /**
     * Sets the value of the failureAnalysis property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureAnalysis }
     *     
     */
    public void setFailureAnalysis(FailureAnalysis value) {
        this.failureAnalysis = value;
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
