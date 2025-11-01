
package io.dscope.rosettanet.domain.procurement.procurement.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_00.ForecastEvent;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_00.UnitOfMeasure;
import io.dscope.rosettanet.universal.dates.v01_00.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_00.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.monetaryexpression.v01_00.FinancialAmountType;


/**
 * <p>Java class for ProductForecastType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductForecastType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0}ForecastEvent" minOccurs="0"/&gt;
 *         &lt;element name="FrozenZone" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:1.0}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ProductFamilyReporting"/&gt;
 *         &lt;element name="ProductForecastIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0}ForecastIdentifierReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductForecastRevision" type="{urn:rosettanet:specification:universal:Document:xsd:schema:1.0}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="TradeOffZone" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:1.0}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:1.0}UnitOfMeasure"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:1.0}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductForecastType", propOrder = {
    "forecastEvent",
    "frozenZone",
    "productFamilyReporting",
    "productForecastIdentifier",
    "productForecastRevision",
    "tradeOffZone",
    "unitOfMeasure",
    "unitPrice"
})
@XmlSeeAlso({
    VmiProductForecastType.class
})
public class ProductForecastType {

    @XmlElementRef(name = "ForecastEvent", namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0", type = ForecastEvent.class, required = false)
    protected ForecastEvent forecastEvent;
    @XmlElement(name = "FrozenZone")
    protected DatePeriodType frozenZone;
    @XmlElementRef(name = "ProductFamilyReporting", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:1.0", type = ProductFamilyReporting.class)
    protected ProductFamilyReporting productFamilyReporting;
    @XmlElement(name = "ProductForecastIdentifier")
    protected List<ForecastIdentifierReferenceType> productForecastIdentifier;
    @XmlElement(name = "ProductForecastRevision")
    protected BusinessDocumentReferenceType productForecastRevision;
    @XmlElement(name = "TradeOffZone")
    protected DatePeriodType tradeOffZone;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:1.0", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the forecastEvent property.
     * 
     * @return
     *     possible object is
     *     {@link ForecastEvent }
     *     
     */
    public ForecastEvent getForecastEvent() {
        return forecastEvent;
    }

    /**
     * Sets the value of the forecastEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForecastEvent }
     *     
     */
    public void setForecastEvent(ForecastEvent value) {
        this.forecastEvent = value;
    }

    /**
     * Gets the value of the frozenZone property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getFrozenZone() {
        return frozenZone;
    }

    /**
     * Sets the value of the frozenZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setFrozenZone(DatePeriodType value) {
        this.frozenZone = value;
    }

    /**
     * Gets the value of the productFamilyReporting property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFamilyReporting }
     *     
     */
    public ProductFamilyReporting getProductFamilyReporting() {
        return productFamilyReporting;
    }

    /**
     * Sets the value of the productFamilyReporting property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamilyReporting }
     *     
     */
    public void setProductFamilyReporting(ProductFamilyReporting value) {
        this.productFamilyReporting = value;
    }

    /**
     * Gets the value of the productForecastIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productForecastIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductForecastIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForecastIdentifierReferenceType }
     * 
     * 
     */
    public List<ForecastIdentifierReferenceType> getProductForecastIdentifier() {
        if (productForecastIdentifier == null) {
            productForecastIdentifier = new ArrayList<ForecastIdentifierReferenceType>();
        }
        return this.productForecastIdentifier;
    }

    /**
     * Gets the value of the productForecastRevision property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getProductForecastRevision() {
        return productForecastRevision;
    }

    /**
     * Sets the value of the productForecastRevision property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setProductForecastRevision(BusinessDocumentReferenceType value) {
        this.productForecastRevision = value;
    }

    /**
     * Gets the value of the tradeOffZone property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getTradeOffZone() {
        return tradeOffZone;
    }

    /**
     * Sets the value of the tradeOffZone property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setTradeOffZone(DatePeriodType value) {
        this.tradeOffZone = value;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
