
package io.dscope.rosettanet.interchange.invoicenotification.v01_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.logistics.v02_02.TrackingReferenceType;


/**
 * <p>Java class for OrderStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PrimaryIdentifier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02}TrackingReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrder" type="{urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:01.07}PurchaseOrderType"/&gt;
 *         &lt;element name="SecondaryIdentifier" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.02}TrackingReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "OrderStatusType", propOrder = {
    "primaryIdentifier",
    "purchaseOrder",
    "secondaryIdentifier"
})
public class OrderStatusType {

    @XmlElement(name = "PrimaryIdentifier")
    protected List<TrackingReferenceType> primaryIdentifier;
    @XmlElement(name = "PurchaseOrder", required = true)
    protected PurchaseOrderType purchaseOrder;
    @XmlElement(name = "SecondaryIdentifier")
    protected List<TrackingReferenceType> secondaryIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReferenceType }
     * 
     * 
     */
    public List<TrackingReferenceType> getPrimaryIdentifier() {
        if (primaryIdentifier == null) {
            primaryIdentifier = new ArrayList<TrackingReferenceType>();
        }
        return this.primaryIdentifier;
    }

    /**
     * Gets the value of the purchaseOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderType }
     *     
     */
    public PurchaseOrderType getPurchaseOrder() {
        return purchaseOrder;
    }

    /**
     * Sets the value of the purchaseOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderType }
     *     
     */
    public void setPurchaseOrder(PurchaseOrderType value) {
        this.purchaseOrder = value;
    }

    /**
     * Gets the value of the secondaryIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the secondaryIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSecondaryIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackingReferenceType }
     * 
     * 
     */
    public List<TrackingReferenceType> getSecondaryIdentifier() {
        if (secondaryIdentifier == null) {
            secondaryIdentifier = new ArrayList<TrackingReferenceType>();
        }
        return this.secondaryIdentifier;
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
