
package io.dscope.rosettanet.domain.design.design.v02_19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for SubpartType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubpartType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}DependentCondition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}ManufacturingProcessInfo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}Material" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}Subpart" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}SubpartIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}Substance" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SubpartType", propOrder = {
    "dependentCondition",
    "manufacturingProcessInfo",
    "material",
    "subpart",
    "subpartIdentifier",
    "substance"
})
public class SubpartType {

    @XmlElementRef(name = "DependentCondition", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = DependentCondition.class, required = false)
    protected List<DependentCondition> dependentCondition;
    @XmlElementRef(name = "ManufacturingProcessInfo", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = ManufacturingProcessInfo.class, required = false)
    protected List<ManufacturingProcessInfo> manufacturingProcessInfo;
    @XmlElementRef(name = "Material", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = Material.class, required = false)
    protected List<Material> material;
    @XmlElementRef(name = "Subpart", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = Subpart.class, required = false)
    protected List<Subpart> subpart;
    @XmlElementRef(name = "SubpartIdentifier", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = SubpartIdentifier.class)
    protected SubpartIdentifier subpartIdentifier;
    @XmlElementRef(name = "Substance", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = Substance.class, required = false)
    protected List<Substance> substance;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the subpartIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SubpartIdentifier }
     *     
     */
    public SubpartIdentifier getSubpartIdentifier() {
        return subpartIdentifier;
    }

    /**
     * Sets the value of the subpartIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubpartIdentifier }
     *     
     */
    public void setSubpartIdentifier(SubpartIdentifier value) {
        this.subpartIdentifier = value;
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
