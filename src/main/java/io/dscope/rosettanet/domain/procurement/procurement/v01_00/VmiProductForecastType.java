
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VmiProductForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VmiProductForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductForecastType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ForecastProductInventory" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductReceiptReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmiProductForecastType", propOrder = {
    "forecastProductInventory",
    "productReceiptReference"
})
public class VmiProductForecastType
    extends ProductForecastType
{

    @XmlElementRef(name = "ForecastProductInventory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = ForecastProductInventory.class)
    protected List<ForecastProductInventory> forecastProductInventory;
    @XmlElementRef(name = "ProductReceiptReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = ProductReceiptReference.class, required = false)
    protected List<ProductReceiptReference> productReceiptReference;

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
     * Gets the value of the productReceiptReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productReceiptReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductReceiptReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductReceiptReference }
     * 
     * 
     */
    public List<ProductReceiptReference> getProductReceiptReference() {
        if (productReceiptReference == null) {
            productReceiptReference = new ArrayList<ProductReceiptReference>();
        }
        return this.productReceiptReference;
    }

}
