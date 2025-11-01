
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.status.v01_04.Status;


/**
 * <p>Java class for VectorReportType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VectorReportType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address1" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Address2" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="CycleCnt" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="Pins" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Status:xsd:codelist:01.04}Status"/&gt;
 *         &lt;element name="VectorLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "VectorReportType", propOrder = {
    "address1",
    "address2",
    "cycleCnt",
    "pins",
    "status",
    "vectorLabel"
})
public class VectorReportType {

    @XmlElement(name = "Address1")
    protected BigInteger address1;
    @XmlElement(name = "Address2")
    protected BigInteger address2;
    @XmlElement(name = "CycleCnt")
    protected BigInteger cycleCnt;
    @XmlElement(name = "Pins", required = true)
    protected String pins;
    @XmlElementRef(name = "Status", namespace = "urn:rosettanet:specification:domain:Manufacturing:Status:xsd:codelist:01.04", type = Status.class)
    protected Status status;
    @XmlElement(name = "VectorLabel")
    protected String vectorLabel;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the address1 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddress1(BigInteger value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAddress2(BigInteger value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the cycleCnt property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCycleCnt() {
        return cycleCnt;
    }

    /**
     * Sets the value of the cycleCnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCycleCnt(BigInteger value) {
        this.cycleCnt = value;
    }

    /**
     * Gets the value of the pins property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPins() {
        return pins;
    }

    /**
     * Sets the value of the pins property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPins(String value) {
        this.pins = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the vectorLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVectorLabel() {
        return vectorLabel;
    }

    /**
     * Sets the value of the vectorLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVectorLabel(String value) {
        this.vectorLabel = value;
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
