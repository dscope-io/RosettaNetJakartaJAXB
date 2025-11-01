
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeader;


/**
 * <p>Java class for WarrantyClaimConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WarrantyClaimConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="WarrantyClaimConfirmData" type="{urn:rosettanet:specification:interchange:WarrantyClaimConfirmation:xsd:schema:01.01}WarrantyClaimConfirmDataType"/&gt;
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
@XmlType(name = "WarrantyClaimConfirmationType", propOrder = {
    "documentHeader",
    "warrantyClaimConfirmData"
})
public class WarrantyClaimConfirmationType {

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "WarrantyClaimConfirmData", required = true)
    protected WarrantyClaimConfirmDataType warrantyClaimConfirmData;
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
     * Gets the value of the warrantyClaimConfirmData property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyClaimConfirmDataType }
     *     
     */
    public WarrantyClaimConfirmDataType getWarrantyClaimConfirmData() {
        return warrantyClaimConfirmData;
    }

    /**
     * Sets the value of the warrantyClaimConfirmData property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyClaimConfirmDataType }
     *     
     */
    public void setWarrantyClaimConfirmData(WarrantyClaimConfirmDataType value) {
        this.warrantyClaimConfirmData = value;
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
