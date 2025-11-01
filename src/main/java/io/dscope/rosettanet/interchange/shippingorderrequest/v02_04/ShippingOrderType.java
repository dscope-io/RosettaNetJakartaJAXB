
package io.dscope.rosettanet.interchange.shippingorderrequest.v02_04;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.OrderInformation;


/**
 * <p>Java class for ShippingOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOrderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}OrderInformation"/&gt;
 *         &lt;element name="RequestingOrderInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.04}RequestingOrderInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ShipmentInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.04}ShipmentInformationType"/&gt;
 *         &lt;element name="ShipmentLineItem" type="{urn:rosettanet:specification:interchange:ShippingOrderRequest:xsd:schema:02.04}ShipmentLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ShippingOrderType", propOrder = {
    "orderInformation",
    "requestingOrderInformation",
    "shipmentInformation",
    "shipmentLineItem"
})
public class ShippingOrderType {

    @XmlElementRef(name = "OrderInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = OrderInformation.class)
    protected OrderInformation orderInformation;
    @XmlElement(name = "RequestingOrderInformation", required = true)
    protected List<RequestingOrderInformationType> requestingOrderInformation;
    @XmlElement(name = "ShipmentInformation", required = true)
    protected ShipmentInformationType shipmentInformation;
    @XmlElement(name = "ShipmentLineItem", required = true)
    protected List<ShipmentLineItemType> shipmentLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrderInformation }
     *     
     */
    public OrderInformation getOrderInformation() {
        return orderInformation;
    }

    /**
     * Sets the value of the orderInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderInformation }
     *     
     */
    public void setOrderInformation(OrderInformation value) {
        this.orderInformation = value;
    }

    /**
     * Gets the value of the requestingOrderInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingOrderInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingOrderInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingOrderInformationType }
     * 
     * 
     */
    public List<RequestingOrderInformationType> getRequestingOrderInformation() {
        if (requestingOrderInformation == null) {
            requestingOrderInformation = new ArrayList<RequestingOrderInformationType>();
        }
        return this.requestingOrderInformation;
    }

    /**
     * Gets the value of the shipmentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentInformationType }
     *     
     */
    public ShipmentInformationType getShipmentInformation() {
        return shipmentInformation;
    }

    /**
     * Sets the value of the shipmentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentInformationType }
     *     
     */
    public void setShipmentInformation(ShipmentInformationType value) {
        this.shipmentInformation = value;
    }

    /**
     * Gets the value of the shipmentLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipmentLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipmentLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipmentLineItemType }
     * 
     * 
     */
    public List<ShipmentLineItemType> getShipmentLineItem() {
        if (shipmentLineItem == null) {
            shipmentLineItem = new ArrayList<ShipmentLineItemType>();
        }
        return this.shipmentLineItem;
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
