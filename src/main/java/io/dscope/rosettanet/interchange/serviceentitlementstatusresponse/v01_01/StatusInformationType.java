
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_01;

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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03}NotificationCode"/&gt;
 *         &lt;element name="WarrantyNotes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "notificationCode",
    "warrantyNotes"
})
public class StatusInformationType {

    @XmlElementRef(name = "NotificationCode", namespace = "urn:rosettanet:specification:domain:Service:NotificationCode:xsd:codelist:01.03", type = NotificationCode.class)
    protected NotificationCode notificationCode;
    @XmlElement(name = "WarrantyNotes")
    protected String warrantyNotes;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the warrantyNotes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWarrantyNotes() {
        return warrantyNotes;
    }

    /**
     * Sets the value of the warrantyNotes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWarrantyNotes(String value) {
        this.warrantyNotes = value;
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
