
package io.dscope.rosettanet.interchange.engineeringinformationinquirydistribution.v01_02;

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
import io.dscope.rosettanet.domain.design.design.v02_19.EngineeringInformationType;
import io.dscope.rosettanet.system.standarddocumentheader.v01_20.DocumentHeader;


/**
 * <p>Java class for EngineeringInformationInquiryDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EngineeringInformationInquiryDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.20}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="EngineeringInformation" type="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}EngineeringInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="EngineeringInformationHeader" type="{urn:rosettanet:specification:interchange:EngineeringInformationInquiryDistribution:xsd:schema:01.02}EngineeringInformationHeaderType"/&gt;
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
@XmlType(name = "EngineeringInformationInquiryDistributionType", propOrder = {
    "documentHeader",
    "engineeringInformation",
    "engineeringInformationHeader"
})
public class EngineeringInformationInquiryDistributionType {

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.20", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "EngineeringInformation")
    protected List<EngineeringInformationType> engineeringInformation;
    @XmlElement(name = "EngineeringInformationHeader", required = true)
    protected EngineeringInformationHeaderType engineeringInformationHeader;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the engineeringInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the engineeringInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEngineeringInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EngineeringInformationType }
     * 
     * 
     */
    public List<EngineeringInformationType> getEngineeringInformation() {
        if (engineeringInformation == null) {
            engineeringInformation = new ArrayList<EngineeringInformationType>();
        }
        return this.engineeringInformation;
    }

    /**
     * Gets the value of the engineeringInformationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link EngineeringInformationHeaderType }
     *     
     */
    public EngineeringInformationHeaderType getEngineeringInformationHeader() {
        return engineeringInformationHeader;
    }

    /**
     * Sets the value of the engineeringInformationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineeringInformationHeaderType }
     *     
     */
    public void setEngineeringInformationHeader(EngineeringInformationHeaderType value) {
        this.engineeringInformationHeader = value;
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
