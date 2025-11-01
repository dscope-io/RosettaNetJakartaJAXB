
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for ValveType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValveType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GovernanceBody" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Material" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OutletConnection" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RFOSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ValveType", propOrder = {
    "governanceBody",
    "material",
    "outletConnection",
    "rfoSize"
})
public class ValveType {

    @XmlElement(name = "GovernanceBody")
    protected String governanceBody;
    @XmlElement(name = "Material")
    protected String material;
    @XmlElement(name = "OutletConnection")
    protected String outletConnection;
    @XmlElement(name = "RFOSize")
    protected String rfoSize;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the governanceBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernanceBody() {
        return governanceBody;
    }

    /**
     * Sets the value of the governanceBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernanceBody(String value) {
        this.governanceBody = value;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterial(String value) {
        this.material = value;
    }

    /**
     * Gets the value of the outletConnection property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutletConnection() {
        return outletConnection;
    }

    /**
     * Sets the value of the outletConnection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutletConnection(String value) {
        this.outletConnection = value;
    }

    /**
     * Gets the value of the rfoSize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRFOSize() {
        return rfoSize;
    }

    /**
     * Sets the value of the rfoSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRFOSize(String value) {
        this.rfoSize = value;
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
