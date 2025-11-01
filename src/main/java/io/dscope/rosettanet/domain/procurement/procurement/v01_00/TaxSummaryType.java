
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.monetaryexpression.v01_00.TaxAmount;


/**
 * <p>Java class for TaxSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}CurrencyConversion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}TaxAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}TaxPhrase" minOccurs="0"/&gt;
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
@XmlType(name = "TaxSummaryType", propOrder = {
    "currencyConversion",
    "monetaryAmount",
    "taxAmount",
    "taxPhrase"
})
public class TaxSummaryType {

    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = CurrencyConversion.class, required = false)
    protected CurrencyConversion currencyConversion;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = MonetaryAmount.class, required = false)
    protected MonetaryAmount monetaryAmount;
    @XmlElementRef(name = "TaxAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0", type = TaxAmount.class, required = false)
    protected List<TaxAmount> taxAmount;
    @XmlElementRef(name = "TaxPhrase", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = TaxPhrase.class, required = false)
    protected TaxPhrase taxPhrase;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the currencyConversion property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyConversion }
     *     
     */
    public CurrencyConversion getCurrencyConversion() {
        return currencyConversion;
    }

    /**
     * Sets the value of the currencyConversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyConversion }
     *     
     */
    public void setCurrencyConversion(CurrencyConversion value) {
        this.currencyConversion = value;
    }

    /**
     * Gets the value of the monetaryAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmount }
     *     
     */
    public MonetaryAmount getMonetaryAmount() {
        return monetaryAmount;
    }

    /**
     * Sets the value of the monetaryAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmount }
     *     
     */
    public void setMonetaryAmount(MonetaryAmount value) {
        this.monetaryAmount = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAmount }
     * 
     * 
     */
    public List<TaxAmount> getTaxAmount() {
        if (taxAmount == null) {
            taxAmount = new ArrayList<TaxAmount>();
        }
        return this.taxAmount;
    }

    /**
     * Gets the value of the taxPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link TaxPhrase }
     *     
     */
    public TaxPhrase getTaxPhrase() {
        return taxPhrase;
    }

    /**
     * Sets the value of the taxPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxPhrase }
     *     
     */
    public void setTaxPhrase(TaxPhrase value) {
        this.taxPhrase = value;
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
