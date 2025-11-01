
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

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
import io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02.ProjectStatus;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DesignProjectDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.ProjectIdentifier;


/**
 * <p>Java class for ProjectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssemblyInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}AssemblyInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DesignProjectDescription" minOccurs="0"/&gt;
 *         &lt;element name="ProductProviderLead" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}ProductProviderLeadType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}ProjectIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02}ProjectStatus" minOccurs="0"/&gt;
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
@XmlType(name = "ProjectInformationType", propOrder = {
    "assemblyInformation",
    "designProjectDescription",
    "productProviderLead",
    "projectIdentifier",
    "projectStatus"
})
public class ProjectInformationType {

    @XmlElement(name = "AssemblyInformation", required = true)
    protected List<AssemblyInformationType> assemblyInformation;
    @XmlElementRef(name = "DesignProjectDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DesignProjectDescription.class, required = false)
    protected DesignProjectDescription designProjectDescription;
    @XmlElement(name = "ProductProviderLead")
    protected ProductProviderLeadType productProviderLead;
    @XmlElementRef(name = "ProjectIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = ProjectIdentifier.class, required = false)
    protected ProjectIdentifier projectIdentifier;
    @XmlElementRef(name = "ProjectStatus", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", type = ProjectStatus.class, required = false)
    protected ProjectStatus projectStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assemblyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssemblyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssemblyInformationType }
     * 
     * 
     */
    public List<AssemblyInformationType> getAssemblyInformation() {
        if (assemblyInformation == null) {
            assemblyInformation = new ArrayList<AssemblyInformationType>();
        }
        return this.assemblyInformation;
    }

    /**
     * Gets the value of the designProjectDescription property.
     * 
     * @return
     *     possible object is
     *     {@link DesignProjectDescription }
     *     
     */
    public DesignProjectDescription getDesignProjectDescription() {
        return designProjectDescription;
    }

    /**
     * Sets the value of the designProjectDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link DesignProjectDescription }
     *     
     */
    public void setDesignProjectDescription(DesignProjectDescription value) {
        this.designProjectDescription = value;
    }

    /**
     * Gets the value of the productProviderLead property.
     * 
     * @return
     *     possible object is
     *     {@link ProductProviderLeadType }
     *     
     */
    public ProductProviderLeadType getProductProviderLead() {
        return productProviderLead;
    }

    /**
     * Sets the value of the productProviderLead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductProviderLeadType }
     *     
     */
    public void setProductProviderLead(ProductProviderLeadType value) {
        this.productProviderLead = value;
    }

    /**
     * Gets the value of the projectIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectIdentifier }
     *     
     */
    public ProjectIdentifier getProjectIdentifier() {
        return projectIdentifier;
    }

    /**
     * Sets the value of the projectIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectIdentifier }
     *     
     */
    public void setProjectIdentifier(ProjectIdentifier value) {
        this.projectIdentifier = value;
    }

    /**
     * Gets the value of the projectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ProjectStatus }
     *     
     */
    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    /**
     * Sets the value of the projectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProjectStatus }
     *     
     */
    public void setProjectStatus(ProjectStatus value) {
        this.projectStatus = value;
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
