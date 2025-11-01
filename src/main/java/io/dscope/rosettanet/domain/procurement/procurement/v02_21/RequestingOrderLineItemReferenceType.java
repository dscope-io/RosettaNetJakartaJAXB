
package io.dscope.rosettanet.domain.procurement.procurement.v02_21;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.document.v01_10.BusinessDocumentReference;


/**
 * <p>Java class for RequestingOrderLineItemReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingOrderLineItemReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.10}BusinessDocumentReference"/&gt;
 *         &lt;element name="SubLineNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubLineSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "RequestingOrderLineItemReferenceType", propOrder = {
    "businessDocumentReference",
    "subLineNumber",
    "subLineSchedule"
})
public class RequestingOrderLineItemReferenceType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.10", type = BusinessDocumentReference.class)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "SubLineNumber")
    protected String subLineNumber;
    @XmlElement(name = "SubLineSchedule")
    protected String subLineSchedule;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
    }

    /**
     * Gets the value of the subLineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLineNumber() {
        return subLineNumber;
    }

    /**
     * Sets the value of the subLineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLineNumber(String value) {
        this.subLineNumber = value;
    }

    /**
     * Gets the value of the subLineSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubLineSchedule() {
        return subLineSchedule;
    }

    /**
     * Sets the value of the subLineSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubLineSchedule(String value) {
        this.subLineSchedule = value;
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
