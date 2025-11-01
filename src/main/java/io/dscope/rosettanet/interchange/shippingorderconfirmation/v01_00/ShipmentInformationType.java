
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v01_00;

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
import io.dscope.rosettanet.domain.logistics.codelist.shipmenttype.v01_01.ShipmentType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ExportDeclarationType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ExportLicense;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.FreeOnBoardTerms;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.IsPartialShipment;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.PhysicalDimension;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ShipmentInstructions;
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.CurrencyConversion;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
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
 *         &lt;element name="ConsolidationNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ContainerTotalCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}CurrencyConversion" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DateInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:01.00}DateInformationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ExportLicense" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}FreeOnBoardTerms" minOccurs="0"/&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03}Incoterms" minOccurs="0"/&gt;
 *         &lt;element name="IsDutyPaidByShipper" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsInvoiceRequired" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}IsPartialShipment" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}PhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element name="RoutingInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:01.00}RoutingInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SED" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ExportDeclarationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ShipmentInstructions" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShipmentServiceAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.01}ShipmentType" minOccurs="0"/&gt;
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
    "consolidationNumber",
    "containerTotalCount",
    "currencyConversion",
    "customValue",
    "dateInformation",
    "exportLicense",
    "freeOnBoardTerms",
    "freightReference",
    "incoterms",
    "isDutyPaidByShipper",
    "isInvoiceRequired",
    "isPartialShipment",
    "partnerDescription",
    "physicalDimension",
    "routingInformation",
    "sed",
    "shipmentInstructions",
    "shipmentServiceAccountNumber",
    "shipmentType"
})
public class ShipmentInformationType {

