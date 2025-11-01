
package io.dscope.rosettanet.interchange.engineeringinformationinquirydistribution.v01_02;

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
import io.dscope.rosettanet.domain.design.codelist.messagefunction.v01_00.MessageFunction;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseorderstatus.v01_06.PurchaseOrderStatusType;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformationType;
import io.dscope.rosettanet.universal.document.v01_10.BusinessDocumentReference;


/**
 * <p>Java class for EngineeringInformationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringInformationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.10}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedReplyDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00}MessageFunction" maxOccurs="unbounded"/&gt;
 *         &lt;element name="MessageReason" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RequestDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Requester" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType"/&gt;
 *         &lt;element name="RequestPurpose" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Responder" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderStatus:xsd:codelist:01.06}PurchaseOrderStatusType"/&gt;
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
@XmlType(name = "EngineeringInformationHeaderType", propOrder = {
    "businessDocumentReference",
    "description",
    "expectedReplyDate",
    "messageFunction",
    "messageReason",
    "requestDate",
    "requester",
    "requestPurpose",
    "responder",
    "status"
})
public class EngineeringInformationHeaderType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.10", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "Description")
    protected List<String> description;
    @XmlElement(name = "ExpectedReplyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expectedReplyDate;
    @XmlElementRef(name = "MessageFunction", namespace = "urn:rosettanet:specification:domain:Design:MessageFunction:xsd:codelist:01.00", type = MessageFunction.class)
    protected List<MessageFunction> messageFunction;
    @XmlElement(name = "MessageReason", required = true)
    protected String messageReason;
    @XmlElement(name = "RequestDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(name = "Requester", required = true)
    protected ContactInformationType requester;
    @XmlElement(name = "RequestPurpose")
    protected List<String> requestPurpose;
    @XmlElement(name = "Responder")
    protected ContactInformationType responder;
    @XmlElement(name = "Status", required = true)
    protected PurchaseOrderStatusType status;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescription() {
        if (description == null) {
            description = new ArrayList<String>();
        }
        return this.description;
    }

    /**
     * Gets the value of the expectedReplyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpectedReplyDate() {
        return expectedReplyDate;
    }

    /**
     * Sets the value of the expectedReplyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpectedReplyDate(XMLGregorianCalendar value) {
        this.expectedReplyDate = value;
    }

    /**
     * Gets the value of the messageFunction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the messageFunction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessageFunction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageFunction }
     * 
     * 
     */
    public List<MessageFunction> getMessageFunction() {
        if (messageFunction == null) {
            messageFunction = new ArrayList<MessageFunction>();
        }
        return this.messageFunction;
    }

    /**
     * Gets the value of the messageReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageReason() {
        return messageReason;
    }

    /**
     * Sets the value of the messageReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageReason(String value) {
        this.messageReason = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
    }

    /**
     * Gets the value of the requester property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getRequester() {
        return requester;
    }

    /**
     * Sets the value of the requester property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setRequester(ContactInformationType value) {
        this.requester = value;
    }

    /**
     * Gets the value of the requestPurpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestPurpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRequestPurpose() {
        if (requestPurpose == null) {
            requestPurpose = new ArrayList<String>();
        }
        return this.requestPurpose;
    }

    /**
     * Gets the value of the responder property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getResponder() {
        return responder;
    }

    /**
     * Sets the value of the responder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setResponder(ContactInformationType value) {
        this.responder = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public PurchaseOrderStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderStatusType }
     *     
     */
    public void setStatus(PurchaseOrderStatusType value) {
        this.status = value;
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
