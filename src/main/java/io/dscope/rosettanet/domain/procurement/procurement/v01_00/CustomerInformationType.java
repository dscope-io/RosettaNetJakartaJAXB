
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.customertype.v01_00.CustomerType;


/**
 * <p>Java class for CustomerInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:1.0}CustomerType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}PartnerDescriptionTax"/&gt;
 *         &lt;element name="ProjectIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustomerInformationType", propOrder = {
    "customerType",
    "partnerDescriptionTax",
    "projectIdentifier"
})
public class CustomerInformationType {

    @XmlElementRef(name = "CustomerType", namespace = "urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:1.0", type = CustomerType.class)
    protected CustomerType customerType;
    @XmlElementRef(name = "PartnerDescriptionTax", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = PartnerDescriptionTax.class)
    protected PartnerDescriptionTax partnerDescriptionTax;
    @XmlElement(name = "ProjectIdentifier")
    protected String projectIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerType property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomerType(CustomerType value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the partnerDescriptionTax property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionTax }
     *     
     */
    public PartnerDescriptionTax getPartnerDescriptionTax() {
        return partnerDescriptionTax;
    }

    /**
     * Sets the value of the partnerDescriptionTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionTax }
     *     
     */
    public void setPartnerDescriptionTax(PartnerDescriptionTax value) {
        this.partnerDescriptionTax = value;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectIdentifier(String value) {
        this.projectIdentifier = value;
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
