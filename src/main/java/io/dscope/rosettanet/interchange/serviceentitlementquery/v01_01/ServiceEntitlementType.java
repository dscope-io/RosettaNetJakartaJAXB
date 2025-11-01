
package io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01;

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
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * <p>Java class for ServiceEntitlementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceEntitlementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EventInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementQuery:xsd:schema:01.01}EventInformationType" minOccurs="0"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementQuery:xsd:schema:01.01}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element name="QueryConstraint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UnitInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementQuery:xsd:schema:01.01}UnitInformationType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ServiceEntitlementType", propOrder = {
    "eventInformation",
    "partInformation",
    "partnerDescription",
    "queryConstraint",
    "unitInformation"
})
public class ServiceEntitlementType {

    @XmlElement(name = "EventInformation")
    protected EventInformationType eventInformation;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElement(name = "QueryConstraint")
    protected String queryConstraint;
    @XmlElement(name = "UnitInformation", required = true)
    protected List<UnitInformationType> unitInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the eventInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EventInformationType }
     *     
     */
    public EventInformationType getEventInformation() {
        return eventInformation;
    }

    /**
     * Sets the value of the eventInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventInformationType }
     *     
     */
    public void setEventInformation(EventInformationType value) {
        this.eventInformation = value;
    }

    /**
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
    }

    /**
     * Gets the value of the queryConstraint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQueryConstraint() {
        return queryConstraint;
    }

    /**
     * Sets the value of the queryConstraint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQueryConstraint(String value) {
        this.queryConstraint = value;
    }

    /**
     * Gets the value of the unitInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the unitInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UnitInformationType }
     * 
     * 
     */
    public List<UnitInformationType> getUnitInformation() {
        if (unitInformation == null) {
            unitInformation = new ArrayList<UnitInformationType>();
        }
        return this.unitInformation;
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
