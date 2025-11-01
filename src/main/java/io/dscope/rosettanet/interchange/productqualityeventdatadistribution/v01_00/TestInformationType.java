
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.Environment;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.Result;
import io.dscope.rosettanet.universal.dates.v01_03.StartAndEndDateTime;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescriptionType;


/**
 * <p>Java class for TestInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}Environment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="IsTestPass" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="Name" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}Result" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}StartAndEndDateTime"/&gt;
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
@XmlType(name = "TestInformationType", propOrder = {
    "comment",
    "environment",
    "isTestPass",
    "name",
    "operatorIdentifier",
    "partnerDescription",
    "result",
    "startAndEndDateTime"
})
public class TestInformationType {

    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "Environment", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = Environment.class, required = false)
    protected List<Environment> environment;
    @XmlElement(name = "IsTestPass")
    protected Boolean isTestPass;
    @XmlElement(name = "Name")
    protected TextualDescriptionType name;
    @XmlElement(name = "OperatorIdentifier")
    protected String operatorIdentifier;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "Result", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = Result.class, required = false)
    protected List<Result> result;
    @XmlElementRef(name = "StartAndEndDateTime", namespace = "urn:rosettanet:specification:universal:Dates:xsd:schema:01.03", type = StartAndEndDateTime.class)
    protected StartAndEndDateTime startAndEndDateTime;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the environment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the environment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnvironment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Environment }
     * 
     * 
     */
    public List<Environment> getEnvironment() {
        if (environment == null) {
            environment = new ArrayList<Environment>();
        }
        return this.environment;
    }

    /**
     * Gets the value of the isTestPass property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsTestPass() {
        return isTestPass;
    }

    /**
     * Sets the value of the isTestPass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsTestPass(Boolean value) {
        this.isTestPass = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setName(TextualDescriptionType value) {
        this.name = value;
    }

    /**
     * Gets the value of the operatorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIdentifier() {
        return operatorIdentifier;
    }

    /**
     * Sets the value of the operatorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIdentifier(String value) {
        this.operatorIdentifier = value;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the result property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResult().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Result }
     * 
     * 
     */
    public List<Result> getResult() {
        if (result == null) {
            result = new ArrayList<Result>();
        }
        return this.result;
    }

    /**
     * Gets the value of the startAndEndDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link StartAndEndDateTime }
     *     
     */
    public StartAndEndDateTime getStartAndEndDateTime() {
        return startAndEndDateTime;
    }

    /**
     * Sets the value of the startAndEndDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link StartAndEndDateTime }
     *     
     */
    public void setStartAndEndDateTime(StartAndEndDateTime value) {
        this.startAndEndDateTime = value;
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
