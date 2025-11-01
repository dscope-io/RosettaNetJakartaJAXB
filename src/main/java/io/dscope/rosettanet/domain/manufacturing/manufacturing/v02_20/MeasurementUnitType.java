
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;


/**
 * <p>Java class for MeasurementUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MeasurementUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20}ProprietaryUnits"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
@XmlType(name = "MeasurementUnitType", propOrder = {
    "proprietaryUnits",
    "unitOfMeasure"
})
public class MeasurementUnitType {

    @XmlElementRef(name = "ProprietaryUnits", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", type = ProprietaryUnits.class, required = false)
    protected ProprietaryUnits proprietaryUnits;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the proprietaryUnits property.
     * 
     * @return
     *     possible object is
     *     {@link ProprietaryUnits }
     *     
     */
    public ProprietaryUnits getProprietaryUnits() {
        return proprietaryUnits;
    }

    /**
     * Sets the value of the proprietaryUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProprietaryUnits }
     *     
     */
    public void setProprietaryUnits(ProprietaryUnits value) {
        this.proprietaryUnits = value;
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
