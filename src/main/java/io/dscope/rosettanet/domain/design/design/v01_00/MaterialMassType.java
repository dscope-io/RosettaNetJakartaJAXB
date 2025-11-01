
package io.dscope.rosettanet.domain.design.design.v01_00;

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
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_00.UnitOfMeasure;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drdfl="urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.01" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:drnlv="urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01" xmlns:tns="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:01.01" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of MaterialMass/Mass is between 1 and unbounded then the value of MaterialMass/UnitOfMeasure MUST be 'KIG'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:drdfl="urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.01" xmlns:drnct="urn:rosettanet:specification:domain:Design:ActionCode:xsd:codelist:01.01" xmlns:drnlv="urn:rosettanet:specification:domain:Design:Level:xsd:codelist:01.01" xmlns:tns="urn:rosettanet:specification:domain:Design:xsd:schema:01.01" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:01.01" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:01.01" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:01.01" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.02" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;If the occurence of MaterialMass/MassPercentage is between 1 and unbounded then the value of MaterialMass/UnitOfMeasure MUST be 'KIG'.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for MaterialMassType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialMassType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Mass" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}MassPercentage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01}UnitOfMeasure"/&gt;
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
@XmlType(name = "MaterialMassType", propOrder = {
    "mass",
    "massPercentage",
    "unitOfMeasure"
})
public class MaterialMassType {

    @XmlElementRef(name = "Mass", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Mass.class, required = false)
    protected List<Mass> mass;
    @XmlElementRef(name = "MassPercentage", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = MassPercentage.class, required = false)
    protected List<MassPercentage> massPercentage;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.01", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the mass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Mass }
     * 
     * 
     */
    public List<Mass> getMass() {
        if (mass == null) {
            mass = new ArrayList<Mass>();
        }
        return this.mass;
    }

    /**
     * Gets the value of the massPercentage property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the massPercentage property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMassPercentage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MassPercentage }
     * 
     * 
     */
    public List<MassPercentage> getMassPercentage() {
        if (massPercentage == null) {
            massPercentage = new ArrayList<MassPercentage>();
        }
        return this.massPercentage;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
