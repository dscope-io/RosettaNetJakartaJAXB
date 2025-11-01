
package io.dscope.rosettanet.interchange.designregistrationrequest.v02_00;

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
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.DesignProjectDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadDescription;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProductProviderLeadTrackingIdentifier;
import io.dscope.rosettanet.domain.marketing.marketing.v02_19.ProjectIdentifier;


/**
 * <p>Java class for DesignProjectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignProjectInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignAssemblyInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequest:xsd:schema:02.00}DesignAssemblyInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DesignCustomerInformation" type="{urn:rosettanet:specification:interchange:DesignRegistrationRequest:xsd:schema:02.00}DesignCustomerInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}DesignProjectDescription"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProductProviderLeadTrackingIdentifier" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}ProjectIdentifier" minOccurs="0"/&gt;
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
@XmlType(name = "DesignProjectInformationType", propOrder = {
    "designAssemblyInformation",
    "designCustomerInformation",
    "designProjectDescription",
    "productProviderLeadDescription",
    "productProviderLeadTrackingIdentifier",
    "projectIdentifier",
    "projectStatus"
})
public class DesignProjectInformationType {

    @XmlElement(name = "DesignAssemblyInformation", required = true)
    protected List<DesignAssemblyInformationType> designAssemblyInformation;
    @XmlElement(name = "DesignCustomerInformation")
    protected DesignCustomerInformationType designCustomerInformation;
    @XmlElementRef(name = "DesignProjectDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = DesignProjectDescription.class)
    protected DesignProjectDescription designProjectDescription;
    @XmlElementRef(name = "ProductProviderLeadDescription", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadDescription.class, required = false)
    protected ProductProviderLeadDescription productProviderLeadDescription;
    @XmlElementRef(name = "ProductProviderLeadTrackingIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProductProviderLeadTrackingIdentifier.class, required = false)
    protected ProductProviderLeadTrackingIdentifier productProviderLeadTrackingIdentifier;
    @XmlElementRef(name = "ProjectIdentifier", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = ProjectIdentifier.class, required = false)
    protected ProjectIdentifier projectIdentifier;
    @XmlElementRef(name = "ProjectStatus", namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", type = ProjectStatus.class, required = false)
    protected ProjectStatus projectStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designAssemblyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designAssemblyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignAssemblyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignAssemblyInformationType }
     * 
     * 
     */
    public List<DesignAssemblyInformationType> getDesignAssemblyInformation() {
        if (designAssemblyInformation == null) {
            designAssemblyInformation = new ArrayList<DesignAssemblyInformationType>();
        }
        return this.designAssemblyInformation;
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
