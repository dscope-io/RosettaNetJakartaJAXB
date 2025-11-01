
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_03;

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
import io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00.DocumentIssuanceType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;


/**
 * <p>Java class for CertificateOfAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateOfAnalysisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00}DocumentIssuanceType"/&gt;
 *         &lt;element name="LotIdentification" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.03}LotIdentificationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Material" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.03}MaterialType"/&gt;
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
@XmlType(name = "CertificateOfAnalysisType", propOrder = {
    "businessDocumentReference",
    "comment",
    "documentIssuanceType",
    "lotIdentification",
    "material"
})
public class CertificateOfAnalysisType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "DocumentIssuanceType", namespace = "urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", type = DocumentIssuanceType.class)
    protected DocumentIssuanceType documentIssuanceType;
    @XmlElement(name = "LotIdentification", required = true)
    protected List<LotIdentificationType> lotIdentification;
    @XmlElement(name = "Material", required = true)
    protected MaterialType material;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

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
     * Gets the value of the documentIssuanceType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIssuanceType }
     *     
     */
    public DocumentIssuanceType getDocumentIssuanceType() {
        return documentIssuanceType;
    }

    /**
     * Sets the value of the documentIssuanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIssuanceType }
     *     
     */
    public void setDocumentIssuanceType(DocumentIssuanceType value) {
        this.documentIssuanceType = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotIdentificationType }
     * 
     * 
     */
    public List<LotIdentificationType> getLotIdentification() {
        if (lotIdentification == null) {
            lotIdentification = new ArrayList<LotIdentificationType>();
        }
        return this.lotIdentification;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialType }
     *     
     */
    public MaterialType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialType }
     *     
     */
    public void setMaterial(MaterialType value) {
        this.material = value;
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
