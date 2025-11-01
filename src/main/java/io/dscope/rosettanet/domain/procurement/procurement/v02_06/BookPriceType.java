
package io.dscope.rosettanet.domain.procurement.procurement.v02_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.bookpricequalifier.v01_04.BookPriceQualifier;
import io.dscope.rosettanet.universal.monetaryexpression.v01_02.FinancialAmount;


/**
 * <p>Java class for BookPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BookPriceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.04}BookPriceQualifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02}FinancialAmount"/&gt;
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
@XmlType(name = "BookPriceType", propOrder = {
    "bookPriceQualifier",
    "financialAmount"
})
public class BookPriceType {

    @XmlElementRef(name = "BookPriceQualifier", namespace = "urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.04", type = BookPriceQualifier.class)
    protected BookPriceQualifier bookPriceQualifier;
    @XmlElementRef(name = "FinancialAmount", namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02", type = FinancialAmount.class)
    protected FinancialAmount financialAmount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bookPriceQualifier property.
     * 
     * @return
     *     possible object is
     *     {@link BookPriceQualifier }
     *     
     */
    public BookPriceQualifier getBookPriceQualifier() {
        return bookPriceQualifier;
    }

    /**
     * Sets the value of the bookPriceQualifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookPriceQualifier }
     *     
     */
    public void setBookPriceQualifier(BookPriceQualifier value) {
        this.bookPriceQualifier = value;
    }

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
