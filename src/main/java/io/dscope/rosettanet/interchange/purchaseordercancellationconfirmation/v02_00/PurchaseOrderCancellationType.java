
package io.dscope.rosettanet.interchange.purchaseordercancellationconfirmation.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.purchaseordercancellationreason.v01_03.PurchaseOrderCancellationReason;
import io.dscope.rosettanet.interchange.codelist.response.v01_01.ResponseType;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


/**
 * <p>Java class for PurchaseOrderCancellationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PurchaseOrderCancellationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03}PurchaseOrderCancellationReason" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseOrderCancellationResponse" type="{urn:rosettanet:specification:interchange:Response:xsd:codelist:01.01}ResponseType"/&gt;
 *         &lt;element name="PurchaseOrderIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="RequestingDocument" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PurchaseOrderCancellationType", propOrder = {
    "purchaseOrderCancellationReason",
    "purchaseOrderCancellationResponse",
    "purchaseOrderIdentifier",
    "requestingDocument",
    "revisionNumber"
})
public class PurchaseOrderCancellationType {

    @XmlElementRef(name = "PurchaseOrderCancellationReason", namespace = "urn:rosettanet:specification:domain:Procurement:PurchaseOrderCancellationReason:xsd:codelist:01.03", type = PurchaseOrderCancellationReason.class, required = false)
    protected PurchaseOrderCancellationReason purchaseOrderCancellationReason;
    @XmlElement(name = "PurchaseOrderCancellationResponse", required = true)
    protected ResponseType purchaseOrderCancellationResponse;
    @XmlElement(name = "PurchaseOrderIdentifier", required = true)
    protected BusinessDocumentReferenceType purchaseOrderIdentifier;
    @XmlElement(name = "RequestingDocument", required = true)
    protected BusinessDocumentReferenceType requestingDocument;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the purchaseOrderCancellationReason property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseOrderCancellationReason }
     *     
     */
    public PurchaseOrderCancellationReason getPurchaseOrderCancellationReason() {
        return purchaseOrderCancellationReason;
    }

    /**
     * Sets the value of the purchaseOrderCancellationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseOrderCancellationReason }
     *     
     */
    public void setPurchaseOrderCancellationReason(PurchaseOrderCancellationReason value) {
        this.purchaseOrderCancellationReason = value;
    }

    /**
     * Gets the value of the purchaseOrderCancellationResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType }
     *     
     */
    public ResponseType getPurchaseOrderCancellationResponse() {
        return purchaseOrderCancellationResponse;
    }

    /**
     * Sets the value of the purchaseOrderCancellationResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType }
     *     
     */
    public void setPurchaseOrderCancellationResponse(ResponseType value) {
        this.purchaseOrderCancellationResponse = value;
    }

    /**
     * Gets the value of the purchaseOrderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getPurchaseOrderIdentifier() {
        return purchaseOrderIdentifier;
    }

    /**
     * Sets the value of the purchaseOrderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setPurchaseOrderIdentifier(BusinessDocumentReferenceType value) {
        this.purchaseOrderIdentifier = value;
    }

    /**
     * Gets the value of the requestingDocument property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getRequestingDocument() {
        return requestingDocument;
    }

    /**
     * Sets the value of the requestingDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setRequestingDocument(BusinessDocumentReferenceType value) {
        this.requestingDocument = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
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
