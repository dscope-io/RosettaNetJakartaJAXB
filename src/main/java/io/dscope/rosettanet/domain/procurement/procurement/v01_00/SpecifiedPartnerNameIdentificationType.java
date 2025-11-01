
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
import io.dscope.rosettanet.universal.partneridentification.v01_00.SpecifiedKnownPartner;


/**
 * <p>Java class for SpecifiedPartnerNameIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerNameIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}PartnerName"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedKnownPartner"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "SpecifiedPartnerNameIdentificationType", propOrder = {
    "partnerName",
    "specifiedKnownPartner"
})
@XmlSeeAlso({
    InstallAtSubLineType.class
})
public class SpecifiedPartnerNameIdentificationType {

    @XmlElementRef(name = "PartnerName", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = PartnerName.class, required = false)
    protected PartnerName partnerName;
    @XmlElementRef(name = "SpecifiedKnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedKnownPartner.class, required = false)
    protected SpecifiedKnownPartner specifiedKnownPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerName }
     *     
     */
    public PartnerName getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerName }
     *     
     */
    public void setPartnerName(PartnerName value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the specifiedKnownPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartner }
     *     
     */
    public SpecifiedKnownPartner getSpecifiedKnownPartner() {
        return specifiedKnownPartner;
    }

    /**
     * Sets the value of the specifiedKnownPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartner }
     *     
     */
    public void setSpecifiedKnownPartner(SpecifiedKnownPartner value) {
        this.specifiedKnownPartner = value;
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
