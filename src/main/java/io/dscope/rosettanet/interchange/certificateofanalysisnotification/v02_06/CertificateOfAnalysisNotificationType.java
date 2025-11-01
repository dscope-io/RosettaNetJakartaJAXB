
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06;

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
import io.dscope.rosettanet.system.standarddocumentheader.v01_24.DocumentHeader;


/**
 * <p>Java class for CertificateOfAnalysisNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateOfAnalysisNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CertificateOfAnalysis" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}CertificateOfAnalysisType" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24}DocumentHeader" minOccurs="0"/&gt;
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
@XmlType(name = "CertificateOfAnalysisNotificationType", propOrder = {
    "certificateOfAnalysis",
    "documentHeader"
})
public class CertificateOfAnalysisNotificationType {

    @XmlElement(name = "CertificateOfAnalysis", required = true)
    protected List<CertificateOfAnalysisType> certificateOfAnalysis;
    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the certificateOfAnalysis property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificateOfAnalysis property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificateOfAnalysis().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CertificateOfAnalysisType }
     * 
     * 
     */
    public List<CertificateOfAnalysisType> getCertificateOfAnalysis() {
        if (certificateOfAnalysis == null) {
            certificateOfAnalysis = new ArrayList<CertificateOfAnalysisType>();
        }
        return this.certificateOfAnalysis;
    }

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
