
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.logistics.codelist.incoterms.v01_03.Incoterms;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.CustomsInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.DateInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.FreeOnBoardTerms;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.FreightValuation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.Instructions;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.PhysicalDimensionType;
import io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_04.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01.PackageType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * <p>Java class for ShipmentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}CustomsInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}DateInformation" minOccurs="0"/&gt;
 *         &lt;element name="DeclarationInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}DeclarationInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}FreeOnBoardTerms" minOccurs="0"/&gt;
 *         &lt;element name="FreightTotalPhysicalDimension" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}PhysicalDimensionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}FreightValuation" minOccurs="0"/&gt;
 *         &lt;element name="HandbookIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03}Incoterms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}Instructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsInsuranceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsIntraCompanyTransfer" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element name="PackageTypeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.04}PaymentTerms" minOccurs="0"/&gt;
 *         &lt;element name="PricingPaymentInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}PricingPaymentInformationType" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SaleTerms" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentReturnInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}ShipmentReturnInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}TaxExemptStatus" minOccurs="0"/&gt;
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
@XmlType(name = "ShipmentInformationType", propOrder = {
    "containerTotalCount",
    "customsInformation",
    "dateInformation",
    "declarationInformation",
    "freeOnBoardTerms",
    "freightTotalPhysicalDimension",
    "freightValuation",
    "handbookIdentifier",
    "incoterms",
    "instructions",
    "isInsuranceRequired",
    "isIntraCompanyTransfer",
    "packageType",
    "packageTypeDescription",
    "partnerDescription",
    "paymentTerms",
    "pricingPaymentInformation",
    "routingInformation",
    "saleTerms",
    "shipmentReturnInformation",
    "taxExemptStatus"
})
public class ShipmentInformationType {

