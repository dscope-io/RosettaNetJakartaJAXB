
package io.dscope.rosettanet.domain.service.service.v02_12;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="EstimateResponse" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="FutureActionEvent" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ResponseSP" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="RootCauseAnalysis" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TestResult" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "estimateResponse",
    "futureActionEvent",
    "responseSP",
    "rootCauseAnalysis",
    "testResult"
})
public class ServiceInformationType {

    @XmlElement(name = "CaseAction")
    protected String caseAction;
    @XmlElement(name = "EstimateResponse")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar estimateResponse;
    @XmlElement(name = "FutureActionEvent")
    protected List<String> futureActionEvent;
    @XmlElement(name = "ResponseSP")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar responseSP;
    @XmlElement(name = "RootCauseAnalysis")
    protected List<String> rootCauseAnalysis;
    @XmlElement(name = "TestResult")
    protected List<String> testResult;
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
