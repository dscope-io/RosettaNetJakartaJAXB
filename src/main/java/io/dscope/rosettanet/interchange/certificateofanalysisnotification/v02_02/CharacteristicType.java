
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_02;

import java.math.BigInteger;
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
 * <p>Java class for CharacteristicType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacteristicType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="CodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="QualityData" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.02}QualityDataType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="SubCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubCodeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestingData" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.02}TestingDataType"/&gt;
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
@XmlType(name = "CharacteristicType", propOrder = {
    "code",
    "codeDescription",
    "qualityData",
    "subCode",
    "subCodeDescription",
    "testingData"
})
public class CharacteristicType {

    @XmlElement(name = "Code", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger code;
    @XmlElement(name = "CodeDescription")
    protected String codeDescription;
    @XmlElement(name = "QualityData", required = true)
    protected List<QualityDataType> qualityData;
    @XmlElement(name = "SubCode")
    protected String subCode;
    @XmlElement(name = "SubCodeDescription")
    protected String subCodeDescription;
    @XmlElement(name = "TestingData", required = true)
    protected TestingDataType testingData;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the codeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDescription() {
        return codeDescription;
    }

    /**
     * Sets the value of the codeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDescription(String value) {
        this.codeDescription = value;
    }

    /**
     * Gets the value of the qualityData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityDataType }
     * 
     * 
     */
    public List<QualityDataType> getQualityData() {
        if (qualityData == null) {
            qualityData = new ArrayList<QualityDataType>();
        }
        return this.qualityData;
    }

    /**
     * Gets the value of the subCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * Sets the value of the subCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * Gets the value of the subCodeDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCodeDescription() {
        return subCodeDescription;
    }

    /**
     * Sets the value of the subCodeDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCodeDescription(String value) {
        this.subCodeDescription = value;
    }

    /**
     * Gets the value of the testingData property.
     * 
     * @return
     *     possible object is
     *     {@link TestingDataType }
     *     
     */
    public TestingDataType getTestingData() {
        return testingData;
    }

    /**
     * Sets the value of the testingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TestingDataType }
     *     
     */
    public void setTestingData(TestingDataType value) {
        this.testingData = value;
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
