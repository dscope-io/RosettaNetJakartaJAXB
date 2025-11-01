
package io.dscope.rosettanet.domain.procurement.procurement.v02_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.shared.v01_04.ManufacturedDate;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;
import io.dscope.rosettanet.universal.productidentification.v01_03.ProductIdentification;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dacc="urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.03" xmlns:dbpq="urn:rosettanet:specification:domain:Procurement:BookPriceQualifier:xsd:codelist:01.04" xmlns:dccc="urn:rosettanet:specification:domain:Procurement:CreditCardClassification:xsd:codelist:01.03" xmlns:dcrt="urn:rosettanet:specification:domain:Procurement:CustomerType:xsd:codelist:01.03" xmlns:dfe="urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:01.03" xmlns:dfrt="urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.03" xmlns:dft="urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.03" xmlns:dit="urn:rosettanet:specification:domain:Procurement:InventoryType:xsd:codelist:01.03" xmlns:dltcc="urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.03" xmlns:dpc="urn:rosettanet:specification:domain:Procurement:PaymentCondition:xsd:codelist:01.03" xmlns:dpcm="urn:rosettanet:specification:domain:Procurement:PurchaseMethod:xsd:codelist:01.03" xmlns:dpsr="urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03" xmlns:dsfr="urn:rosettanet:specification:domain:Procurement:SpecialFulfillmentRequest:xsd:codelist:01.03" xmlns:dsh="urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.03" xmlns:dslt="urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.03" xmlns:dst="urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03" xmlns:dte="urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03" xmlns:dtec="urn:rosettanet:specification:domain:Procurement:TaxExemptionCode:xsd:codelist:01.03" xmlns:dtq="urn:rosettanet:specification:domain:Procurement:TotalQualifier:xsd:codelist:01.03" xmlns:dtt="urn:rosettanet:specification:domain:Procurement:TransactionType:xsd:codelist:01.04" xmlns:rfob="urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.01" xmlns:ri="urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01" xmlns:rict="urn:rosettanet:specification:domain:Shared:InvoiceChargeType:xsd:codelist:01.01" xmlns:rmat="urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01" xmlns:rpm="urn:rosettanet:specification:domain:Shared:PaymentMethod:xsd:codelist:01.01" xmlns:rptc="urn:rosettanet:specification:domain:Shared:PricingTypeCode:xsd:codelist:01.02" xmlns:rssl="urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.04" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.06" xmlns:uat="urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.02" xmlns:uc="urn:rosettanet:specification:universal:Country:xsd:codelist:01.02" xmlns:ucr="urn:rosettanet:specification:universal:Currency:xsd:codelist:01.02" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.03" xmlns:ulc="urn:rosettanet:specification:universal:Locations:xsd:schema:01.03" xmlns:ume="urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.02" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.06" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.02" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In InventoryItemIdentification, at least one occurrence of CountryOfOrigin, ManufacturedDate or ProductIdentification.&lt;/urss:Constraint&gt;
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
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}ManufacturedDate" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03}ProductIdentification" minOccurs="0"/&gt;
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
    @XmlElementRef(name = "ManufacturedDate", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", type = ManufacturedDate.class, required = false)
    protected ManufacturedDate manufacturedDate;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.03", type = ProductIdentification.class, required = false)
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
