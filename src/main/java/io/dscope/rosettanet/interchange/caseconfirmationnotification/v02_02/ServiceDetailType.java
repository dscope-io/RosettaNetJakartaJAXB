
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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.service.service.v02_20.Part;
import io.dscope.rosettanet.domain.service.service.v02_20.ServiceInformation;
import io.dscope.rosettanet.domain.service.service.v02_20.Update;
import io.dscope.rosettanet.universal.partneridentification.v01_16.FullPartnerType;


/**
 * <p>Java class for ServiceDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AccessDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContractNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DiagnosticCapabilities" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EndDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Generation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="GPSLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InstallationSite" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}FullPartnerType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Part" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ServiceInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Update" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceDetailType", propOrder = {
    "accessDescription",
    "contractNumber",
    "diagnosticCapabilities",
    "endDate",
    "generation",
    "gpsLocation",
    "installationSite",
    "part",
    "serviceID",
    "serviceInformation",
    "serviceLevel",
    "startDate",
    "update"
})
public class ServiceDetailType {

    @XmlElement(name = "AccessDescription")
    protected String accessDescription;
    @XmlElement(name = "ContractNumber")
    protected String contractNumber;
    @XmlElement(name = "DiagnosticCapabilities")
    protected String diagnosticCapabilities;
    @XmlElement(name = "EndDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar endDate;
    @XmlElement(name = "Generation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generation;
    @XmlElement(name = "GPSLocation")
    protected String gpsLocation;
    @XmlElement(name = "InstallationSite")
    protected FullPartnerType installationSite;
    @XmlElementRef(name = "Part", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Part.class, required = false)
    protected List<Part> part;
    @XmlElement(name = "ServiceID")
    protected String serviceID;
    @XmlElementRef(name = "ServiceInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ServiceInformation.class, required = false)
    protected List<ServiceInformation> serviceInformation;
    @XmlElement(name = "ServiceLevel")
    protected String serviceLevel;
    @XmlElement(name = "StartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar startDate;
    @XmlElementRef(name = "Update", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Update.class, required = false)
    protected Update update;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the accessDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessDescription() {
        return accessDescription;
    }

    /**
     * Sets the value of the accessDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessDescription(String value) {
        this.accessDescription = value;
    }

    /**
     * Gets the value of the contractNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractNumber() {
        return contractNumber;
    }

    /**
     * Sets the value of the contractNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractNumber(String value) {
        this.contractNumber = value;
    }

    /**
     * Gets the value of the diagnosticCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiagnosticCapabilities() {
        return diagnosticCapabilities;
    }

    /**
     * Sets the value of the diagnosticCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiagnosticCapabilities(String value) {
        this.diagnosticCapabilities = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * Gets the value of the generation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneration() {
        return generation;
    }

    /**
     * Sets the value of the generation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneration(XMLGregorianCalendar value) {
        this.generation = value;
    }

    /**
     * Gets the value of the gpsLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGPSLocation() {
        return gpsLocation;
    }

    /**
     * Sets the value of the gpsLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGPSLocation(String value) {
        this.gpsLocation = value;
    }

    /**
     * Gets the value of the installationSite property.
     * 
     * @return
     *     possible object is
     *     {@link FullPartnerType }
     *     
     */
    public FullPartnerType getInstallationSite() {
        return installationSite;
    }

    /**
     * Sets the value of the installationSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullPartnerType }
     *     
     */
    public void setInstallationSite(FullPartnerType value) {
        this.installationSite = value;
    }

    /**
     * Gets the value of the part property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the part property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Part }
     * 
     * 
     */
    public List<Part> getPart() {
        if (part == null) {
            part = new ArrayList<Part>();
        }
        return this.part;
    }

    /**
     * Gets the value of the serviceID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Sets the value of the serviceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
    }

    /**
     * Gets the value of the serviceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceInformation }
     * 
     * 
     */
    public List<ServiceInformation> getServiceInformation() {
        if (serviceInformation == null) {
            serviceInformation = new ArrayList<ServiceInformation>();
        }
        return this.serviceInformation;
    }

    /**
     * Gets the value of the serviceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLevel() {
        return serviceLevel;
    }

    /**
     * Sets the value of the serviceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLevel(String value) {
        this.serviceLevel = value;
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
     * Gets the value of the update property.
     * 
     * @return
     *     possible object is
     *     {@link Update }
     *     
     */
    public Update getUpdate() {
        return update;
    }

    /**
     * Sets the value of the update property.
     * 
     * @param value
     *     allowed object is
     *     {@link Update }
     *     
     */
    public void setUpdate(Update value) {
        this.update = value;
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
