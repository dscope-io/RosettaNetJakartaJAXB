
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v02_01;

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
import io.dscope.rosettanet.domain.design.design.v02_17.Directive;
import io.dscope.rosettanet.domain.design.design.v02_17.ManufacturingProcessInfo;
import io.dscope.rosettanet.domain.design.design.v02_17.Material;
import io.dscope.rosettanet.domain.design.design.v02_17.ProductIdentifier;
import io.dscope.rosettanet.domain.design.design.v02_17.ProductIdentifierType;
import io.dscope.rosettanet.domain.design.design.v02_17.ProductMass;
import io.dscope.rosettanet.domain.design.design.v02_17.Subpart;
import io.dscope.rosettanet.domain.design.design.v02_17.Substance;
import io.dscope.rosettanet.universal.partneridentification.v01_14.KnownPartner;


/**
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativeProductIdentifier" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}ProductIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Condition" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:02.01}ConditionType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}Directive" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DistributionNote" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}NoteType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}KnownPartner" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}ManufacturingProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}Material" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}ProductIdentifier"/&gt;
 *         &lt;element name="ProductInformationObject" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:02.01}ProductInformationObjectType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}ProductMass" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}Subpart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.17}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "condition",
    "directive",
    "distributionNote",
    "isGeneric",
    "knownPartner",
    "manufacturingProcessInfo",
    "material",
    "productIdentifier",
    "productInformationObject",
    "productMass",
    "subpart",
    "substance"
})
public class ProductInformationType {

    @XmlElement(name = "AlternativeProductIdentifier")
    protected List<ProductIdentifierType> alternativeProductIdentifier;
    @XmlElement(name = "Condition")
    protected List<ConditionType> condition;
    @XmlElementRef(name = "Directive", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = Directive.class, required = false)
    protected List<Directive> directive;
    @XmlElement(name = "DistributionNote")
    protected List<String> distributionNote;
    @XmlElement(name = "IsGeneric")
    protected Boolean isGeneric;
    @XmlElementRef(name = "KnownPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = KnownPartner.class, required = false)
    protected KnownPartner knownPartner;
    @XmlElementRef(name = "ManufacturingProcessInfo", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = ManufacturingProcessInfo.class, required = false)
    protected List<ManufacturingProcessInfo> manufacturingProcessInfo;
    @XmlElementRef(name = "Material", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = Material.class, required = false)
    protected List<Material> material;
    @XmlElementRef(name = "ProductIdentifier", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = ProductIdentifier.class)
    protected ProductIdentifier productIdentifier;
    @XmlElement(name = "ProductInformationObject")
    protected List<ProductInformationObjectType> productInformationObject;
    @XmlElementRef(name = "ProductMass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = ProductMass.class, required = false)
    protected ProductMass productMass;
    @XmlElementRef(name = "Subpart", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = Subpart.class, required = false)
    protected List<Subpart> subpart;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.17", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativeProductIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeProductIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeProductIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentifierType }
     * 
     * 
     */
    public List<ProductIdentifierType> getAlternativeProductIdentifier() {
        if (alternativeProductIdentifier == null) {
            alternativeProductIdentifier = new ArrayList<ProductIdentifierType>();
        }
        return this.alternativeProductIdentifier;
    }

    /**
     * Gets the value of the condition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the condition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCondition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionType }
     * 
     * 
     */
    public List<ConditionType> getCondition() {
        if (condition == null) {
            condition = new ArrayList<ConditionType>();
        }
        return this.condition;
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
     * Gets the value of the manufacturingProcessInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturingProcessInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturingProcessInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturingProcessInfo }
     * 
     * 
     */
    public List<ManufacturingProcessInfo> getManufacturingProcessInfo() {
        if (manufacturingProcessInfo == null) {
            manufacturingProcessInfo = new ArrayList<ManufacturingProcessInfo>();
        }
        return this.manufacturingProcessInfo;
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
     * Gets the value of the productIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentifier }
     *     
     */
    public ProductIdentifier getProductIdentifier() {
        return productIdentifier;
    }

    /**
     * Sets the value of the productIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentifier }
     *     
     */
    public void setProductIdentifier(ProductIdentifier value) {
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
