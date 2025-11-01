
package io.dscope.rosettanet.interchange.designregistrationrequest.v02_00;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.CoreProductRegistration;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DeviceProductRegistration;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.GeographicRegion;
import io.dscope.rosettanet.domain.shared.shared.v01_17.ProductQuantity;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_16.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for DesignPartInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignPartInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Attachment" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequest:xsd:schema:02.00}AttachmentType" minOccurs="0"/&gt;
 *         &lt;element name="DemandCreatorFieldApplicationEngineer" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="DemandCreatorSalesRepresentative" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element name="DesignCustomerInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequest:xsd:schema:02.00}DesignCustomerInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="ImplementorComments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IndependentFieldApplicationEngineer" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="IndependentSalesRepresentative" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="PartConfidencePercent" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="ProductProviderSalesRepresentative" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantity"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}CoreProductRegistration"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DeviceProductRegistration"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "DesignPartInformationType", propOrder = {
    "attachment",
    "demandCreatorFieldApplicationEngineer",
    "demandCreatorSalesRepresentative",
    "demandCreatorTrackingIdentifier",
    "designCustomerInformation",
    "designRegistrationIdentification",
    "geographicRegion",
    "implementorComments",
    "independentFieldApplicationEngineer",
    "independentSalesRepresentative",
    "partConfidencePercent",
    "partnerDescription",
    "productProviderSalesRepresentative",
    "productQuantity",
    "coreProductRegistrationOrDeviceProductRegistration"
})
public class DesignPartInformationType {

    @XmlElement(name = "Attachment")
    protected AttachmentType attachment;
    @XmlElement(name = "DemandCreatorFieldApplicationEngineer", required = true)
    protected SpecifiedPartnerDescriptionType demandCreatorFieldApplicationEngineer;
    @XmlElement(name = "DemandCreatorSalesRepresentative", required = true)
    protected SpecifiedPartnerDescriptionType demandCreatorSalesRepresentative;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElement(name = "DesignCustomerInformation")
    protected DesignCustomerInformationType designCustomerInformation;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "ImplementorComments")
    protected String implementorComments;
    @XmlElement(name = "IndependentFieldApplicationEngineer", required = true)
    protected SpecifiedPartnerDescriptionType independentFieldApplicationEngineer;
    @XmlElement(name = "IndependentSalesRepresentative", required = true)
    protected SpecifiedPartnerDescriptionType independentSalesRepresentative;
    @XmlElement(name = "PartConfidencePercent")
    protected BigDecimal partConfidencePercent;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "ProductProviderSalesRepresentative", required = true)
    protected SpecifiedPartnerDescriptionType productProviderSalesRepresentative;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElementRefs({
        @XmlElementRef(name = "CoreProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = CoreProductRegistration.class, required = false),
        @XmlElementRef(name = "DeviceProductRegistration", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DeviceProductRegistration.class, required = false)
    })
    protected List<JAXBElement<?>> coreProductRegistrationOrDeviceProductRegistration;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link AttachmentType }
     *     
     */
    public AttachmentType getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link AttachmentType }
     *     
     */
    public void setAttachment(AttachmentType value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the demandCreatorFieldApplicationEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDemandCreatorFieldApplicationEngineer() {
        return demandCreatorFieldApplicationEngineer;
    }

    /**
     * Sets the value of the demandCreatorFieldApplicationEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDemandCreatorFieldApplicationEngineer(SpecifiedPartnerDescriptionType value) {
        this.demandCreatorFieldApplicationEngineer = value;
    }

    /**
     * Gets the value of the demandCreatorSalesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getDemandCreatorSalesRepresentative() {
        return demandCreatorSalesRepresentative;
    }

    /**
     * Sets the value of the demandCreatorSalesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setDemandCreatorSalesRepresentative(SpecifiedPartnerDescriptionType value) {
        this.demandCreatorSalesRepresentative = value;
    }

    /**
     * Gets the value of the demandCreatorTrackingIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link DemandCreatorTrackingIdentifier }
     *     
     */
    public DemandCreatorTrackingIdentifier getDemandCreatorTrackingIdentifier() {
        return demandCreatorTrackingIdentifier;
    }

    /**
     * Sets the value of the demandCreatorTrackingIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link DemandCreatorTrackingIdentifier }
     *     
     */
    public void setDemandCreatorTrackingIdentifier(DemandCreatorTrackingIdentifier value) {
        this.demandCreatorTrackingIdentifier = value;
    }

    /**
     * Gets the value of the designCustomerInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DesignCustomerInformationType }
     *     
     */
    public DesignCustomerInformationType getDesignCustomerInformation() {
        return designCustomerInformation;
    }

    /**
     * Sets the value of the designCustomerInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignCustomerInformationType }
     *     
     */
    public void setDesignCustomerInformation(DesignCustomerInformationType value) {
        this.designCustomerInformation = value;
    }

    /**
     * Gets the value of the designRegistrationIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link DesignRegistrationIdentification }
     *     
     */
    public DesignRegistrationIdentification getDesignRegistrationIdentification() {
        return designRegistrationIdentification;
    }

    /**
     * Sets the value of the designRegistrationIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignRegistrationIdentification }
     *     
     */
    public void setDesignRegistrationIdentification(DesignRegistrationIdentification value) {
        this.designRegistrationIdentification = value;
    }

    /**
     * Gets the value of the geographicRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegion }
     *     
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /**
     * Sets the value of the geographicRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegion }
     *     
     */
    public void setGeographicRegion(GeographicRegion value) {
        this.geographicRegion = value;
    }

    /**
     * Gets the value of the implementorComments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImplementorComments() {
        return implementorComments;
    }

    /**
     * Sets the value of the implementorComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImplementorComments(String value) {
        this.implementorComments = value;
    }

    /**
     * Gets the value of the independentFieldApplicationEngineer property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getIndependentFieldApplicationEngineer() {
        return independentFieldApplicationEngineer;
    }

    /**
     * Sets the value of the independentFieldApplicationEngineer property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setIndependentFieldApplicationEngineer(SpecifiedPartnerDescriptionType value) {
        this.independentFieldApplicationEngineer = value;
    }

    /**
     * Gets the value of the independentSalesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getIndependentSalesRepresentative() {
        return independentSalesRepresentative;
    }

    /**
     * Sets the value of the independentSalesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setIndependentSalesRepresentative(SpecifiedPartnerDescriptionType value) {
        this.independentSalesRepresentative = value;
    }

    /**
     * Gets the value of the partConfidencePercent property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartConfidencePercent() {
        return partConfidencePercent;
    }

    /**
     * Sets the value of the partConfidencePercent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartConfidencePercent(BigDecimal value) {
        this.partConfidencePercent = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the productProviderSalesRepresentative property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getProductProviderSalesRepresentative() {
        return productProviderSalesRepresentative;
    }

    /**
     * Sets the value of the productProviderSalesRepresentative property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setProductProviderSalesRepresentative(SpecifiedPartnerDescriptionType value) {
        this.productProviderSalesRepresentative = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the coreProductRegistrationOrDeviceProductRegistration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coreProductRegistrationOrDeviceProductRegistration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCoreProductRegistrationOrDeviceProductRegistration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoreProductRegistration }
     * {@link DeviceProductRegistration }
     * 
     * 
     */
    public List<JAXBElement<?>> getCoreProductRegistrationOrDeviceProductRegistration() {
        if (coreProductRegistrationOrDeviceProductRegistration == null) {
            coreProductRegistrationOrDeviceProductRegistration = new ArrayList<JAXBElement<?>>();
        }
        return this.coreProductRegistrationOrDeviceProductRegistration;
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
