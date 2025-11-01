
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for ProductIdentificationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerProductIdentification" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.07}PartnerProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationInformationType", propOrder = {
    "partnerProductIdentification"
})
public class ProductIdentificationInformationType
    extends ProductIdentificationType
{

    @XmlElement(name = "PartnerProductIdentification")
    protected List<PartnerProductIdentificationType> partnerProductIdentification;

    /**
     * Gets the value of the partnerProductIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProductIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerProductIdentificationType }
     * 
     * 
     */
    public List<PartnerProductIdentificationType> getPartnerProductIdentification() {
        if (partnerProductIdentification == null) {
            partnerProductIdentification = new ArrayList<PartnerProductIdentificationType>();
        }
        return this.partnerProductIdentification;
    }

}
