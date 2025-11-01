
package io.dscope.rosettanet.interchange.shipmentreceiptnotification.v02_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancy.v01_03.ReceivingDiscrepancy;
import io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancyreason.v01_03.ReceivingDiscrepancyReason;


/**
 * <p>Java class for DiscrepancyInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscrepancyInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03}ReceivingDiscrepancy"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03}ReceivingDiscrepancyReason"/&gt;
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
@XmlType(name = "DiscrepancyInformationType", propOrder = {
    "receivingDiscrepancy",
    "receivingDiscrepancyReason"
})
public class DiscrepancyInformationType {

    @XmlElementRef(name = "ReceivingDiscrepancy", namespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancy:xsd:codelist:01.03", type = ReceivingDiscrepancy.class)
    protected ReceivingDiscrepancy receivingDiscrepancy;
    @XmlElementRef(name = "ReceivingDiscrepancyReason", namespace = "urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03", type = ReceivingDiscrepancyReason.class)
    protected ReceivingDiscrepancyReason receivingDiscrepancyReason;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the receivingDiscrepancy property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingDiscrepancy }
     *     
     */
    public ReceivingDiscrepancy getReceivingDiscrepancy() {
        return receivingDiscrepancy;
    }

    /**
     * Sets the value of the receivingDiscrepancy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingDiscrepancy }
     *     
     */
    public void setReceivingDiscrepancy(ReceivingDiscrepancy value) {
        this.receivingDiscrepancy = value;
    }

    /**
     * Gets the value of the receivingDiscrepancyReason property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivingDiscrepancyReason }
     *     
     */
    public ReceivingDiscrepancyReason getReceivingDiscrepancyReason() {
        return receivingDiscrepancyReason;
    }

    /**
     * Sets the value of the receivingDiscrepancyReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivingDiscrepancyReason }
     *     
     */
    public void setReceivingDiscrepancyReason(ReceivingDiscrepancyReason value) {
        this.receivingDiscrepancyReason = value;
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
