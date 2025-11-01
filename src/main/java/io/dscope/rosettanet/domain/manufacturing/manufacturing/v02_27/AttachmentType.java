
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_03.AttachmentDescription;
import io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02.MimeTypeQualifier;


/**
 * <p>Java class for AttachmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AttachmentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:01.03}AttachmentDescription" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02}MimeTypeQualifier"/&gt;
 *         &lt;element name="UniversalResourceLocator" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "AttachmentType", propOrder = {
    "attachmentDescription",
    "description",
    "mimeTypeQualifier",
    "universalResourceLocator"
})
public class AttachmentType {

    @XmlElementRef(name = "AttachmentDescription", namespace = "urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:01.03", type = AttachmentDescription.class, required = false)
    protected AttachmentDescription attachmentDescription;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElementRef(name = "MimeTypeQualifier", namespace = "urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02", type = MimeTypeQualifier.class)
    protected MimeTypeQualifier mimeTypeQualifier;
    @XmlElement(name = "UniversalResourceLocator", required = true)
    protected String universalResourceLocator;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the attachmentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentDescription }
     *     
     */
    public AttachmentDescription getAttachmentDescription() {
        return attachmentDescription;
    }

    /**
     * Sets the value of the attachmentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentDescription }
     *     
     */
    public void setAttachmentDescription(AttachmentDescription value) {
        this.attachmentDescription = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the mimeTypeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeQualifier }
     *     
     */
    public MimeTypeQualifier getMimeTypeQualifier() {
        return mimeTypeQualifier;
    }

    /**
     * Sets the value of the mimeTypeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeQualifier }
     *     
     */
    public void setMimeTypeQualifier(MimeTypeQualifier value) {
        this.mimeTypeQualifier = value;
    }

    /**
     * Gets the value of the universalResourceLocator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalResourceLocator() {
        return universalResourceLocator;
    }

    /**
     * Sets the value of the universalResourceLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalResourceLocator(String value) {
        this.universalResourceLocator = value;
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
