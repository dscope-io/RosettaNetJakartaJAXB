
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.componenttype.v01_02.ComponentType;


/**
 * <p>Java class for BuildInfoReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BuildInfoReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComponentID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComponentLocation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ComponentNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="ComponentParentNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ComponentSerialNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ComponentType:xsd:codelist:01.02}ComponentType" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "BuildInfoReportType", propOrder = {
    "componentDescription",
    "componentID",
    "componentLocation",
    "componentNumber",
    "componentParentNumber",
    "componentSerialNumber",
    "componentType",
    "userSite"
})
public class BuildInfoReportType {

    @XmlElement(name = "ComponentDescription")
    protected String componentDescription;
    @XmlElement(name = "ComponentID")
    protected String componentID;
    @XmlElement(name = "ComponentLocation")
    protected String componentLocation;
    @XmlElement(name = "ComponentNumber", required = true)
    protected BigInteger componentNumber;
    @XmlElement(name = "ComponentParentNumber")
    protected BigInteger componentParentNumber;
    @XmlElement(name = "ComponentSerialNumber")
    protected String componentSerialNumber;
    @XmlElementRef(name = "ComponentType", namespace = "urn:rosettanet:specification:domain:Manufacturing:ComponentType:xsd:codelist:01.02", type = ComponentType.class, required = false)
    protected ComponentType componentType;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the componentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentDescription() {
        return componentDescription;
    }

    /**
     * Sets the value of the componentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentDescription(String value) {
        this.componentDescription = value;
    }

    /**
     * Gets the value of the componentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentID() {
        return componentID;
    }

    /**
     * Sets the value of the componentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentID(String value) {
        this.componentID = value;
    }

    /**
     * Gets the value of the componentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentLocation() {
        return componentLocation;
    }

    /**
     * Sets the value of the componentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentLocation(String value) {
        this.componentLocation = value;
    }

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
     * Gets the value of the componentParentNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getComponentParentNumber() {
        return componentParentNumber;
    }

    /**
     * Sets the value of the componentParentNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setComponentParentNumber(BigInteger value) {
        this.componentParentNumber = value;
    }

    /**
     * Gets the value of the componentSerialNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComponentSerialNumber() {
        return componentSerialNumber;
    }

    /**
     * Sets the value of the componentSerialNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComponentSerialNumber(String value) {
        this.componentSerialNumber = value;
    }

    /**
     * Gets the value of the componentType property.
     * 
     * @return
     *     possible object is
     *     {@link ComponentType }
     *     
     */
    public ComponentType getComponentType() {
        return componentType;
    }

    /**
     * Sets the value of the componentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComponentType }
     *     
     */
    public void setComponentType(ComponentType value) {
        this.componentType = value;
    }

    /**
     * Gets the value of the userSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserSite() {
        return userSite;
    }

    /**
     * Sets the value of the userSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserSite(BigInteger value) {
        this.userSite = value;
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
