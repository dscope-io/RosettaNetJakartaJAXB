
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AssemblyProcessType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AssemblyProcessType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AssemblyLotReport" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}AssemblyLotReportType"/&gt;
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
@XmlType(name = "AssemblyProcessType", propOrder = {
    "assemblyLotReport"
})
public class AssemblyProcessType {

    @XmlElement(name = "AssemblyLotReport", required = true)
    protected AssemblyLotReportType assemblyLotReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the assemblyLotReport property.
     * 
     * @return
     *     possible object is
     *     {@link AssemblyLotReportType }
     *     
     */
    public AssemblyLotReportType getAssemblyLotReport() {
        return assemblyLotReport;
    }

    /**
     * Sets the value of the assemblyLotReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssemblyLotReportType }
     *     
     */
    public void setAssemblyLotReport(AssemblyLotReportType value) {
        this.assemblyLotReport = value;
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
