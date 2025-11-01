
package io.dscope.rosettanet.system.standarddocumentheader.v01_09;

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
import io.dscope.rosettanet.universal.partneridentification.v01_06.PartnerIdentification;


/**
 * <p>Java class for SenderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SenderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09}BusinessServiceInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.02}ContactInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06}PartnerIdentification"/&gt;
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
@XmlType(name = "SenderType", propOrder = {
    "businessServiceInformation",
    "contactInformation",
    "partnerIdentification"
})
public class SenderType {

    @XmlElementRef(name = "BusinessServiceInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.09", type = BusinessServiceInformation.class, required = false)
    protected BusinessServiceInformation businessServiceInformation;
    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.02", type = ContactInformation.class, required = false)
    protected List<ContactInformation> contactInformation;
    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06", type = PartnerIdentification.class)
    protected PartnerIdentification partnerIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessServiceInformation property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessServiceInformation }
     *     
     */
    public BusinessServiceInformation getBusinessServiceInformation() {
        return businessServiceInformation;
    }

    /**
     * Sets the value of the businessServiceInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessServiceInformation }
     *     
     */
    public void setBusinessServiceInformation(BusinessServiceInformation value) {
        this.businessServiceInformation = value;
    }

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
     * Gets the value of the partnerIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentification }
     *     
     */
    public PartnerIdentification getPartnerIdentification() {
        return partnerIdentification;
    }

    /**
     * Sets the value of the partnerIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentification }
     *     
     */
    public void setPartnerIdentification(PartnerIdentification value) {
        this.partnerIdentification = value;
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
