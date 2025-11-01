
package io.dscope.rosettanet.interchange.invoicenotification.v01_07;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_01.InvoiceAmount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_01.PrePaymentDetail;
import io.dscope.rosettanet.domain.procurement.procurement.v02_01.SpecifiedBusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_05.PartnerDescriptionType;
import io.dscope.rosettanet.universal.partneridentification.v01_05.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for InvoiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}InvoiceAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStatus" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}OrderStatusType"/&gt;
 *         &lt;element name="PackingSlipIdentifier" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}SpecifiedBusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01}PrePaymentDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShipTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05}PartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}AmountType"/&gt;
 *         &lt;element name="TransportedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.05}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TransportedByAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceLineItemType", propOrder = {
    "comments",
    "invoiceAmount",
    "lineNumber",
    "orderStatus",
    "packingSlipIdentifier",
    "prePaymentDetail",
    "preTaxAmount",
    "shipTo",
    "shipToAccount",
    "totalLineItemAmount",
    "transportedBy",
    "transportedByAccount"
})
public class InvoiceLineItemType {

    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "InvoiceAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", type = InvoiceAmount.class, required = false)
    protected List<InvoiceAmount> invoiceAmount;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderStatusType orderStatus;
    @XmlElement(name = "PackingSlipIdentifier")
    protected SpecifiedBusinessDocumentReferenceType packingSlipIdentifier;
    @XmlElementRef(name = "PrePaymentDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", type = PrePaymentDetail.class, required = false)
    protected PrePaymentDetail prePaymentDetail;
    @XmlElement(name = "PreTaxAmount")
    protected AmountType preTaxAmount;
    @XmlElement(name = "ShipTo")
    protected PartnerDescriptionType shipTo;
    @XmlElement(name = "ShipToAccount")
    protected List<String> shipToAccount;
    @XmlElement(name = "TotalLineItemAmount", required = true)
    protected AmountType totalLineItemAmount;
    @XmlElement(name = "TransportedBy")
    protected SpecifiedPartnerDescriptionType transportedBy;
    @XmlElement(name = "TransportedByAccount")
    protected List<String> transportedByAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceAmount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceAmount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceAmount }
     * 
     * 
     */
    public List<InvoiceAmount> getInvoiceAmount() {
        if (invoiceAmount == null) {
            invoiceAmount = new ArrayList<InvoiceAmount>();
        }
        return this.invoiceAmount;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the orderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusType }
     *     
     */
    public OrderStatusType getOrderStatus() {
        return orderStatus;
    }

    /**
     * Sets the value of the orderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusType }
     *     
     */
    public void setOrderStatus(OrderStatusType value) {
        this.orderStatus = value;
    }

    /**
     * Gets the value of the packingSlipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public SpecifiedBusinessDocumentReferenceType getPackingSlipIdentifier() {
        return packingSlipIdentifier;
    }

    /**
     * Sets the value of the packingSlipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedBusinessDocumentReferenceType }
     *     
     */
    public void setPackingSlipIdentifier(SpecifiedBusinessDocumentReferenceType value) {
        this.packingSlipIdentifier = value;
    }

    /**
     * Gets the value of the prePaymentDetail property.
     * 
     * @return
     *     possible object is
     *     {@link PrePaymentDetail }
     *     
     */
    public PrePaymentDetail getPrePaymentDetail() {
        return prePaymentDetail;
    }

    /**
     * Sets the value of the prePaymentDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrePaymentDetail }
     *     
     */
    public void setPrePaymentDetail(PrePaymentDetail value) {
        this.prePaymentDetail = value;
    }

    /**
     * Gets the value of the preTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getPreTaxAmount() {
        return preTaxAmount;
    }

    /**
     * Sets the value of the preTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setPreTaxAmount(AmountType value) {
        this.preTaxAmount = value;
    }

    /**
     * Gets the value of the shipTo property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public PartnerDescriptionType getShipTo() {
        return shipTo;
    }

    /**
     * Sets the value of the shipTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescriptionType }
     *     
     */
    public void setShipTo(PartnerDescriptionType value) {
        this.shipTo = value;
    }

    /**
     * Gets the value of the shipToAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipToAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipToAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getShipToAccount() {
        if (shipToAccount == null) {
            shipToAccount = new ArrayList<String>();
        }
        return this.shipToAccount;
    }

    /**
     * Gets the value of the totalLineItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalLineItemAmount(AmountType value) {
        this.totalLineItemAmount = value;
    }

    /**
     * Gets the value of the transportedBy property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransportedBy() {
        return transportedBy;
    }

    /**
     * Sets the value of the transportedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransportedBy(SpecifiedPartnerDescriptionType value) {
        this.transportedBy = value;
    }

    /**
     * Gets the value of the transportedByAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportedByAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportedByAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTransportedByAccount() {
        if (transportedByAccount == null) {
            transportedByAccount = new ArrayList<String>();
        }
        return this.transportedByAccount;
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
