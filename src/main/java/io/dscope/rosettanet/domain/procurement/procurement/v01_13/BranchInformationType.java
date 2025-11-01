
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_04.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for BranchInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BranchInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}CustomerInformation" minOccurs="0"/&gt;
 *         &lt;element name="DistributedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.04}SpecifiedPartnerDescriptionType"/&gt;
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
@XmlType(name = "BranchInformationType", propOrder = {
    "customerInformation",
    "distributedBy"
})
public class BranchInformationType {

    @XmlElementRef(name = "CustomerInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = CustomerInformation.class, required = false)
    protected CustomerInformation customerInformation;
    @XmlElement(name = "DistributedBy", required = true)
    protected SpecifiedPartnerDescriptionType distributedBy;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerInformation }
     *     
     */
    public CustomerInformation getCustomerInformation() {
        return customerInformation;
    }

    /**
     * Sets the value of the customerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerInformation }
     *     
     */
    public void setCustomerInformation(CustomerInformation value) {
        this.customerInformation = value;
    }

    /**
     * Gets the value of the distributedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDistributedBy() {
        return distributedBy;
    }

    /**
     * Sets the value of the distributedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDistributedBy(SpecifiedPartnerDescriptionType value) {
        this.distributedBy = value;
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
