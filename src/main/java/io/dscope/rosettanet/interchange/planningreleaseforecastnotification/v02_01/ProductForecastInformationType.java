
package io.dscope.rosettanet.interchange.planningreleaseforecastnotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ProductForecastType;


/**
 * <p>Java class for ProductForecastInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductForecastInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ProductForecastType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProductSchedule" type="{urn:rosettanet:specification:interchange:PlanningReleaseForecastNotification:xsd:schema:02.01}ProductScheduleType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductForecastInformationType", propOrder = {
    "productSchedule"
})
public class ProductForecastInformationType
    extends ProductForecastType
{

    @XmlElement(name = "ProductSchedule", required = true)
    protected List<ProductScheduleType> productSchedule;

    /**
     * Gets the value of the productSchedule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productSchedule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductSchedule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductScheduleType }
     * 
     * 
     */
    public List<ProductScheduleType> getProductSchedule() {
        if (productSchedule == null) {
            productSchedule = new ArrayList<ProductScheduleType>();
        }
        return this.productSchedule;
    }

}
