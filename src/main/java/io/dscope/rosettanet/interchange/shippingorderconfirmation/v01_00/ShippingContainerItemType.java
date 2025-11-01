
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v01_00;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.LotReference;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ManufacturerProfile;


/**
 * <p>Java class for ShippingContainerItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}LotReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NumberOfItemPackages" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="QuantityInformation" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:01.00}QuantityInformationType"/&gt;
 *         &lt;element name="RequestingOrderLineItemReference" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:01.00}RequestingOrderLineItemReferenceType"/&gt;
 *         &lt;element name="TraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingContainerItemType", propOrder = {
    "lotReference",
    "manufacturerProfile",
    "numberOfItemPackages",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "traceIdentifier"
})
public class ShippingContainerItemType {

    @XmlElementRef(name = "LotReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = LotReference.class, required = false)
    protected List<LotReference> lotReference;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElement(name = "NumberOfItemPackages")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberOfItemPackages;
    @XmlElement(name = "QuantityInformation", required = true)
    protected QuantityInformationType quantityInformation;
    @XmlElement(name = "RequestingOrderLineItemReference", required = true)
    protected RequestingOrderLineItemReferenceType requestingOrderLineItemReference;
    @XmlElement(name = "TraceIdentifier")
    protected List<String> traceIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotReference }
     * 
     * 
     */
    public List<LotReference> getLotReference() {
        if (lotReference == null) {
            lotReference = new ArrayList<LotReference>();
        }
        return this.lotReference;
    }

    /**
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the numberOfItemPackages property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfItemPackages() {
        return numberOfItemPackages;
    }

    /**
     * Sets the value of the numberOfItemPackages property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfItemPackages(BigInteger value) {
        this.numberOfItemPackages = value;
    }

    /**
     * Gets the value of the quantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInformationType }
     *     
     */
    public QuantityInformationType getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformationType }
     *     
     */
    public void setQuantityInformation(QuantityInformationType value) {
        this.quantityInformation = value;
    }

    /**
     * Gets the value of the requestingOrderLineItemReference property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingOrderLineItemReferenceType }
     *     
     */
    public RequestingOrderLineItemReferenceType getRequestingOrderLineItemReference() {
        return requestingOrderLineItemReference;
    }

    /**
     * Sets the value of the requestingOrderLineItemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingOrderLineItemReferenceType }
     *     
     */
    public void setRequestingOrderLineItemReference(RequestingOrderLineItemReferenceType value) {
        this.requestingOrderLineItemReference = value;
    }

    /**
     * Gets the value of the traceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraceIdentifier() {
        if (traceIdentifier == null) {
            traceIdentifier = new ArrayList<String>();
        }
        return this.traceIdentifier;
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
