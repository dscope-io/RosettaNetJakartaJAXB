
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.devicepackagetype.v01_03.DevicePackageType;
import io.dscope.rosettanet.domain.shared.codelist.packagetype.v01_01.PackageType;
import io.dscope.rosettanet.universal.physicaldimension.v01_05.LinearType;


/**
 * <p>Java class for EngineeringInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AdditionalDescription" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}AttachmentType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.03}DevicePackageType" minOccurs="0"/&gt;
 *         &lt;element name="ExpectedDaysPerLayer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="PackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageDimension" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.05}LinearType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01}PackageType" minOccurs="0"/&gt;
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
@XmlType(name = "EngineeringInformationType", propOrder = {
    "additionalDescription",
    "devicePackageType",
    "expectedDaysPerLayer",
    "packageDescription",
    "packageDimension",
    "packageType"
})
public class EngineeringInformationType {

    @XmlElement(name = "AdditionalDescription")
    protected List<AttachmentType> additionalDescription;
    @XmlElementRef(name = "DevicePackageType", namespace = "urn:rosettanet:specification:domain:Manufacturing:DevicePackageType:xsd:codelist:01.03", type = DevicePackageType.class, required = false)
    protected DevicePackageType devicePackageType;
    @XmlElement(name = "ExpectedDaysPerLayer")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger expectedDaysPerLayer;
    @XmlElement(name = "PackageDescription")
    protected String packageDescription;
    @XmlElement(name = "PackageDimension")
    protected LinearType packageDimension;
    @XmlElementRef(name = "PackageType", namespace = "urn:rosettanet:specification:domain:Shared:PackageType:xsd:codelist:01.01", type = PackageType.class, required = false)
    protected PackageType packageType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the additionalDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachmentType }
     * 
     * 
     */
    public List<AttachmentType> getAdditionalDescription() {
        if (additionalDescription == null) {
            additionalDescription = new ArrayList<AttachmentType>();
        }
        return this.additionalDescription;
    }

    /**
     * Gets the value of the devicePackageType property.
     * 
     * @return
     *     possible object is
     *     {@link DevicePackageType }
     *     
     */
    public DevicePackageType getDevicePackageType() {
        return devicePackageType;
    }

    /**
     * Sets the value of the devicePackageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DevicePackageType }
     *     
     */
    public void setDevicePackageType(DevicePackageType value) {
        this.devicePackageType = value;
    }

    /**
     * Gets the value of the expectedDaysPerLayer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getExpectedDaysPerLayer() {
        return expectedDaysPerLayer;
    }

    /**
     * Sets the value of the expectedDaysPerLayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setExpectedDaysPerLayer(BigInteger value) {
        this.expectedDaysPerLayer = value;
    }

    /**
     * Gets the value of the packageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageDescription() {
        return packageDescription;
    }

    /**
     * Sets the value of the packageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageDescription(String value) {
        this.packageDescription = value;
    }

    /**
     * Gets the value of the packageDimension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getPackageDimension() {
        return packageDimension;
    }

    /**
     * Sets the value of the packageDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setPackageDimension(LinearType value) {
        this.packageDimension = value;
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
