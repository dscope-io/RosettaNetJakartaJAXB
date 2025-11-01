
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_02;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.design.design.v01_05.ReferenceLocator;


/**
 * <p>Java class for ProductInformationObjectType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationObjectType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentTypeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}NoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/&gt;
 *         &lt;element name="ModificationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}ReferenceLocator" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
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
@XmlType(name = "ProductInformationObjectType", propOrder = {
    "contentTypeReference",
    "descriptionNote",
    "effectiveDate",
    "identifier",
    "modificationDate",
    "name",
    "referenceLocator",
    "version"
})
public class ProductInformationObjectType {

    @XmlElement(name = "ContentTypeReference")
    protected String contentTypeReference;
    @XmlElement(name = "DescriptionNote")
    protected List<String> descriptionNote;
    @XmlElement(name = "EffectiveDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar effectiveDate;
    @XmlElement(name = "Identifier", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger identifier;
    @XmlElement(name = "ModificationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modificationDate;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElementRef(name = "ReferenceLocator", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = ReferenceLocator.class, required = false)
    protected ReferenceLocator referenceLocator;
    @XmlElement(name = "Version")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger version;
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
     * Gets the value of the descriptionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the descriptionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescriptionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDescriptionNote() {
        if (descriptionNote == null) {
            descriptionNote = new ArrayList<String>();
        }
        return this.descriptionNote;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveDate(XMLGregorianCalendar value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentifier(BigInteger value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the modificationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDate() {
        return modificationDate;
    }

    /**
     * Sets the value of the modificationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDate(XMLGregorianCalendar value) {
        this.modificationDate = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the referenceLocator property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceLocator }
     *     
     */
    public ReferenceLocator getReferenceLocator() {
        return referenceLocator;
    }

    /**
     * Sets the value of the referenceLocator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceLocator }
     *     
     */
    public void setReferenceLocator(ReferenceLocator value) {
        this.referenceLocator = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setVersion(BigInteger value) {
        this.version = value;
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
