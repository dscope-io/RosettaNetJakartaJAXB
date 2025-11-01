
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_09;

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
import io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_01.ContainerSpecification;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.PhysicalDimensionType;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.TrackingReference;
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
 *         &lt;element name="ContainerPhysicalDimension" type="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}PhysicalDimensionType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.01}ContainerSpecification" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
 *         &lt;element name="ShippingCartonIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainerItem" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}ShippingContainerItemType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SubContainer" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.09}SubContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}TrackingReference" minOccurs="0"/&gt;
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
    "containerPhysicalDimension",
    "containerSpecification",
    "identifier",
    "packageType",
    "shippingCartonIdentifier",
    "shippingContainerItem",
    "subContainer",
    "trackingReference"
})
public class ShippingContainerType {

    @XmlElement(name = "ContainerPhysicalDimension")
    protected PhysicalDimensionType containerPhysicalDimension;
    @XmlElementRef(name = "ContainerSpecification", namespace = "urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.01", type = ContainerSpecification.class, required = false)
    protected ContainerSpecification containerSpecification;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlElement(name = "ShippingCartonIdentifier")
    protected String shippingCartonIdentifier;
    @XmlElement(name = "ShippingContainerItem")
    protected List<ShippingContainerItemType> shippingContainerItem;
    @XmlElement(name = "SubContainer")
    protected List<SubContainerType> subContainer;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = TrackingReference.class, required = false)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the containerPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public PhysicalDimensionType getContainerPhysicalDimension() {
        return containerPhysicalDimension;
    }

    /**
     * Sets the value of the containerPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalDimensionType }
     *     
     */
    public void setContainerPhysicalDimension(PhysicalDimensionType value) {
        this.containerPhysicalDimension = value;
    }

    /**
     * Gets the value of the containerSpecification property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerSpecification }
     *     
     */
    public ContainerSpecification getContainerSpecification() {
        return containerSpecification;
    }

    /**
     * Sets the value of the containerSpecification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerSpecification }
     *     
     */
    public void setContainerSpecification(ContainerSpecification value) {
        this.containerSpecification = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

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
     * Gets the value of the shippingCartonIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShippingCartonIdentifier() {
        return shippingCartonIdentifier;
    }

    /**
     * Sets the value of the shippingCartonIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShippingCartonIdentifier(String value) {
        this.shippingCartonIdentifier = value;
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
