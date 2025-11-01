
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.GeographicRegion;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.IsRegisterable;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductClassification;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductPricingType;
import io.dscope.rosettanet.interchange.codelist.parttype.v02_00.PartType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescription;


/**
 * <p>Java class for EligibleProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EligibleProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveRegistrationDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}GeographicRegion" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsRegisterable"/&gt;
 *         &lt;element name="LastShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MinimumOrderQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00}PartType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescription" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductPricingType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "EligibleProductInformationType", propOrder = {
    "effectiveRegistrationDate",
    "geographicRegion",
    "isRegisterable",
    "lastShipDate",
    "minimumOrderQuantity",
    "partType",
    "productClassification",
    "productIdentification",
    "textualDescription",
    "unitPrice"
})
public class EligibleProductInformationType {

    @XmlElement(name = "EffectiveRegistrationDate")
    protected DatePeriodType effectiveRegistrationDate;
    @XmlElementRef(name = "GeographicRegion", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = GeographicRegion.class, required = false)
    protected GeographicRegion geographicRegion;
    @XmlElementRef(name = "IsRegisterable", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsRegisterable.class)
    protected IsRegisterable isRegisterable;
    @XmlElement(name = "LastShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastShipDate;
    @XmlElement(name = "MinimumOrderQuantity")
    protected Float minimumOrderQuantity;
    @XmlElementRef(name = "PartType", namespace = "urn:rosettanet:specification:interchange:PartType:xsd:codelist:02.00", type = PartType.class)
    protected PartType partType;
    @XmlElementRef(name = "ProductClassification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductClassification.class, required = false)
    protected ProductClassification productClassification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "TextualDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = TextualDescription.class, required = false)
    protected TextualDescription textualDescription;
    @XmlElement(name = "UnitPrice")
    protected List<ProductPricingType> unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the effectiveRegistrationDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveRegistrationDate() {
        return effectiveRegistrationDate;
    }

    /**
     * Sets the value of the effectiveRegistrationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveRegistrationDate(DatePeriodType value) {
        this.effectiveRegistrationDate = value;
    }

    /**
     * Gets the value of the geographicRegion property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegion }
     *     
     */
    public GeographicRegion getGeographicRegion() {
        return geographicRegion;
    }

    /**
     * Sets the value of the geographicRegion property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegion }
     *     
     */
    public void setGeographicRegion(GeographicRegion value) {
        this.geographicRegion = value;
    }

    /**
     * Gets the value of the isRegisterable property.
     * 
     * @return
     *     possible object is
     *     {@link IsRegisterable }
     *     
     */
    public IsRegisterable getIsRegisterable() {
        return isRegisterable;
    }

    /**
     * Sets the value of the isRegisterable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsRegisterable }
     *     
     */
    public void setIsRegisterable(IsRegisterable value) {
        this.isRegisterable = value;
    }

    /**
     * Gets the value of the lastShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastShipDate() {
        return lastShipDate;
    }

    /**
     * Sets the value of the lastShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastShipDate(XMLGregorianCalendar value) {
        this.lastShipDate = value;
    }

    /**
     * Gets the value of the minimumOrderQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumOrderQuantity() {
        return minimumOrderQuantity;
    }

    /**
     * Sets the value of the minimumOrderQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumOrderQuantity(Float value) {
        this.minimumOrderQuantity = value;
    }

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link PartType }
     *     
     */
    public PartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartType }
     *     
     */
    public void setPartType(PartType value) {
        this.partType = value;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification }
     *     
     */
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification }
     *     
     */
    public void setProductClassification(ProductClassification value) {
        this.productClassification = value;
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
     * Gets the value of the textualDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescription }
     *     
     */
    public TextualDescription getTextualDescription() {
        return textualDescription;
    }

    /**
     * Sets the value of the textualDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescription }
     *     
     */
    public void setTextualDescription(TextualDescription value) {
        this.textualDescription = value;
    }

    /**
     * Gets the value of the unitPrice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitPrice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitPrice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductPricingType }
     * 
     * 
     */
    public List<ProductPricingType> getUnitPrice() {
        if (unitPrice == null) {
            unitPrice = new ArrayList<ProductPricingType>();
        }
        return this.unitPrice;
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
