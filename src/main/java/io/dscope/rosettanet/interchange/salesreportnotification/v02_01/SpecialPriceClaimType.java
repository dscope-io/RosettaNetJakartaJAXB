
package io.dscope.rosettanet.interchange.salesreportnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.SpecialPrice;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


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
 *         &lt;element name="DebitMemo" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceValue" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}SpecialPrice" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaim" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaimQualifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SpecialPriceClaimType", propOrder = {
    "authorizationNumber",
    "comments",
    "debitMemo",
    "referenceValue",
    "specialPrice",
    "specialPriceClaim",
    "specialPriceClaimQualifier"
})
public class SpecialPriceClaimType {

    @XmlElement(name = "AuthorizationNumber")
    protected String authorizationNumber;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElement(name = "DebitMemo")
    protected BusinessDocumentReferenceType debitMemo;
    @XmlElement(name = "ReferenceValue")
    protected List<BusinessDocumentReferenceType> referenceValue;
    @XmlElementRef(name = "SpecialPrice", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = SpecialPrice.class, required = false)
    protected SpecialPrice specialPrice;
    @XmlElement(name = "SpecialPriceClaim")
    protected BusinessDocumentReferenceType specialPriceClaim;
    @XmlElement(name = "SpecialPriceClaimQualifier")
    protected List<BusinessDocumentReferenceType> specialPriceClaimQualifier;
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
     * Gets the value of the debitMemo property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getDebitMemo() {
        return debitMemo;
    }

    /**
     * Sets the value of the debitMemo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setDebitMemo(BusinessDocumentReferenceType value) {
        this.debitMemo = value;
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
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getReferenceValue() {
        if (referenceValue == null) {
            referenceValue = new ArrayList<BusinessDocumentReferenceType>();
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
     * Gets the value of the specialPriceClaim property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getSpecialPriceClaim() {
        return specialPriceClaim;
    }

    /**
     * Sets the value of the specialPriceClaim property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setSpecialPriceClaim(BusinessDocumentReferenceType value) {
        this.specialPriceClaim = value;
    }

    /**
     * Gets the value of the specialPriceClaimQualifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPriceClaimQualifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPriceClaimQualifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getSpecialPriceClaimQualifier() {
        if (specialPriceClaimQualifier == null) {
            specialPriceClaimQualifier = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.specialPriceClaimQualifier;
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
