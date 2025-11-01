
package io.dscope.rosettanet.interchange.strategicforecastnotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ForecastProductSchedule;
import io.dscope.rosettanet.interchange.codelist.strategicforecastquantitytype.v01_01.StrategicForecastQuantityType;


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
 *         &lt;element ref="{urn:rosettanet:specification:interchange:StrategicForecastQuantityType:xsd:codelist:01.01}StrategicForecastQuantityType"/&gt;
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
    "strategicForecastQuantityType"
})
public class ProductScheduleType {

    @XmlElementRef(name = "ForecastProductSchedule", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ForecastProductSchedule.class)
    protected List<ForecastProductSchedule> forecastProductSchedule;
    @XmlElementRef(name = "StrategicForecastQuantityType", namespace = "urn:rosettanet:specification:interchange:StrategicForecastQuantityType:xsd:codelist:01.01", type = StrategicForecastQuantityType.class)
    protected StrategicForecastQuantityType strategicForecastQuantityType;
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
     * Gets the value of the strategicForecastQuantityType property.
     * 
     * @return
     *     possible object is
     *     {@link StrategicForecastQuantityType }
     *     
     */
    public StrategicForecastQuantityType getStrategicForecastQuantityType() {
        return strategicForecastQuantityType;
    }

    /**
     * Sets the value of the strategicForecastQuantityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StrategicForecastQuantityType }
     *     
     */
    public void setStrategicForecastQuantityType(StrategicForecastQuantityType value) {
        this.strategicForecastQuantityType = value;
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
