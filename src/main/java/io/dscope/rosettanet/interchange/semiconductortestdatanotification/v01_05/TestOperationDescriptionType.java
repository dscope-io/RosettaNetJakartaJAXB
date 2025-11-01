
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02.CompletionStatusType;


/**
 * <p>Java class for TestOperationDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestOperationDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="LotEndDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotStartDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="LotStatusCompletion" type="{urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02}CompletionStatusType" minOccurs="0"/&gt;
 *         &lt;element name="TestOpIdentification" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05}TestOpIdentificationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="TestPass" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TestOperationDescriptionType", propOrder = {
    "lotEndDateTime",
    "lotStartDateTime",
    "lotStatusCompletion",
    "testOpIdentification",
    "testPass"
})
public class TestOperationDescriptionType {

    @XmlElement(name = "LotEndDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotEndDateTime;
    @XmlElement(name = "LotStartDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lotStartDateTime;
    @XmlElement(name = "LotStatusCompletion")
    protected CompletionStatusType lotStatusCompletion;
    @XmlElement(name = "TestOpIdentification", required = true)
    protected List<TestOpIdentificationType> testOpIdentification;
    @XmlElement(name = "TestPass")
    protected List<BigInteger> testPass;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLotEndDateTime() {
        return lotEndDateTime;
    }

    /**
     * Sets the value of the lotEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLotEndDateTime(XMLGregorianCalendar value) {
        this.lotEndDateTime = value;
    }

    /**
     * Gets the value of the lotStartDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLotStartDateTime() {
        return lotStartDateTime;
    }

    /**
     * Sets the value of the lotStartDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLotStartDateTime(XMLGregorianCalendar value) {
        this.lotStartDateTime = value;
    }

    /**
     * Gets the value of the lotStatusCompletion property.
     * 
     * @return
     *     possible object is
     *     {@link CompletionStatusType }
     *     
     */
    public CompletionStatusType getLotStatusCompletion() {
        return lotStatusCompletion;
    }

    /**
     * Sets the value of the lotStatusCompletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompletionStatusType }
     *     
     */
    public void setLotStatusCompletion(CompletionStatusType value) {
        this.lotStatusCompletion = value;
    }

    /**
     * Gets the value of the testOpIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testOpIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestOpIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestOpIdentificationType }
     * 
     * 
     */
    public List<TestOpIdentificationType> getTestOpIdentification() {
        if (testOpIdentification == null) {
            testOpIdentification = new ArrayList<TestOpIdentificationType>();
        }
        return this.testOpIdentification;
    }

    /**
     * Gets the value of the testPass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testPass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestPass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getTestPass() {
        if (testPass == null) {
            testPass = new ArrayList<BigInteger>();
        }
        return this.testPass;
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
