
package io.dscope.rosettanet.universal.partneridentification.v01_06;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_02.ContactInformation;


/**
 * <p>Java class for KnownPartnerContactType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnownPartnerContactType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.02}ContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}KnownPartner"/&gt;
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
@XmlType(name = "KnownPartnerContactType", propOrder = {
    "contactInformation",
    "knownPartner"
})
public class KnownPartnerContactType {

    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.02", type = ContactInformation.class, required = false)
    protected List<ContactInformation> contactInformation;
    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = KnownPartner.class)
    protected KnownPartner knownPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contactInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactInformation }
     * 
     * 
     */
    public List<ContactInformation> getContactInformation() {
        if (contactInformation == null) {
            contactInformation = new ArrayList<ContactInformation>();
        }
        return this.contactInformation;
    }

    /**
     * Gets the value of the knownPartner property.
     * 
     * @return
     *     possible object is
     *     {@link KnownPartner }
     *     
     */
    public KnownPartner getKnownPartner() {
        return knownPartner;
    }

    /**
     * Sets the value of the knownPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownPartner }
     *     
     */
    public void setKnownPartner(KnownPartner value) {
        this.knownPartner = value;
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
