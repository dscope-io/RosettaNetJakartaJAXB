
package io.dscope.rosettanet.system.standarddocumentheader.v01_24;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.language.v01_02.LanguageType;
import io.dscope.rosettanet.universal.codelist.mimetypequalifier.v01_02.MimeTypeQualifierType;


/**
 * <p>Java class for ManifestItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManifestItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Language" type="{urn:rosettanet:specification:universal:Language:xsd:codelist:01.02}LanguageType" minOccurs="0"/&gt;
 *         &lt;element name="Length" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="MimeTypeQualifier" type="{urn:rosettanet:specification:universal:MimeTypeQualifier:xsd:codelist:01.02}MimeTypeQualifierType"/&gt;
 *         &lt;element name="UniversalResourceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ManifestItemType", propOrder = {
    "description",
    "language",
    "length",
    "mimeTypeQualifier",
    "universalResourceIdentifier"
})
public class ManifestItemType {

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Language")
    protected LanguageType language;
    @XmlElement(name = "Length")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger length;
    @XmlElement(name = "MimeTypeQualifier", required = true)
    protected MimeTypeQualifierType mimeTypeQualifier;
    @XmlElement(name = "UniversalResourceIdentifier", required = true)
    protected String universalResourceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link LanguageType }
     *     
     */
    public LanguageType getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link LanguageType }
     *     
     */
    public void setLanguage(LanguageType value) {
        this.language = value;
    }

    /**
     * Gets the value of the length property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLength() {
        return length;
    }

    /**
     * Sets the value of the length property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLength(BigInteger value) {
        this.length = value;
    }

    /**
     * Gets the value of the mimeTypeQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link MimeTypeQualifierType }
     *     
     */
    public MimeTypeQualifierType getMimeTypeQualifier() {
        return mimeTypeQualifier;
    }

    /**
     * Sets the value of the mimeTypeQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link MimeTypeQualifierType }
     *     
     */
    public void setMimeTypeQualifier(MimeTypeQualifierType value) {
        this.mimeTypeQualifier = value;
    }

    /**
     * Gets the value of the universalResourceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniversalResourceIdentifier() {
        return universalResourceIdentifier;
    }

    /**
     * Sets the value of the universalResourceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniversalResourceIdentifier(String value) {
        this.universalResourceIdentifier = value;
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
