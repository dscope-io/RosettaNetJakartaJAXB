
package io.dscope.rosettanet.domain.procurement.procurement.v01_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.codelist.creditcardclassification.v01_02.CreditCardClassification;


/**
 * <p>Java class for CreditCardType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreditCardType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CardHolderName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CidIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.02}CreditCardClassification"/&gt;
 *         &lt;element name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "CreditCardType", propOrder = {
    "cardHolderName",
    "cidIdentifier",
    "creditCardClassification",
    "expiryDate",
    "identifier"
})
public class CreditCardType {

    @XmlElement(name = "CardHolderName", required = true)
    protected String cardHolderName;
    @XmlElement(name = "CidIdentifier")
    protected String cidIdentifier;
    @XmlElementRef(name = "CreditCardClassification", namespace = "urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.02", type = CreditCardClassification.class)
    protected CreditCardClassification creditCardClassification;
    @XmlElement(name = "ExpiryDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expiryDate;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cardHolderName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * Sets the value of the cardHolderName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * Gets the value of the cidIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCidIdentifier() {
        return cidIdentifier;
    }

    /**
     * Sets the value of the cidIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCidIdentifier(String value) {
        this.cidIdentifier = value;
    }

    /**
     * Gets the value of the creditCardClassification property.
     * 
     * @return
     *     possible object is
     *     {@link CreditCardClassification }
     *     
     */
    public CreditCardClassification getCreditCardClassification() {
        return creditCardClassification;
    }

    /**
     * Sets the value of the creditCardClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardClassification }
     *     
     */
    public void setCreditCardClassification(CreditCardClassification value) {
        this.creditCardClassification = value;
    }

    /**
     * Gets the value of the expiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * Sets the value of the expiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
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
