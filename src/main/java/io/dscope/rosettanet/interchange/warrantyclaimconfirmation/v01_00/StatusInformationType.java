
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03.NotificationCode;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;


/**
 * <p>Java class for StatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="MessageTrackingID" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03}NotificationCode"/&gt;
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
@XmlType(name = "StatusInformationType", propOrder = {
    "comments",
    "messageTrackingID",
    "notificationCode"
})
public class StatusInformationType {

    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "MessageTrackingID", required = true)
    protected BusinessDocumentReferenceType messageTrackingID;
    @XmlElementRef(name = "NotificationCode", namespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", type = NotificationCode.class)
    protected NotificationCode notificationCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the messageTrackingID property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getMessageTrackingID() {
        return messageTrackingID;
    }

    /**
     * Sets the value of the messageTrackingID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setMessageTrackingID(BusinessDocumentReferenceType value) {
        this.messageTrackingID = value;
    }

    /**
     * Gets the value of the notificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link NotificationCode }
     *     
     */
    public NotificationCode getNotificationCode() {
        return notificationCode;
    }

    /**
     * Sets the value of the notificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificationCode }
     *     
     */
    public void setNotificationCode(NotificationCode value) {
        this.notificationCode = value;
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
