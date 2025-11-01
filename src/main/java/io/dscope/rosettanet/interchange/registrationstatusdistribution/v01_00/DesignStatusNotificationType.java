
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

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
import io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00.FileTransmission;


/**
 * <p>Java class for DesignStatusNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DesignStatusNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DesignRegistrationInformation" type="{urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00}DesignRegistrationInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00}FileTransmission"/&gt;
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
@XmlType(name = "DesignStatusNotificationType", propOrder = {
    "designRegistrationInformation",
    "fileTransmission"
})
public class DesignStatusNotificationType {

    @XmlElement(name = "DesignRegistrationInformation", required = true)
    protected List<DesignRegistrationInformationType> designRegistrationInformation;
    @XmlElementRef(name = "FileTransmission", namespace = "urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", type = FileTransmission.class)
    protected FileTransmission fileTransmission;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the designRegistrationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the designRegistrationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDesignRegistrationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DesignRegistrationInformationType }
     * 
     * 
     */
    public List<DesignRegistrationInformationType> getDesignRegistrationInformation() {
        if (designRegistrationInformation == null) {
            designRegistrationInformation = new ArrayList<DesignRegistrationInformationType>();
        }
        return this.designRegistrationInformation;
    }

    /**
     * Gets the value of the fileTransmission property.
     * 
     * @return
     *     possible object is
     *     {@link FileTransmission }
     *     
     */
    public FileTransmission getFileTransmission() {
        return fileTransmission;
    }

    /**
     * Sets the value of the fileTransmission property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileTransmission }
     *     
     */
    public void setFileTransmission(FileTransmission value) {
        this.fileTransmission = value;
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
