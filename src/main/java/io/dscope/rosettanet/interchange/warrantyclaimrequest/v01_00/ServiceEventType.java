
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00;

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
import io.dscope.rosettanet.domain.service.service.v02_20.FailureInformation;
import io.dscope.rosettanet.domain.service.service.v02_20.ServiceStartDate;
import io.dscope.rosettanet.universal.contactinformation.v01_04.ContactInformationType;


/**
 * <p>Java class for ServiceEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEventType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompletionDate" type="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ServiceCompletionDateType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}FailureInformation" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ServiceStartDate" minOccurs="0"/&gt;
 *         &lt;element name="Technician" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceEventType", propOrder = {
    "completionDate",
    "failureInformation",
    "notes",
    "requestedDeliveryMethod",
    "serviceStartDate",
    "technician"
})
public class ServiceEventType {

    @XmlElement(name = "CompletionDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionDate;
    @XmlElementRef(name = "FailureInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = FailureInformation.class, required = false)
    protected FailureInformation failureInformation;
    @XmlElement(name = "Notes")
    protected String notes;
    @XmlElement(name = "RequestedDeliveryMethod")
    protected ServiceDeliveryMethodType requestedDeliveryMethod;
    @XmlElementRef(name = "ServiceStartDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ServiceStartDate.class, required = false)
    protected ServiceStartDate serviceStartDate;
    @XmlElement(name = "Technician")
    protected ContactInformationType technician;
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
     * Gets the value of the failureInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FailureInformation }
     *     
     */
    public FailureInformation getFailureInformation() {
        return failureInformation;
    }

    /**
     * Sets the value of the failureInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FailureInformation }
     *     
     */
    public void setFailureInformation(FailureInformation value) {
        this.failureInformation = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotes(String value) {
        this.notes = value;
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
     * Gets the value of the serviceStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceStartDate }
     *     
     */
    public ServiceStartDate getServiceStartDate() {
        return serviceStartDate;
    }

    /**
     * Sets the value of the serviceStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceStartDate }
     *     
     */
    public void setServiceStartDate(ServiceStartDate value) {
        this.serviceStartDate = value;
    }

    /**
     * Gets the value of the technician property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getTechnician() {
        return technician;
    }

    /**
     * Sets the value of the technician property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setTechnician(ContactInformationType value) {
        this.technician = value;
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
