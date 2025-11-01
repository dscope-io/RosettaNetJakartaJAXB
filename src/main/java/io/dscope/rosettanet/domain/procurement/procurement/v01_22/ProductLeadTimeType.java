
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.interval.v01_02.Interval;
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_02.LeadTimeClassificationCode;


/**
 * <p>Java class for ProductLeadTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLeadTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:Interval:xsd:codelist:01.02}Interval"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}IsCallFactory" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22}LeadTimeQuantity" minOccurs="0"/&gt;
 *         &lt;element name="PeriodNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "ProductLeadTimeType", propOrder = {
    "interval",
    "isCallFactory",
    "leadTimeClassificationCode",
    "leadTimeQuantity",
    "periodNumber"
})
public class ProductLeadTimeType {

    @XmlElementRef(name = "Interval", namespace = "urn:rosettanet:specification:domain:Procurement:Interval:xsd:codelist:01.02", type = Interval.class)
    protected Interval interval;
    @XmlElementRef(name = "IsCallFactory", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", type = IsCallFactory.class, required = false)
    protected IsCallFactory isCallFactory;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElementRef(name = "LeadTimeQuantity", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", type = LeadTimeQuantity.class, required = false)
    protected LeadTimeQuantity leadTimeQuantity;
    @XmlElement(name = "PeriodNumber", required = true)
    protected String periodNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link Interval }
     *     
     */
    public Interval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link Interval }
     *     
     */
    public void setInterval(Interval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the isCallFactory property.
     * 
     * @return
     *     possible object is
     *     {@link IsCallFactory }
     *     
     */
    public IsCallFactory getIsCallFactory() {
        return isCallFactory;
    }

    /**
     * Sets the value of the isCallFactory property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsCallFactory }
     *     
     */
    public void setIsCallFactory(IsCallFactory value) {
        this.isCallFactory = value;
    }

    /**
     * Gets the value of the leadTimeClassificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public LeadTimeClassificationCode getLeadTimeClassificationCode() {
        return leadTimeClassificationCode;
    }

    /**
     * Sets the value of the leadTimeClassificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeClassificationCode }
     *     
     */
    public void setLeadTimeClassificationCode(LeadTimeClassificationCode value) {
        this.leadTimeClassificationCode = value;
    }

    /**
     * Gets the value of the leadTimeQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeQuantity }
     *     
     */
    public LeadTimeQuantity getLeadTimeQuantity() {
        return leadTimeQuantity;
    }

    /**
     * Sets the value of the leadTimeQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeQuantity }
     *     
     */
    public void setLeadTimeQuantity(LeadTimeQuantity value) {
        this.leadTimeQuantity = value;
    }

    /**
     * Gets the value of the periodNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodNumber() {
        return periodNumber;
    }

    /**
     * Sets the value of the periodNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodNumber(String value) {
        this.periodNumber = value;
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
