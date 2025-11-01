
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PinType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Channel" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ChipPinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModulePinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PositionID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Signal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PinType", propOrder = {
    "channel",
    "chipPinName",
    "modulePinName",
    "positionID",
    "signal",
    "type"
})
public class PinType {

    @XmlElement(name = "Channel")
    protected BigInteger channel;
    @XmlElement(name = "ChipPinName")
    protected String chipPinName;
    @XmlElement(name = "ModulePinName")
    protected String modulePinName;
    @XmlElement(name = "PositionID", required = true)
    protected BigInteger positionID;
    @XmlElement(name = "Signal")
    protected String signal;
    @XmlElement(name = "Type")
    protected String type;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the channel property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChannel() {
        return channel;
    }

    /**
     * Sets the value of the channel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChannel(BigInteger value) {
        this.channel = value;
    }

    /**
     * Gets the value of the chipPinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChipPinName() {
        return chipPinName;
    }

    /**
     * Sets the value of the chipPinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChipPinName(String value) {
        this.chipPinName = value;
    }

    /**
     * Gets the value of the modulePinName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModulePinName() {
        return modulePinName;
    }

    /**
     * Sets the value of the modulePinName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModulePinName(String value) {
        this.modulePinName = value;
    }

    /**
     * Gets the value of the positionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPositionID() {
        return positionID;
    }

    /**
     * Sets the value of the positionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPositionID(BigInteger value) {
        this.positionID = value;
    }

    /**
     * Gets the value of the signal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignal() {
        return signal;
    }

    /**
     * Sets the value of the signal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignal(String value) {
        this.signal = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
