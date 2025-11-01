
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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


/**
 * <p>Java class for ManufacturingLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotTraceCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}LotType"/&gt;
 *         &lt;element name="WaferInformation" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}WaferInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ManufacturingLotType", propOrder = {
    "lotTraceCode",
    "primaryLot",
    "waferInformation"
})
public class ManufacturingLotType {

    @XmlElement(name = "LotTraceCode")
    protected String lotTraceCode;
    @XmlElement(name = "PrimaryLot", required = true)
    protected LotType primaryLot;
    @XmlElement(name = "WaferInformation")
    protected List<WaferInformationType> waferInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotTraceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLotTraceCode() {
        return lotTraceCode;
    }

    /**
     * Sets the value of the lotTraceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLotTraceCode(String value) {
        this.lotTraceCode = value;
    }

    /**
     * Gets the value of the primaryLot property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getPrimaryLot() {
        return primaryLot;
    }

    /**
     * Sets the value of the primaryLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setPrimaryLot(LotType value) {
        this.primaryLot = value;
    }

    /**
     * Gets the value of the waferInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waferInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaferInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaferInformationType }
     * 
     * 
     */
    public List<WaferInformationType> getWaferInformation() {
        if (waferInformation == null) {
            waferInformation = new ArrayList<WaferInformationType>();
        }
        return this.waferInformation;
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
