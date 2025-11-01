
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.design.v02_15.LifeCycleStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ManufacturedDate;


/**
 * <p>Java class for ProductLifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLifeCycleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.15}LifeCycleStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ManufacturedDate" minOccurs="0"/&gt;
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
@XmlType(name = "ProductLifeCycleType", propOrder = {
    "lifeCycleStatus",
    "manufacturedDate"
})
public class ProductLifeCycleType {

    @XmlElementRef(name = "LifeCycleStatus", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.15", type = LifeCycleStatus.class)
    protected LifeCycleStatus lifeCycleStatus;
    @XmlElementRef(name = "ManufacturedDate", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ManufacturedDate.class, required = false)
    protected ManufacturedDate manufacturedDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lifeCycleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LifeCycleStatus }
     *     
     */
    public LifeCycleStatus getLifeCycleStatus() {
        return lifeCycleStatus;
    }

    /**
     * Sets the value of the lifeCycleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LifeCycleStatus }
     *     
     */
    public void setLifeCycleStatus(LifeCycleStatus value) {
        this.lifeCycleStatus = value;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturedDate }
     *     
     */
    public ManufacturedDate getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturedDate }
     *     
     */
    public void setManufacturedDate(ManufacturedDate value) {
        this.manufacturedDate = value;
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
