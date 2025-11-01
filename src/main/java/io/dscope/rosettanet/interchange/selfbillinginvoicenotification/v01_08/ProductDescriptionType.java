
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_08;

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
import io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03.NationalExportControlClassification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.LotIdentification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxSummary;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductSerialIdentification;


/**
 * <p>Java class for ProductDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}LotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03}NationalExportControlClassification" minOccurs="0"/&gt;
 *         &lt;element name="NationalHarmonizedTariffScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductMovement" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.08}ProductMovementType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductSerialIdentification" minOccurs="0"/&gt;
 *         &lt;element name="ProprietaryInformation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}TaxSummary" minOccurs="0"/&gt;
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
@XmlType(name = "ProductDescriptionType", propOrder = {
    "countryOfOrigin",
    "lotIdentification",
    "nationalExportControlClassification",
    "nationalHarmonizedTariffScheduleCode",
    "productMovement",
    "productSerialIdentification",
    "proprietaryInformation",
    "remitToTax",
    "shippingServiceLevel",
    "soldToTax",
    "taxSummary"
})
public class ProductDescriptionType {

    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = LotIdentification.class, required = false)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "NationalExportControlClassification", namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", type = NationalExportControlClassification.class, required = false)
    protected NationalExportControlClassification nationalExportControlClassification;
    @XmlElement(name = "NationalHarmonizedTariffScheduleCode")
    protected String nationalHarmonizedTariffScheduleCode;
    @XmlElement(name = "ProductMovement", required = true)
    protected List<ProductMovementType> productMovement;
    @XmlElementRef(name = "ProductSerialIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductSerialIdentification.class, required = false)
    protected ProductSerialIdentification productSerialIdentification;
    @XmlElement(name = "ProprietaryInformation")
    protected String proprietaryInformation;
    @XmlElement(name = "RemitToTax")
    protected TaxSummaryType remitToTax;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "SoldToTax")
    protected TaxSummaryType soldToTax;
    @XmlElementRef(name = "TaxSummary", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = TaxSummary.class, required = false)
    protected TaxSummary taxSummary;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountryOfOrigin() {
        return countryOfOrigin;
    }

    /**
     * Sets the value of the countryOfOrigin property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountryOfOrigin(CountryType value) {
        this.countryOfOrigin = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

    /**
     * Gets the value of the nationalExportControlClassification property.
     * 
     * @return
     *     possible object is
     *     {@link NationalExportControlClassification }
     *     
     */
    public NationalExportControlClassification getNationalExportControlClassification() {
        return nationalExportControlClassification;
    }

    /**
     * Sets the value of the nationalExportControlClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link NationalExportControlClassification }
     *     
     */
    public void setNationalExportControlClassification(NationalExportControlClassification value) {
        this.nationalExportControlClassification = value;
    }

    /**
     * Gets the value of the nationalHarmonizedTariffScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalHarmonizedTariffScheduleCode() {
        return nationalHarmonizedTariffScheduleCode;
    }

    /**
     * Sets the value of the nationalHarmonizedTariffScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalHarmonizedTariffScheduleCode(String value) {
        this.nationalHarmonizedTariffScheduleCode = value;
    }

    /**
     * Gets the value of the productMovement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMovement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMovement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMovementType }
     * 
     * 
     */
    public List<ProductMovementType> getProductMovement() {
        if (productMovement == null) {
            productMovement = new ArrayList<ProductMovementType>();
        }
        return this.productMovement;
    }

    /**
     * Gets the value of the productSerialIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public ProductSerialIdentification getProductSerialIdentification() {
        return productSerialIdentification;
    }

    /**
     * Sets the value of the productSerialIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public void setProductSerialIdentification(ProductSerialIdentification value) {
        this.productSerialIdentification = value;
    }

    /**
     * Gets the value of the proprietaryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProprietaryInformation() {
        return proprietaryInformation;
    }

    /**
     * Sets the value of the proprietaryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProprietaryInformation(String value) {
        this.proprietaryInformation = value;
    }

    /**
     * Gets the value of the remitToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getRemitToTax() {
        return remitToTax;
    }

    /**
     * Sets the value of the remitToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setRemitToTax(TaxSummaryType value) {
        this.remitToTax = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
    }

    /**
     * Gets the value of the soldToTax property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummaryType }
     *     
     */
    public TaxSummaryType getSoldToTax() {
        return soldToTax;
    }

    /**
     * Sets the value of the soldToTax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummaryType }
     *     
     */
    public void setSoldToTax(TaxSummaryType value) {
        this.soldToTax = value;
    }

    /**
     * Gets the value of the taxSummary property.
     * 
     * @return
     *     possible object is
     *     {@link TaxSummary }
     *     
     */
    public TaxSummary getTaxSummary() {
        return taxSummary;
    }

    /**
     * Sets the value of the taxSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxSummary }
     *     
     */
    public void setTaxSummary(TaxSummary value) {
        this.taxSummary = value;
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
