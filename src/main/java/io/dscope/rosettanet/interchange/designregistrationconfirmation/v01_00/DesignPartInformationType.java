
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderComments;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.RegistrationDisposition;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderComments" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}RegistrationDisposition" minOccurs="0"/&gt;
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
    "demandCreatorTrackingIdentifier",
    "designRegistrationIdentification",
    "geographicRegion",
    "partnerDescription",
    "productProviderComments",
    "productProviderLeadTrackingIdentifier",
    "registrationDisposition",
    "coreProductRegistrationOrDeviceProductRegistration"
})
public class DesignPartInformationType {

    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "ProductProviderComments", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderComments.class, required = false)
    protected ProductProviderComments productProviderComments;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElementRef(name = "RegistrationDisposition", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = RegistrationDisposition.class, required = false)
    protected RegistrationDisposition registrationDisposition;
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
     * Gets the value of the productProviderComments property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderComments }
     *     
     */
    public ProductProviderComments getProductProviderComments() {
        return productProviderComments;
    }

    /**
     * Sets the value of the productProviderComments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderComments }
     *     
     */
    public void setProductProviderComments(ProductProviderComments value) {
        this.productProviderComments = value;
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
     * Gets the value of the registrationDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationDisposition }
     *     
     */
    public RegistrationDisposition getRegistrationDisposition() {
        return registrationDisposition;
    }

    /**
     * Sets the value of the registrationDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationDisposition }
     *     
     */
    public void setRegistrationDisposition(RegistrationDisposition value) {
        this.registrationDisposition = value;
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
