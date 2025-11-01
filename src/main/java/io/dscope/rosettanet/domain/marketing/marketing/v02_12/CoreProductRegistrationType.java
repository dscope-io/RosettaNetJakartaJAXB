
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import java.math.BigDecimal;
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
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductPricingType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescription;


/**
 * <p>Java class for CoreProductRegistrationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreProductRegistrationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DebitAuthorizationNumber" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignCompetitorInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DeviceProductRegistration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsDeveloperToolKit" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="RegistrationBonusPercent" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationStatus"/&gt;
 *         &lt;element name="SuggestedResalePrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductPricingType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescription" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductPricingType" minOccurs="0"/&gt;
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
@XmlType(name = "CoreProductRegistrationType", propOrder = {
    "alternativeIdentifier",
    "businessDocumentReference",
    "debitAuthorizationNumber",
    "designCompetitorInformation",
    "deviceProductRegistration",
    "isDeveloperToolKit",
    "minimumOrderQuantity",
    "productIdentification",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "registrationBonusPercent",
    "registrationStatus",
    "suggestedResalePrice",
    "textualDescription",
    "unitPrice"
})
public class CoreProductRegistrationType {

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected AlternativeIdentifier alternativeIdentifier;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "DebitAuthorizationNumber", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DebitAuthorizationNumber.class, required = false)
    protected DebitAuthorizationNumber debitAuthorizationNumber;
    @XmlElementRef(name = "DesignCompetitorInformation", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignCompetitorInformation.class, required = false)
    protected List<DesignCompetitorInformation> designCompetitorInformation;
    @XmlElementRef(name = "DeviceProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DeviceProductRegistration.class, required = false)
    protected List<DeviceProductRegistration> deviceProductRegistration;
    @XmlElementRef(name = "IsDeveloperToolKit", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsDeveloperToolKit.class, required = false)
    protected IsDeveloperToolKit isDeveloperToolKit;
    @XmlElement(name = "MinimumOrderQuantity")
    protected Float minimumOrderQuantity;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElement(name = "RegistrationBonusPercent")
    protected BigDecimal registrationBonusPercent;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationStatus.class)
    protected RegistrationStatus registrationStatus;
    @XmlElement(name = "SuggestedResalePrice", required = true)
    protected ProductPricingType suggestedResalePrice;
    @XmlElementRef(name = "TextualDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = TextualDescription.class, required = false)
    protected TextualDescription textualDescription;
    @XmlElement(name = "UnitPrice")
    protected ProductPricingType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public AlternativeIdentifier getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    /**
     * Sets the value of the alternativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public void setAlternativeIdentifier(AlternativeIdentifier value) {
        this.alternativeIdentifier = value;
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
     * Gets the value of the debitAuthorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public DebitAuthorizationNumber getDebitAuthorizationNumber() {
        return debitAuthorizationNumber;
    }

    /**
     * Sets the value of the debitAuthorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public void setDebitAuthorizationNumber(DebitAuthorizationNumber value) {
        this.debitAuthorizationNumber = value;
    }

    /**
     * Gets the value of the designCompetitorInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designCompetitorInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignCompetitorInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignCompetitorInformation }
     * 
     * 
     */
    public List<DesignCompetitorInformation> getDesignCompetitorInformation() {
        if (designCompetitorInformation == null) {
            designCompetitorInformation = new ArrayList<DesignCompetitorInformation>();
        }
        return this.designCompetitorInformation;
    }

    /**
     * Gets the value of the deviceProductRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceProductRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceProductRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceProductRegistration }
     * 
     * 
     */
    public List<DeviceProductRegistration> getDeviceProductRegistration() {
        if (deviceProductRegistration == null) {
            deviceProductRegistration = new ArrayList<DeviceProductRegistration>();
        }
        return this.deviceProductRegistration;
    }

    /**
     * Gets the value of the isDeveloperToolKit property.
     * 
     * @return
     *     possible object is
     *     {@link IsDeveloperToolKit }
     *     
     */
    public IsDeveloperToolKit getIsDeveloperToolKit() {
        return isDeveloperToolKit;
    }

    /**
     * Sets the value of the isDeveloperToolKit property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDeveloperToolKit }
     *     
     */
    public void setIsDeveloperToolKit(IsDeveloperToolKit value) {
        this.isDeveloperToolKit = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumOrderQuantity(Float value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the productProviderLeadDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderLeadDescription }
     *     
     */
    public ProductProviderLeadDescription getProductProviderLeadDescription() {
        return productProviderLeadDescription;
    }

    /**
     * Sets the value of the productProviderLeadDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderLeadDescription }
     *     
     */
    public void setProductProviderLeadDescription(ProductProviderLeadDescription value) {
        this.productProviderLeadDescription = value;
    }

    /**
     * Gets the value of the productProviderLeadTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderLeadTrackingIdentifier }
     *     
     */
    public ProductProviderLeadTrackingIdentifier getProductProviderLeadTrackingIdentifier() {
        return productProviderLeadTrackingIdentifier;
    }

    /**
     * Sets the value of the productProviderLeadTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderLeadTrackingIdentifier }
     *     
     */
    public void setProductProviderLeadTrackingIdentifier(ProductProviderLeadTrackingIdentifier value) {
        this.productProviderLeadTrackingIdentifier = value;
    }

    /**
     * Gets the value of the registrationBonusPercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegistrationBonusPercent() {
        return registrationBonusPercent;
    }

    /**
     * Sets the value of the registrationBonusPercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegistrationBonusPercent(BigDecimal value) {
        this.registrationBonusPercent = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationStatus }
     *     
     */
    public RegistrationStatus getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationStatus }
     *     
     */
    public void setRegistrationStatus(RegistrationStatus value) {
        this.registrationStatus = value;
    }

    /**
     * Gets the value of the suggestedResalePrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getSuggestedResalePrice() {
        return suggestedResalePrice;
    }

    /**
     * Sets the value of the suggestedResalePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setSuggestedResalePrice(ProductPricingType value) {
        this.suggestedResalePrice = value;
    }

    /**
     * Gets the value of the textualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescription }
     *     
     */
    public TextualDescription getTextualDescription() {
        return textualDescription;
    }

    /**
     * Sets the value of the textualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescription }
     *     
     */
    public void setTextualDescription(TextualDescription value) {
        this.textualDescription = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setUnitPrice(ProductPricingType value) {
        this.unitPrice = value;
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
