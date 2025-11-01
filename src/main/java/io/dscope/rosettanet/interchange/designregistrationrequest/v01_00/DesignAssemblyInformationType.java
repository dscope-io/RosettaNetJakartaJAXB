
package io.dscope.rosettanet.interchange.designregistrationrequest.v01_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02.RegistrationComplexityLevel;
import io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02.RegistrationInvolvementLevel;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DemandCreatorTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DesignRegistrationIdentification;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.RegistrationStatus;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescriptionType;


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
 *         &lt;element name="AssemblyDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DemandCreatorTrackingIdentifier"/&gt;
 *         &lt;element name="DesignAssemblyInformation" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType"/&gt;
 *         &lt;element name="DesignCustomerInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00}DesignCustomerInformationType"/&gt;
 *         &lt;element name="DesignPartInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequestNotification:xsd:schema:01.00}DesignPartInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignRegistrationIdentification" minOccurs="0"/&gt;
 *         &lt;element name="Estimated2ndYearAssemblyQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="Estimated3rdYearAssemblyQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="EstimatedLifetimeQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="PrototypeDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02}RegistrationComplexityLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02}RegistrationInvolvementLevel" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}RegistrationStatus" minOccurs="0"/&gt;
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
    "assemblyDescription",
    "demandCreatorTrackingIdentifier",
    "designAssemblyInformation",
    "designCustomerInformation",
    "designPartInformation",
    "designRegistrationIdentification",
    "estimated2NdYearAssemblyQuantity",
    "estimated3RdYearAssemblyQuantity",
    "estimatedLifetimeQuantity",
    "geographicRegion",
    "name",
    "productionDate",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "prototypeDate",
    "registrationComplexityLevel",
    "registrationInvolvementLevel",
    "registrationStatus"
})
public class DesignAssemblyInformationType {

    @XmlElement(name = "AssemblyDescription", required = true)
    protected TextualDescriptionType assemblyDescription;
    @XmlElementRef(name = "DemandCreatorTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DemandCreatorTrackingIdentifier.class)
    protected DemandCreatorTrackingIdentifier demandCreatorTrackingIdentifier;
    @XmlElement(name = "DesignAssemblyInformation")
    protected float designAssemblyInformation;
    @XmlElement(name = "DesignCustomerInformation", required = true)
    protected DesignCustomerInformationType designCustomerInformation;
    @XmlElement(name = "DesignPartInformation", required = true)
    protected List<DesignPartInformationType> designPartInformation;
    @XmlElementRef(name = "DesignRegistrationIdentification", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignRegistrationIdentification.class, required = false)
    protected DesignRegistrationIdentification designRegistrationIdentification;
    @XmlElement(name = "Estimated2ndYearAssemblyQuantity")
    protected Float estimated2NdYearAssemblyQuantity;
    @XmlElement(name = "Estimated3rdYearAssemblyQuantity")
    protected Float estimated3RdYearAssemblyQuantity;
    @XmlElement(name = "EstimatedLifetimeQuantity")
    protected Float estimatedLifetimeQuantity;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ProductionDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productionDate;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElement(name = "PrototypeDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar prototypeDate;
    @XmlElementRef(name = "RegistrationComplexityLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", type = RegistrationComplexityLevel.class, required = false)
    protected RegistrationComplexityLevel registrationComplexityLevel;
    @XmlElementRef(name = "RegistrationInvolvementLevel", namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", type = RegistrationInvolvementLevel.class, required = false)
    protected RegistrationInvolvementLevel registrationInvolvementLevel;
    @XmlElementRef(name = "RegistrationStatus", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = RegistrationStatus.class, required = false)
    protected RegistrationStatus registrationStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getAssemblyDescription() {
        return assemblyDescription;
    }

    /**
     * Sets the value of the assemblyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setAssemblyDescription(TextualDescriptionType value) {
        this.assemblyDescription = value;
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
     * Gets the value of the designAssemblyInformation property.
     * 
     */
    public float getDesignAssemblyInformation() {
        return designAssemblyInformation;
    }

    /**
     * Sets the value of the designAssemblyInformation property.
     * 
     */
    public void setDesignAssemblyInformation(float value) {
        this.designAssemblyInformation = value;
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
     * Gets the value of the estimated2NdYearAssemblyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimated2NdYearAssemblyQuantity() {
        return estimated2NdYearAssemblyQuantity;
    }

    /**
     * Sets the value of the estimated2NdYearAssemblyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimated2NdYearAssemblyQuantity(Float value) {
        this.estimated2NdYearAssemblyQuantity = value;
    }

    /**
     * Gets the value of the estimated3RdYearAssemblyQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimated3RdYearAssemblyQuantity() {
        return estimated3RdYearAssemblyQuantity;
    }

    /**
     * Sets the value of the estimated3RdYearAssemblyQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimated3RdYearAssemblyQuantity(Float value) {
        this.estimated3RdYearAssemblyQuantity = value;
    }

    /**
     * Gets the value of the estimatedLifetimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getEstimatedLifetimeQuantity() {
        return estimatedLifetimeQuantity;
    }

    /**
     * Sets the value of the estimatedLifetimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setEstimatedLifetimeQuantity(Float value) {
        this.estimatedLifetimeQuantity = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
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
     * Gets the value of the prototypeDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPrototypeDate() {
        return prototypeDate;
    }

    /**
     * Sets the value of the prototypeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPrototypeDate(XMLGregorianCalendar value) {
        this.prototypeDate = value;
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