    @XmlElement(name = "ContainerTotalCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElementRef(name = "CustomsInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = CustomsInformation.class, required = false)
    protected CustomsInformation customsInformation;
    @XmlElementRef(name = "DateInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = DateInformation.class, required = false)
    protected DateInformation dateInformation;
    @XmlElement(name = "DeclarationInformation", required = true)
    protected DeclarationInformationType declarationInformation;
    @XmlElementRef(name = "FreeOnBoardTerms", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = FreeOnBoardTerms.class, required = false)
    protected FreeOnBoardTerms freeOnBoardTerms;
    @XmlElement(name = "FreightTotalPhysicalDimension")
    protected PhysicalDimensionType freightTotalPhysicalDimension;
    @XmlElementRef(name = "FreightValuation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = FreightValuation.class, required = false)
    protected FreightValuation freightValuation;
    @XmlElement(name = "HandbookIdentifier")
    protected String handbookIdentifier;
    @XmlElementRef(name = "Incoterms", namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", type = Incoterms.class, required = false)
    protected Incoterms incoterms;
    @XmlElementRef(name = "Instructions", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = Instructions.class, required = false)
    protected List<Instructions> instructions;
    @XmlElement(name = "IsInsuranceRequired")
    protected boolean isInsuranceRequired;
    @XmlElement(name = "IsIntraCompanyTransfer")
    protected boolean isIntraCompanyTransfer;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElement(name = "PackageTypeDescription")
    protected String packageTypeDescription;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.04", type = PaymentTerms.class, required = false)
    protected PaymentTerms paymentTerms;
    @XmlElement(name = "PricingPaymentInformation")
    protected PricingPaymentInformationType pricingPaymentInformation;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "SaleTerms")
    protected String saleTerms;
    @XmlElement(name = "ShipmentReturnInformation")
    protected ShipmentReturnInformationType shipmentReturnInformation;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerTotalCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getContainerTotalCount() {
        return containerTotalCount;
    }

    /**
     * Sets the value of the containerTotalCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setContainerTotalCount(BigInteger value) {
        this.containerTotalCount = value;
    }

    /**
     * Gets the value of the customsInformation property.
     * 
     * @return
     *     possible object is
     *     {@link CustomsInformation }
     *     
     */
    public CustomsInformation getCustomsInformation() {
        return customsInformation;
    }

    /**
     * Sets the value of the customsInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomsInformation }
     *     
     */
    public void setCustomsInformation(CustomsInformation value) {
        this.customsInformation = value;
    }

    /**
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformation }
     *     
     */
    public DateInformation getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformation }
     *     
     */
    public void setDateInformation(DateInformation value) {
        this.dateInformation = value;
    }

    /**
     * Gets the value of the declarationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DeclarationInformationType }
     *     
     */
    public DeclarationInformationType getDeclarationInformation() {
        return declarationInformation;
    }

    /**
     * Sets the value of the declarationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeclarationInformationType }
     *     
     */
    public void setDeclarationInformation(DeclarationInformationType value) {
        this.declarationInformation = value;
    }

    /**
     * Gets the value of the freeOnBoardTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreeOnBoardTerms }
     *     
     */
    public FreeOnBoardTerms getFreeOnBoardTerms() {
        return freeOnBoardTerms;
    }

    /**
     * Sets the value of the freeOnBoardTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreeOnBoardTerms }
     *     
     */
    public void setFreeOnBoardTerms(FreeOnBoardTerms value) {
        this.freeOnBoardTerms = value;
    }

    /**
     * Gets the value of the freightTotalPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public PhysicalDimensionType getFreightTotalPhysicalDimension() {
        return freightTotalPhysicalDimension;
    }

    /**
     * Sets the value of the freightTotalPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public void setFreightTotalPhysicalDimension(PhysicalDimensionType value) {
        this.freightTotalPhysicalDimension = value;
    }

    /**
     * Gets the value of the freightValuation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightValuation }
     *     
     */
    public FreightValuation getFreightValuation() {
        return freightValuation;
    }

    /**
     * Sets the value of the freightValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightValuation }
     *     
     */
    public void setFreightValuation(FreightValuation value) {
        this.freightValuation = value;
    }

    /**
     * Gets the value of the handbookIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandbookIdentifier() {
        return handbookIdentifier;
    }

    /**
     * Sets the value of the handbookIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandbookIdentifier(String value) {
        this.handbookIdentifier = value;
    }

    /**
     * Gets the value of the incoterms property.
     * 
     * @return
     *     possible object is
     *     {@link Incoterms }
     *     
     */
    public Incoterms getIncoterms() {
        return incoterms;
    }

    /**
     * Sets the value of the incoterms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Incoterms }
     *     
     */
    public void setIncoterms(Incoterms value) {
        this.incoterms = value;
    }

    /**
     * Gets the value of the instructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Instructions }
     * 
     * 
     */
    public List<Instructions> getInstructions() {
        if (instructions == null) {
            instructions = new ArrayList<Instructions>();
        }
        return this.instructions;
    }

    /**
     * Gets the value of the isInsuranceRequired property.
     * 
     */
    public boolean isIsInsuranceRequired() {
        return isInsuranceRequired;
    }

    /**
     * Sets the value of the isInsuranceRequired property.
     * 
     */
    public void setIsInsuranceRequired(boolean value) {
        this.isInsuranceRequired = value;
    }

    /**
     * Gets the value of the isIntraCompanyTransfer property.
     * 
     */
    public boolean isIsIntraCompanyTransfer() {
        return isIntraCompanyTransfer;
    }

    /**
     * Sets the value of the isIntraCompanyTransfer property.
     * 
     */
    public void setIsIntraCompanyTransfer(boolean value) {
        this.isIntraCompanyTransfer = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the packageTypeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageTypeDescription() {
        return packageTypeDescription;
    }

    /**
     * Sets the value of the packageTypeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageTypeDescription(String value) {
        this.packageTypeDescription = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentTerms }
     *     
     */
    public PaymentTerms getPaymentTerms() {
        return paymentTerms;
    }

    /**
     * Sets the value of the paymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentTerms }
     *     
     */
    public void setPaymentTerms(PaymentTerms value) {
        this.paymentTerms = value;
    }

    /**
     * Gets the value of the pricingPaymentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PricingPaymentInformationType }
     *     
     */
    public PricingPaymentInformationType getPricingPaymentInformation() {
        return pricingPaymentInformation;
    }

    /**
     * Sets the value of the pricingPaymentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingPaymentInformationType }
     *     
     */
    public void setPricingPaymentInformation(PricingPaymentInformationType value) {
        this.pricingPaymentInformation = value;
    }

    /**
     * Gets the value of the routingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the routingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoutingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoutingInformationType }
     * 
     * 
     */
    public List<RoutingInformationType> getRoutingInformation() {
        if (routingInformation == null) {
            routingInformation = new ArrayList<RoutingInformationType>();
        }
        return this.routingInformation;
    }

    /**
     * Gets the value of the saleTerms property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleTerms() {
        return saleTerms;
    }

    /**
     * Sets the value of the saleTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleTerms(String value) {
        this.saleTerms = value;
    }

    /**
     * Gets the value of the shipmentReturnInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentReturnInformationType }
     *     
     */
    public ShipmentReturnInformationType getShipmentReturnInformation() {
        return shipmentReturnInformation;
    }

    /**
     * Sets the value of the shipmentReturnInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentReturnInformationType }
     *     
     */
    public void setShipmentReturnInformation(ShipmentReturnInformationType value) {
        this.shipmentReturnInformation = value;
    }

    /**
     * Gets the value of the taxExemptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptStatus }
     *     
     */
    public TaxExemptStatus getTaxExemptStatus() {
        return taxExemptStatus;
    }

    /**
     * Sets the value of the taxExemptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptStatus }
     *     
     */
    public void setTaxExemptStatus(TaxExemptStatus value) {
        this.taxExemptStatus = value;
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
