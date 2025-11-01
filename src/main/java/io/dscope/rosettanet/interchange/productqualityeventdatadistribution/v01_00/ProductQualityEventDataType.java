
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.GeographicRegionType;


/**
 * <p>Java class for ProductQualityEventDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductQualityEventDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RepairAndFailureData" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}RepairAndFailureDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RepairDataSupplier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}GeographicRegionType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductQualityEventDataType", propOrder = {
    "repairAndFailureData",
    "repairDataSupplier"
})
public class ProductQualityEventDataType {

    @XmlElement(name = "RepairAndFailureData", required = true)
    protected List<RepairAndFailureDataType> repairAndFailureData;
    @XmlElement(name = "RepairDataSupplier")
    protected GeographicRegionType repairDataSupplier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the repairAndFailureData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the repairAndFailureData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRepairAndFailureData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RepairAndFailureDataType }
     * 
     * 
     */
    public List<RepairAndFailureDataType> getRepairAndFailureData() {
        if (repairAndFailureData == null) {
            repairAndFailureData = new ArrayList<RepairAndFailureDataType>();
        }
        return this.repairAndFailureData;
    }

    /**
     * Gets the value of the repairDataSupplier property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegionType }
     *     
     */
    public GeographicRegionType getRepairDataSupplier() {
        return repairDataSupplier;
    }

    /**
     * Sets the value of the repairDataSupplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegionType }
     *     
     */
    public void setRepairDataSupplier(GeographicRegionType value) {
        this.repairDataSupplier = value;
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
