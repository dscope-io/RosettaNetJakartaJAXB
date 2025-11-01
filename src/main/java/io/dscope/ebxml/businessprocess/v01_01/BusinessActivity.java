
package io.dscope.ebxml.businessprocess.v01_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BusinessActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="fromRole" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fromRoleIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="toRole" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="toRoleIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="beginsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="endsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessActivity")
@XmlSeeAlso({
    CollaborationActivity.class,
    BusinessTransactionActivity.class
})
public class BusinessActivity {

    @XmlAttribute(name = "fromRole", required = true)
    protected String fromRole;
    @XmlAttribute(name = "fromRoleIDREF")
    protected String fromRoleIDREF;
    @XmlAttribute(name = "toRole", required = true)
    protected String toRole;
    @XmlAttribute(name = "toRoleIDREF")
    protected String toRoleIDREF;
    @XmlAttribute(name = "beginsWhen")
    protected String beginsWhen;
    @XmlAttribute(name = "endsWhen")
    protected String endsWhen;
    @XmlAttribute(name = "preCondition")
    protected String preCondition;
    @XmlAttribute(name = "postCondition")
    protected String postCondition;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameID", required = true)
    protected String nameID;

    /**
     * Gets the value of the fromRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRole() {
        return fromRole;
    }

    /**
     * Sets the value of the fromRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRole(String value) {
        this.fromRole = value;
    }

    /**
     * Gets the value of the fromRoleIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromRoleIDREF() {
        return fromRoleIDREF;
    }

    /**
     * Sets the value of the fromRoleIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromRoleIDREF(String value) {
        this.fromRoleIDREF = value;
    }

    /**
     * Gets the value of the toRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRole() {
        return toRole;
    }

    /**
     * Sets the value of the toRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRole(String value) {
        this.toRole = value;
    }

    /**
     * Gets the value of the toRoleIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToRoleIDREF() {
        return toRoleIDREF;
    }

    /**
     * Sets the value of the toRoleIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToRoleIDREF(String value) {
        this.toRoleIDREF = value;
    }

    /**
     * Gets the value of the beginsWhen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginsWhen() {
        return beginsWhen;
    }

    /**
     * Sets the value of the beginsWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginsWhen(String value) {
        this.beginsWhen = value;
    }

    /**
     * Gets the value of the endsWhen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsWhen() {
        return endsWhen;
    }

    /**
     * Sets the value of the endsWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsWhen(String value) {
        this.endsWhen = value;
    }

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition(String value) {
        this.preCondition = value;
    }

    /**
     * Gets the value of the postCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCondition() {
        return postCondition;
    }

    /**
     * Sets the value of the postCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCondition(String value) {
        this.postCondition = value;
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
