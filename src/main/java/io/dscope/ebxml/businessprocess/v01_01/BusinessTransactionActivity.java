
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ebxml.org/BusinessProcess/1.01}BusinessActivity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="businessTransaction" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="businessTransactionIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="isConcurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="isLegallyBinding" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="timeToPerform" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentation"
})
@XmlRootElement(name = "BusinessTransactionActivity")
public class BusinessTransactionActivity
    extends BusinessActivity
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "businessTransaction", required = true)
    protected String businessTransaction;
    @XmlAttribute(name = "businessTransactionIDREF")
    protected String businessTransactionIDREF;
    @XmlAttribute(name = "isConcurrent")
    protected Boolean isConcurrent;
    @XmlAttribute(name = "isLegallyBinding")
    protected Boolean isLegallyBinding;
    @XmlAttribute(name = "timeToPerform")
    protected Duration timeToPerform;

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
     * Gets the value of the businessTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransaction() {
        return businessTransaction;
    }

    /**
     * Sets the value of the businessTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransaction(String value) {
        this.businessTransaction = value;
    }

    /**
     * Gets the value of the businessTransactionIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionIDREF() {
        return businessTransactionIDREF;
    }

    /**
     * Sets the value of the businessTransactionIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionIDREF(String value) {
        this.businessTransactionIDREF = value;
    }

    /**
     * Gets the value of the isConcurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsConcurrent() {
        if (isConcurrent == null) {
            return true;
        } else {
            return isConcurrent;
        }
    }

    /**
     * Sets the value of the isConcurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConcurrent(Boolean value) {
        this.isConcurrent = value;
    }

    /**
     * Gets the value of the isLegallyBinding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsLegallyBinding() {
        if (isLegallyBinding == null) {
            return true;
        } else {
            return isLegallyBinding;
        }
    }

    /**
     * Sets the value of the isLegallyBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLegallyBinding(Boolean value) {
        this.isLegallyBinding = value;
    }

    /**
     * Gets the value of the timeToPerform property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToPerform() {
        return timeToPerform;
    }

    /**
     * Sets the value of the timeToPerform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToPerform(Duration value) {
        this.timeToPerform = value;
    }

}
