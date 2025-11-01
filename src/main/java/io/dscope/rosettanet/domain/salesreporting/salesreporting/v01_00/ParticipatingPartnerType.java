
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.monetaryexpression.v01_00.TaxJurisdiction;
import io.dscope.rosettanet.universal.partneridentification.v01_00.IntermittentPartner;
import io.dscope.rosettanet.universal.partneridentification.v01_00.KnownPartner;


/**
 * <p>Java class for ParticipatingPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipatingPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}TaxJurisdiction" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}IntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}KnownPartner"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipatingPartnerType", propOrder = {
    "taxJurisdiction",
    "intermittentPartner",
    "knownPartner"
})
public class ParticipatingPartnerType {

    @XmlElementRef(name = "TaxJurisdiction", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0", type = TaxJurisdiction.class, required = false)
    protected TaxJurisdiction taxJurisdiction;
    @XmlElementRef(name = "IntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = IntermittentPartner.class, required = false)
    protected IntermittentPartner intermittentPartner;
    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = KnownPartner.class, required = false)
    protected KnownPartner knownPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the taxJurisdiction property.
     * 
     * @return
     *     possible object is
     *     {@link TaxJurisdiction }
     *     
     */
    public TaxJurisdiction getTaxJurisdiction() {
        return taxJurisdiction;
    }

    /**
     * Sets the value of the taxJurisdiction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxJurisdiction }
     *     
     */
    public void setTaxJurisdiction(TaxJurisdiction value) {
        this.taxJurisdiction = value;
    }

    /**
     * Gets the value of the intermittentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link IntermittentPartner }
     *     
     */
    public IntermittentPartner getIntermittentPartner() {
        return intermittentPartner;
    }

    /**
     * Sets the value of the intermittentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermittentPartner }
     *     
     */
    public void setIntermittentPartner(IntermittentPartner value) {
        this.intermittentPartner = value;
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
