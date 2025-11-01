
package io.dscope.rosettanet.interchange.quoterequest.v01_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for QuoteQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ManufacturerMinimumPackageQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="TransportationSchedule" type="{urn:rosettanet:specification:interchange:QuoteRequest:xsd:schema:01.03}TransportationScheduleType"/&gt;
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
@XmlType(name = "QuoteQuantityType", propOrder = {
    "manufacturerMinimumPackageQuantity",
    "minimumOrderQuantity",
    "transportationSchedule"
})
public class QuoteQuantityType {

    @XmlElement(name = "ManufacturerMinimumPackageQuantity")
    protected Float manufacturerMinimumPackageQuantity;
    @XmlElement(name = "MinimumOrderQuantity")
    protected Float minimumOrderQuantity;
    @XmlElement(name = "TransportationSchedule", required = true)
    protected TransportationScheduleType transportationSchedule;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getManufacturerMinimumPackageQuantity() {
        return manufacturerMinimumPackageQuantity;
    }

    /**
     * Sets the value of the manufacturerMinimumPackageQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setManufacturerMinimumPackageQuantity(Float value) {
        this.manufacturerMinimumPackageQuantity = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumOrderQuantity(Float value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the transportationSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link TransportationScheduleType }
     *     
     */
    public TransportationScheduleType getTransportationSchedule() {
        return transportationSchedule;
    }

    /**
     * Sets the value of the transportationSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransportationScheduleType }
     *     
     */
    public void setTransportationSchedule(TransportationScheduleType value) {
        this.transportationSchedule = value;
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
