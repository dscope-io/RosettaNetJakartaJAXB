
package io.dscope.rosettanet.interchange.shippingordercancellationrequest.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03.OrderAdmin;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;


/**
 * <p>Java class for RequestingOrderInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestingOrderInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03}OrderAdmin" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" minOccurs="0"/&gt;
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
@XmlType(name = "RequestingOrderInformationType", propOrder = {
    "businessDocumentReference",
    "orderAdmin",
    "orderReference"
})
public class RequestingOrderInformationType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElementRef(name = "OrderAdmin", namespace = "urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03", type = OrderAdmin.class, required = false)
    protected List<OrderAdmin> orderAdmin;
    @XmlElement(name = "OrderReference")
    protected BusinessDocumentReferenceType orderReference;
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
     * Gets the value of the orderAdmin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderAdmin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderAdmin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderAdmin }
     * 
     * 
     */
    public List<OrderAdmin> getOrderAdmin() {
        if (orderAdmin == null) {
            orderAdmin = new ArrayList<OrderAdmin>();
        }
        return this.orderAdmin;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setOrderReference(BusinessDocumentReferenceType value) {
        this.orderReference = value;
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
