
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.service.codelist.contactpreference.v01_01.ContactPreference;
import io.dscope.rosettanet.universal.contactinformation.v01_04.ContactInformationType;


/**
 * <p>Java class for CRContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CRContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.04}ContactInformationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AltPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CaseOwner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01}ContactPreference" minOccurs="0"/&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRContactType", propOrder = {
    "address",
    "altPhone",
    "caseOwner",
    "contactPreference",
    "id"
})
public class CRContactType
    extends ContactInformationType
{

    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "AltPhone")
    protected String altPhone;
    @XmlElement(name = "CaseOwner", required = true)
    protected String caseOwner;
    @XmlElementRef(name = "ContactPreference", namespace = "urn:rosettanet:specification:domain:Service:ContactPreference:xsd:codelist:01.01", type = ContactPreference.class, required = false)
    protected ContactPreference contactPreference;
    @XmlElement(name = "Id")
    protected String id;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the altPhone property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAltPhone() {
        return altPhone;
    }

    /**
     * Sets the value of the altPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAltPhone(String value) {
        this.altPhone = value;
    }

    /**
     * Gets the value of the caseOwner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaseOwner() {
        return caseOwner;
    }

    /**
     * Sets the value of the caseOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaseOwner(String value) {
        this.caseOwner = value;
    }

    /**
     * Gets the value of the contactPreference property.
     * 
     * @return
     *     possible object is
     *     {@link ContactPreference }
     *     
     */
    public ContactPreference getContactPreference() {
        return contactPreference;
    }

    /**
     * Sets the value of the contactPreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPreference }
     *     
     */
    public void setContactPreference(ContactPreference value) {
        this.contactPreference = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
