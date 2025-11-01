
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_03.ContactInformationType;


/**
 * <p>Java class for ProductProviderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductProviderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderCommentsType" minOccurs="0"/&gt;
 *         &lt;element name="FieldApplicationEngineer" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType" minOccurs="0"/&gt;
 *         &lt;element name="SalesRepresentative" type="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.03}ContactInformationType" minOccurs="0"/&gt;
 *         &lt;element name="TrackingIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ProductProviderInformationType", propOrder = {
    "comments",
    "fieldApplicationEngineer",
    "salesRepresentative",
    "trackingIdentifier"
})
public class ProductProviderInformationType {

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "FieldApplicationEngineer")
    protected ContactInformationType fieldApplicationEngineer;
    @XmlElement(name = "SalesRepresentative")
    protected ContactInformationType salesRepresentative;
    @XmlElement(name = "TrackingIdentifier", required = true)
    protected String trackingIdentifier;
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
     * Gets the value of the fieldApplicationEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getFieldApplicationEngineer() {
        return fieldApplicationEngineer;
    }

    /**
     * Sets the value of the fieldApplicationEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setFieldApplicationEngineer(ContactInformationType value) {
        this.fieldApplicationEngineer = value;
    }

    /**
     * Gets the value of the salesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationType }
     *     
     */
    public ContactInformationType getSalesRepresentative() {
        return salesRepresentative;
    }

    /**
     * Sets the value of the salesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationType }
     *     
     */
    public void setSalesRepresentative(ContactInformationType value) {
        this.salesRepresentative = value;
    }

    /**
     * Gets the value of the trackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingIdentifier() {
        return trackingIdentifier;
    }

    /**
     * Sets the value of the trackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingIdentifier(String value) {
        this.trackingIdentifier = value;
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
