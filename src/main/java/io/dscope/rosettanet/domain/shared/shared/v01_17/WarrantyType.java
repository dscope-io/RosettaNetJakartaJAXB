
package io.dscope.rosettanet.domain.shared.shared.v01_17;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.interval.v01_01.IntervalType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriod;


/**
 * <p>Java class for WarrantyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriod" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duration" type="{urn:rosettanet:specification:domain:Shared:Interval:xsd:codelist:01.01}IntervalType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01}WarrantyType" minOccurs="0"/&gt;
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
@XmlType(name = "WarrantyType", propOrder = {
    "datePeriod",
    "description",
    "duration",
    "warrantyType"
})
public class WarrantyType {

    @XmlElementRef(name = "DatePeriod", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = DatePeriod.class, required = false)
    protected DatePeriod datePeriod;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Duration")
    protected IntervalType duration;
    @XmlElementRef(name = "WarrantyType", namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", type = io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType.class, required = false)
    protected io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType warrantyType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod }
     *     
     */
    public DatePeriod getDatePeriod() {
        return datePeriod;
    }

    /**
     * Sets the value of the datePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod }
     *     
     */
    public void setDatePeriod(DatePeriod value) {
        this.datePeriod = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link IntervalType }
     *     
     */
    public IntervalType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntervalType }
     *     
     */
    public void setDuration(IntervalType value) {
        this.duration = value;
    }

    /**
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType }
     *     
     */
    public io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType }
     *     
     */
    public void setWarrantyType(io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType value) {
        this.warrantyType = value;
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
