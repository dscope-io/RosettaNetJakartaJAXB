
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

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
import io.dscope.rosettanet.universal.physicaldimension.v01_00.LinearType;
import io.dscope.rosettanet.universal.productidentification.v01_00.ProductIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_00.ProductIdentificationType;


/**
 * <p>Java class for SourceDeviceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceDeviceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternateSourceDevice" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DiePerWaferWorkOn" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="GrossDiePerWafer" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0}SourceLot" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0}WaferBacksideInformation" minOccurs="0"/&gt;
 *         &lt;element name="WaferSize" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:1.0}LinearType" minOccurs="0"/&gt;
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
@XmlType(name = "SourceDeviceType", propOrder = {
    "alternateSourceDevice",
    "diePerWaferWorkOn",
    "grossDiePerWafer",
    "productIdentification",
    "sourceLot",
    "waferBacksideInformation",
    "waferSize"
})
public class SourceDeviceType {

    @XmlElement(name = "AlternateSourceDevice")
    protected List<ProductIdentificationType> alternateSourceDevice;
    @XmlElement(name = "DiePerWaferWorkOn")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger diePerWaferWorkOn;
    @XmlElement(name = "GrossDiePerWafer")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger grossDiePerWafer;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "SourceLot", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", type = SourceLot.class)
    protected List<SourceLot> sourceLot;
    @XmlElementRef(name = "WaferBacksideInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", type = WaferBacksideInformation.class, required = false)
    protected WaferBacksideInformation waferBacksideInformation;
    @XmlElement(name = "WaferSize")
    protected LinearType waferSize;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternateSourceDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateSourceDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateSourceDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getAlternateSourceDevice() {
        if (alternateSourceDevice == null) {
            alternateSourceDevice = new ArrayList<ProductIdentificationType>();
        }
        return this.alternateSourceDevice;
    }

    /**
     * Gets the value of the diePerWaferWorkOn property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiePerWaferWorkOn() {
        return diePerWaferWorkOn;
    }

    /**
     * Sets the value of the diePerWaferWorkOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiePerWaferWorkOn(BigInteger value) {
        this.diePerWaferWorkOn = value;
    }

    /**
     * Gets the value of the grossDiePerWafer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossDiePerWafer() {
        return grossDiePerWafer;
    }

    /**
     * Sets the value of the grossDiePerWafer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossDiePerWafer(BigInteger value) {
        this.grossDiePerWafer = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the sourceLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceLot }
     * 
     * 
     */
    public List<SourceLot> getSourceLot() {
        if (sourceLot == null) {
            sourceLot = new ArrayList<SourceLot>();
        }
        return this.sourceLot;
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
     * Gets the value of the waferSize property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getWaferSize() {
        return waferSize;
    }

    /**
     * Sets the value of the waferSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setWaferSize(LinearType value) {
        this.waferSize = value;
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
