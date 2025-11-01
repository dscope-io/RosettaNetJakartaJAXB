
package io.dscope.rosettanet.system.standarddocumentheader.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.codelist.businessprocessidentifier.v01_00.TpirBusinessProcessIdentifier;


/**
 * <p>Java class for TpirPipIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpirPipIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerId" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}DunsPlus4Type"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0}PipIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0}PipVersion"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0}TpirBusinessProcessIdentifier"/&gt;
 *         &lt;element name="TpirPipVersion" type="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0}VersionIdentifierType"/&gt;
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
@XmlType(name = "TpirPipIdentificationType", propOrder = {
    "partnerId",
    "pipIdentifier",
    "pipVersion",
    "tpirBusinessProcessIdentifier",
    "tpirPipVersion"
})
public class TpirPipIdentificationType {

    @XmlElement(name = "PartnerId", required = true)
    protected String partnerId;
    @XmlElementRef(name = "PipIdentifier", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0", type = PipIdentifier.class)
    protected PipIdentifier pipIdentifier;
    @XmlElementRef(name = "PipVersion", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0", type = PipVersion.class)
    protected PipVersion pipVersion;
    @XmlElementRef(name = "TpirBusinessProcessIdentifier", namespace = "urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0", type = TpirBusinessProcessIdentifier.class)
    protected TpirBusinessProcessIdentifier tpirBusinessProcessIdentifier;
    @XmlElement(name = "TpirPipVersion", required = true)
    protected String tpirPipVersion;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the pipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PipIdentifier }
     *     
     */
    public PipIdentifier getPipIdentifier() {
        return pipIdentifier;
    }

    /**
     * Sets the value of the pipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipIdentifier }
     *     
     */
    public void setPipIdentifier(PipIdentifier value) {
        this.pipIdentifier = value;
    }

    /**
     * Gets the value of the pipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link PipVersion }
     *     
     */
    public PipVersion getPipVersion() {
        return pipVersion;
    }

    /**
     * Sets the value of the pipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipVersion }
     *     
     */
    public void setPipVersion(PipVersion value) {
        this.pipVersion = value;
    }

    /**
     * Gets the value of the tpirBusinessProcessIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TpirBusinessProcessIdentifier }
     *     
     */
    public TpirBusinessProcessIdentifier getTpirBusinessProcessIdentifier() {
        return tpirBusinessProcessIdentifier;
    }

    /**
     * Sets the value of the tpirBusinessProcessIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpirBusinessProcessIdentifier }
     *     
     */
    public void setTpirBusinessProcessIdentifier(TpirBusinessProcessIdentifier value) {
        this.tpirBusinessProcessIdentifier = value;
    }

    /**
     * Gets the value of the tpirPipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpirPipVersion() {
        return tpirPipVersion;
    }

    /**
     * Sets the value of the tpirPipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpirPipVersion(String value) {
        this.tpirPipVersion = value;
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
