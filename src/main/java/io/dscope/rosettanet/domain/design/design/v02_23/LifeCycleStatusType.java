
package io.dscope.rosettanet.domain.design.design.v02_23;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.codelist.productlifecyclestatuscode.v01_03.ProductLifeCycleStatusCode;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;


/**
 * <p>Java class for LifeCycleStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LifeCycleStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EffectiveDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.03}ProductLifeCycleStatusCode"/&gt;
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
@XmlType(name = "LifeCycleStatusType", propOrder = {
    "effectiveDate",
    "productLifeCycleStatusCode"
})
public class LifeCycleStatusType {

    @XmlElement(name = "EffectiveDate")
    protected DatePeriodType effectiveDate;
    @XmlElementRef(name = "ProductLifeCycleStatusCode", namespace = "urn:rosettanet:specification:domain:Design:ProductLifeCycleStatusCode:xsd:codelist:01.03", type = ProductLifeCycleStatusCode.class)
    protected ProductLifeCycleStatusCode productLifeCycleStatusCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setEffectiveDate(DatePeriodType value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the productLifeCycleStatusCode property.
     * 
     * @return
     *     possible object is
     *     {@link ProductLifeCycleStatusCode }
     *     
     */
    public ProductLifeCycleStatusCode getProductLifeCycleStatusCode() {
        return productLifeCycleStatusCode;
    }

    /**
     * Sets the value of the productLifeCycleStatusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductLifeCycleStatusCode }
     *     
     */
    public void setProductLifeCycleStatusCode(ProductLifeCycleStatusCode value) {
        this.productLifeCycleStatusCode = value;
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
