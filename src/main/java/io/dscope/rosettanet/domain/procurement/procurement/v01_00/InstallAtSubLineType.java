
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.contactinformation.v01_00.ContactInformation;


/**
 * <p>Java class for InstallAtSubLineType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InstallAtSubLineType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}SpecifiedPartnerNameIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0}ContactInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallAtSubLineType", propOrder = {
    "contactInformation"
})
public class InstallAtSubLineType
    extends SpecifiedPartnerNameIdentificationType
{

    @XmlElementRef(name = "ContactInformation", namespace = "urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0", type = ContactInformation.class, required = false)
    protected ContactInformation contactInformation;

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

}
