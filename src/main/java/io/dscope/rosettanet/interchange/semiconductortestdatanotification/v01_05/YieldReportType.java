
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for YieldReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YieldReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GoodDieQuantity" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GrossDiePerWafer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="OtherDefectQuantity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TestQty" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="TestYld" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType" minOccurs="0"/&gt;
 *         &lt;element name="TotalFunctionalDie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "YieldReportType", propOrder = {
    "goodDieQuantity",
    "grossDiePerWafer",
    "otherDefectQuantity",
    "testQty",
    "testYld",
    "totalFunctionalDie"
})
public class YieldReportType {

    @XmlElement(name = "GoodDieQuantity")
    protected BigInteger goodDieQuantity;
    @XmlElement(name = "GrossDiePerWafer")
    protected BigInteger grossDiePerWafer;
    @XmlElement(name = "OtherDefectQuantity")
    protected String otherDefectQuantity;
    @XmlElement(name = "TestQty")
    protected BigInteger testQty;
    @XmlElement(name = "TestYld")
    protected BigDecimal testYld;
    @XmlElement(name = "TotalFunctionalDie")
    protected String totalFunctionalDie;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the goodDieQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGoodDieQuantity() {
        return goodDieQuantity;
    }

    /**
     * Sets the value of the goodDieQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGoodDieQuantity(BigInteger value) {
        this.goodDieQuantity = value;
    }

    /**
     * Gets the value of the grossDiePerWafer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getGrossDiePerWafer() {
        return grossDiePerWafer;
    }

    /**
     * Sets the value of the grossDiePerWafer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setGrossDiePerWafer(BigInteger value) {
        this.grossDiePerWafer = value;
    }

    /**
     * Gets the value of the otherDefectQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherDefectQuantity() {
        return otherDefectQuantity;
    }

    /**
     * Sets the value of the otherDefectQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherDefectQuantity(String value) {
        this.otherDefectQuantity = value;
    }

    /**
     * Gets the value of the testQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTestQty() {
        return testQty;
    }

    /**
     * Sets the value of the testQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTestQty(BigInteger value) {
        this.testQty = value;
    }

    /**
     * Gets the value of the testYld property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTestYld() {
        return testYld;
    }

    /**
     * Sets the value of the testYld property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTestYld(BigDecimal value) {
        this.testYld = value;
    }

    /**
     * Gets the value of the totalFunctionalDie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalFunctionalDie() {
        return totalFunctionalDie;
    }

    /**
     * Sets the value of the totalFunctionalDie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalFunctionalDie(String value) {
        this.totalFunctionalDie = value;
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
