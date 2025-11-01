
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for FinalTestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinalTestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Die" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}DieType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ECIDReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}ECIDReportType" minOccurs="0"/&gt;
 *         &lt;element name="YieldReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}YieldReportType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FinalTestType", propOrder = {
    "die",
    "ecidReport",
    "yieldReport"
})
public class FinalTestType {

    @XmlElement(name = "Die", required = true)
    protected List<DieType> die;
    @XmlElement(name = "ECIDReport")
    protected ECIDReportType ecidReport;
    @XmlElement(name = "YieldReport")
    protected List<YieldReportType> yieldReport;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the die property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the die property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDie().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DieType }
     * 
     * 
     */
    public List<DieType> getDie() {
        if (die == null) {
            die = new ArrayList<DieType>();
        }
        return this.die;
    }

    /**
     * Gets the value of the ecidReport property.
     * 
     * @return
     *     possible object is
     *     {@link ECIDReportType }
     *     
     */
    public ECIDReportType getECIDReport() {
        return ecidReport;
    }

    /**
     * Sets the value of the ecidReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link ECIDReportType }
     *     
     */
    public void setECIDReport(ECIDReportType value) {
        this.ecidReport = value;
    }

    /**
     * Gets the value of the yieldReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the yieldReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYieldReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YieldReportType }
     * 
     * 
     */
    public List<YieldReportType> getYieldReport() {
        if (yieldReport == null) {
            yieldReport = new ArrayList<YieldReportType>();
        }
        return this.yieldReport;
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
