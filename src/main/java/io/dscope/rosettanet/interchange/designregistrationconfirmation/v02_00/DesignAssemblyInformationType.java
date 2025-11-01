
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00;

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
import io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02.RegistrationComplexityLevel;
import io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02.RegistrationInvolvementLevel;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.ProductProviderLeadDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.ProductProviderLeadTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.RegistrationStatus;


/**
 * <p>Java class for DesignAssemblyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignAssemblyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element name="DesignPartInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.00}DesignPartInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}GeographicRegion"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02}RegistrationComplexityLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02}RegistrationInvolvementLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}RegistrationStatus"/&gt;
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
@XmlType(name = "DesignAssemblyInformationType", propOrder = {
    "comments",
    "demandCreatorTrackingIdentifier",
    "designPartInformation",
    "designRegistrationIdentification",
    "geographicRegion",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "registrationComplexityLevel",
    "registrationInvolvementLevel",
    "registrationStatus"
})
public class DesignAssemblyInformationType {

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElement(name = "DesignPartInformation", required = true)
    protected List<DesignPartInformationType> designPartInformation;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = GeographicRegion.class)
    protected GeographicRegion geographicRegion;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElementRef(name = "RegistrationComplexityLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", type = RegistrationComplexityLevel.class, required = false)
    protected RegistrationComplexityLevel registrationComplexityLevel;
    @XmlElementRef(name = "RegistrationInvolvementLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", type = RegistrationInvolvementLevel.class, required = false)
    protected RegistrationInvolvementLevel registrationInvolvementLevel;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = RegistrationStatus.class)
    protected RegistrationStatus registrationStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the designPartInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designPartInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignPartInformationType }
     * 
     * 
     */
    public List<DesignPartInformationType> getDesignPartInformation() {
        if (designPartInformation == null) {
            designPartInformation = new ArrayList<DesignPartInformationType>();
        }
        return this.designPartInformation;
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
     * Gets the value of the registrationComplexityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationComplexityLevel }
     *     
     */
    public RegistrationComplexityLevel getRegistrationComplexityLevel() {
        return registrationComplexityLevel;
    }

    /**
     * Sets the value of the registrationComplexityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationComplexityLevel }
     *     
     */
    public void setRegistrationComplexityLevel(RegistrationComplexityLevel value) {
        this.registrationComplexityLevel = value;
    }

    /**
     * Gets the value of the registrationInvolvementLevel property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationInvolvementLevel }
     *     
     */
    public RegistrationInvolvementLevel getRegistrationInvolvementLevel() {
        return registrationInvolvementLevel;
    }

    /**
     * Sets the value of the registrationInvolvementLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationInvolvementLevel }
     *     
     */
    public void setRegistrationInvolvementLevel(RegistrationInvolvementLevel value) {
        this.registrationInvolvementLevel = value;
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
