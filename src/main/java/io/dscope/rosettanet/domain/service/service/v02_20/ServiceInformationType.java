
package io.dscope.rosettanet.domain.service.service.v02_20;

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


/**
 * <p>Java class for ServiceInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseAction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaseReview" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Complexity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerImpact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerSymptom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EstimateResponse" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FutureActionEvent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}Notes" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProblemDetailDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseSP" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RootCauseAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ServiceInformationSecurity" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SpecialInstruction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestResult" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="WorkAroundSummary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ServiceInformationType", propOrder = {
    "caseAction",
    "caseReview",
    "complexity",
    "customerImpact",
    "customerSymptom",
    "estimateResponse",
    "futureActionEvent",
    "notes",
    "problemDetailDescription",
    "resolutionSummary",
    "responseSP",
    "rootCauseAnalysis",
    "serviceInformationSecurity",
    "specialInstruction",
    "testResult",
    "workAroundSummary"
})
public class ServiceInformationType {

    @XmlElement(name = "CaseAction")
    protected String caseAction;
    @XmlElement(name = "CaseReview")
    protected String caseReview;
    @XmlElement(name = "Complexity")
    protected String complexity;
    @XmlElement(name = "CustomerImpact")
    protected String customerImpact;
    @XmlElement(name = "CustomerSymptom")
    protected String customerSymptom;
    @XmlElement(name = "EstimateResponse")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimateResponse;
    @XmlElement(name = "FutureActionEvent")
    protected List<String> futureActionEvent;
    @XmlElementRef(name = "Notes", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = Notes.class, required = false)
    protected List<Notes> notes;
    @XmlElement(name = "ProblemDetailDescription")
    protected String problemDetailDescription;
    @XmlElement(name = "ResolutionSummary")
    protected String resolutionSummary;
    @XmlElement(name = "ResponseSP")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseSP;
    @XmlElement(name = "RootCauseAnalysis")
    protected List<String> rootCauseAnalysis;
    @XmlElement(name = "ServiceInformationSecurity", required = true)
    protected String serviceInformationSecurity;
    @XmlElement(name = "SpecialInstruction")
    protected String specialInstruction;
    @XmlElement(name = "TestResult")
    protected List<String> testResult;
    @XmlElement(name = "WorkAroundSummary")
    protected String workAroundSummary;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the caseAction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseAction() {
        return caseAction;
    }

    /**
     * Sets the value of the caseAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseAction(String value) {
        this.caseAction = value;
    }

    /**
     * Gets the value of the caseReview property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseReview() {
        return caseReview;
    }

    /**
     * Sets the value of the caseReview property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseReview(String value) {
        this.caseReview = value;
    }

    /**
     * Gets the value of the complexity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComplexity() {
        return complexity;
    }

    /**
     * Sets the value of the complexity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComplexity(String value) {
        this.complexity = value;
    }

    /**
     * Gets the value of the customerImpact property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerImpact() {
        return customerImpact;
    }

    /**
     * Sets the value of the customerImpact property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerImpact(String value) {
        this.customerImpact = value;
    }

    /**
     * Gets the value of the customerSymptom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSymptom() {
        return customerSymptom;
    }

    /**
     * Sets the value of the customerSymptom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSymptom(String value) {
        this.customerSymptom = value;
    }

    /**
     * Gets the value of the estimateResponse property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimateResponse() {
        return estimateResponse;
    }

    /**
     * Sets the value of the estimateResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimateResponse(XMLGregorianCalendar value) {
        this.estimateResponse = value;
    }

    /**
     * Gets the value of the futureActionEvent property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the futureActionEvent property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFutureActionEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getFutureActionEvent() {
        if (futureActionEvent == null) {
            futureActionEvent = new ArrayList<String>();
        }
        return this.futureActionEvent;
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
     * {@link Notes }
     * 
     * 
     */
    public List<Notes> getNotes() {
        if (notes == null) {
            notes = new ArrayList<Notes>();
        }
        return this.notes;
    }

    /**
     * Gets the value of the problemDetailDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProblemDetailDescription() {
        return problemDetailDescription;
    }

    /**
     * Sets the value of the problemDetailDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProblemDetailDescription(String value) {
        this.problemDetailDescription = value;
    }

    /**
     * Gets the value of the resolutionSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResolutionSummary() {
        return resolutionSummary;
    }

    /**
     * Sets the value of the resolutionSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResolutionSummary(String value) {
        this.resolutionSummary = value;
    }

    /**
     * Gets the value of the responseSP property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseSP() {
        return responseSP;
    }

    /**
     * Sets the value of the responseSP property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseSP(XMLGregorianCalendar value) {
        this.responseSP = value;
    }

    /**
     * Gets the value of the rootCauseAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rootCauseAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRootCauseAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRootCauseAnalysis() {
        if (rootCauseAnalysis == null) {
            rootCauseAnalysis = new ArrayList<String>();
        }
        return this.rootCauseAnalysis;
    }

    /**
     * Gets the value of the serviceInformationSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceInformationSecurity() {
        return serviceInformationSecurity;
    }

    /**
     * Sets the value of the serviceInformationSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceInformationSecurity(String value) {
        this.serviceInformationSecurity = value;
    }

    /**
     * Gets the value of the specialInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialInstruction() {
        return specialInstruction;
    }

    /**
     * Sets the value of the specialInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialInstruction(String value) {
        this.specialInstruction = value;
    }

    /**
     * Gets the value of the testResult property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testResult property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTestResult() {
        if (testResult == null) {
            testResult = new ArrayList<String>();
        }
        return this.testResult;
    }

    /**
     * Gets the value of the workAroundSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkAroundSummary() {
        return workAroundSummary;
    }

    /**
     * Sets the value of the workAroundSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkAroundSummary(String value) {
        this.workAroundSummary = value;
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
