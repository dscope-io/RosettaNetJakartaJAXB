
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.devicetype.v01_03.DeviceType;
import io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04.Priority;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.WaferBacksideInformation;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for TargetDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TargetDeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomerLotNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerTargetDevice" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:01.03}DeviceType" minOccurs="0"/&gt;
 *         &lt;element name="IsTargetDeviceStatusEOL" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04}Priority" minOccurs="0"/&gt;
 *         &lt;element name="TargetDeviceLotNumber" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="VendorTargetDevice" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}WaferBacksideInformation" minOccurs="0"/&gt;
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
@XmlType(name = "TargetDeviceType", propOrder = {
    "customerLotNumber",
    "customerTargetDevice",
    "deviceType",
    "isTargetDeviceStatusEOL",
    "priority",
    "targetDeviceLotNumber",
    "vendorTargetDevice",
    "waferBacksideInformation"
})
public class TargetDeviceType {

    @XmlElement(name = "CustomerLotNumber")
    protected List<String> customerLotNumber;
    @XmlElement(name = "CustomerTargetDevice", required = true)
    protected ProductIdentificationType customerTargetDevice;
    @XmlElementRef(name = "DeviceType", namespace = "urn:rosettanet:specification:domain:Manufacturing:DeviceType:xsd:codelist:01.03", type = DeviceType.class, required = false)
    protected DeviceType deviceType;
    @XmlElement(name = "IsTargetDeviceStatusEOL")
    protected Boolean isTargetDeviceStatusEOL;
    @XmlElementRef(name = "Priority", namespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", type = Priority.class, required = false)
    protected Priority priority;
    @XmlElement(name = "TargetDeviceLotNumber")
    protected List<String> targetDeviceLotNumber;
    @XmlElement(name = "VendorTargetDevice")
    protected ProductIdentificationType vendorTargetDevice;
    @XmlElementRef(name = "WaferBacksideInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = WaferBacksideInformation.class, required = false)
    protected WaferBacksideInformation waferBacksideInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customerLotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerLotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerLotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCustomerLotNumber() {
        if (customerLotNumber == null) {
            customerLotNumber = new ArrayList<String>();
        }
        return this.customerLotNumber;
    }

    /**
     * Gets the value of the customerTargetDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getCustomerTargetDevice() {
        return customerTargetDevice;
    }

    /**
     * Sets the value of the customerTargetDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setCustomerTargetDevice(ProductIdentificationType value) {
        this.customerTargetDevice = value;
    }

    /**
     * Gets the value of the deviceType property.
     * 
     * @return
     *     possible object is
     *     {@link DeviceType }
     *     
     */
    public DeviceType getDeviceType() {
        return deviceType;
    }

    /**
     * Sets the value of the deviceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeviceType }
     *     
     */
    public void setDeviceType(DeviceType value) {
        this.deviceType = value;
    }

    /**
     * Gets the value of the isTargetDeviceStatusEOL property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTargetDeviceStatusEOL() {
        return isTargetDeviceStatusEOL;
    }

    /**
     * Sets the value of the isTargetDeviceStatusEOL property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTargetDeviceStatusEOL(Boolean value) {
        this.isTargetDeviceStatusEOL = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the targetDeviceLotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetDeviceLotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetDeviceLotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTargetDeviceLotNumber() {
        if (targetDeviceLotNumber == null) {
            targetDeviceLotNumber = new ArrayList<String>();
        }
        return this.targetDeviceLotNumber;
    }

    /**
     * Gets the value of the vendorTargetDevice property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getVendorTargetDevice() {
        return vendorTargetDevice;
    }

    /**
     * Sets the value of the vendorTargetDevice property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setVendorTargetDevice(ProductIdentificationType value) {
        this.vendorTargetDevice = value;
    }

    /**
     * Gets the value of the waferBacksideInformation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferBacksideInformation }
     *     
     */
    public WaferBacksideInformation getWaferBacksideInformation() {
        return waferBacksideInformation;
    }

    /**
     * Sets the value of the waferBacksideInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferBacksideInformation }
     *     
     */
    public void setWaferBacksideInformation(WaferBacksideInformation value) {
        this.waferBacksideInformation = value;
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
