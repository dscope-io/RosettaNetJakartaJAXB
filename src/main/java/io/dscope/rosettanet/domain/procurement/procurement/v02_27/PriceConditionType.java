
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;


/**
 * <p>Java class for PriceConditionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PriceConditionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="GeneralServiceAdministrationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceCondition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPricingDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
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
@XmlType(name = "PriceConditionType", propOrder = {
    "contractIdentifier",
    "generalServiceAdministrationNumber",
    "specialPriceCondition",
    "specialPricingDatePeriod"
})
public class PriceConditionType {

    @XmlElement(name = "ContractIdentifier")
    protected BusinessDocumentReferenceType contractIdentifier;
    @XmlElement(name = "GeneralServiceAdministrationNumber")
    protected BusinessDocumentReferenceType generalServiceAdministrationNumber;
    @XmlElement(name = "SpecialPriceCondition")
    protected String specialPriceCondition;
    @XmlElement(name = "SpecialPricingDatePeriod")
    protected DatePeriodType specialPricingDatePeriod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setContractIdentifier(BusinessDocumentReferenceType value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the generalServiceAdministrationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGeneralServiceAdministrationNumber() {
        return generalServiceAdministrationNumber;
    }

    /**
     * Sets the value of the generalServiceAdministrationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGeneralServiceAdministrationNumber(BusinessDocumentReferenceType value) {
        this.generalServiceAdministrationNumber = value;
    }

    /**
     * Gets the value of the specialPriceCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialPriceCondition() {
        return specialPriceCondition;
    }

    /**
     * Sets the value of the specialPriceCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialPriceCondition(String value) {
        this.specialPriceCondition = value;
    }

    /**
     * Gets the value of the specialPricingDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getSpecialPricingDatePeriod() {
        return specialPricingDatePeriod;
    }

    /**
     * Sets the value of the specialPricingDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setSpecialPricingDatePeriod(DatePeriodType value) {
        this.specialPricingDatePeriod = value;
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
