
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ForeignCurrencyControl;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ShippingDocumentReference;
import io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00.DeliveryType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for DeclarationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeclarationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AmendmentInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}AmendmentInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DateInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}DateInformationType" minOccurs="0"/&gt;
 *         &lt;element name="Declarant" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="DeclarationFormReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00}DeliveryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ForeignCurrencyControl" minOccurs="0"/&gt;
 *         &lt;element name="FundTransferFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsGoodsStoredInFreeTradeZone" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsInformationComplete" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsSupplierOfGoods" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="MessageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PreDeclarationIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Purpose" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ShippingDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TradeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DeclarationInformationType", propOrder = {
    "amendmentInformation",
    "businessDocumentReference",
    "dateInformation",
    "declarant",
    "declarationFormReference",
    "deliveryType",
    "foreignCurrencyControl",
    "fundTransferFrom",
    "isGoodsStoredInFreeTradeZone",
    "isInformationComplete",
    "isSupplierOfGoods",
    "messageType",
    "partnerDescription",
    "paymentDescription",
    "preDeclarationIdentifier",
    "purpose",
    "shippingDocumentReference",
    "tradeType"
})
public class DeclarationInformationType {

    @XmlElement(name = "AmendmentInformation")
    protected AmendmentInformationType amendmentInformation;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DateInformation")
    protected DateInformationType dateInformation;
    @XmlElement(name = "Declarant", required = true)
    protected SpecifiedPartnerDescriptionType declarant;
    @XmlElement(name = "DeclarationFormReference")
    protected List<BusinessDocumentReferenceType> declarationFormReference;
    @XmlElementRef(name = "DeliveryType", namespace = "urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", type = DeliveryType.class, required = false)
    protected DeliveryType deliveryType;
    @XmlElementRef(name = "ForeignCurrencyControl", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ForeignCurrencyControl.class, required = false)
    protected ForeignCurrencyControl foreignCurrencyControl;
    @XmlElement(name = "FundTransferFrom")
    protected String fundTransferFrom;
    @XmlElement(name = "IsGoodsStoredInFreeTradeZone")
    protected Boolean isGoodsStoredInFreeTradeZone;
    @XmlElement(name = "IsInformationComplete")
    protected Boolean isInformationComplete;
    @XmlElement(name = "IsSupplierOfGoods")
    protected Boolean isSupplierOfGoods;
    @XmlElement(name = "MessageType")
    protected String messageType;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "PaymentDescription")
    protected String paymentDescription;
    @XmlElement(name = "PreDeclarationIdentifier")
    protected String preDeclarationIdentifier;
    @XmlElement(name = "Purpose")
    protected List<String> purpose;
    @XmlElementRef(name = "ShippingDocumentReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ShippingDocumentReference.class, required = false)
    protected List<ShippingDocumentReference> shippingDocumentReference;
    @XmlElement(name = "TradeType")
    protected String tradeType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the amendmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link AmendmentInformationType }
     *     
     */
    public AmendmentInformationType getAmendmentInformation() {
        return amendmentInformation;
    }

    /**
     * Sets the value of the amendmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmendmentInformationType }
     *     
     */
    public void setAmendmentInformation(AmendmentInformationType value) {
        this.amendmentInformation = value;
    }

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformationType }
     *     
     */
    public DateInformationType getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformationType }
     *     
     */
    public void setDateInformation(DateInformationType value) {
        this.dateInformation = value;
    }

    /**
     * Gets the value of the declarant property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDeclarant() {
        return declarant;
    }

    /**
     * Sets the value of the declarant property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDeclarant(SpecifiedPartnerDescriptionType value) {
        this.declarant = value;
    }

    /**
     * Gets the value of the declarationFormReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declarationFormReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclarationFormReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getDeclarationFormReference() {
        if (declarationFormReference == null) {
            declarationFormReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.declarationFormReference;
    }

    /**
     * Gets the value of the deliveryType property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryType }
     *     
     */
    public DeliveryType getDeliveryType() {
        return deliveryType;
    }

    /**
     * Sets the value of the deliveryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryType }
     *     
     */
    public void setDeliveryType(DeliveryType value) {
        this.deliveryType = value;
    }

    /**
     * Gets the value of the foreignCurrencyControl property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignCurrencyControl }
     *     
     */
    public ForeignCurrencyControl getForeignCurrencyControl() {
        return foreignCurrencyControl;
    }

    /**
     * Sets the value of the foreignCurrencyControl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignCurrencyControl }
     *     
     */
    public void setForeignCurrencyControl(ForeignCurrencyControl value) {
        this.foreignCurrencyControl = value;
    }

    /**
     * Gets the value of the fundTransferFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFundTransferFrom() {
        return fundTransferFrom;
    }

    /**
     * Sets the value of the fundTransferFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFundTransferFrom(String value) {
        this.fundTransferFrom = value;
    }

    /**
     * Gets the value of the isGoodsStoredInFreeTradeZone property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGoodsStoredInFreeTradeZone() {
        return isGoodsStoredInFreeTradeZone;
    }

    /**
     * Sets the value of the isGoodsStoredInFreeTradeZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGoodsStoredInFreeTradeZone(Boolean value) {
        this.isGoodsStoredInFreeTradeZone = value;
    }

    /**
     * Gets the value of the isInformationComplete property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInformationComplete() {
        return isInformationComplete;
    }

    /**
     * Sets the value of the isInformationComplete property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInformationComplete(Boolean value) {
        this.isInformationComplete = value;
    }

    /**
     * Gets the value of the isSupplierOfGoods property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSupplierOfGoods() {
        return isSupplierOfGoods;
    }

    /**
     * Sets the value of the isSupplierOfGoods property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSupplierOfGoods(Boolean value) {
        this.isSupplierOfGoods = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the paymentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDescription() {
        return paymentDescription;
    }

    /**
     * Sets the value of the paymentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDescription(String value) {
        this.paymentDescription = value;
    }

    /**
     * Gets the value of the preDeclarationIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreDeclarationIdentifier() {
        return preDeclarationIdentifier;
    }

    /**
     * Sets the value of the preDeclarationIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreDeclarationIdentifier(String value) {
        this.preDeclarationIdentifier = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<String>();
        }
        return this.purpose;
    }

    /**
     * Gets the value of the shippingDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingDocumentReference }
     * 
     * 
     */
    public List<ShippingDocumentReference> getShippingDocumentReference() {
        if (shippingDocumentReference == null) {
            shippingDocumentReference = new ArrayList<ShippingDocumentReference>();
        }
        return this.shippingDocumentReference;
    }

    /**
     * Gets the value of the tradeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeType() {
        return tradeType;
    }

    /**
     * Sets the value of the tradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeType(String value) {
        this.tradeType = value;
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
