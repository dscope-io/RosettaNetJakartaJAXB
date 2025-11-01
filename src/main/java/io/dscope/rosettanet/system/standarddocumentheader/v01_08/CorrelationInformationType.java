
package io.dscope.rosettanet.system.standarddocumentheader.v01_08;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for CorrelationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorrelationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.08}ContractInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.08}RequestingDocumentInformation" minOccurs="0"/&gt;
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
@XmlType(name = "CorrelationInformationType", propOrder = {
    "contractInformation",
    "requestingDocumentInformation"
})
public class CorrelationInformationType {

    @XmlElementRef(name = "ContractInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.08", type = ContractInformation.class, required = false)
    protected ContractInformation contractInformation;
    @XmlElementRef(name = "RequestingDocumentInformation", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.08", type = RequestingDocumentInformation.class, required = false)
    protected RequestingDocumentInformation requestingDocumentInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInformation(ContractInformation value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the requestingDocumentInformation property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingDocumentInformation }
     *     
     */
    public RequestingDocumentInformation getRequestingDocumentInformation() {
        return requestingDocumentInformation;
    }

    /**
     * Sets the value of the requestingDocumentInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingDocumentInformation }
     *     
     */
    public void setRequestingDocumentInformation(RequestingDocumentInformation value) {
        this.requestingDocumentInformation = value;
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
