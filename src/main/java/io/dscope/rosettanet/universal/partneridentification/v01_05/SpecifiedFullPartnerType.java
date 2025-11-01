
package io.dscope.rosettanet.universal.partneridentification.v01_05;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.contactinformation.v01_01.ContactInformation;
import io.dscope.rosettanet.universal.locations.v01_02.Location;
import io.dscope.rosettanet.universal.locations.v01_02.PhysicalAddress;


/**
 * <p>Java class for SpecifiedFullPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedFullPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.01}ContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}Location" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05}PartnerIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.02}PhysicalAddress" minOccurs="0"/&gt;
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
@XmlType(name = "SpecifiedFullPartnerType", propOrder = {
    "contactInformation",
    "location",
    "partnerIdentification",
    "physicalAddress"
})
@XmlSeeAlso({
    FullPartnerType.class
})
public class SpecifiedFullPartnerType {

    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.01", type = ContactInformation.class, required = false)
    protected List<ContactInformation> contactInformation;
    @XmlElementRef(name = "Location", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = Location.class, required = false)
    protected Location location;
    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05", type = PartnerIdentification.class, required = false)
    protected List<PartnerIdentification> partnerIdentification;
    @XmlElementRef(name = "PhysicalAddress", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.02", type = PhysicalAddress.class, required = false)
    protected PhysicalAddress physicalAddress;
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
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the partnerIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerIdentification }
     * 
     * 
     */
    public List<PartnerIdentification> getPartnerIdentification() {
        if (partnerIdentification == null) {
            partnerIdentification = new ArrayList<PartnerIdentification>();
        }
        return this.partnerIdentification;
    }

    /**
     * Gets the value of the physicalAddress property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalAddress }
     *     
     */
    public PhysicalAddress getPhysicalAddress() {
        return physicalAddress;
    }

    /**
     * Sets the value of the physicalAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalAddress }
     *     
     */
    public void setPhysicalAddress(PhysicalAddress value) {
        this.physicalAddress = value;
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
