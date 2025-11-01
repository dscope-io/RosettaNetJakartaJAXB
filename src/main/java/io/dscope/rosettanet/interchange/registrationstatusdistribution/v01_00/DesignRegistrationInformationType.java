
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationRenewableStatusType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


/**
 * <p>Java class for DesignRegistrationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignRegistrationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EngagementDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="PreviousSubmission" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ProjectInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}ProjectInformationType"/&gt;
 *         &lt;element name="RenewableStatus" type="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationRenewableStatusType" minOccurs="0"/&gt;
 *         &lt;element name="SubmissionDate" type="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationSubmissionDateType" minOccurs="0"/&gt;
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
@XmlType(name = "DesignRegistrationInformationType", propOrder = {
    "engagementDate",
    "previousSubmission",
    "projectInformation",
    "renewableStatus",
    "submissionDate"
})
public class DesignRegistrationInformationType {

    @XmlElement(name = "EngagementDate")
    protected DatePeriodType engagementDate;
    @XmlElement(name = "PreviousSubmission")
    protected BusinessDocumentReferenceType previousSubmission;
    @XmlElement(name = "ProjectInformation", required = true)
    protected ProjectInformationType projectInformation;
    @XmlElement(name = "RenewableStatus")
    protected RegistrationRenewableStatusType renewableStatus;
    @XmlElement(name = "SubmissionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar submissionDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the engagementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEngagementDate() {
        return engagementDate;
    }

    /**
     * Sets the value of the engagementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEngagementDate(DatePeriodType value) {
        this.engagementDate = value;
    }

    /**
     * Gets the value of the previousSubmission property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPreviousSubmission() {
        return previousSubmission;
    }

    /**
     * Sets the value of the previousSubmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPreviousSubmission(BusinessDocumentReferenceType value) {
        this.previousSubmission = value;
    }

    /**
     * Gets the value of the projectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectInformationType }
     *     
     */
    public ProjectInformationType getProjectInformation() {
        return projectInformation;
    }

    /**
     * Sets the value of the projectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectInformationType }
     *     
     */
    public void setProjectInformation(ProjectInformationType value) {
        this.projectInformation = value;
    }

    /**
     * Gets the value of the renewableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationRenewableStatusType }
     *     
     */
    public RegistrationRenewableStatusType getRenewableStatus() {
        return renewableStatus;
    }

    /**
     * Sets the value of the renewableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationRenewableStatusType }
     *     
     */
    public void setRenewableStatus(RegistrationRenewableStatusType value) {
        this.renewableStatus = value;
    }

    /**
     * Gets the value of the submissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSubmissionDate() {
        return submissionDate;
    }

    /**
     * Sets the value of the submissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSubmissionDate(XMLGregorianCalendar value) {
        this.submissionDate = value;
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
