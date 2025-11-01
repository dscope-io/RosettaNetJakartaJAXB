
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for BusinessAction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessAction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="isAuthorizationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isIntelligibleCheckRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isNonRepudiationRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="isNonRepudiationReceiptRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *       &lt;attribute name="timeToAcknowledgeReceipt" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="timeToAcknowledgeAcceptance" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessAction", propOrder = {
    "documentation"
})
@XmlSeeAlso({
    RespondingBusinessActivity.class,
    RequestingBusinessActivity.class
})
public class BusinessAction {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "isAuthorizationRequired")
    protected Boolean isAuthorizationRequired;
    @XmlAttribute(name = "isIntelligibleCheckRequired")
    protected Boolean isIntelligibleCheckRequired;
    @XmlAttribute(name = "isNonRepudiationRequired")
    protected Boolean isNonRepudiationRequired;
    @XmlAttribute(name = "isNonRepudiationReceiptRequired")
    protected Boolean isNonRepudiationReceiptRequired;
    @XmlAttribute(name = "timeToAcknowledgeReceipt")
    protected Duration timeToAcknowledgeReceipt;
    @XmlAttribute(name = "timeToAcknowledgeAcceptance")
    protected Duration timeToAcknowledgeAcceptance;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameID", required = true)
    protected String nameID;

    /**
     * Gets the value of the documentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Documentation }
     * 
     * 
     */
    public List<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<Documentation>();
        }
        return this.documentation;
    }

    /**
     * Gets the value of the isAuthorizationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAuthorizationRequired() {
        if (isAuthorizationRequired == null) {
            return false;
        } else {
            return isAuthorizationRequired;
        }
    }

    /**
     * Sets the value of the isAuthorizationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAuthorizationRequired(Boolean value) {
        this.isAuthorizationRequired = value;
    }

    /**
     * Gets the value of the isIntelligibleCheckRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsIntelligibleCheckRequired() {
        if (isIntelligibleCheckRequired == null) {
            return false;
        } else {
            return isIntelligibleCheckRequired;
        }
    }

    /**
     * Sets the value of the isIntelligibleCheckRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsIntelligibleCheckRequired(Boolean value) {
        this.isIntelligibleCheckRequired = value;
    }

    /**
     * Gets the value of the isNonRepudiationRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNonRepudiationRequired() {
        if (isNonRepudiationRequired == null) {
            return false;
        } else {
            return isNonRepudiationRequired;
        }
    }

    /**
     * Sets the value of the isNonRepudiationRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonRepudiationRequired(Boolean value) {
        this.isNonRepudiationRequired = value;
    }

    /**
     * Gets the value of the isNonRepudiationReceiptRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsNonRepudiationReceiptRequired() {
        if (isNonRepudiationReceiptRequired == null) {
            return false;
        } else {
            return isNonRepudiationReceiptRequired;
        }
    }

    /**
     * Sets the value of the isNonRepudiationReceiptRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsNonRepudiationReceiptRequired(Boolean value) {
        this.isNonRepudiationReceiptRequired = value;
    }

    /**
     * Gets the value of the timeToAcknowledgeReceipt property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToAcknowledgeReceipt() {
        return timeToAcknowledgeReceipt;
    }

    /**
     * Sets the value of the timeToAcknowledgeReceipt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToAcknowledgeReceipt(Duration value) {
        this.timeToAcknowledgeReceipt = value;
    }

    /**
     * Gets the value of the timeToAcknowledgeAcceptance property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToAcknowledgeAcceptance() {
        return timeToAcknowledgeAcceptance;
    }

    /**
     * Sets the value of the timeToAcknowledgeAcceptance property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToAcknowledgeAcceptance(Duration value) {
        this.timeToAcknowledgeAcceptance = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameID() {
        return nameID;
    }

    /**
     * Sets the value of the nameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameID(String value) {
        this.nameID = value;
    }

}
