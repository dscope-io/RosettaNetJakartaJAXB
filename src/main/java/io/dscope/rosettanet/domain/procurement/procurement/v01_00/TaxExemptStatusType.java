
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


/**
 * <p>Java class for TaxExemptStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxExemptStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsTaxExempt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}TaxExemption" minOccurs="0"/&gt;
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
@XmlType(name = "TaxExemptStatusType", propOrder = {
    "isTaxExempt",
    "taxExemption"
})
public class TaxExemptStatusType {

    @XmlElement(name = "IsTaxExempt")
    protected boolean isTaxExempt;
    @XmlElementRef(name = "TaxExemption", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = TaxExemption.class, required = false)
    protected TaxExemption taxExemption;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isTaxExempt property.
     * 
     */
    public boolean isIsTaxExempt() {
        return isTaxExempt;
    }

    /**
     * Sets the value of the isTaxExempt property.
     * 
     */
    public void setIsTaxExempt(boolean value) {
        this.isTaxExempt = value;
    }

    /**
     * Gets the value of the taxExemption property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemption }
     *     
     */
    public TaxExemption getTaxExemption() {
        return taxExemption;
    }

    /**
     * Sets the value of the taxExemption property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemption }
     *     
     */
    public void setTaxExemption(TaxExemption value) {
        this.taxExemption = value;
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
