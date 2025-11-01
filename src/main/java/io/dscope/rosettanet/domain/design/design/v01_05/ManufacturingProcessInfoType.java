
package io.dscope.rosettanet.domain.design.design.v01_05;

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
 * <p>Java class for ManufacturingProcessInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ManufacturingProcessInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Process" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.05}ProcessValue"/&gt;
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
@XmlType(name = "ManufacturingProcessInfoType", propOrder = {
    "process",
    "processValue"
})
public class ManufacturingProcessInfoType {

    @XmlElement(name = "Process", required = true)
    protected String process;
    @XmlElementRef(name = "ProcessValue", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.05", type = ProcessValue.class)
    protected ProcessValue processValue;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the process property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcess() {
        return process;
    }

    /**
     * Sets the value of the process property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcess(String value) {
        this.process = value;
    }

    /**
     * Gets the value of the processValue property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessValue }
     *     
     */
    public ProcessValue getProcessValue() {
        return processValue;
    }

    /**
     * Sets the value of the processValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessValue }
     *     
     */
    public void setProcessValue(ProcessValue value) {
        this.processValue = value;
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
