
package io.dscope.rosettanet.interchange.thresholdreleaseforecastnotification.v02_01;

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
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerIdentificationType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for PartnerProductForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerProductForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ForecastPartner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProductForecastInformation" type="{urn:rosettanet:specification:interchange:ThresholdReleaseForecastNotification:xsd:schema:02.01}ProductForecastInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SoldToPartner" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerIdentificationType"/&gt;
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
@XmlType(name = "PartnerProductForecastType", propOrder = {
    "forecastPartner",
    "productForecastInformation",
    "soldToPartner"
})
public class PartnerProductForecastType {

    @XmlElement(name = "ForecastPartner", required = true)
    protected List<SpecifiedPartnerDescriptionType> forecastPartner;
    @XmlElement(name = "ProductForecastInformation", required = true)
    protected List<ProductForecastInformationType> productForecastInformation;
    @XmlElement(name = "SoldToPartner", required = true)
    protected PartnerIdentificationType soldToPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forecastPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForecastPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedPartnerDescriptionType }
     * 
     * 
     */
    public List<SpecifiedPartnerDescriptionType> getForecastPartner() {
        if (forecastPartner == null) {
            forecastPartner = new ArrayList<SpecifiedPartnerDescriptionType>();
        }
        return this.forecastPartner;
    }

    /**
     * Gets the value of the productForecastInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productForecastInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductForecastInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductForecastInformationType }
     * 
     * 
     */
    public List<ProductForecastInformationType> getProductForecastInformation() {
        if (productForecastInformation == null) {
            productForecastInformation = new ArrayList<ProductForecastInformationType>();
        }
        return this.productForecastInformation;
    }

    /**
     * Gets the value of the soldToPartner property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerIdentificationType }
     *     
     */
    public PartnerIdentificationType getSoldToPartner() {
        return soldToPartner;
    }

    /**
     * Sets the value of the soldToPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerIdentificationType }
     *     
     */
    public void setSoldToPartner(PartnerIdentificationType value) {
        this.soldToPartner = value;
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
