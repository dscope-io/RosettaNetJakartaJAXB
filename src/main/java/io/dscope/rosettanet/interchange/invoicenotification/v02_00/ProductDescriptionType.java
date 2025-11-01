
package io.dscope.rosettanet.interchange.invoicenotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_07.LotIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;


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
 *         &lt;element name="HarmonizedTariffScheduleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07}LotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03}NationalExportControlClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "harmonizedTariffScheduleCode",
    "lotIdentification",
    "nationalExportControlClassification",
    "productIdentification",
    "serialIdentifier"
})
public class ProductDescriptionType {

    @XmlElement(name = "HarmonizedTariffScheduleCode")
    protected String harmonizedTariffScheduleCode;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.07", type = LotIdentification.class, required = false)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "NationalExportControlClassification", namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", type = NationalExportControlClassification.class, required = false)
    protected NationalExportControlClassification nationalExportControlClassification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "SerialIdentifier")
    protected String serialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the harmonizedTariffScheduleCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHarmonizedTariffScheduleCode() {
        return harmonizedTariffScheduleCode;
    }

    /**
     * Sets the value of the harmonizedTariffScheduleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHarmonizedTariffScheduleCode(String value) {
        this.harmonizedTariffScheduleCode = value;
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
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialIdentifier() {
        return serialIdentifier;
    }

    /**
     * Sets the value of the serialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialIdentifier(String value) {
        this.serialIdentifier = value;
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
