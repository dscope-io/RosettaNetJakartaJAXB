
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_02.LeadTimeClassificationCode;
import io.dscope.rosettanet.domain.procurement.procurement.v01_15.DatePeriodAndDuration;
import io.dscope.rosettanet.interchange.codelist.leadtimecommencement.v01_00.LeadTimeCommencement;


/**
 * <p>Java class for OrderLeadTimeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderLeadTimeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15}DatePeriodAndDuration"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02}LeadTimeClassificationCode" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.00}LeadTimeCommencement" minOccurs="0"/&gt;
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
@XmlType(name = "OrderLeadTimeType", propOrder = {
    "datePeriodAndDuration",
    "leadTimeClassificationCode",
    "leadTimeCommencement"
})
public class OrderLeadTimeType {

    @XmlElementRef(name = "DatePeriodAndDuration", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.15", type = DatePeriodAndDuration.class)
    protected DatePeriodAndDuration datePeriodAndDuration;
    @XmlElementRef(name = "LeadTimeClassificationCode", namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02", type = LeadTimeClassificationCode.class, required = false)
    protected LeadTimeClassificationCode leadTimeClassificationCode;
    @XmlElementRef(name = "LeadTimeCommencement", namespace = "urn:rosettanet:specification:interchange:LeadTimeCommencement:xsd:codelist:01.00", type = LeadTimeCommencement.class, required = false)
    protected LeadTimeCommencement leadTimeCommencement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriodAndDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public DatePeriodAndDuration getDatePeriodAndDuration() {
        return datePeriodAndDuration;
    }

    /**
     * Sets the value of the datePeriodAndDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public void setDatePeriodAndDuration(DatePeriodAndDuration value) {
        this.datePeriodAndDuration = value;
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
     * Gets the value of the leadTimeCommencement property.
     * 
     * @return
     *     possible object is
     *     {@link LeadTimeCommencement }
     *     
     */
    public LeadTimeCommencement getLeadTimeCommencement() {
        return leadTimeCommencement;
    }

    /**
     * Sets the value of the leadTimeCommencement property.
     * 
     * @param value
     *     allowed object is
     *     {@link LeadTimeCommencement }
     *     
     */
    public void setLeadTimeCommencement(LeadTimeCommencement value) {
        this.leadTimeCommencement = value;
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
