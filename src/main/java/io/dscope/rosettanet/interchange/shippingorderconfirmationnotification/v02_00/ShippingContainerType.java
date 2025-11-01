
package io.dscope.rosettanet.interchange.shippingorderconfirmationnotification.v02_00;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.PhysicalDimension;
import io.dscope.rosettanet.domain.logistics.logistics.v02_15.TrackingReference;
import io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01.PackageType;


/**
 * <p>Java class for ShippingContainerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}PhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ShippingContainerItem" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}ShippingContainerItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubContainer" type="{urn:rosettanet:specification:interchange:ShippingOrderConfirmationNotification:xsd:schema:02.00}SubContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}TrackingReference" minOccurs="0"/&gt;
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
@XmlType(name = "ShippingContainerType", propOrder = {
    "packageType",
    "physicalDimension",
    "shippingContainerIdentifier",
    "shippingContainerItem",
    "subContainer",
    "trackingReference"
})
public class ShippingContainerType {

    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElementRef(name = "PhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = PhysicalDimension.class, required = false)
    protected PhysicalDimension physicalDimension;
    @XmlElement(name = "ShippingContainerIdentifier", required = true)
    protected String shippingContainerIdentifier;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItemType> shippingContainerItem;
    @XmlElement(name = "SubContainer")
    protected List<SubContainerType> subContainer;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageType }
     *     
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageType }
     *     
     */
    public void setPackageType(PackageType value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimension }
     *     
     */
    public PhysicalDimension getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimension }
     *     
     */
    public void setPhysicalDimension(PhysicalDimension value) {
        this.physicalDimension = value;
    }

    /**
     * Gets the value of the shippingContainerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingContainerIdentifier() {
        return shippingContainerIdentifier;
    }

    /**
     * Sets the value of the shippingContainerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingContainerIdentifier(String value) {
        this.shippingContainerIdentifier = value;
    }

    /**
     * Gets the value of the shippingContainerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainerItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerItemType }
     * 
     * 
     */
    public List<ShippingContainerItemType> getShippingContainerItem() {
        if (shippingContainerItem == null) {
            shippingContainerItem = new ArrayList<ShippingContainerItemType>();
        }
        return this.shippingContainerItem;
    }

    /**
     * Gets the value of the subContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubContainerType }
     * 
     * 
     */
    public List<SubContainerType> getSubContainer() {
        if (subContainer == null) {
            subContainer = new ArrayList<SubContainerType>();
        }
        return this.subContainer;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
