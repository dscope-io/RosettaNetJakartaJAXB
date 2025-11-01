
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;


/**
 * <p>Java class for FeeInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FeeInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DutyNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtendedPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="FeeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "FeeInformationType", propOrder = {
    "dutyNote",
    "extendedPrice",
    "feeType",
    "name",
    "unitPrice"
})
public class FeeInformationType {

    @XmlElement(name = "DutyNote")
    protected String dutyNote;
    @XmlElement(name = "ExtendedPrice")
    protected FinancialAmountType extendedPrice;
    @XmlElement(name = "FeeType")
    protected String feeType;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the dutyNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDutyNote() {
        return dutyNote;
    }

    /**
     * Sets the value of the dutyNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDutyNote(String value) {
        this.dutyNote = value;
    }

    /**
     * Gets the value of the extendedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getExtendedPrice() {
        return extendedPrice;
    }

    /**
     * Sets the value of the extendedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setExtendedPrice(FinancialAmountType value) {
        this.extendedPrice = value;
    }

    /**
     * Gets the value of the feeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeType() {
        return feeType;
    }

    /**
     * Sets the value of the feeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeType(String value) {
        this.feeType = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
