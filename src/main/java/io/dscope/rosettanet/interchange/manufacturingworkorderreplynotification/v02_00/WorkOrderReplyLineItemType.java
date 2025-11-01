
package io.dscope.rosettanet.interchange.manufacturingworkorderreplynotification.v02_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_04.ChangeReason;
import io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_04.LineItemStatus;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ItemQuantityType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;


/**
 * <p>Java class for WorkOrderReplyLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderReplyLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04}ChangeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProfile" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.00}CustomerProfileType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04}LineItemStatus"/&gt;
 *         &lt;element name="ProductionDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseLintItemQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ItemQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="ResponseShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SublineItems" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.00}SublineItemsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetDevice" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.00}TargetDeviceType" minOccurs="0"/&gt;
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
@XmlType(name = "WorkOrderReplyLineItemType", propOrder = {
    "businessDocumentReference",
    "changeReason",
    "comment",
    "customerProfile",
    "lineItemStatus",
    "productionDate",
    "responseLintItemQuantity",
    "responseShipDate",
    "responseStartDate",
    "sublineItems",
    "targetDevice"
})
public class WorkOrderReplyLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ChangeReason", namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", type = ChangeReason.class, required = false)
    protected List<ChangeReason> changeReason;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "CustomerProfile", required = true)
    protected CustomerProfileType customerProfile;
    @XmlElementRef(name = "LineItemStatus", namespace = "urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04", type = LineItemStatus.class)
    protected LineItemStatus lineItemStatus;
    @XmlElement(name = "ProductionDate")
    protected DatePeriodType productionDate;
    @XmlElement(name = "ResponseLintItemQuantity")
    protected ItemQuantityType responseLintItemQuantity;
    @XmlElement(name = "ResponseShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseShipDate;
    @XmlElement(name = "ResponseStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseStartDate;
    @XmlElement(name = "SublineItems")
    protected List<SublineItemsType> sublineItems;
    @XmlElement(name = "TargetDevice")
    protected TargetDeviceType targetDevice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the changeReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the changeReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChangeReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChangeReason }
     * 
     * 
     */
    public List<ChangeReason> getChangeReason() {
        if (changeReason == null) {
            changeReason = new ArrayList<ChangeReason>();
        }
        return this.changeReason;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the lineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemStatus }
     *     
     */
    public LineItemStatus getLineItemStatus() {
        return lineItemStatus;
    }

    /**
     * Sets the value of the lineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemStatus }
     *     
     */
    public void setLineItemStatus(LineItemStatus value) {
        this.lineItemStatus = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setProductionDate(DatePeriodType value) {
        this.productionDate = value;
    }

    /**
     * Gets the value of the responseLintItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemQuantityType }
     *     
     */
    public ItemQuantityType getResponseLintItemQuantity() {
        return responseLintItemQuantity;
    }

    /**
     * Sets the value of the responseLintItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemQuantityType }
     *     
     */
    public void setResponseLintItemQuantity(ItemQuantityType value) {
        this.responseLintItemQuantity = value;
    }

    /**
     * Gets the value of the responseShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseShipDate() {
        return responseShipDate;
    }

    /**
     * Sets the value of the responseShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseShipDate(XMLGregorianCalendar value) {
        this.responseShipDate = value;
    }

    /**
     * Gets the value of the responseStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseStartDate() {
        return responseStartDate;
    }

    /**
     * Sets the value of the responseStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseStartDate(XMLGregorianCalendar value) {
        this.responseStartDate = value;
    }

    /**
     * Gets the value of the sublineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sublineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSublineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SublineItemsType }
     * 
     * 
     */
    public List<SublineItemsType> getSublineItems() {
        if (sublineItems == null) {
            sublineItems = new ArrayList<SublineItemsType>();
        }
        return this.sublineItems;
    }

    /**
     * Gets the value of the targetDevice property.
     * 
     * @return
     *     possible object is
     *     {@link TargetDeviceType }
     *     
     */
    public TargetDeviceType getTargetDevice() {
        return targetDevice;
    }

    /**
     * Sets the value of the targetDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetDeviceType }
     *     
     */
    public void setTargetDevice(TargetDeviceType value) {
        this.targetDevice = value;
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
