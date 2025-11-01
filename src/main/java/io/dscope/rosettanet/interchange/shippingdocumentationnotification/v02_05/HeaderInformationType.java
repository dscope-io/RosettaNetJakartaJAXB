
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.BillOfLading;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


/**
 * <p>Java class for HeaderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}BillOfLading" minOccurs="0"/&gt;
 *         &lt;element name="CommercialInvoice" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="PackingList" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingDocument" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingOrderInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShippingOrderInformationType"/&gt;
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
@XmlType(name = "HeaderInformationType", propOrder = {
    "billOfLading",
    "commercialInvoice",
    "packingList",
    "shippingDocument",
    "shippingOrderInformation"
})
public class HeaderInformationType {

    @XmlElementRef(name = "BillOfLading", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = BillOfLading.class, required = false)
    protected BillOfLading billOfLading;
    @XmlElement(name = "CommercialInvoice")
    protected BusinessDocumentReferenceType commercialInvoice;
    @XmlElement(name = "PackingList")
    protected BusinessDocumentReferenceType packingList;
    @XmlElement(name = "ShippingDocument")
    protected List<BusinessDocumentReferenceType> shippingDocument;
    @XmlElement(name = "ShippingOrderInformation", required = true)
    protected ShippingOrderInformationType shippingOrderInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the billOfLading property.
     * 
     * @return
     *     possible object is
     *     {@link BillOfLading }
     *     
     */
    public BillOfLading getBillOfLading() {
        return billOfLading;
    }

    /**
     * Sets the value of the billOfLading property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillOfLading }
     *     
     */
    public void setBillOfLading(BillOfLading value) {
        this.billOfLading = value;
    }

    /**
     * Gets the value of the commercialInvoice property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getCommercialInvoice() {
        return commercialInvoice;
    }

    /**
     * Sets the value of the commercialInvoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setCommercialInvoice(BusinessDocumentReferenceType value) {
        this.commercialInvoice = value;
    }

    /**
     * Gets the value of the packingList property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPackingList() {
        return packingList;
    }

    /**
     * Sets the value of the packingList property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPackingList(BusinessDocumentReferenceType value) {
        this.packingList = value;
    }

    /**
     * Gets the value of the shippingDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getShippingDocument() {
        if (shippingDocument == null) {
            shippingDocument = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.shippingDocument;
    }

    /**
     * Gets the value of the shippingOrderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderInformationType }
     *     
     */
    public ShippingOrderInformationType getShippingOrderInformation() {
        return shippingOrderInformation;
    }

    /**
     * Sets the value of the shippingOrderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderInformationType }
     *     
     */
    public void setShippingOrderInformation(ShippingOrderInformationType value) {
        this.shippingOrderInformation = value;
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
