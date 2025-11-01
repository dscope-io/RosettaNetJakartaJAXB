
package io.dscope.rosettanet.interchange.embeddedreleaseforecastnotification.v01_00;

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
import io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_04.ForecastQuantityTypeType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ForecastProductSchedule;


/**
 * <p>Java class for ProductScheduleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductScheduleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ForecastProductSchedule" maxOccurs="unbounded"/&gt;
 *         &lt;element name="OrderForecastQuantityType" type="{urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.04}ForecastQuantityTypeType"/&gt;
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
@XmlType(name = "ProductScheduleType", propOrder = {
    "forecastProductSchedule",
    "orderForecastQuantityType"
})
public class ProductScheduleType {

    @XmlElementRef(name = "ForecastProductSchedule", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ForecastProductSchedule.class)
    protected List<ForecastProductSchedule> forecastProductSchedule;
    @XmlElement(name = "OrderForecastQuantityType", required = true)
    protected ForecastQuantityTypeType orderForecastQuantityType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastProductSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastProductSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastProductSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastProductSchedule }
     * 
     * 
     */
    public List<ForecastProductSchedule> getForecastProductSchedule() {
        if (forecastProductSchedule == null) {
            forecastProductSchedule = new ArrayList<ForecastProductSchedule>();
        }
        return this.forecastProductSchedule;
    }

    /**
     * Gets the value of the orderForecastQuantityType property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastQuantityTypeType }
     *     
     */
    public ForecastQuantityTypeType getOrderForecastQuantityType() {
        return orderForecastQuantityType;
    }

    /**
     * Sets the value of the orderForecastQuantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastQuantityTypeType }
     *     
     */
    public void setOrderForecastQuantityType(ForecastQuantityTypeType value) {
        this.orderForecastQuantityType = value;
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
