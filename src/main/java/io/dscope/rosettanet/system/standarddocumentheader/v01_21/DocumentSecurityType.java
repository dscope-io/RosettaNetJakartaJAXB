
package io.dscope.rosettanet.system.standarddocumentheader.v01_21;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DocumentSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonRepudiableReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersistentEncryption" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersistentSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "DocumentSecurityType", propOrder = {
    "nonRepudiableReceipt",
    "persistentEncryption",
    "persistentSignature"
})
public class DocumentSecurityType {

    @XmlElement(name = "NonRepudiableReceipt")
    protected boolean nonRepudiableReceipt;
    @XmlElement(name = "PersistentEncryption")
    protected boolean persistentEncryption;
    @XmlElement(name = "PersistentSignature")
    protected boolean persistentSignature;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the nonRepudiableReceipt property.
     * 
     */
    public boolean isNonRepudiableReceipt() {
        return nonRepudiableReceipt;
    }

    /**
     * Sets the value of the nonRepudiableReceipt property.
     * 
     */
    public void setNonRepudiableReceipt(boolean value) {
        this.nonRepudiableReceipt = value;
    }

    /**
     * Gets the value of the persistentEncryption property.
     * 
     */
    public boolean isPersistentEncryption() {
        return persistentEncryption;
    }

    /**
     * Sets the value of the persistentEncryption property.
     * 
     */
    public void setPersistentEncryption(boolean value) {
        this.persistentEncryption = value;
    }

    /**
     * Gets the value of the persistentSignature property.
     * 
     */
    public boolean isPersistentSignature() {
        return persistentSignature;
    }

    /**
     * Sets the value of the persistentSignature property.
     * 
     */
    public void setPersistentSignature(boolean value) {
        this.persistentSignature = value;
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
