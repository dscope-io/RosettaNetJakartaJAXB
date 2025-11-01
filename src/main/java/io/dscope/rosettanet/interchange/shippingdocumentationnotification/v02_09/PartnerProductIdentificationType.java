
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.PhysicalDimension;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerIdentification;


/**
 * <p>Java class for PartnerProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerProductIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}PhysicalDimension" minOccurs="0"/&gt;
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
@XmlType(name = "PartnerProductIdentificationType", propOrder = {
    "partnerIdentification",
    "physicalDimension"
})
public class PartnerProductIdentificationType {

    @XmlElementRef(name = "PartnerIdentification", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerIdentification.class)
    protected PartnerIdentification partnerIdentification;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimension }
     *     
     */
    public PhysicalDimension getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimension }
     *     
     */
    public void setPhysicalDimension(PhysicalDimension value) {
        this.physicalDimension = value;
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
