
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00.ManufacturedDate;
import io.dscope.rosettanet.universal.codelist.country.v01_00.CountryType;
import io.dscope.rosettanet.universal.productidentification.v01_00.ProductIdentification;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dmftn="urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0" xmlns:drbpc="urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:1.0" xmlns:drctl="urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:1.0" xmlns:drctr="urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:1.0" xmlns:drdcf="urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:1.0" xmlns:drfcr="urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:1.0" xmlns:drfct="urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0" xmlns:drfnr="urn:rosettanet:specification:domain:Procurement:FreeOnBoard:xsd:codelist:1.0" xmlns:drhgv="urn:rosettanet:specification:domain:Procurement:ShippingServiceLevel:xsd:codelist:1.0" xmlns:drmty="urn:rosettanet:specification:domain:Procurement:MonetaryAmountType:xsd:codelist:1.0" xmlns:drnsl="urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:1.0" xmlns:drntr="urn:rosettanet:specification:domain:Procurement:Interval:xsd:codelist:1.0" xmlns:drpcg="urn:rosettanet:specification:domain:Procurement:PricingTypeCode:xsd:codelist:1.0" xmlns:drpcs="urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:1.0" xmlns:drpfl="urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:1.0" xmlns:drpmt="urn:rosettanet:specification:domain:Procurement:PaymentType:xsd:codelist:1.0" xmlns:drpmt1="urn:rosettanet:specification:domain:Procurement:PaymentMethod:xsd:codelist:1.0" xmlns:drpmt11="urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:1.0" xmlns:drrcc="urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:1.0" xmlns:drrtr="urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:1.0" xmlns:drrts="urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:1.0" xmlns:drsch="urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:1.0" xmlns:drspn1="urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:1.0" xmlns:drtmt="urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:1.0" xmlns:drtnc="urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:1.0" xmlns:drtnp="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:1.0" xmlns:drtqf="urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:1.0" xmlns:drvhg="urn:rosettanet:specification:domain:Procurement:InvoiceChargeType:xsd:codelist:1.0" xmlns:drvty="urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:1.0" xmlns:dscrc="urn:rosettanet:specification:domain:Procurement:CarrierCode:xsd:codelist:1.0" xmlns:tns="urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0" xmlns:ucttf="urn:rosettanet:specification:universal:ContactInformation:xsd:schema:1.0" xmlns:udcmn="urn:rosettanet:specification:universal:Document:xsd:schema:1.0" xmlns:udts="urn:rosettanet:specification:universal:Dates:xsd:schema:1.0" xmlns:udtyp="urn:rosettanet:specification:universal:DataType:xsd:schema:1.0" xmlns:ulctn="urn:rosettanet:specification:universal:Locations:xsd:schema:1.0" xmlns:umtyp="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0" xmlns:updtn="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0" xmlns:uptrn="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0" xmlns:urntf="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:1.0" xmlns:uscnt="urn:rosettanet:specification:universal:Country:xsd:codelist:1.0" xmlns:uscrn="urn:rosettanet:specification:universal:Currency:xsd:codelist:1.0" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;At least one occurrence of countryOfOrigin/Country, manufactureDate or ProductIdentification/AlternativeIdentifier is required.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for InventoryItemIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InventoryItemIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:1.0}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0}ManufacturedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0}ProductIdentification" minOccurs="0"/&gt;
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
@XmlType(name = "InventoryItemIdentificationType", propOrder = {
    "countryOfOrigin",
    "manufacturedDate",
    "productIdentification"
})
public class InventoryItemIdentificationType {

    @XmlElement(name = "CountryOfOrigin")
    protected CountryType countryOfOrigin;
    @XmlElementRef(name = "ManufacturedDate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", type = ManufacturedDate.class, required = false)
    protected ManufacturedDate manufacturedDate;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
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
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link ManufacturedDate }
     *     
     */
    public ManufacturedDate getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ManufacturedDate }
     *     
     */
    public void setManufacturedDate(ManufacturedDate value) {
        this.manufacturedDate = value;
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
