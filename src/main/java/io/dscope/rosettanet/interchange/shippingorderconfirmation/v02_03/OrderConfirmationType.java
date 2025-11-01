
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v02_03;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01.ShippingOrderRejectReason;
import io.dscope.rosettanet.domain.logistics.codelist.shippingorderstatus.v01_01.ShippingOrderStatus;


/**
 * <p>Java class for OrderConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01}ShippingOrderRejectReason" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.01}ShippingOrderStatus"/&gt;
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
@XmlType(name = "OrderConfirmationType", propOrder = {
    "shippingOrderRejectReason",
    "shippingOrderStatus"
})
public class OrderConfirmationType {

    @XmlElementRef(name = "ShippingOrderRejectReason", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", type = ShippingOrderRejectReason.class, required = false)
    protected ShippingOrderRejectReason shippingOrderRejectReason;
    @XmlElementRef(name = "ShippingOrderStatus", namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderStatus:xsd:codelist:01.01", type = ShippingOrderStatus.class)
    protected ShippingOrderStatus shippingOrderStatus;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the shippingOrderRejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderRejectReason }
     *     
     */
    public ShippingOrderRejectReason getShippingOrderRejectReason() {
        return shippingOrderRejectReason;
    }

    /**
     * Sets the value of the shippingOrderRejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderRejectReason }
     *     
     */
    public void setShippingOrderRejectReason(ShippingOrderRejectReason value) {
        this.shippingOrderRejectReason = value;
    }

    /**
     * Gets the value of the shippingOrderStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingOrderStatus }
     *     
     */
    public ShippingOrderStatus getShippingOrderStatus() {
        return shippingOrderStatus;
    }

    /**
     * Sets the value of the shippingOrderStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingOrderStatus }
     *     
     */
    public void setShippingOrderStatus(ShippingOrderStatus value) {
        this.shippingOrderStatus = value;
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
