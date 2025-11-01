
package io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_02;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.OrderInformation;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * <p>Java class for ShippingOrderCancellationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingOrderCancellationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CancellationConfirmation" type="{urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.02}CancellationConfirmationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}OrderInformation"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="RequestingOrderInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.02}RequestingOrderInformationType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ShippingOrderCancellationType", propOrder = {
    "cancellationConfirmation",
    "orderInformation",
    "partnerDescription",
    "requestingOrderInformation"
})
public class ShippingOrderCancellationType {

    @XmlElement(name = "CancellationConfirmation", required = true)
    protected CancellationConfirmationType cancellationConfirmation;
    @XmlElementRef(name = "OrderInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = OrderInformation.class)
    protected OrderInformation orderInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "RequestingOrderInformation", required = true)
    protected List<RequestingOrderInformationType> requestingOrderInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the cancellationConfirmation property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationConfirmationType }
     *     
     */
    public CancellationConfirmationType getCancellationConfirmation() {
        return cancellationConfirmation;
    }

    /**
     * Sets the value of the cancellationConfirmation property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationConfirmationType }
     *     
     */
    public void setCancellationConfirmation(CancellationConfirmationType value) {
        this.cancellationConfirmation = value;
    }

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
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
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
