
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_02;

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
import io.dscope.rosettanet.interchange.codelist.phase.v01_00.Phase;


/**
 * <p>Java class for TestingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestingDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00}Phase" minOccurs="0"/&gt;
 *         &lt;element name="Repetition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sample" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.02}SampleType" minOccurs="0"/&gt;
 *         &lt;element name="SourceComponent" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="SourceComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "TestingDataType", propOrder = {
    "method",
    "phase",
    "repetition",
    "sample",
    "sourceComponent",
    "sourceComponentDescription"
})
public class TestingDataType {

    @XmlElement(name = "Method")
    protected String method;
    @XmlElementRef(name = "Phase", namespace = "urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", type = Phase.class, required = false)
    protected Phase phase;
    @XmlElement(name = "Repetition")
    protected String repetition;
    @XmlElement(name = "Sample")
    protected SampleType sample;
    @XmlElement(name = "SourceComponent")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceComponent;
    @XmlElement(name = "SourceComponentDescription")
    protected String sourceComponentDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link Phase }
     *     
     */
    public Phase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phase }
     *     
     */
    public void setPhase(Phase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the repetition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetition() {
        return repetition;
    }

    /**
     * Sets the value of the repetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetition(String value) {
        this.repetition = value;
    }

    /**
     * Gets the value of the sample property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType }
     *     
     */
    public SampleType getSample() {
        return sample;
    }

    /**
     * Sets the value of the sample property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType }
     *     
     */
    public void setSample(SampleType value) {
        this.sample = value;
    }

    /**
     * Gets the value of the sourceComponent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceComponent() {
        return sourceComponent;
    }

    /**
     * Sets the value of the sourceComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceComponent(BigInteger value) {
        this.sourceComponent = value;
    }

    /**
     * Gets the value of the sourceComponentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceComponentDescription() {
        return sourceComponentDescription;
    }

    /**
     * Sets the value of the sourceComponentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceComponentDescription(String value) {
        this.sourceComponentDescription = value;
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
