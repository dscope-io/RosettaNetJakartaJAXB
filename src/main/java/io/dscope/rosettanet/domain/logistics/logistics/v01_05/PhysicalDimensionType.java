
package io.dscope.rosettanet.domain.logistics.logistics.v01_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.physicaldimension.v01_01.Linear;


/**
 * <p>Java class for PhysicalDimensionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalDimensionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}Linear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05}MassPhysicalDimension" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalDimensionType", propOrder = {
    "linear",
    "massPhysicalDimension"
})
public class PhysicalDimensionType {

    @XmlElementRef(name = "Linear", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01", type = Linear.class, required = false)
    protected Linear linear;
    @XmlElementRef(name = "MassPhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:01.05", type = MassPhysicalDimension.class, required = false)
    protected MassPhysicalDimension massPhysicalDimension;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the linear property.
     * 
     * @return
     *     possible object is
     *     {@link Linear }
     *     
     */
    public Linear getLinear() {
        return linear;
    }

    /**
     * Sets the value of the linear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linear }
     *     
     */
    public void setLinear(Linear value) {
        this.linear = value;
    }

    /**
     * Gets the value of the massPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public MassPhysicalDimension getMassPhysicalDimension() {
        return massPhysicalDimension;
    }

    /**
     * Sets the value of the massPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public void setMassPhysicalDimension(MassPhysicalDimension value) {
        this.massPhysicalDimension = value;
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
