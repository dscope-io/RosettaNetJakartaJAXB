
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import io.dscope.rosettanet.domain.service.service.v02_12.IncidentDetailType;


/**
 * <p>Java class for QualityIncidentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityIncidentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ComponentRepairData" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}ComponentRepairDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Detail" type="{urn:rosettanet:specification:domain:Service:xsd:schema:02.12}IncidentDetailType"/&gt;
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestInformation" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}TestInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "QualityIncidentInformationType", propOrder = {
    "componentRepairData",
    "description",
    "detail",
    "number",
    "sequenceNumber",
    "testInformation"
})
public class QualityIncidentInformationType {

    @XmlElement(name = "ComponentRepairData")
    protected List<ComponentRepairDataType> componentRepairData;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Detail", required = true)
    protected IncidentDetailType detail;
    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "SequenceNumber")
    protected String sequenceNumber;
    @XmlElement(name = "TestInformation")
    protected List<TestInformationType> testInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the componentRepairData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the componentRepairData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComponentRepairData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentRepairDataType }
     * 
     * 
     */
    public List<ComponentRepairDataType> getComponentRepairData() {
        if (componentRepairData == null) {
            componentRepairData = new ArrayList<ComponentRepairDataType>();
        }
        return this.componentRepairData;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link IncidentDetailType }
     *     
     */
    public IncidentDetailType getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncidentDetailType }
     *     
     */
    public void setDetail(IncidentDetailType value) {
        this.detail = value;
    }

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the testInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestInformationType }
     * 
     * 
     */
    public List<TestInformationType> getTestInformation() {
        if (testInformation == null) {
            testInformation = new ArrayList<TestInformationType>();
        }
        return this.testInformation;
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
