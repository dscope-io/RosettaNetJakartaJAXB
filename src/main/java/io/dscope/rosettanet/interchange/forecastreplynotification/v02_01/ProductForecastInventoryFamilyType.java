
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastProductInventory;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ProductForecastType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for ProductForecastInventoryFamilyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductForecastInventoryFamilyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ProductForecastType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastProductInventory" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductFamilyIdentification" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductSchedule" type="{urn:rosettanet:specification:interchange:ForecastReplyNotification:xsd:schema:02.01}ProductScheduleType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductForecastInventoryFamilyType", propOrder = {
    "forecastProductInventory",
    "productFamilyIdentification",
    "productIdentification",
    "productSchedule"
})
public class ProductForecastInventoryFamilyType
    extends ProductForecastType
{

    @XmlElementRef(name = "ForecastProductInventory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = ForecastProductInventory.class, required = false)
    protected List<ForecastProductInventory> forecastProductInventory;
    @XmlElement(name = "ProductFamilyIdentification")
    protected List<ProductIdentificationType> productFamilyIdentification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected List<ProductIdentification> productIdentification;
    @XmlElement(name = "ProductSchedule", required = true)
    protected List<ProductScheduleType> productSchedule;

    /**
     * Gets the value of the forecastProductInventory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastProductInventory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastProductInventory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastProductInventory }
     * 
     * 
     */
    public List<ForecastProductInventory> getForecastProductInventory() {
        if (forecastProductInventory == null) {
            forecastProductInventory = new ArrayList<ForecastProductInventory>();
        }
        return this.forecastProductInventory;
    }

    /**
     * Gets the value of the productFamilyIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productFamilyIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductFamilyIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getProductFamilyIdentification() {
        if (productFamilyIdentification == null) {
            productFamilyIdentification = new ArrayList<ProductIdentificationType>();
        }
        return this.productFamilyIdentification;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentification }
     * 
     * 
     */
    public List<ProductIdentification> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentification>();
        }
        return this.productIdentification;
    }

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
