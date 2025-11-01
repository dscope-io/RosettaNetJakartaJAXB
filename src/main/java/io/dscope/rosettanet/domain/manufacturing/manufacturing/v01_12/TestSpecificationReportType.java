
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import java.math.BigInteger;
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


/**
 * <p>Java class for TestSpecificationReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestSpecificationReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Category" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassKeyItemDefect" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TestID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TestName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12}TestParameter" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestSpecificationReportType", propOrder = {
    "category",
    "passKeyItemDefect",
    "primaryIdentifier",
    "testID",
    "testName",
    "testParameter"
})
public class TestSpecificationReportType {

    @XmlElement(name = "Category")
    protected String category;
    @XmlElement(name = "PassKeyItemDefect")
    protected Boolean passKeyItemDefect;
    @XmlElement(name = "PrimaryIdentifier", required = true)
    protected BigInteger primaryIdentifier;
    @XmlElement(name = "TestID", required = true)
    protected BigInteger testID;
    @XmlElement(name = "TestName")
    protected String testName;
    @XmlElementRef(name = "TestParameter", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", type = TestParameter.class, required = false)
    protected List<TestParameter> testParameter;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the passKeyItemDefect property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPassKeyItemDefect() {
        return passKeyItemDefect;
    }

    /**
     * Sets the value of the passKeyItemDefect property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPassKeyItemDefect(Boolean value) {
        this.passKeyItemDefect = value;
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
     * Gets the value of the testID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestID() {
        return testID;
    }

    /**
     * Sets the value of the testID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestID(BigInteger value) {
        this.testID = value;
    }

    /**
     * Gets the value of the testName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestName() {
        return testName;
    }

    /**
     * Sets the value of the testName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestName(String value) {
        this.testName = value;
    }

    /**
     * Gets the value of the testParameter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testParameter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestParameter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestParameter }
     * 
     * 
     */
    public List<TestParameter> getTestParameter() {
        if (testParameter == null) {
            testParameter = new ArrayList<TestParameter>();
        }
        return this.testParameter;
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
