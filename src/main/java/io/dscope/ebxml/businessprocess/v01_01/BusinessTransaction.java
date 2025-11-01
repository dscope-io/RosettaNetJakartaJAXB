
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}RequestingBusinessActivity"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}RespondingBusinessActivity"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="isGuaranteedDeliveryRequired" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentation",
    "requestingBusinessActivity",
    "respondingBusinessActivity"
})
@XmlRootElement(name = "BusinessTransaction")
public class BusinessTransaction {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "RequestingBusinessActivity", required = true)
    protected RequestingBusinessActivity requestingBusinessActivity;
    @XmlElement(name = "RespondingBusinessActivity", required = true)
    protected RespondingBusinessActivity respondingBusinessActivity;
    @XmlAttribute(name = "pattern")
    @XmlSchemaType(name = "anyURI")
    protected String pattern;
    @XmlAttribute(name = "isGuaranteedDeliveryRequired")
    protected Boolean isGuaranteedDeliveryRequired;
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
     * Gets the value of the requestingBusinessActivity property.
     * 
     * @return
     *     possible object is
     *     {@link RequestingBusinessActivity }
     *     
     */
    public RequestingBusinessActivity getRequestingBusinessActivity() {
        return requestingBusinessActivity;
    }

    /**
     * Sets the value of the requestingBusinessActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestingBusinessActivity }
     *     
     */
    public void setRequestingBusinessActivity(RequestingBusinessActivity value) {
        this.requestingBusinessActivity = value;
    }

    /**
     * Gets the value of the respondingBusinessActivity property.
     * 
     * @return
     *     possible object is
     *     {@link RespondingBusinessActivity }
     *     
     */
    public RespondingBusinessActivity getRespondingBusinessActivity() {
        return respondingBusinessActivity;
    }

    /**
     * Sets the value of the respondingBusinessActivity property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespondingBusinessActivity }
     *     
     */
    public void setRespondingBusinessActivity(RespondingBusinessActivity value) {
        this.respondingBusinessActivity = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the isGuaranteedDeliveryRequired property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsGuaranteedDeliveryRequired() {
        if (isGuaranteedDeliveryRequired == null) {
            return false;
        } else {
            return isGuaranteedDeliveryRequired;
        }
    }

    /**
     * Sets the value of the isGuaranteedDeliveryRequired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsGuaranteedDeliveryRequired(Boolean value) {
        this.isGuaranteedDeliveryRequired = value;
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
