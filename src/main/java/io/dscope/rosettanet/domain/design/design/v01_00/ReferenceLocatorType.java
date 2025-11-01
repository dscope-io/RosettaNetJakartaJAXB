
package io.dscope.rosettanet.domain.design.design.v01_00;

import java.math.BigInteger;
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


/**
 * <p>Java class for ReferenceLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceLocatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentTypeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileFormatReference" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UrlLegal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Attachment"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}url" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "ReferenceLocatorType", propOrder = {
    "contentTypeReference",
    "fileFormatReference",
    "fileSize",
    "reference",
    "urlLegal",
    "attachment",
    "url"
})
public class ReferenceLocatorType {

    @XmlElement(name = "ContentTypeReference")
    protected String contentTypeReference;
    @XmlElement(name = "FileFormatReference")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileFormatReference;
    @XmlElement(name = "FileSize")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileSize;
    @XmlElement(name = "Reference")
    protected List<String> reference;
    @XmlElement(name = "UrlLegal")
    protected List<String> urlLegal;
    @XmlElementRef(name = "Attachment", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Attachment.class, required = false)
    protected Attachment attachment;
    @XmlElementRef(name = "url", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Url.class, required = false)
    protected List<Url> url;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contentTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentTypeReference() {
        return contentTypeReference;
    }

    /**
     * Sets the value of the contentTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentTypeReference(String value) {
        this.contentTypeReference = value;
    }

    /**
     * Gets the value of the fileFormatReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileFormatReference() {
        return fileFormatReference;
    }

    /**
     * Sets the value of the fileFormatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileFormatReference(BigInteger value) {
        this.fileFormatReference = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReference() {
        if (reference == null) {
            reference = new ArrayList<String>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the urlLegal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlLegal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLegal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrlLegal() {
        if (urlLegal == null) {
            urlLegal = new ArrayList<String>();
        }
        return this.urlLegal;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Url }
     * 
     * 
     */
    public List<Url> getUrl() {
        if (url == null) {
            url = new ArrayList<Url>();
        }
        return this.url;
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
