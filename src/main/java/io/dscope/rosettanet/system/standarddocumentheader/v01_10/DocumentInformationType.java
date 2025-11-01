
package io.dscope.rosettanet.system.standarddocumentheader.v01_10;

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
 * <p>Java class for DocumentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Creation" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}DocumentIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}DocumentManifest" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}DocumentSecurity" minOccurs="0"/&gt;
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
@XmlType(name = "DocumentInformationType", propOrder = {
    "creation",
    "documentIdentification",
    "documentManifest",
    "documentSecurity"
})
public class DocumentInformationType {

    @XmlElement(name = "Creation", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creation;
    @XmlElementRef(name = "DocumentIdentification", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = DocumentIdentification.class)
    protected DocumentIdentification documentIdentification;
    @XmlElementRef(name = "DocumentManifest", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = DocumentManifest.class, required = false)
    protected DocumentManifest documentManifest;
    @XmlElementRef(name = "DocumentSecurity", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = DocumentSecurity.class, required = false)
    protected DocumentSecurity documentSecurity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the creation property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreation() {
        return creation;
    }

    /**
     * Sets the value of the creation property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreation(XMLGregorianCalendar value) {
        this.creation = value;
    }

    /**
     * Gets the value of the documentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification }
     *     
     */
    public DocumentIdentification getDocumentIdentification() {
        return documentIdentification;
    }

    /**
     * Sets the value of the documentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification }
     *     
     */
    public void setDocumentIdentification(DocumentIdentification value) {
        this.documentIdentification = value;
    }

    /**
     * Gets the value of the documentManifest property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentManifest }
     *     
     */
    public DocumentManifest getDocumentManifest() {
        return documentManifest;
    }

    /**
     * Sets the value of the documentManifest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentManifest }
     *     
     */
    public void setDocumentManifest(DocumentManifest value) {
        this.documentManifest = value;
    }

    /**
     * Gets the value of the documentSecurity property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentSecurity }
     *     
     */
    public DocumentSecurity getDocumentSecurity() {
        return documentSecurity;
    }

    /**
     * Sets the value of the documentSecurity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentSecurity }
     *     
     */
    public void setDocumentSecurity(DocumentSecurity value) {
        this.documentSecurity = value;
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
