
package io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01;

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
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;
import io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02.WarrantyProgram;


/**
 * <p>Java class for EventInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompletionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FailureDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02}WarrantyProgram" minOccurs="0"/&gt;
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
@XmlType(name = "EventInformationType", propOrder = {
    "completionDate",
    "failureDate",
    "requestedDeliveryMethod",
    "startDate",
    "warrantyProgram"
})
public class EventInformationType {

    @XmlElement(name = "CompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    @XmlElement(name = "FailureDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar failureDate;
    @XmlElement(name = "RequestedDeliveryMethod")
    protected ServiceDeliveryMethodType requestedDeliveryMethod;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "WarrantyProgram", namespace = "urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02", type = WarrantyProgram.class, required = false)
    protected WarrantyProgram warrantyProgram;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionDate() {
        return completionDate;
    }

    /**
     * Sets the value of the completionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionDate(XMLGregorianCalendar value) {
        this.completionDate = value;
    }

    /**
     * Gets the value of the failureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFailureDate() {
        return failureDate;
    }

    /**
     * Sets the value of the failureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFailureDate(XMLGregorianCalendar value) {
        this.failureDate = value;
    }

    /**
     * Gets the value of the requestedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedDeliveryMethod() {
        return requestedDeliveryMethod;
    }

    /**
     * Sets the value of the requestedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.requestedDeliveryMethod = value;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the warrantyProgram property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyProgram }
     *     
     */
    public WarrantyProgram getWarrantyProgram() {
        return warrantyProgram;
    }

    /**
     * Sets the value of the warrantyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyProgram }
     *     
     */
    public void setWarrantyProgram(WarrantyProgram value) {
        this.warrantyProgram = value;
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
