
package io.dscope.rosettanet.system.standarddocumentheader.v01_17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequestingDocumentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingDocumentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessProcessInstanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestingDocumentCreationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestingDocumentInstanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
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
@XmlType(name = "RequestingDocumentInformationType", propOrder = {
    "businessProcessInstanceIdentifier",
    "requestingDocumentCreationDateTime",
    "requestingDocumentInstanceIdentifier",
    "responseDateTime"
})
public class RequestingDocumentInformationType {

    @XmlElement(name = "BusinessProcessInstanceIdentifier")
    protected String businessProcessInstanceIdentifier;
    @XmlElement(name = "RequestingDocumentCreationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestingDocumentCreationDateTime;
    @XmlElement(name = "RequestingDocumentInstanceIdentifier", required = true)
    protected String requestingDocumentInstanceIdentifier;
    @XmlElement(name = "ResponseDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessProcessInstanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcessInstanceIdentifier() {
        return businessProcessInstanceIdentifier;
    }

    /**
     * Sets the value of the businessProcessInstanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcessInstanceIdentifier(String value) {
        this.businessProcessInstanceIdentifier = value;
    }

    /**
     * Gets the value of the requestingDocumentCreationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestingDocumentCreationDateTime() {
        return requestingDocumentCreationDateTime;
    }

    /**
     * Sets the value of the requestingDocumentCreationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestingDocumentCreationDateTime(XMLGregorianCalendar value) {
        this.requestingDocumentCreationDateTime = value;
    }

    /**
     * Gets the value of the requestingDocumentInstanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestingDocumentInstanceIdentifier() {
        return requestingDocumentInstanceIdentifier;
    }

    /**
     * Sets the value of the requestingDocumentInstanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestingDocumentInstanceIdentifier(String value) {
        this.requestingDocumentInstanceIdentifier = value;
    }

    /**
     * Gets the value of the responseDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseDateTime() {
        return responseDateTime;
    }

    /**
     * Sets the value of the responseDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseDateTime(XMLGregorianCalendar value) {
        this.responseDateTime = value;
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
