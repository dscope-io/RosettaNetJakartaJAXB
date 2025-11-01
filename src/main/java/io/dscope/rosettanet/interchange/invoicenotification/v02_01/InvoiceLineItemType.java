
package io.dscope.rosettanet.interchange.invoicenotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_18.AncillaryDates;
import io.dscope.rosettanet.domain.procurement.procurement.v02_18.InvoiceAmount;
import io.dscope.rosettanet.domain.procurement.procurement.v02_18.PackingSlip;
import io.dscope.rosettanet.domain.procurement.procurement.v02_18.PrePaymentDetail;
import io.dscope.rosettanet.universal.partneridentification.v01_13.PartnerDescription;


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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}AncillaryDates" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}InvoiceAmount" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OrderStatus" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.01}OrderStatusType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}PackingSlip" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.13}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18}PrePaymentDetail" minOccurs="0"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.01}AmountType" minOccurs="0"/&gt;
 *         &lt;element name="ShipToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.01}AmountType"/&gt;
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
    "ancillaryDates",
    "comments",
    "invoiceAmount",
    "lineNumber",
    "orderStatus",
    "packingSlip",
    "partnerDescription",
    "prePaymentDetail",
    "preTaxAmount",
    "shipToAccount",
    "totalLineItemAmount",
    "transportedByAccount"
})
public class InvoiceLineItemType {

    @XmlElementRef(name = "AncillaryDates", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", type = AncillaryDates.class, required = false)
    protected List<AncillaryDates> ancillaryDates;
    @XmlElement(name = "Comments")
    protected String comments;
    @XmlElementRef(name = "InvoiceAmount", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", type = InvoiceAmount.class, required = false)
    protected List<InvoiceAmount> invoiceAmount;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "OrderStatus", required = true)
    protected OrderStatusType orderStatus;
    @XmlElementRef(name = "PackingSlip", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", type = PackingSlip.class, required = false)
    protected List<PackingSlip> packingSlip;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.13", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElementRef(name = "PrePaymentDetail", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", type = PrePaymentDetail.class, required = false)
    protected PrePaymentDetail prePaymentDetail;
    @XmlElement(name = "PreTaxAmount")
    protected AmountType preTaxAmount;
    @XmlElement(name = "ShipToAccount")
    protected List<String> shipToAccount;
    @XmlElement(name = "TotalLineItemAmount", required = true)
    protected AmountType totalLineItemAmount;
    @XmlElement(name = "TransportedByAccount")
    protected List<String> transportedByAccount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the ancillaryDates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryDates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryDates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryDates }
     * 
     * 
     */
    public List<AncillaryDates> getAncillaryDates() {
        if (ancillaryDates == null) {
            ancillaryDates = new ArrayList<AncillaryDates>();
        }
        return this.ancillaryDates;
    }

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
     * Gets the value of the packingSlip property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packingSlip property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackingSlip().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackingSlip }
     * 
     * 
     */
    public List<PackingSlip> getPackingSlip() {
        if (packingSlip == null) {
            packingSlip = new ArrayList<PackingSlip>();
        }
        return this.packingSlip;
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
