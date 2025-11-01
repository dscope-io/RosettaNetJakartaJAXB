
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;


/**
 * <p>Java class for ServiceDeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceDeliveryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ApprovedMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType"/&gt;
 *         &lt;element name="IsRequestedMethodAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="RequestedMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType"/&gt;
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
@XmlType(name = "ServiceDeliveryType", propOrder = {
    "approvedMethod",
    "isRequestedMethodAllowed",
    "requestedMethod"
})
public class ServiceDeliveryType {

    @XmlElement(name = "ApprovedMethod", required = true)
    protected ServiceDeliveryMethodType approvedMethod;
    @XmlElement(name = "IsRequestedMethodAllowed")
    protected boolean isRequestedMethodAllowed;
    @XmlElement(name = "RequestedMethod", required = true)
    protected ServiceDeliveryMethodType requestedMethod;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the approvedMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getApprovedMethod() {
        return approvedMethod;
    }

    /**
     * Sets the value of the approvedMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setApprovedMethod(ServiceDeliveryMethodType value) {
        this.approvedMethod = value;
    }

    /**
     * Gets the value of the isRequestedMethodAllowed property.
     * 
     */
    public boolean isIsRequestedMethodAllowed() {
        return isRequestedMethodAllowed;
    }

    /**
     * Sets the value of the isRequestedMethodAllowed property.
     * 
     */
    public void setIsRequestedMethodAllowed(boolean value) {
        this.isRequestedMethodAllowed = value;
    }

    /**
     * Gets the value of the requestedMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedMethod() {
        return requestedMethod;
    }

    /**
     * Sets the value of the requestedMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedMethod(ServiceDeliveryMethodType value) {
        this.requestedMethod = value;
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
