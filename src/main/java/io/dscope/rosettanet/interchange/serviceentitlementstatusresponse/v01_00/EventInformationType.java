
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02.ServiceDeliveryMethodType;
import io.dscope.rosettanet.domain.service.codelist.warrantymethod.v01_02.WarrantyMethod;
import io.dscope.rosettanet.domain.service.codelist.warrantyprogram.v01_02.WarrantyProgram;
import io.dscope.rosettanet.domain.service.service.v02_20.ReimbursementInformation;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;


/**
 * <p>Java class for EventInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsRequestedDeliveryMethodAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="RecommendedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ReimbursementInformation" minOccurs="0"/&gt;
 *         &lt;element name="RequestedDeliveryMethod" type="{urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02}ServiceDeliveryMethodType" minOccurs="0"/&gt;
 *         &lt;element name="TotalReimbursement" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:WarrantyMethod:xsd:codelist:01.02}WarrantyMethod" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02}WarrantyProgram" minOccurs="0"/&gt;
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
@XmlType(name = "EventInformationType", propOrder = {
    "isRequestedDeliveryMethodAllowed",
    "recommendedDeliveryMethod",
    "reimbursementInformation",
    "requestedDeliveryMethod",
    "totalReimbursement",
    "warrantyMethod",
    "warrantyProgram"
})
public class EventInformationType {

    @XmlElement(name = "IsRequestedDeliveryMethodAllowed")
    protected Boolean isRequestedDeliveryMethodAllowed;
    @XmlElement(name = "RecommendedDeliveryMethod")
    protected ServiceDeliveryMethodType recommendedDeliveryMethod;
    @XmlElementRef(name = "ReimbursementInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ReimbursementInformation.class, required = false)
    protected ReimbursementInformation reimbursementInformation;
    @XmlElement(name = "RequestedDeliveryMethod")
    protected ServiceDeliveryMethodType requestedDeliveryMethod;
    @XmlElement(name = "TotalReimbursement")
    protected FinancialAmountType totalReimbursement;
    @XmlElementRef(name = "WarrantyMethod", namespace = "urn:rosettanet:specification:domain:Service:WarrantyMethod:xsd:codelist:01.02", type = WarrantyMethod.class, required = false)
    protected WarrantyMethod warrantyMethod;
    @XmlElementRef(name = "WarrantyProgram", namespace = "urn:rosettanet:specification:domain:Service:WarrantyProgram:xsd:codelist:01.02", type = WarrantyProgram.class, required = false)
    protected WarrantyProgram warrantyProgram;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isRequestedDeliveryMethodAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsRequestedDeliveryMethodAllowed() {
        return isRequestedDeliveryMethodAllowed;
    }

    /**
     * Sets the value of the isRequestedDeliveryMethodAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsRequestedDeliveryMethodAllowed(Boolean value) {
        this.isRequestedDeliveryMethodAllowed = value;
    }

    /**
     * Gets the value of the recommendedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRecommendedDeliveryMethod() {
        return recommendedDeliveryMethod;
    }

    /**
     * Sets the value of the recommendedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRecommendedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.recommendedDeliveryMethod = value;
    }

    /**
     * Gets the value of the reimbursementInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ReimbursementInformation }
     *     
     */
    public ReimbursementInformation getReimbursementInformation() {
        return reimbursementInformation;
    }

    /**
     * Sets the value of the reimbursementInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReimbursementInformation }
     *     
     */
    public void setReimbursementInformation(ReimbursementInformation value) {
        this.reimbursementInformation = value;
    }

    /**
     * Gets the value of the requestedDeliveryMethod property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public ServiceDeliveryMethodType getRequestedDeliveryMethod() {
        return requestedDeliveryMethod;
    }

    /**
     * Sets the value of the requestedDeliveryMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDeliveryMethodType }
     *     
     */
    public void setRequestedDeliveryMethod(ServiceDeliveryMethodType value) {
        this.requestedDeliveryMethod = value;
    }

    /**
     * Gets the value of the totalReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalReimbursement() {
        return totalReimbursement;
    }

    /**
     * Sets the value of the totalReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalReimbursement(FinancialAmountType value) {
        this.totalReimbursement = value;
    }

    /**
     * Gets the value of the warrantyMethod property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyMethod }
     *     
     */
    public WarrantyMethod getWarrantyMethod() {
        return warrantyMethod;
    }

    /**
     * Sets the value of the warrantyMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyMethod }
     *     
     */
    public void setWarrantyMethod(WarrantyMethod value) {
        this.warrantyMethod = value;
    }

    /**
     * Gets the value of the warrantyProgram property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyProgram }
     *     
     */
    public WarrantyProgram getWarrantyProgram() {
        return warrantyProgram;
    }

    /**
     * Sets the value of the warrantyProgram property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyProgram }
     *     
     */
    public void setWarrantyProgram(WarrantyProgram value) {
        this.warrantyProgram = value;
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
