
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import io.dscope.rosettanet.domain.design.codelist.abccode.v01_02.ABCCode;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductLeadTime;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dabcc="urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02" xmlns:dalc="urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:02.15" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dppt="urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03" xmlns:p372922_="http://java.sun.com/xml/ns/jaxb" xmlns:p41377_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:tns="urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductProcurement, if the value of IsOnAllocation is equal to false then the occurence of ProductLeadTime MUST be between 1 and unbounded.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductProcurementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductProcurementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02}ABCCode" minOccurs="0"/&gt;
 *         &lt;element name="ChangeOrderWindow" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ChangeOrderWindowType" minOccurs="0"/&gt;
 *         &lt;element name="IsAvailableToOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsOnAllocation" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsWaiverRequiredToOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="OrderingAvailabilityDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="OrderPolicy" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="OrderProvision" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}OrderProvisionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductLeadTime" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03}ProductProcurementType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ScrapPercentage" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductProcurementType", propOrder = {
    "abcCode",
    "changeOrderWindow",
    "isAvailableToOrder",
    "isOnAllocation",
    "isWaiverRequiredToOrder",
    "orderingAvailabilityDate",
    "orderPolicy",
    "orderProvision",
    "productLeadTime",
    "productProcurementType",
    "scrapPercentage"
})
public class ProductProcurementType {

    @XmlElementRef(name = "ABCCode", namespace = "urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02", type = ABCCode.class, required = false)
    protected ABCCode abcCode;
    @XmlElement(name = "ChangeOrderWindow")
    protected ChangeOrderWindowType changeOrderWindow;
    @XmlElement(name = "IsAvailableToOrder")
    protected boolean isAvailableToOrder;
    @XmlElement(name = "IsOnAllocation")
    protected boolean isOnAllocation;
    @XmlElement(name = "IsWaiverRequiredToOrder")
    protected boolean isWaiverRequiredToOrder;
    @XmlElement(name = "OrderingAvailabilityDate")
    protected DatePeriodType orderingAvailabilityDate;
    @XmlElement(name = "OrderPolicy")
    protected Duration orderPolicy;
    @XmlElement(name = "OrderProvision")
    protected OrderProvisionType orderProvision;
    @XmlElementRef(name = "ProductLeadTime", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductLeadTime.class, required = false)
    protected List<ProductLeadTime> productLeadTime;
    @XmlElementRef(name = "ProductProcurementType", namespace = "urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03", type = io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType.class, required = false)
    protected List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> productProcurementType;
    @XmlElement(name = "ScrapPercentage")
    protected BigDecimal scrapPercentage;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the abcCode property.
     * 
     * @return
     *     possible object is
     *     {@link ABCCode }
     *     
     */
    public ABCCode getABCCode() {
        return abcCode;
    }

    /**
     * Sets the value of the abcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link ABCCode }
     *     
     */
    public void setABCCode(ABCCode value) {
        this.abcCode = value;
    }

    /**
     * Gets the value of the changeOrderWindow property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeOrderWindowType }
     *     
     */
    public ChangeOrderWindowType getChangeOrderWindow() {
        return changeOrderWindow;
    }

    /**
     * Sets the value of the changeOrderWindow property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeOrderWindowType }
     *     
     */
    public void setChangeOrderWindow(ChangeOrderWindowType value) {
        this.changeOrderWindow = value;
    }

    /**
     * Gets the value of the isAvailableToOrder property.
     * 
     */
    public boolean isIsAvailableToOrder() {
        return isAvailableToOrder;
    }

    /**
     * Sets the value of the isAvailableToOrder property.
     * 
     */
    public void setIsAvailableToOrder(boolean value) {
        this.isAvailableToOrder = value;
    }

    /**
     * Gets the value of the isOnAllocation property.
     * 
     */
    public boolean isIsOnAllocation() {
        return isOnAllocation;
    }

    /**
     * Sets the value of the isOnAllocation property.
     * 
     */
    public void setIsOnAllocation(boolean value) {
        this.isOnAllocation = value;
    }

    /**
     * Gets the value of the isWaiverRequiredToOrder property.
     * 
     */
    public boolean isIsWaiverRequiredToOrder() {
        return isWaiverRequiredToOrder;
    }

    /**
     * Sets the value of the isWaiverRequiredToOrder property.
     * 
     */
    public void setIsWaiverRequiredToOrder(boolean value) {
        this.isWaiverRequiredToOrder = value;
    }

    /**
     * Gets the value of the orderingAvailabilityDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getOrderingAvailabilityDate() {
        return orderingAvailabilityDate;
    }

    /**
     * Sets the value of the orderingAvailabilityDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setOrderingAvailabilityDate(DatePeriodType value) {
        this.orderingAvailabilityDate = value;
    }

    /**
     * Gets the value of the orderPolicy property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOrderPolicy() {
        return orderPolicy;
    }

    /**
     * Sets the value of the orderPolicy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOrderPolicy(Duration value) {
        this.orderPolicy = value;
    }

    /**
     * Gets the value of the orderProvision property.
     * 
     * @return
     *     possible object is
     *     {@link OrderProvisionType }
     *     
     */
    public OrderProvisionType getOrderProvision() {
        return orderProvision;
    }

    /**
     * Sets the value of the orderProvision property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderProvisionType }
     *     
     */
    public void setOrderProvision(OrderProvisionType value) {
        this.orderProvision = value;
    }

    /**
     * Gets the value of the productLeadTime property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productLeadTime property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductLeadTime().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductLeadTime }
     * 
     * 
     */
    public List<ProductLeadTime> getProductLeadTime() {
        if (productLeadTime == null) {
            productLeadTime = new ArrayList<ProductLeadTime>();
        }
        return this.productLeadTime;
    }

    /**
     * Gets the value of the productProcurementType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productProcurementType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductProcurementType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType }
     * 
     * 
     */
    public List<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType> getProductProcurementType() {
        if (productProcurementType == null) {
            productProcurementType = new ArrayList<io.dscope.rosettanet.domain.procurement.codelist.productprocurementtype.v01_03.ProductProcurementType>();
        }
        return this.productProcurementType;
    }

    /**
     * Gets the value of the scrapPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getScrapPercentage() {
        return scrapPercentage;
    }

    /**
     * Sets the value of the scrapPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setScrapPercentage(BigDecimal value) {
        this.scrapPercentage = value;
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
