
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

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
 * <p>Java class for PinInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PinInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ChipPinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModulePinName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Pin" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Signal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PinInformationType", propOrder = {
    "chipPinName",
    "modulePinName",
    "pin",
    "signal"
})
public class PinInformationType {

    @XmlElement(name = "ChipPinName")
    protected String chipPinName;
    @XmlElement(name = "ModulePinName")
    protected String modulePinName;
    @XmlElement(name = "Pin")
    protected BigInteger pin;
    @XmlElement(name = "Signal")
    protected String signal;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the pin property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPin() {
        return pin;
    }

    /**
     * Sets the value of the pin property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPin(BigInteger value) {
        this.pin = value;
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
