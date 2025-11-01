
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.physicaldimension.v01_06.LinearType;


/**
 * <p>Java class for PackageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PackageDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalDimension" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.06}LinearType" minOccurs="0"/&gt;
 *         &lt;element name="PinCount" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "PackageType", propOrder = {
    "packageDescription",
    "packageFamily",
    "packageType",
    "physicalDimension",
    "pinCount"
})
public class PackageType {

    @XmlElement(name = "PackageDescription")
    protected String packageDescription;
    @XmlElement(name = "PackageFamily")
    protected String packageFamily;
    @XmlElement(name = "PackageType")
    protected String packageType;
    @XmlElement(name = "PhysicalDimension")
    protected LinearType physicalDimension;
    @XmlElement(name = "PinCount")
    protected BigInteger pinCount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the packageFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageFamily() {
        return packageFamily;
    }

    /**
     * Sets the value of the packageFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageFamily(String value) {
        this.packageFamily = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the physicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getPhysicalDimension() {
        return physicalDimension;
    }

    /**
     * Sets the value of the physicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setPhysicalDimension(LinearType value) {
        this.physicalDimension = value;
    }

    /**
     * Gets the value of the pinCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPinCount() {
        return pinCount;
    }

    /**
     * Sets the value of the pinCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPinCount(BigInteger value) {
        this.pinCount = value;
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