    @XmlElement(name = "ConsolidationNumber")
    protected BusinessDocumentReferenceType consolidationNumber;
    @XmlElement(name = "ContainerTotalCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger containerTotalCount;
    @XmlElementRef(name = "CurrencyConversion", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = CurrencyConversion.class, required = false)
    protected List<CurrencyConversion> currencyConversion;
    @XmlElement(name = "CustomValue")
    protected String customValue;
    @XmlElement(name = "DateInformation")
    protected DateInformationType dateInformation;
    @XmlElementRef(name = "ExportLicense", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ExportLicense.class, required = false)
    protected ExportLicense exportLicense;
    @XmlElementRef(name = "FreeOnBoardTerms", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = FreeOnBoardTerms.class, required = false)
    protected FreeOnBoardTerms freeOnBoardTerms;
    @XmlElement(name = "FreightReference")
    protected BusinessDocumentReferenceType freightReference;
    @XmlElementRef(name = "Incoterms", namespace = "urn:rosettanet:specification:domain:Logistics:Incoterms:xsd:codelist:01.03", type = Incoterms.class, required = false)
    protected Incoterms incoterms;
    @XmlElement(name = "IsDutyPaidByShipper")
    protected boolean isDutyPaidByShipper;
    @XmlElement(name = "IsInvoiceRequired")
    protected boolean isInvoiceRequired;
    @XmlElementRef(name = "IsPartialShipment", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = IsPartialShipment.class, required = false)
    protected IsPartialShipment isPartialShipment;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlElement(name = "RoutingInformation", required = true)
    protected List<RoutingInformationType> routingInformation;
    @XmlElement(name = "SED")
    protected ExportDeclarationType sed;
    @XmlElementRef(name = "ShipmentInstructions", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ShipmentInstructions.class, required = false)
    protected List<ShipmentInstructions> shipmentInstructions;
    @XmlElement(name = "ShipmentServiceAccountNumber")
    protected String shipmentServiceAccountNumber;
    @XmlElementRef(name = "ShipmentType", namespace = "urn:rosettanet:specification:domain:Logistics:ShipmentType:xsd:codelist:01.01", type = ShipmentType.class, required = false)
    protected ShipmentType shipmentType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the consolidationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getConsolidationNumber() {
        return consolidationNumber;
    }

    /**
     * Sets the value of the consolidationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setConsolidationNumber(BusinessDocumentReferenceType value) {
        this.consolidationNumber = value;
    }

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
     * Gets the value of the currencyConversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the currencyConversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCurrencyConversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CurrencyConversion }
     * 
     * 
     */
    public List<CurrencyConversion> getCurrencyConversion() {
        if (currencyConversion == null) {
            currencyConversion = new ArrayList<CurrencyConversion>();
        }
        return this.currencyConversion;
    }

    /**
     * Gets the value of the customValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomValue() {
        return customValue;
    }

    /**
     * Sets the value of the customValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomValue(String value) {
        this.customValue = value;
    }

    /**
     * Gets the value of the dateInformation property.
     * 
     * @return
     *     possible object is
     *     {@link DateInformationType }
     *     
     */
    public DateInformationType getDateInformation() {
        return dateInformation;
    }

    /**
     * Sets the value of the dateInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateInformationType }
     *     
     */
    public void setDateInformation(DateInformationType value) {
        this.dateInformation = value;
    }

    /**
     * Gets the value of the exportLicense property.
     * 
     * @return
     *     possible object is
     *     {@link ExportLicense }
     *     
     */
    public ExportLicense getExportLicense() {
        return exportLicense;
    }

    /**
     * Sets the value of the exportLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLicense }
     *     
     */
    public void setExportLicense(ExportLicense value) {
        this.exportLicense = value;
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
     * Gets the value of the freightReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightReference() {
        return freightReference;
    }

    /**
     * Sets the value of the freightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightReference(BusinessDocumentReferenceType value) {
        this.freightReference = value;
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
     * Gets the value of the isDutyPaidByShipper property.
     * 
     */
    public boolean isIsDutyPaidByShipper() {
        return isDutyPaidByShipper;
    }

    /**
     * Sets the value of the isDutyPaidByShipper property.
     * 
     */
    public void setIsDutyPaidByShipper(boolean value) {
        this.isDutyPaidByShipper = value;
    }

    /**
     * Gets the value of the isInvoiceRequired property.
     * 
     */
    public boolean isIsInvoiceRequired() {
        return isInvoiceRequired;
    }

    /**
     * Sets the value of the isInvoiceRequired property.
     * 
     */
    public void setIsInvoiceRequired(boolean value) {
        this.isInvoiceRequired = value;
    }

    /**
     * Gets the value of the isPartialShipment property.
     * 
     * @return
     *     possible object is
     *     {@link IsPartialShipment }
     *     
     */
    public IsPartialShipment getIsPartialShipment() {
        return isPartialShipment;
    }

    /**
     * Sets the value of the isPartialShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsPartialShipment }
     *     
     */
    public void setIsPartialShipment(IsPartialShipment value) {
        this.isPartialShipment = value;
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
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimension }
     *     
     */
    public PhysicalDimension getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimension }
     *     
     */
    public void setPhysicalDimension(PhysicalDimension value) {
        this.physicalDimension = value;
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
     * Gets the value of the sed property.
     * 
     * @return
     *     possible object is
     *     {@link ExportDeclarationType }
     *     
     */
    public ExportDeclarationType getSED() {
        return sed;
    }

    /**
     * Sets the value of the sed property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportDeclarationType }
     *     
     */
    public void setSED(ExportDeclarationType value) {
        this.sed = value;
    }

    /**
     * Gets the value of the shipmentInstructions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentInstructions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentInstructions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentInstructions }
     * 
     * 
     */
    public List<ShipmentInstructions> getShipmentInstructions() {
        if (shipmentInstructions == null) {
            shipmentInstructions = new ArrayList<ShipmentInstructions>();
        }
        return this.shipmentInstructions;
    }

    /**
     * Gets the value of the shipmentServiceAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipmentServiceAccountNumber() {
        return shipmentServiceAccountNumber;
    }

    /**
     * Sets the value of the shipmentServiceAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipmentServiceAccountNumber(String value) {
        this.shipmentServiceAccountNumber = value;
    }

    /**
     * Gets the value of the shipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentType }
     *     
     */
    public ShipmentType getShipmentType() {
        return shipmentType;
    }

    /**
     * Sets the value of the shipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentType }
     *     
     */
    public void setShipmentType(ShipmentType value) {
        this.shipmentType = value;
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
