
package io.dscope.rosettanet.universal.partneridentification.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.BillFromType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.BillToType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.InstallAtPartnerType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.RemitToType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.ShipFromPartnerType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.ShipToPartnerLineType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.ShipToPartnerType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.SoldToPartnerType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.TransferToPartnerType;
import io.dscope.rosettanet.domain.procurement.procurement.v01_00.TransportedByPartnerType;


/**
 * <p>Java class for SpecifiedPartnerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecifiedPartnerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedIntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedKnownPartnerContact"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedNewPartner"/&gt;
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
@XmlType(name = "SpecifiedPartnerDescriptionType", propOrder = {
    "specifiedIntermittentPartner",
    "specifiedKnownPartnerContact",
    "specifiedNewPartner"
})
@XmlSeeAlso({
    BillFromType.class,
    BillToType.class,
    InstallAtPartnerType.class,
    RemitToType.class,
    ShipFromPartnerType.class,
    ShipToPartnerType.class,
    ShipToPartnerLineType.class,
    SoldToPartnerType.class,
    TransferToPartnerType.class,
    TransportedByPartnerType.class
})
public class SpecifiedPartnerDescriptionType {

    @XmlElementRef(name = "SpecifiedIntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedIntermittentPartner.class, required = false)
    protected SpecifiedIntermittentPartner specifiedIntermittentPartner;
    @XmlElementRef(name = "SpecifiedKnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedKnownPartnerContact.class, required = false)
    protected SpecifiedKnownPartnerContact specifiedKnownPartnerContact;
    @XmlElementRef(name = "SpecifiedNewPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedNewPartner.class, required = false)
    protected SpecifiedNewPartner specifiedNewPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the specifiedIntermittentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedIntermittentPartner }
     *     
     */
    public SpecifiedIntermittentPartner getSpecifiedIntermittentPartner() {
        return specifiedIntermittentPartner;
    }

    /**
     * Sets the value of the specifiedIntermittentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedIntermittentPartner }
     *     
     */
    public void setSpecifiedIntermittentPartner(SpecifiedIntermittentPartner value) {
        this.specifiedIntermittentPartner = value;
    }

    /**
     * Gets the value of the specifiedKnownPartnerContact property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedKnownPartnerContact }
     *     
     */
    public SpecifiedKnownPartnerContact getSpecifiedKnownPartnerContact() {
        return specifiedKnownPartnerContact;
    }

    /**
     * Sets the value of the specifiedKnownPartnerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedKnownPartnerContact }
     *     
     */
    public void setSpecifiedKnownPartnerContact(SpecifiedKnownPartnerContact value) {
        this.specifiedKnownPartnerContact = value;
    }

    /**
     * Gets the value of the specifiedNewPartner property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedNewPartner }
     *     
     */
    public SpecifiedNewPartner getSpecifiedNewPartner() {
        return specifiedNewPartner;
    }

    /**
     * Sets the value of the specifiedNewPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedNewPartner }
     *     
     */
    public void setSpecifiedNewPartner(SpecifiedNewPartner value) {
        this.specifiedNewPartner = value;
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
