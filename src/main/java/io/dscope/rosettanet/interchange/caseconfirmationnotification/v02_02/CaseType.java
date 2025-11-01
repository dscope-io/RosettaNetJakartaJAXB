
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

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
import io.dscope.rosettanet.domain.service.codelist.priority.v01_01.Priority;
import io.dscope.rosettanet.domain.service.codelist.severity.v01_01.Severity;


/**
 * <p>Java class for CaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseDetail" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}CaseDetailType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:Priority:xsd:codelist:01.01}Priority" minOccurs="0"/&gt;
 *         &lt;element name="Response" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}ResponseType"/&gt;
 *         &lt;element name="ServiceDetail" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}ServiceDetailType"/&gt;
 *         &lt;element name="ServiceRequestEmailNotification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01}Severity" minOccurs="0"/&gt;
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
@XmlType(name = "CaseType", propOrder = {
    "caseDetail",
    "priority",
    "response",
    "serviceDetail",
    "serviceRequestEmailNotification",
    "severity"
})
public class CaseType {

    @XmlElement(name = "CaseDetail", required = true)
    protected CaseDetailType caseDetail;
    @XmlElementRef(name = "Priority", namespace = "urn:rosettanet:specification:domain:Service:Priority:xsd:codelist:01.01", type = Priority.class, required = false)
    protected Priority priority;
    @XmlElement(name = "Response", required = true)
    protected ResponseType response;
    @XmlElement(name = "ServiceDetail", required = true)
    protected ServiceDetailType serviceDetail;
    @XmlElement(name = "ServiceRequestEmailNotification")
    protected List<String> serviceRequestEmailNotification;
    @XmlElementRef(name = "Severity", namespace = "urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", type = Severity.class, required = false)
    protected Severity severity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the caseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CaseDetailType }
     *     
     */
    public CaseDetailType getCaseDetail() {
        return caseDetail;
    }

    /**
     * Sets the value of the caseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseDetailType }
     *     
     */
    public void setCaseDetail(CaseDetailType value) {
        this.caseDetail = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setResponse(ResponseType value) {
        this.response = value;
    }

    /**
     * Gets the value of the serviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetailType }
     *     
     */
    public ServiceDetailType getServiceDetail() {
        return serviceDetail;
    }

    /**
     * Sets the value of the serviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetailType }
     *     
     */
    public void setServiceDetail(ServiceDetailType value) {
        this.serviceDetail = value;
    }

    /**
     * Gets the value of the serviceRequestEmailNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequestEmailNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequestEmailNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceRequestEmailNotification() {
        if (serviceRequestEmailNotification == null) {
            serviceRequestEmailNotification = new ArrayList<String>();
        }
        return this.serviceRequestEmailNotification;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Severity }
     *     
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Severity }
     *     
     */
    public void setSeverity(Severity value) {
        this.severity = value;
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
