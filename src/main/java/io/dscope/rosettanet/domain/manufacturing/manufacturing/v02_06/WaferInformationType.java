
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.rawwafertype.v01_03.RawWaferType;
import io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_03.WaferQualityRatingType;


/**
 * <p>Java class for WaferInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Grade" type="{urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.03}WaferQualityRatingType"/&gt;
 *         &lt;element name="MappingFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryWaferIdentifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03}RawWaferType" minOccurs="0"/&gt;
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
@XmlType(name = "WaferInformationType", propOrder = {
    "grade",
    "mappingFileName",
    "primaryWaferIdentifier",
    "rawWaferType"
})
public class WaferInformationType {

    @XmlElement(name = "Grade", required = true)
    protected WaferQualityRatingType grade;
    @XmlElement(name = "MappingFileName")
    protected String mappingFileName;
    @XmlElement(name = "PrimaryWaferIdentifier", required = true)
    protected String primaryWaferIdentifier;
    @XmlElementRef(name = "RawWaferType", namespace = "urn:rosettanet:specification:domain:Manufacturing:RawWaferType:xsd:codelist:01.03", type = RawWaferType.class, required = false)
    protected RawWaferType rawWaferType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link WaferQualityRatingType }
     *     
     */
    public WaferQualityRatingType getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferQualityRatingType }
     *     
     */
    public void setGrade(WaferQualityRatingType value) {
        this.grade = value;
    }

    /**
     * Gets the value of the mappingFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingFileName() {
        return mappingFileName;
    }

    /**
     * Sets the value of the mappingFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingFileName(String value) {
        this.mappingFileName = value;
    }

    /**
     * Gets the value of the primaryWaferIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryWaferIdentifier() {
        return primaryWaferIdentifier;
    }

    /**
     * Sets the value of the primaryWaferIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryWaferIdentifier(String value) {
        this.primaryWaferIdentifier = value;
    }

    /**
     * Gets the value of the rawWaferType property.
     * 
     * @return
     *     possible object is
     *     {@link RawWaferType }
     *     
     */
    public RawWaferType getRawWaferType() {
        return rawWaferType;
    }

    /**
     * Sets the value of the rawWaferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RawWaferType }
     *     
     */
    public void setRawWaferType(RawWaferType value) {
        this.rawWaferType = value;
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
