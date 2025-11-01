
package io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationreasontype.v01_03.ShippingOrderCancellationReasonType;
import io.dscope.rosettanet.domain.logistics.codelist.shippingordercancellationstatus.v01_03.ShippingOrderCancellationStatus;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dl="urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08" xmlns:doa="urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03" xmlns:dsocrt="urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.03" xmlns:dsocs="urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03" xmlns:p703799_="http://java.sun.com/xml/ns/jaxb" xmlns:p884531_="http://annox.dev.java.net" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.11" xmlns:st="http://www.ascc.net/xml/schematron" xmlns:tns="urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.00" xmlns:udc="urn:rosettanet:specification:universal:Document:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.08" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In CancellationConfirmation, if the value of ShippingOrderCancellationStatus is equal to 'REJ' then the occurence of ShippingOrderCancellationReasonType MUST be 1.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for CancellationConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CancellationConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.03}ShippingOrderCancellationReasonType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03}ShippingOrderCancellationStatus"/&gt;
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
@XmlType(name = "CancellationConfirmationType", propOrder = {
    "shippingOrderCancellationReasonType",
    "shippingOrderCancellationStatus"
})
public class CancellationConfirmationType {

    @XmlElementRef(name = "ShippingOrderCancellationReasonType", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationReasonType:xsd:codelist:01.03", type = ShippingOrderCancellationReasonType.class, required = false)
    protected ShippingOrderCancellationReasonType shippingOrderCancellationReasonType;
    @XmlElementRef(name = "ShippingOrderCancellationStatus", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderCancellationStatus:xsd:codelist:01.03", type = ShippingOrderCancellationStatus.class)
    protected ShippingOrderCancellationStatus shippingOrderCancellationStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shippingOrderCancellationReasonType property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderCancellationReasonType }
     *     
     */
    public ShippingOrderCancellationReasonType getShippingOrderCancellationReasonType() {
        return shippingOrderCancellationReasonType;
    }

    /**
     * Sets the value of the shippingOrderCancellationReasonType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderCancellationReasonType }
     *     
     */
    public void setShippingOrderCancellationReasonType(ShippingOrderCancellationReasonType value) {
        this.shippingOrderCancellationReasonType = value;
    }

    /**
     * Gets the value of the shippingOrderCancellationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderCancellationStatus }
     *     
     */
    public ShippingOrderCancellationStatus getShippingOrderCancellationStatus() {
        return shippingOrderCancellationStatus;
    }

    /**
     * Sets the value of the shippingOrderCancellationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderCancellationStatus }
     *     
     */
    public void setShippingOrderCancellationStatus(ShippingOrderCancellationStatus value) {
        this.shippingOrderCancellationStatus = value;
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
