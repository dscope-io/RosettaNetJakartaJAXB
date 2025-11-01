
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00;

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
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationDisposition;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationRenewableStatus;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationSubmissionDate;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;


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
 *         &lt;element name="DesignEngagementDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="DesignProjectInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.00}DesignProjectInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationDisposition"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationRenewableStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationSubmissionDate" minOccurs="0"/&gt;
 *         &lt;element name="RenewalRequiredDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
    "designEngagementDate",
    "designProjectInformation",
    "registrationDisposition",
    "registrationRenewableStatus",
    "registrationSubmissionDate",
    "renewalRequiredDate"
})
public class DesignRegistrationInformationType {

    @XmlElement(name = "DesignEngagementDate")
    protected DatePeriodType designEngagementDate;
    @XmlElement(name = "DesignProjectInformation", required = true)
    protected DesignProjectInformationType designProjectInformation;
    @XmlElementRef(name = "RegistrationDisposition", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationDisposition.class)
    protected RegistrationDisposition registrationDisposition;
    @XmlElementRef(name = "RegistrationRenewableStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationRenewableStatus.class, required = false)
    protected RegistrationRenewableStatus registrationRenewableStatus;
    @XmlElementRef(name = "RegistrationSubmissionDate", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationSubmissionDate.class, required = false)
    protected RegistrationSubmissionDate registrationSubmissionDate;
    @XmlElement(name = "RenewalRequiredDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar renewalRequiredDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designEngagementDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getDesignEngagementDate() {
        return designEngagementDate;
    }

    /**
     * Sets the value of the designEngagementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setDesignEngagementDate(DatePeriodType value) {
        this.designEngagementDate = value;
    }

    /**
     * Gets the value of the designProjectInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DesignProjectInformationType }
     *     
     */
    public DesignProjectInformationType getDesignProjectInformation() {
        return designProjectInformation;
    }

    /**
     * Sets the value of the designProjectInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignProjectInformationType }
     *     
     */
    public void setDesignProjectInformation(DesignProjectInformationType value) {
        this.designProjectInformation = value;
    }

    /**
     * Gets the value of the registrationDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDisposition }
     *     
     */
    public RegistrationDisposition getRegistrationDisposition() {
        return registrationDisposition;
    }

    /**
     * Sets the value of the registrationDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDisposition }
     *     
     */
    public void setRegistrationDisposition(RegistrationDisposition value) {
        this.registrationDisposition = value;
    }

    /**
     * Gets the value of the registrationRenewableStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationRenewableStatus }
     *     
     */
    public RegistrationRenewableStatus getRegistrationRenewableStatus() {
        return registrationRenewableStatus;
    }

    /**
     * Sets the value of the registrationRenewableStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationRenewableStatus }
     *     
     */
    public void setRegistrationRenewableStatus(RegistrationRenewableStatus value) {
        this.registrationRenewableStatus = value;
    }

    /**
     * Gets the value of the registrationSubmissionDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationSubmissionDate }
     *     
     */
    public RegistrationSubmissionDate getRegistrationSubmissionDate() {
        return registrationSubmissionDate;
    }

    /**
     * Sets the value of the registrationSubmissionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationSubmissionDate }
     *     
     */
    public void setRegistrationSubmissionDate(RegistrationSubmissionDate value) {
        this.registrationSubmissionDate = value;
    }

    /**
     * Gets the value of the renewalRequiredDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRenewalRequiredDate() {
        return renewalRequiredDate;
    }

    /**
     * Sets the value of the renewalRequiredDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRenewalRequiredDate(XMLGregorianCalendar value) {
        this.renewalRequiredDate = value;
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
