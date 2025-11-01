
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
import io.dscope.rosettanet.domain.service.codelist.requesttype.v01_01.RequestType;
import io.dscope.rosettanet.domain.service.service.v02_20.CRContact;
import io.dscope.rosettanet.domain.service.service.v02_20.CaseID;
import io.dscope.rosettanet.domain.service.service.v02_20.Fault;
import io.dscope.rosettanet.domain.service.service.v02_20.Hardware;
import io.dscope.rosettanet.domain.service.service.v02_20.RejectCase;
import io.dscope.rosettanet.domain.service.service.v02_20.Software;


/**
 * <p>Java class for CaseDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseDetailType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}CaseID"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}CRContact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Fault" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Hardware" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MasterCaseNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProblemType" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}ProblemTypeType" minOccurs="0"/&gt;
 *         &lt;element name="Reason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}RejectCase" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:RequestType:xsd:codelist:01.01}RequestType"/&gt;
 *         &lt;element name="SerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Software" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Title" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CaseDetailType", propOrder = {
    "caseID",
    "crContact",
    "fault",
    "hardware",
    "masterCaseNumber",
    "notes",
    "problemType",
    "reason",
    "rejectCase",
    "requestType",
    "serialNumber",
    "software",
    "status",
    "title"
})
public class CaseDetailType {

    @XmlElementRef(name = "CaseID", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = CaseID.class)
    protected CaseID caseID;
    @XmlElementRef(name = "CRContact", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = CRContact.class, required = false)
    protected List<CRContact> crContact;
    @XmlElementRef(name = "Fault", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Fault.class, required = false)
    protected List<Fault> fault;
    @XmlElementRef(name = "Hardware", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Hardware.class, required = false)
    protected List<Hardware> hardware;
    @XmlElement(name = "MasterCaseNumber")
    protected String masterCaseNumber;
    @XmlElement(name = "Notes")
    protected List<String> notes;
    @XmlElement(name = "ProblemType")
    protected ProblemTypeType problemType;
    @XmlElement(name = "Reason")
    protected String reason;
    @XmlElementRef(name = "RejectCase", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = RejectCase.class, required = false)
    protected RejectCase rejectCase;
    @XmlElementRef(name = "RequestType", namespace = "urn:rosettanet:specification:domain:Service:RequestType:xsd:codelist:01.01", type = RequestType.class)
    protected RequestType requestType;
    @XmlElement(name = "SerialNumber")
    protected String serialNumber;
    @XmlElementRef(name = "Software", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Software.class, required = false)
    protected List<Software> software;
    @XmlElement(name = "Status")
    protected String status;
    @XmlElement(name = "Title")
    protected String title;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the caseID property.
     * 
     * @return
     *     possible object is
     *     {@link CaseID }
     *     
     */
    public CaseID getCaseID() {
        return caseID;
    }

    /**
     * Sets the value of the caseID property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseID }
     *     
     */
    public void setCaseID(CaseID value) {
        this.caseID = value;
    }

    /**
     * Gets the value of the crContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the crContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCRContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CRContact }
     * 
     * 
     */
    public List<CRContact> getCRContact() {
        if (crContact == null) {
            crContact = new ArrayList<CRContact>();
        }
        return this.crContact;
    }

    /**
     * Gets the value of the fault property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fault property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFault().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fault }
     * 
     * 
     */
    public List<Fault> getFault() {
        if (fault == null) {
            fault = new ArrayList<Fault>();
        }
        return this.fault;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hardware property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHardware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hardware }
     * 
     * 
     */
    public List<Hardware> getHardware() {
        if (hardware == null) {
            hardware = new ArrayList<Hardware>();
        }
        return this.hardware;
    }

    /**
     * Gets the value of the masterCaseNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterCaseNumber() {
        return masterCaseNumber;
    }

    /**
     * Sets the value of the masterCaseNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterCaseNumber(String value) {
        this.masterCaseNumber = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNotes() {
        if (notes == null) {
            notes = new ArrayList<String>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the problemType property.
     * 
     * @return
     *     possible object is
     *     {@link ProblemTypeType }
     *     
     */
    public ProblemTypeType getProblemType() {
        return problemType;
    }

    /**
     * Sets the value of the problemType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProblemTypeType }
     *     
     */
    public void setProblemType(ProblemTypeType value) {
        this.problemType = value;
    }

    /**
     * Gets the value of the reason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReason() {
        return reason;
    }

    /**
     * Sets the value of the reason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReason(String value) {
        this.reason = value;
    }

    /**
     * Gets the value of the rejectCase property.
     * 
     * @return
     *     possible object is
     *     {@link RejectCase }
     *     
     */
    public RejectCase getRejectCase() {
        return rejectCase;
    }

    /**
     * Sets the value of the rejectCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link RejectCase }
     *     
     */
    public void setRejectCase(RejectCase value) {
        this.rejectCase = value;
    }

    /**
     * Gets the value of the requestType property.
     * 
     * @return
     *     possible object is
     *     {@link RequestType }
     *     
     */
    public RequestType getRequestType() {
        return requestType;
    }

    /**
     * Sets the value of the requestType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestType }
     *     
     */
    public void setRequestType(RequestType value) {
        this.requestType = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialNumber(String value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the software property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the software property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoftware().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Software }
     * 
     * 
     */
    public List<Software> getSoftware() {
        if (software == null) {
            software = new ArrayList<Software>();
        }
        return this.software;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
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
