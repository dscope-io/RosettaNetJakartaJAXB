
package io.dscope.rosettanet.system.standarddocumentheader.v01_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DocumentHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09}CorrelationInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09}DocumentInformation"/&gt;
 *         &lt;element name="HeaderVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09}Receiver"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09}Sender"/&gt;
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
@XmlType(name = "DocumentHeaderType", propOrder = {
    "correlationInformation",
    "documentInformation",
    "headerVersion",
    "receiver",
    "sender"
})
public class DocumentHeaderType {

    @XmlElementRef(name = "CorrelationInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09", type = CorrelationInformation.class, required = false)
    protected CorrelationInformation correlationInformation;
    @XmlElementRef(name = "DocumentInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09", type = DocumentInformation.class)
    protected DocumentInformation documentInformation;
    @XmlElement(name = "HeaderVersion")
    protected String headerVersion;
    @XmlElementRef(name = "Receiver", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09", type = Receiver.class)
    protected Receiver receiver;
    @XmlElementRef(name = "Sender", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09", type = Sender.class)
    protected Sender sender;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the correlationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationInformation }
     *     
     */
    public CorrelationInformation getCorrelationInformation() {
        return correlationInformation;
    }

    /**
     * Sets the value of the correlationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationInformation }
     *     
     */
    public void setCorrelationInformation(CorrelationInformation value) {
        this.correlationInformation = value;
    }

    /**
     * Gets the value of the documentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentInformation }
     *     
     */
    public DocumentInformation getDocumentInformation() {
        return documentInformation;
    }

    /**
     * Sets the value of the documentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentInformation }
     *     
     */
    public void setDocumentInformation(DocumentInformation value) {
        this.documentInformation = value;
    }

    /**
     * Gets the value of the headerVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeaderVersion() {
        return headerVersion;
    }

    /**
     * Sets the value of the headerVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeaderVersion(String value) {
        this.headerVersion = value;
    }

    /**
     * Gets the value of the receiver property.
     * 
     * @return
     *     possible object is
     *     {@link Receiver }
     *     
     */
    public Receiver getReceiver() {
        return receiver;
    }

    /**
     * Sets the value of the receiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link Receiver }
     *     
     */
    public void setReceiver(Receiver value) {
        this.receiver = value;
    }

    /**
     * Gets the value of the sender property.
     * 
     * @return
     *     possible object is
     *     {@link Sender }
     *     
     */
    public Sender getSender() {
        return sender;
    }

    /**
     * Sets the value of the sender property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sender }
     *     
     */
    public void setSender(Sender value) {
        this.sender = value;
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
