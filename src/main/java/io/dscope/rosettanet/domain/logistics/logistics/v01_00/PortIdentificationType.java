
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.portidentifierauthoritycode.v01_00.PortIdentifierAuthorityCode;


/**
 * <p>Java class for PortIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:PortIdentifierAuthorityCode:xsd:codelist:1.0}PortIdentifierAuthorityCode"/&gt;
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
@XmlType(name = "PortIdentificationType", propOrder = {
    "identifier",
    "portIdentifierAuthorityCode"
})
public class PortIdentificationType {

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElementRef(name = "PortIdentifierAuthorityCode", namespace = "urn:rosettanet:specification:domain:Logistics:PortIdentifierAuthorityCode:xsd:codelist:1.0", type = PortIdentifierAuthorityCode.class)
    protected PortIdentifierAuthorityCode portIdentifierAuthorityCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the portIdentifierAuthorityCode property.
     * 
     * @return
     *     possible object is
     *     {@link PortIdentifierAuthorityCode }
     *     
     */
    public PortIdentifierAuthorityCode getPortIdentifierAuthorityCode() {
        return portIdentifierAuthorityCode;
    }

    /**
     * Sets the value of the portIdentifierAuthorityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link PortIdentifierAuthorityCode }
     *     
     */
    public void setPortIdentifierAuthorityCode(PortIdentifierAuthorityCode value) {
        this.portIdentifierAuthorityCode = value;
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
