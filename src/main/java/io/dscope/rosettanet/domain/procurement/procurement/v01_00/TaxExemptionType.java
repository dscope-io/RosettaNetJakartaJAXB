
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
import io.dscope.rosettanet.domain.procurement.codelist.taxexemptioncode.v01_00.TaxExemptionCode;


/**
 * <p>Java class for TaxExemptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:1.0}TaxExemptionCode"/&gt;
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
@XmlType(name = "TaxExemptionType", propOrder = {
    "certificationIdentifier",
    "taxExemptionCode"
})
public class TaxExemptionType {

    @XmlElement(name = "CertificationIdentifier", required = true)
    protected String certificationIdentifier;
    @XmlElementRef(name = "TaxExemptionCode", namespace = "urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:1.0", type = TaxExemptionCode.class)
    protected TaxExemptionCode taxExemptionCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the certificationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificationIdentifier() {
        return certificationIdentifier;
    }

    /**
     * Sets the value of the certificationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificationIdentifier(String value) {
        this.certificationIdentifier = value;
    }

    /**
     * Gets the value of the taxExemptionCode property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptionCode }
     *     
     */
    public TaxExemptionCode getTaxExemptionCode() {
        return taxExemptionCode;
    }

    /**
     * Sets the value of the taxExemptionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptionCode }
     *     
     */
    public void setTaxExemptionCode(TaxExemptionCode value) {
        this.taxExemptionCode = value;
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
