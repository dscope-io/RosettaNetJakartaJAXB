
package io.dscope.rosettanet.domain.procurement.procurement.v01_13;

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


/**
 * <p>Java class for ForecastProductScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastProductScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}ForecastPeriod"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}ProductQuantity"/&gt;
 *         &lt;element name="ScheduleProductForecastIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}ForecastIdentifierReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ForecastProductScheduleType", propOrder = {
    "forecastPeriod",
    "productQuantity",
    "scheduleProductForecastIdentifier"
})
public class ForecastProductScheduleType {

    @XmlElementRef(name = "ForecastPeriod", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = ForecastPeriod.class)
    protected ForecastPeriod forecastPeriod;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElement(name = "ScheduleProductForecastIdentifier")
    protected List<ForecastIdentifierReferenceType> scheduleProductForecastIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastPeriod }
     *     
     */
    public ForecastPeriod getForecastPeriod() {
        return forecastPeriod;
    }

    /**
     * Sets the value of the forecastPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastPeriod }
     *     
     */
    public void setForecastPeriod(ForecastPeriod value) {
        this.forecastPeriod = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the scheduleProductForecastIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scheduleProductForecastIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScheduleProductForecastIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastIdentifierReferenceType }
     * 
     * 
     */
    public List<ForecastIdentifierReferenceType> getScheduleProductForecastIdentifier() {
        if (scheduleProductForecastIdentifier == null) {
            scheduleProductForecastIdentifier = new ArrayList<ForecastIdentifierReferenceType>();
        }
        return this.scheduleProductForecastIdentifier;
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
