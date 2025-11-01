
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.SpecialPrice;


/**
 * <p>Java class for SpecialPriceClaimType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SpecialPriceClaimType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DebitMemoNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceQuallifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceValue" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}SpecialPrice"/&gt;
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
@XmlType(name = "SpecialPriceClaimType", propOrder = {
    "authorizationNumber",
    "comments",
    "debitMemoNumber",
    "identifier",
    "referenceQuallifier",
    "referenceValue",
    "specialPrice"
})
public class SpecialPriceClaimType {

    @XmlElement(name = "AuthorizationNumber")
    protected String authorizationNumber;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DebitMemoNumber")
    protected String debitMemoNumber;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElement(name = "ReferenceQuallifier")
    protected List<String> referenceQuallifier;
    @XmlElement(name = "ReferenceValue")
    protected List<String> referenceValue;
    @XmlElementRef(name = "SpecialPrice", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = SpecialPrice.class)
    protected SpecialPrice specialPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationNumber() {
        return authorizationNumber;
    }

    /**
     * Sets the value of the authorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationNumber(String value) {
        this.authorizationNumber = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the debitMemoNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitMemoNumber() {
        return debitMemoNumber;
    }

    /**
     * Sets the value of the debitMemoNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitMemoNumber(String value) {
        this.debitMemoNumber = value;
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
     * Gets the value of the referenceQuallifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceQuallifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceQuallifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceQuallifier() {
        if (referenceQuallifier == null) {
            referenceQuallifier = new ArrayList<String>();
        }
        return this.referenceQuallifier;
    }

    /**
     * Gets the value of the referenceValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the referenceValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReferenceValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReferenceValue() {
        if (referenceValue == null) {
            referenceValue = new ArrayList<String>();
        }
        return this.referenceValue;
    }

    /**
     * Gets the value of the specialPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialPrice }
     *     
     */
    public SpecialPrice getSpecialPrice() {
        return specialPrice;
    }

    /**
     * Sets the value of the specialPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialPrice }
     *     
     */
    public void setSpecialPrice(SpecialPrice value) {
        this.specialPrice = value;
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
