
package io.dscope.rosettanet.domain.logistics.logistics.v02_09;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.document.v01_04.BusinessDocumentReferenceType;


/**
 * <p>Java class for BillOfLadingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BillOfLadingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="ManifestNumber" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.04}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "BillOfLadingType", propOrder = {
    "freightReference",
    "manifestNumber"
})
public class BillOfLadingType {

    @XmlElement(name = "FreightReference", required = true)
    protected BusinessDocumentReferenceType freightReference;
    @XmlElement(name = "ManifestNumber")
    protected BusinessDocumentReferenceType manifestNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the freightReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getFreightReference() {
        return freightReference;
    }

    /**
     * Sets the value of the freightReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setFreightReference(BusinessDocumentReferenceType value) {
        this.freightReference = value;
    }

    /**
     * Gets the value of the manifestNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getManifestNumber() {
        return manifestNumber;
    }

    /**
     * Sets the value of the manifestNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setManifestNumber(BusinessDocumentReferenceType value) {
        this.manifestNumber = value;
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
