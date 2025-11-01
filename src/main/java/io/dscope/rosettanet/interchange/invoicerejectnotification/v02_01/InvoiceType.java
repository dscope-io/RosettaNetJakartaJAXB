
package io.dscope.rosettanet.interchange.invoicerejectnotification.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.invoicerejection.v01_04.InvoiceRejection;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.Financing;
import io.dscope.rosettanet.domain.shared.codelist.monetaryamounttype.v01_01.MonetaryAmountTypeType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FinancialAmount" type="{urn:rosettanet:specification:domain:Shared:MonetaryAmountType:xsd:codelist:01.01}MonetaryAmountTypeType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:InvoiceRejectNotification:xsd:schema:02.01}InvoiceLineItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.04}InvoiceRejection"/&gt;
 *         &lt;element name="PurchaseOrder" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="SalesOrder" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceType", propOrder = {
    "comments",
    "financialAmount",
    "financing",
    "invoiceLineItem",
    "invoiceRejection",
    "purchaseOrder",
    "salesOrder"
})
public class InvoiceType {

    @XmlElement(name = "Comments", required = true)
    protected String comments;
    @XmlElement(name = "FinancialAmount", required = true)
    protected MonetaryAmountTypeType financialAmount;
    @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = Financing.class, required = false)
    protected Financing financing;
    @XmlElement(name = "InvoiceLineItem")
    protected List<InvoiceLineItemType> invoiceLineItem;
    @XmlElementRef(name = "InvoiceRejection", namespace = "urn:rosettanet:specification:domain:Procurement:InvoiceRejection:xsd:codelist:01.04", type = InvoiceRejection.class)
    protected InvoiceRejection invoiceRejection;
    @XmlElement(name = "PurchaseOrder", required = true)
    protected BusinessDocumentReferenceType purchaseOrder;
    @XmlElement(name = "SalesOrder")
    protected BusinessDocumentReferenceType salesOrder;
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
     * Gets the value of the financialAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountTypeType }
     *     
     */
    public MonetaryAmountTypeType getFinancialAmount() {
        return financialAmount;
    }

    /**
     * Sets the value of the financialAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountTypeType }
     *     
     */
    public void setFinancialAmount(MonetaryAmountTypeType value) {
        this.financialAmount = value;
    }

    /**
     * Gets the value of the financing property.
     * 
     * @return
     *     possible object is
     *     {@link Financing }
     *     
     */
    public Financing getFinancing() {
        return financing;
    }

    /**
     * Sets the value of the financing property.
     * 
     * @param value
     *     allowed object is
     *     {@link Financing }
     *     
     */
    public void setFinancing(Financing value) {
        this.financing = value;
    }

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceLineItemType }
     * 
     * 
     */
    public List<InvoiceLineItemType> getInvoiceLineItem() {
        if (invoiceLineItem == null) {
            invoiceLineItem = new ArrayList<InvoiceLineItemType>();
        }
        return this.invoiceLineItem;
    }

    /**
     * Gets the value of the invoiceRejection property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceRejection }
     *     
     */
    public InvoiceRejection getInvoiceRejection() {
        return invoiceRejection;
    }

    /**
     * Sets the value of the invoiceRejection property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceRejection }
     *     
     */
    public void setInvoiceRejection(InvoiceRejection value) {
        this.invoiceRejection = value;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrder(BusinessDocumentReferenceType value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the salesOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getSalesOrder() {
        return salesOrder;
    }

    /**
     * Sets the value of the salesOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setSalesOrder(BusinessDocumentReferenceType value) {
        this.salesOrder = value;
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
