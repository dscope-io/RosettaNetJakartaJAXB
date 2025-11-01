
package io.dscope.rosettanet.universal.monetaryexpression.v01_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.taxtype.v01_02.TaxType;


/**
 * <p>Java class for TaxAmountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxAmountType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02}FinancialAmount"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02}TaxJurisdiction" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02}TaxType"/&gt;
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
@XmlType(name = "TaxAmountType", propOrder = {
    "financialAmount",
    "taxJurisdiction",
    "taxType"
})
public class TaxAmountType {

    @XmlElementRef(name = "FinancialAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02", type = FinancialAmount.class)
    protected FinancialAmount financialAmount;
    @XmlElementRef(name = "TaxJurisdiction", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02", type = TaxJurisdiction.class, required = false)
    protected TaxJurisdiction taxJurisdiction;
    @XmlElementRef(name = "TaxType", namespace = "urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02", type = TaxType.class)
    protected TaxType taxType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the financialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmount }
     *     
     */
    public FinancialAmount getFinancialAmount() {
        return financialAmount;
    }

    /**
     * Sets the value of the financialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmount }
     *     
     */
    public void setFinancialAmount(FinancialAmount value) {
        this.financialAmount = value;
    }

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
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link TaxType }
     *     
     */
    public TaxType getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxType }
     *     
     */
    public void setTaxType(TaxType value) {
        this.taxType = value;
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
