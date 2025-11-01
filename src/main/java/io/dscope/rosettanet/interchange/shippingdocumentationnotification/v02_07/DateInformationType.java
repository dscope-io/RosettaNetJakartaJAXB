
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateType;


/**
 * <p>Java class for DateInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ActualCargoUnloadingDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedCargoUnloadingPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="PermitValidityDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
 *         &lt;element name="TemporaryImportDatePeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateType" minOccurs="0"/&gt;
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
@XmlType(name = "DateInformationType", propOrder = {
    "actualCargoUnloadingDatePeriod",
    "expectedCargoUnloadingPeriod",
    "permitValidityDatePeriod",
    "temporaryImportDatePeriod"
})
public class DateInformationType {

    @XmlElement(name = "ActualCargoUnloadingDatePeriod")
    protected StartAndEndDateType actualCargoUnloadingDatePeriod;
    @XmlElement(name = "ExpectedCargoUnloadingPeriod")
    protected StartAndEndDateType expectedCargoUnloadingPeriod;
    @XmlElement(name = "PermitValidityDatePeriod")
    protected StartAndEndDateType permitValidityDatePeriod;
    @XmlElement(name = "TemporaryImportDatePeriod")
    protected StartAndEndDateType temporaryImportDatePeriod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the actualCargoUnloadingDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getActualCargoUnloadingDatePeriod() {
        return actualCargoUnloadingDatePeriod;
    }

    /**
     * Sets the value of the actualCargoUnloadingDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setActualCargoUnloadingDatePeriod(StartAndEndDateType value) {
        this.actualCargoUnloadingDatePeriod = value;
    }

    /**
     * Gets the value of the expectedCargoUnloadingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getExpectedCargoUnloadingPeriod() {
        return expectedCargoUnloadingPeriod;
    }

    /**
     * Sets the value of the expectedCargoUnloadingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setExpectedCargoUnloadingPeriod(StartAndEndDateType value) {
        this.expectedCargoUnloadingPeriod = value;
    }

    /**
     * Gets the value of the permitValidityDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getPermitValidityDatePeriod() {
        return permitValidityDatePeriod;
    }

    /**
     * Sets the value of the permitValidityDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setPermitValidityDatePeriod(StartAndEndDateType value) {
        this.permitValidityDatePeriod = value;
    }

    /**
     * Gets the value of the temporaryImportDatePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateType }
     *     
     */
    public StartAndEndDateType getTemporaryImportDatePeriod() {
        return temporaryImportDatePeriod;
    }

    /**
     * Sets the value of the temporaryImportDatePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateType }
     *     
     */
    public void setTemporaryImportDatePeriod(StartAndEndDateType value) {
        this.temporaryImportDatePeriod = value;
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
