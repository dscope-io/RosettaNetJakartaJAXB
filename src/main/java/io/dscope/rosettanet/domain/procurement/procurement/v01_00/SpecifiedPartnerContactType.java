
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_00.ContactInformation;


/**
 * <p>Java class for SpecifiedPartnerContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0}ContactInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}SpecifiedPartnerLocation"/&gt;
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
@XmlType(name = "SpecifiedPartnerContactType", propOrder = {
    "contactInformation",
    "specifiedPartnerLocation"
})
@XmlSeeAlso({
    InstallAtPartnerLineType.class,
    ShipToPartnerSubLineType.class
})
public class SpecifiedPartnerContactType {

    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0", type = ContactInformation.class, required = false)
    protected ContactInformation contactInformation;
    @XmlElementRef(name = "SpecifiedPartnerLocation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = SpecifiedPartnerLocation.class)
    protected SpecifiedPartnerLocation specifiedPartnerLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contactInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInformation }
     *     
     */
    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    /**
     * Sets the value of the contactInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformation }
     *     
     */
    public void setContactInformation(ContactInformation value) {
        this.contactInformation = value;
    }

    /**
     * Gets the value of the specifiedPartnerLocation property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerLocation }
     *     
     */
    public SpecifiedPartnerLocation getSpecifiedPartnerLocation() {
        return specifiedPartnerLocation;
    }

    /**
     * Sets the value of the specifiedPartnerLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerLocation }
     *     
     */
    public void setSpecifiedPartnerLocation(SpecifiedPartnerLocation value) {
        this.specifiedPartnerLocation = value;
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
