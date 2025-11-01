
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.design.codelist.assemblylevelcode.v01_01.AssemblyLevelCode;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;urss:Constraint xmlns:urss="urn:rosettanet:specification:system:xml:1.0" xmlns:dabcc="urn:rosettanet:specification:domain:Design:ABCCode:xsd:codelist:01.02" xmlns:dalc="urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01" xmlns:dds="urn:rosettanet:specification:domain:Design:xsd:schema:02.15" xmlns:dp="urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17" xmlns:dppt="urn:rosettanet:specification:domain:Procurement:ProductProcurementType:xsd:codelist:01.03" xmlns:p372922_="http://java.sun.com/xml/ns/jaxb" xmlns:p41377_="http://annox.dev.java.net" xmlns:sha="urn:rosettanet:specification:domain:Shared:xsd:schema:01.10" xmlns:ssdh="urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16" xmlns:tns="urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00" xmlns:ud="urn:rosettanet:specification:universal:Dates:xsd:schema:01.03" xmlns:udt="urn:rosettanet:specification:universal:DataType:xsd:schema:01.04" xmlns:updi="urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04" xmlns:upi="urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12" xmlns:uuom="urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03" xmlns:xs="http://www.w3.org/2001/XMLSchema"&gt;In ProductAttribute, if the occurence of CommodityIdentifier is 1 then the occurence of commodityIdentifier/AlternativeIdentifier MUST be between 1 and unbounded.&lt;/urss:Constraint&gt;
 * </pre>
 * 
 * 
 * <p>Java class for ProductAttributeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAttributeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01}AssemblyLevelCode"/&gt;
 *         &lt;element name="CommodityIdentifier" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" minOccurs="0"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductDescription"/&gt;
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
@XmlType(name = "ProductAttributeType", propOrder = {
    "assemblyLevelCode",
    "commodityIdentifier",
    "isGeneric",
    "productDescription"
})
public class ProductAttributeType {

    @XmlElementRef(name = "AssemblyLevelCode", namespace = "urn:rosettanet:specification:domain:Design:AssemblyLevelCode:xsd:codelist:01.01", type = AssemblyLevelCode.class)
    protected AssemblyLevelCode assemblyLevelCode;
    @XmlElement(name = "CommodityIdentifier")
    protected ProductIdentificationType commodityIdentifier;
    @XmlElement(name = "IsGeneric")
    protected boolean isGeneric;
    @XmlElementRef(name = "ProductDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductDescription.class)
    protected ProductDescription productDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyLevelCode }
     *     
     */
    public AssemblyLevelCode getAssemblyLevelCode() {
        return assemblyLevelCode;
    }

    /**
     * Sets the value of the assemblyLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyLevelCode }
     *     
     */
    public void setAssemblyLevelCode(AssemblyLevelCode value) {
        this.assemblyLevelCode = value;
    }

    /**
     * Gets the value of the commodityIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getCommodityIdentifier() {
        return commodityIdentifier;
    }

    /**
     * Sets the value of the commodityIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setCommodityIdentifier(ProductIdentificationType value) {
        this.commodityIdentifier = value;
    }

    /**
     * Gets the value of the isGeneric property.
     * 
     */
    public boolean isIsGeneric() {
        return isGeneric;
    }

    /**
     * Sets the value of the isGeneric property.
     * 
     */
    public void setIsGeneric(boolean value) {
        this.isGeneric = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescription }
     *     
     */
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescription }
     *     
     */
    public void setProductDescription(ProductDescription value) {
        this.productDescription = value;
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
