
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dabcc="urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02" xmlns:dalc="urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:02.15" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dppt="urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03" xmlns:p372922_="http://java.sun.com/xml/ns/jaxb" xmlns:p41377_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:tns="urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ChangeOrderWindow, at least one occurrence of CancelOrderWindow or ChangeOrderWindow.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ChangeOrderWindowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ChangeOrderWindowType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancelOrderWindow" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrderWindow" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
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
@XmlType(name = "ChangeOrderWindowType", propOrder = {
    "cancelOrderWindow",
    "changeOrderWindow"
})
public class ChangeOrderWindowType {

    @XmlElement(name = "CancelOrderWindow")
    protected Duration cancelOrderWindow;
    @XmlElement(name = "ChangeOrderWindow")
    protected Duration changeOrderWindow;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cancelOrderWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getCancelOrderWindow() {
        return cancelOrderWindow;
    }

    /**
     * Sets the value of the cancelOrderWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setCancelOrderWindow(Duration value) {
        this.cancelOrderWindow = value;
    }

    /**
     * Gets the value of the changeOrderWindow property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getChangeOrderWindow() {
        return changeOrderWindow;
    }

    /**
     * Sets the value of the changeOrderWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setChangeOrderWindow(Duration value) {
        this.changeOrderWindow = value;
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
