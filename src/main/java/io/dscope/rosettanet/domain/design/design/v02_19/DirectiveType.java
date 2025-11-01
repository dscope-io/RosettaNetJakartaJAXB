
package io.dscope.rosettanet.domain.design.design.v02_19;

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
import io.dscope.rosettanet.domain.design.codelist.compliant.v01_03.Compliant;


/**
 * <p>Java class for DirectiveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DirectiveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.03}Compliant"/&gt;
 *         &lt;element name="Exemption" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LegalDefinition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LegalType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SupplierAcceptance" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Version" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "DirectiveType", propOrder = {
    "compliant",
    "exemption",
    "legalDefinition",
    "legalType",
    "name",
    "supplierAcceptance",
    "version"
})
public class DirectiveType {

    @XmlElementRef(name = "Compliant", namespace = "urn:rosettanet:specification:domain:Design:Compliant:xsd:codelist:01.03", type = Compliant.class)
    protected Compliant compliant;
    @XmlElement(name = "Exemption")
    protected List<String> exemption;
    @XmlElement(name = "LegalDefinition")
    protected String legalDefinition;
    @XmlElement(name = "LegalType")
    protected String legalType;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SupplierAcceptance")
    protected Boolean supplierAcceptance;
    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the compliant property.
     * 
     * @return
     *     possible object is
     *     {@link Compliant }
     *     
     */
    public Compliant getCompliant() {
        return compliant;
    }

    /**
     * Sets the value of the compliant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Compliant }
     *     
     */
    public void setCompliant(Compliant value) {
        this.compliant = value;
    }

    /**
     * Gets the value of the exemption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getExemption() {
        if (exemption == null) {
            exemption = new ArrayList<String>();
        }
        return this.exemption;
    }

    /**
     * Gets the value of the legalDefinition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalDefinition() {
        return legalDefinition;
    }

    /**
     * Sets the value of the legalDefinition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalDefinition(String value) {
        this.legalDefinition = value;
    }

    /**
     * Gets the value of the legalType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalType() {
        return legalType;
    }

    /**
     * Sets the value of the legalType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalType(String value) {
        this.legalType = value;
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
     * Gets the value of the supplierAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSupplierAcceptance() {
        return supplierAcceptance;
    }

    /**
     * Sets the value of the supplierAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSupplierAcceptance(Boolean value) {
        this.supplierAcceptance = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
