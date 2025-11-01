
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_01;

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
import io.dscope.rosettanet.domain.design.codelist.actioncode.v01_00.ActionCodeType;
import io.dscope.rosettanet.domain.design.design.v01_00.DependentCondition;
import io.dscope.rosettanet.domain.design.design.v01_00.Directive;
import io.dscope.rosettanet.domain.design.design.v01_00.Material;
import io.dscope.rosettanet.domain.design.design.v01_00.ProductMass;
import io.dscope.rosettanet.domain.design.design.v01_00.Subpart;
import io.dscope.rosettanet.domain.design.design.v01_00.Substance;
import io.dscope.rosettanet.universal.partneridentification.v01_00.KnownPartner;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:dsgn="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:p596140_="http://annox.dev.java.net" xmlns:p89650_="http://java.sun.com/xml/ns/jaxb" xmlns:sdctr="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.01" xmlns:tns="urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:11.01.00" xmlns:ucttf="urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.01" xmlns:udcmn="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:uptrn="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.02" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of ProductInformation/isGeneric is between 1 and 1 then the value of ProductInformation/isGeneric MUST be 'true'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:dsgn="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:p596140_="http://annox.dev.java.net" xmlns:p89650_="http://java.sun.com/xml/ns/jaxb" xmlns:sdctr="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.01" xmlns:tns="urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:11.01.00" xmlns:ucttf="urn:rosettanet:specification:universal:ContactInformation:xsd:schema:01.01" xmlns:udcmn="urn:rosettanet:specification:universal:Document:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:uptrn="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.02" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of ProductInformation/KnownPartner is between 1 and 1 then the value of ProductInformation/KnownPartner/ProcessRoleIdentifier MUST be 'MFG'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativeProductIdentifier" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:11.01.00}ProductIdentifierType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Directive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DistributionNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}NoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.02}KnownPartner" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Material" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductActionCode" type="{urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01}ActionCodeType" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentifier" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:11.01.00}ProductIdentifierType"/&gt;
 *         &lt;element name="ProductInformationObject" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:11.01.00}ProductInformationObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}ProductMass" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Subpart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductInformationType", propOrder = {
    "alternativeProductIdentifier",
    "dependentCondition",
    "directive",
    "distributionNote",
    "isGeneric",
    "knownPartner",
    "material",
    "productActionCode",
    "productIdentifier",
    "productInformationObject",
    "productMass",
    "subpart",
    "substance"
})
public class ProductInformationType {

    @XmlElement(name = "AlternativeProductIdentifier")
    protected ProductIdentifierType alternativeProductIdentifier;
    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElementRef(name = "Directive", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Directive.class, required = false)
    protected List<Directive> directive;
    @XmlElement(name = "DistributionNote")
    protected List<String> distributionNote;
    @XmlElement(name = "IsGeneric")
    protected Boolean isGeneric;
    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.02", type = KnownPartner.class, required = false)
    protected KnownPartner knownPartner;
    @XmlElementRef(name = "Material", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Material.class, required = false)
    protected List<Material> material;
    @XmlElement(name = "ProductActionCode")
    protected ActionCodeType productActionCode;
    @XmlElement(name = "ProductIdentifier", required = true)
    protected ProductIdentifierType productIdentifier;
    @XmlElement(name = "ProductInformationObject")
    protected List<ProductInformationObjectType> productInformationObject;
    @XmlElementRef(name = "ProductMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = ProductMass.class, required = false)
    protected ProductMass productMass;
    @XmlElementRef(name = "Subpart", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Subpart.class, required = false)
    protected List<Subpart> subpart;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeProductIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifierType }
     *     
     */
    public ProductIdentifierType getAlternativeProductIdentifier() {
        return alternativeProductIdentifier;
    }

    /**
     * Sets the value of the alternativeProductIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifierType }
     *     
     */
    public void setAlternativeProductIdentifier(ProductIdentifierType value) {
        this.alternativeProductIdentifier = value;
    }

    /**
     * Gets the value of the dependentCondition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dependentCondition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDependentCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DependentCondition }
     * 
     * 
     */
    public List<DependentCondition> getDependentCondition() {
        if (dependentCondition == null) {
            dependentCondition = new ArrayList<DependentCondition>();
        }
        return this.dependentCondition;
    }

    /**
     * Gets the value of the directive property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the directive property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDirective().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Directive }
     * 
     * 
     */
    public List<Directive> getDirective() {
        if (directive == null) {
            directive = new ArrayList<Directive>();
        }
        return this.directive;
    }

    /**
     * Gets the value of the distributionNote property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the distributionNote property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDistributionNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDistributionNote() {
        if (distributionNote == null) {
            distributionNote = new ArrayList<String>();
        }
        return this.distributionNote;
    }

    /**
     * Gets the value of the isGeneric property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsGeneric() {
        return isGeneric;
    }

    /**
     * Sets the value of the isGeneric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGeneric(Boolean value) {
        this.isGeneric = value;
    }

    /**
     * Gets the value of the knownPartner property.
     * 
     * @return
     *     possible object is
     *     {@link KnownPartner }
     *     
     */
    public KnownPartner getKnownPartner() {
        return knownPartner;
    }

    /**
     * Sets the value of the knownPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownPartner }
     *     
     */
    public void setKnownPartner(KnownPartner value) {
        this.knownPartner = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the material property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterial().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Material }
     * 
     * 
     */
    public List<Material> getMaterial() {
        if (material == null) {
            material = new ArrayList<Material>();
        }
        return this.material;
    }

    /**
     * Gets the value of the productActionCode property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getProductActionCode() {
        return productActionCode;
    }

    /**
     * Sets the value of the productActionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setProductActionCode(ActionCodeType value) {
        this.productActionCode = value;
    }

    /**
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifierType }
     *     
     */
    public ProductIdentifierType getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifierType }
     *     
     */
    public void setProductIdentifier(ProductIdentifierType value) {
        this.productIdentifier = value;
    }

    /**
     * Gets the value of the productInformationObject property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformationObject property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformationObject().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInformationObjectType }
     * 
     * 
     */
    public List<ProductInformationObjectType> getProductInformationObject() {
        if (productInformationObject == null) {
            productInformationObject = new ArrayList<ProductInformationObjectType>();
        }
        return this.productInformationObject;
    }

    /**
     * Gets the value of the productMass property.
     * 
     * @return
     *     possible object is
     *     {@link ProductMass }
     *     
     */
    public ProductMass getProductMass() {
        return productMass;
    }

    /**
     * Sets the value of the productMass property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductMass }
     *     
     */
    public void setProductMass(ProductMass value) {
        this.productMass = value;
    }

    /**
     * Gets the value of the subpart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subpart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubpart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Subpart }
     * 
     * 
     */
    public List<Subpart> getSubpart() {
        if (subpart == null) {
            subpart = new ArrayList<Subpart>();
        }
        return this.subpart;
    }

    /**
     * Gets the value of the substance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Substance }
     * 
     * 
     */
    public List<Substance> getSubstance() {
        if (substance == null) {
            substance = new ArrayList<Substance>();
        }
        return this.substance;
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
