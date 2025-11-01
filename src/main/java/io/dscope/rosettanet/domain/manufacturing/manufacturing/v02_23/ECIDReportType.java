
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ECIDReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ECIDReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="DecodedID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Decoder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ECIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}IntCoordinate"/&gt;
 *         &lt;element name="RawBits" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}HexadecimalType" minOccurs="0"/&gt;
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
@XmlType(name = "ECIDReportType", propOrder = {
    "componentNumber",
    "decodedID",
    "decoder",
    "ecidType",
    "intCoordinate",
    "rawBits"
})
public class ECIDReportType {

    @XmlElement(name = "ComponentNumber")
    protected BigInteger componentNumber;
    @XmlElement(name = "DecodedID")
    protected String decodedID;
    @XmlElement(name = "Decoder")
    protected String decoder;
    @XmlElement(name = "ECIDType")
    protected String ecidType;
    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = IntCoordinate.class)
    protected IntCoordinate intCoordinate;
    @XmlElement(name = "RawBits")
    protected String rawBits;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the componentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentNumber() {
        return componentNumber;
    }

    /**
     * Sets the value of the componentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentNumber(BigInteger value) {
        this.componentNumber = value;
    }

    /**
     * Gets the value of the decodedID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecodedID() {
        return decodedID;
    }

    /**
     * Sets the value of the decodedID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecodedID(String value) {
        this.decodedID = value;
    }

    /**
     * Gets the value of the decoder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecoder() {
        return decoder;
    }

    /**
     * Sets the value of the decoder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecoder(String value) {
        this.decoder = value;
    }

    /**
     * Gets the value of the ecidType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getECIDType() {
        return ecidType;
    }

    /**
     * Sets the value of the ecidType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setECIDType(String value) {
        this.ecidType = value;
    }

    /**
     * Gets the value of the intCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link IntCoordinate }
     *     
     */
    public IntCoordinate getIntCoordinate() {
        return intCoordinate;
    }

    /**
     * Sets the value of the intCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCoordinate }
     *     
     */
    public void setIntCoordinate(IntCoordinate value) {
        this.intCoordinate = value;
    }

    /**
     * Gets the value of the rawBits property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRawBits() {
        return rawBits;
    }

    /**
     * Sets the value of the rawBits property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRawBits(String value) {
        this.rawBits = value;
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
