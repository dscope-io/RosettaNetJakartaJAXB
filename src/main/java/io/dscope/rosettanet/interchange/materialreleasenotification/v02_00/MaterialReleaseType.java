
package io.dscope.rosettanet.interchange.materialreleasenotification.v02_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.OrderShippingInformation;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;


/**
 * <p>Java class for MaterialReleaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialReleaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}OrderShippingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PartnerProductRelease" type="{urn:rosettanet:specification:interchange:MaterialReleaseNotification:xsd:schema:02.00}PartnerProductReleaseType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ReleaseIdentifierReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialReleaseType", propOrder = {
    "orderShippingInformation",
    "partnerDescription",
    "partnerProductRelease",
    "releaseIdentifierReference"
})
public class MaterialReleaseType {

    @XmlElementRef(name = "OrderShippingInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = OrderShippingInformation.class, required = false)
    protected List<OrderShippingInformation> orderShippingInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected List<PartnerDescription> partnerDescription;
    @XmlElement(name = "PartnerProductRelease", required = true)
    protected List<PartnerProductReleaseType> partnerProductRelease;
    @XmlElement(name = "ReleaseIdentifierReference")
    protected List<BusinessDocumentReferenceType> releaseIdentifierReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the orderShippingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderShippingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderShippingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderShippingInformation }
     * 
     * 
     */
    public List<OrderShippingInformation> getOrderShippingInformation() {
        if (orderShippingInformation == null) {
            orderShippingInformation = new ArrayList<OrderShippingInformation>();
        }
        return this.orderShippingInformation;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerDescription }
     * 
     * 
     */
    public List<PartnerDescription> getPartnerDescription() {
        if (partnerDescription == null) {
            partnerDescription = new ArrayList<PartnerDescription>();
        }
        return this.partnerDescription;
    }

    /**
     * Gets the value of the partnerProductRelease property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnerProductRelease property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnerProductRelease().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnerProductReleaseType }
     * 
     * 
     */
    public List<PartnerProductReleaseType> getPartnerProductRelease() {
        if (partnerProductRelease == null) {
            partnerProductRelease = new ArrayList<PartnerProductReleaseType>();
        }
        return this.partnerProductRelease;
    }

    /**
     * Gets the value of the releaseIdentifierReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the releaseIdentifierReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReleaseIdentifierReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getReleaseIdentifierReference() {
        if (releaseIdentifierReference == null) {
            releaseIdentifierReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.releaseIdentifierReference;
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
