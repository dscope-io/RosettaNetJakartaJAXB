
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.standarddocumentheader.v01_18.DocumentHeader;


/**
 * <p>Java class for RemittanceAdviceNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RemittanceAdviceNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.18}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="RemittanceAdvice" type="{urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.01}RemittanceAdviceType"/&gt;
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
@XmlType(name = "RemittanceAdviceNotificationType", propOrder = {
    "documentHeader",
    "remittanceAdvice"
})
public class RemittanceAdviceNotificationType {

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.18", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "RemittanceAdvice", required = true)
    protected RemittanceAdviceType remittanceAdvice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the remittanceAdvice property.
     * 
     * @return
     *     possible object is
     *     {@link RemittanceAdviceType }
     *     
     */
    public RemittanceAdviceType getRemittanceAdvice() {
        return remittanceAdvice;
    }

    /**
     * Sets the value of the remittanceAdvice property.
     * 
     * @param value
     *     allowed object is
     *     {@link RemittanceAdviceType }
     *     
     */
    public void setRemittanceAdvice(RemittanceAdviceType value) {
        this.remittanceAdvice = value;
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
