
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


/**
 * <p>Java class for SublineItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SublineItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04}ChangeReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProfile" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderReplyNotification:xsd:schema:02.00}CustomerProfileType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04}LineItemStatus"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ResponseShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="ResponseStartDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SublineResponseQuantity" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ItemQuantityType" minOccurs="0"/&gt;
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
@XmlType(name = "SublineItemsType", propOrder = {
    "changeReason",
    "customerProfile",
    "lineItemStatus",
    "number",
    "responseShipDate",
    "responseStartDate",
    "sublineResponseQuantity"
})
public class SublineItemsType {

    @XmlElementRef(name = "ChangeReason", namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", type = ChangeReason.class, required = false)
    protected List<ChangeReason> changeReason;
    @XmlElement(name = "CustomerProfile", required = true)
    protected CustomerProfileType customerProfile;
    @XmlElementRef(name = "LineItemStatus", namespace = "urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04", type = LineItemStatus.class)
    protected LineItemStatus lineItemStatus;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "ResponseShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseShipDate;
    @XmlElement(name = "ResponseStartDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseStartDate;
    @XmlElement(name = "SublineResponseQuantity")
    protected ItemQuantityType sublineResponseQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
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
     * Gets the value of the sublineResponseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ItemQuantityType }
     *     
     */
    public ItemQuantityType getSublineResponseQuantity() {
        return sublineResponseQuantity;
    }

    /**
     * Sets the value of the sublineResponseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemQuantityType }
     *     
     */
    public void setSublineResponseQuantity(ItemQuantityType value) {
        this.sublineResponseQuantity = value;
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
