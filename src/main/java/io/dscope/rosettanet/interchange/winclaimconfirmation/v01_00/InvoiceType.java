
package io.dscope.rosettanet.interchange.winclaimconfirmation.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;


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
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:WinClaimConfirmationNotification:xsd:schema:01.00}InvoiceLineItemType" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType"/&gt;
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
    "invoiceLineItem",
    "invoiceNumber"
})
public class InvoiceType {

    @XmlElement(name = "InvoiceLineItem")
    protected InvoiceLineItemType invoiceLineItem;
    @XmlElement(name = "InvoiceNumber", required = true)
    protected BusinessDocumentReferenceType invoiceNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the invoiceLineItem property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLineItemType }
     *     
     */
    public InvoiceLineItemType getInvoiceLineItem() {
        return invoiceLineItem;
    }

    /**
     * Sets the value of the invoiceLineItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLineItemType }
     *     
     */
    public void setInvoiceLineItem(InvoiceLineItemType value) {
        this.invoiceLineItem = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setInvoiceNumber(BusinessDocumentReferenceType value) {
        this.invoiceNumber = value;
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
