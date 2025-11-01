
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23.TestTemperature;


/**
 * <p>Java class for InlineSetupReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InlineSetupReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Disposition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasOperationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MeasOperationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Orientation" type="{urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04}OrientationType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="ProcessRecipe" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23}TestTemperature" minOccurs="0"/&gt;
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
@XmlType(name = "InlineSetupReportType", propOrder = {
    "disposition",
    "measOperationID",
    "measOperationName",
    "orientation",
    "primaryIdentifier",
    "processRecipe",
    "testFlag",
    "testTemperature"
})
public class InlineSetupReportType {

    @XmlElement(name = "Disposition")
    protected String disposition;
    @XmlElement(name = "MeasOperationID")
    protected String measOperationID;
    @XmlElement(name = "MeasOperationName")
    protected String measOperationName;
    @XmlElement(name = "Orientation")
    protected OrientationType orientation;
    @XmlElement(name = "PrimaryIdentifier")
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "ProcessRecipe")
    protected String processRecipe;
    @XmlElement(name = "TestFlag")
    protected String testFlag;
    @XmlElementRef(name = "TestTemperature", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", type = TestTemperature.class, required = false)
    protected TestTemperature testTemperature;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the disposition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisposition() {
        return disposition;
    }

    /**
     * Sets the value of the disposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisposition(String value) {
        this.disposition = value;
    }

    /**
     * Gets the value of the measOperationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasOperationID() {
        return measOperationID;
    }

    /**
     * Sets the value of the measOperationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasOperationID(String value) {
        this.measOperationID = value;
    }

    /**
     * Gets the value of the measOperationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeasOperationName() {
        return measOperationName;
    }

    /**
     * Sets the value of the measOperationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeasOperationName(String value) {
        this.measOperationName = value;
    }

    /**
     * Gets the value of the orientation property.
     * 
     * @return
     *     possible object is
     *     {@link OrientationType }
     *     
     */
    public OrientationType getOrientation() {
        return orientation;
    }

    /**
     * Sets the value of the orientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrientationType }
     *     
     */
    public void setOrientation(OrientationType value) {
        this.orientation = value;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPrimaryIdentifier(BigInteger value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the processRecipe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessRecipe() {
        return processRecipe;
    }

    /**
     * Sets the value of the processRecipe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessRecipe(String value) {
        this.processRecipe = value;
    }

    /**
     * Gets the value of the testFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestFlag() {
        return testFlag;
    }

    /**
     * Sets the value of the testFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestFlag(String value) {
        this.testFlag = value;
    }

    /**
     * Gets the value of the testTemperature property.
     * 
     * @return
     *     possible object is
     *     {@link TestTemperature }
     *     
     */
    public TestTemperature getTestTemperature() {
        return testTemperature;
    }

    /**
     * Sets the value of the testTemperature property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestTemperature }
     *     
     */
    public void setTestTemperature(TestTemperature value) {
        this.testTemperature = value;
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
