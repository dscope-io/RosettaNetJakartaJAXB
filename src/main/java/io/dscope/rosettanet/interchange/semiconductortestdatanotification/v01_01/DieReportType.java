
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_01;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07.IntCoordinate;
import io.dscope.rosettanet.universal.dates.v01_01.DateTimePeriodType;


/**
 * <p>Java class for DieReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DieReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CharFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="CompositeFailSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DieTestingPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.01}DateTimePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="FirstFailSort" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="GangTest" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.01}GangTestType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07}IntCoordinate" minOccurs="0"/&gt;
 *         &lt;element name="UserSite" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "DieReportType", propOrder = {
    "charFlag",
    "compositeFailSort",
    "dieTestingPeriod",
    "firstFailSort",
    "gangTest",
    "intCoordinate",
    "userSite"
})
public class DieReportType {

    @XmlElement(name = "CharFlag")
    protected Boolean charFlag;
    @XmlElement(name = "CompositeFailSort")
    protected String compositeFailSort;
    @XmlElement(name = "DieTestingPeriod")
    protected DateTimePeriodType dieTestingPeriod;
    @XmlElement(name = "FirstFailSort")
    protected BigInteger firstFailSort;
    @XmlElement(name = "GangTest")
    protected GangTestType gangTest;
    @XmlElementRef(name = "IntCoordinate", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", type = IntCoordinate.class, required = false)
    protected IntCoordinate intCoordinate;
    @XmlElement(name = "UserSite")
    protected BigInteger userSite;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the charFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCharFlag() {
        return charFlag;
    }

    /**
     * Sets the value of the charFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCharFlag(Boolean value) {
        this.charFlag = value;
    }

    /**
     * Gets the value of the compositeFailSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompositeFailSort() {
        return compositeFailSort;
    }

    /**
     * Sets the value of the compositeFailSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompositeFailSort(String value) {
        this.compositeFailSort = value;
    }

    /**
     * Gets the value of the dieTestingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodType }
     *     
     */
    public DateTimePeriodType getDieTestingPeriod() {
        return dieTestingPeriod;
    }

    /**
     * Sets the value of the dieTestingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodType }
     *     
     */
    public void setDieTestingPeriod(DateTimePeriodType value) {
        this.dieTestingPeriod = value;
    }

    /**
     * Gets the value of the firstFailSort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFirstFailSort() {
        return firstFailSort;
    }

    /**
     * Sets the value of the firstFailSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFirstFailSort(BigInteger value) {
        this.firstFailSort = value;
    }

    /**
     * Gets the value of the gangTest property.
     * 
     * @return
     *     possible object is
     *     {@link GangTestType }
     *     
     */
    public GangTestType getGangTest() {
        return gangTest;
    }

    /**
     * Sets the value of the gangTest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GangTestType }
     *     
     */
    public void setGangTest(GangTestType value) {
        this.gangTest = value;
    }

    /**
     * Gets the value of the intCoordinate property.
     * 
     * @return
     *     possible object is
     *     {@link IntCoordinate }
     *     
     */
    public IntCoordinate getIntCoordinate() {
        return intCoordinate;
    }

    /**
     * Sets the value of the intCoordinate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntCoordinate }
     *     
     */
    public void setIntCoordinate(IntCoordinate value) {
        this.intCoordinate = value;
    }

    /**
     * Gets the value of the userSite property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserSite() {
        return userSite;
    }

    /**
     * Sets the value of the userSite property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserSite(BigInteger value) {
        this.userSite = value;
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
