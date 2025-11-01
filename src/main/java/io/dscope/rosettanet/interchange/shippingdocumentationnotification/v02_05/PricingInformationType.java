
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.CurrencyConversion;
import io.dscope.rosettanet.domain.shared.shared.v01_12.MonetaryAmount;
import io.dscope.rosettanet.domain.shared.shared.v01_12.Rate;


/**
 * <p>Java class for PricingInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PricingInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}CurrencyConversion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}Rate" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PricingInformationType", propOrder = {
    "currencyConversion",
    "monetaryAmount",
    "rate"
})
public class PricingInformationType {

    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = CurrencyConversion.class, required = false)
    protected CurrencyConversion currencyConversion;
    @XmlElementRef(name = "MonetaryAmount", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = MonetaryAmount.class, required = false)
    protected List<MonetaryAmount> monetaryAmount;
    @XmlElementRef(name = "Rate", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = Rate.class, required = false)
    protected List<Rate> rate;
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
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monetaryAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonetaryAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAmount }
     * 
     * 
     */
    public List<MonetaryAmount> getMonetaryAmount() {
        if (monetaryAmount == null) {
            monetaryAmount = new ArrayList<MonetaryAmount>();
        }
        return this.monetaryAmount;
    }

    /**
     * Gets the value of the rate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rate }
     * 
     * 
     */
    public List<Rate> getRate() {
        if (rate == null) {
            rate = new ArrayList<Rate>();
        }
        return this.rate;
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
