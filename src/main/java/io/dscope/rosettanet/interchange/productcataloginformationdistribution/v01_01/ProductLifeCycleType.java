
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_01;

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
import io.dscope.rosettanet.domain.design.design.v02_22.LifeCycleStatus;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.SubstituteProductReference;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;


/**
 * <p>Java class for ProductLifeCycleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLifeCycleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.22}LifeCycleStatus" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="OrderAvailability" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}SubstituteProductReference" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductLifeCycleType", propOrder = {
    "businessDocumentReference",
    "lifeCycleStatus",
    "manufacturerProfile",
    "orderAvailability",
    "shipDate",
    "substituteProductReference"
})
public class ProductLifeCycleType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "LifeCycleStatus", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.22", type = LifeCycleStatus.class)
    protected List<LifeCycleStatus> lifeCycleStatus;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElement(name = "OrderAvailability")
    protected DatePeriodType orderAvailability;
    @XmlElement(name = "ShipDate")
    protected DatePeriodType shipDate;
    @XmlElementRef(name = "SubstituteProductReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = SubstituteProductReference.class, required = false)
    protected List<SubstituteProductReference> substituteProductReference;
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
     * Gets the value of the lifeCycleStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lifeCycleStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLifeCycleStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LifeCycleStatus }
     * 
     * 
     */
    public List<LifeCycleStatus> getLifeCycleStatus() {
        if (lifeCycleStatus == null) {
            lifeCycleStatus = new ArrayList<LifeCycleStatus>();
        }
        return this.lifeCycleStatus;
    }

    /**
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the orderAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getOrderAvailability() {
        return orderAvailability;
    }

    /**
     * Sets the value of the orderAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setOrderAvailability(DatePeriodType value) {
        this.orderAvailability = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setShipDate(DatePeriodType value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the substituteProductReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the substituteProductReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubstituteProductReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubstituteProductReference }
     * 
     * 
     */
    public List<SubstituteProductReference> getSubstituteProductReference() {
        if (substituteProductReference == null) {
            substituteProductReference = new ArrayList<SubstituteProductReference>();
        }
        return this.substituteProductReference;
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
