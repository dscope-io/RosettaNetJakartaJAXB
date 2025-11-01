
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

import java.util.ArrayList;
import java.util.List;
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
 * <p>Java class for TaxSummaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxSummaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CityTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}TaxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}CurrencyConversion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}MonetaryAmount" minOccurs="0"/&gt;
 *         &lt;element name="NationalTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}TaxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RegionalTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}TaxInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}TaxPhrase" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "cityTax",
    "currencyConversion",
    "monetaryAmount",
    "nationalTax",
    "regionalTax",
    "taxPhrase"
})
public class TaxSummaryType {

    @XmlElement(name = "CityTax")
    protected List<TaxInformationType> cityTax;
    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = CurrencyConversion.class, required = false)
    protected CurrencyConversion currencyConversion;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = MonetaryAmount.class, required = false)
    protected MonetaryAmount monetaryAmount;
    @XmlElement(name = "NationalTax")
    protected List<TaxInformationType> nationalTax;
    @XmlElement(name = "RegionalTax")
    protected List<TaxInformationType> regionalTax;
    @XmlElementRef(name = "TaxPhrase", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = TaxPhrase.class, required = false)
    protected List<TaxPhrase> taxPhrase;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cityTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cityTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCityTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getCityTax() {
        if (cityTax == null) {
            cityTax = new ArrayList<TaxInformationType>();
        }
        return this.cityTax;
    }

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
     * Gets the value of the nationalTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getNationalTax() {
        if (nationalTax == null) {
            nationalTax = new ArrayList<TaxInformationType>();
        }
        return this.nationalTax;
    }

    /**
     * Gets the value of the regionalTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the regionalTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegionalTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxInformationType }
     * 
     * 
     */
    public List<TaxInformationType> getRegionalTax() {
        if (regionalTax == null) {
            regionalTax = new ArrayList<TaxInformationType>();
        }
        return this.regionalTax;
    }

    /**
     * Gets the value of the taxPhrase property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxPhrase property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxPhrase().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxPhrase }
     * 
     * 
     */
    public List<TaxPhrase> getTaxPhrase() {
        if (taxPhrase == null) {
            taxPhrase = new ArrayList<TaxPhrase>();
        }
        return this.taxPhrase;
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
