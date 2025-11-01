
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://www.ebxml.org/BusinessProcess/1.01}RoleType" maxOccurs="2" minOccurs="2"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Start"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BusinessTransactionActivity"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}CollaborationActivity"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Success" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Failure" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Transition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Fork" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Join" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Decision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="beginsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="endsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timeToPerform" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="initiatingRoleIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="isInnerCollaboration" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "role",
    "start",
    "businessTransactionActivityOrCollaborationActivity",
    "success",
    "failure",
    "transition",
    "fork",
    "join",
    "decision"
})
@XmlRootElement(name = "BinaryCollaboration")
public class BinaryCollaboration {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "Role", required = true)
    protected List<RoleType> role;
    @XmlElement(name = "Start", required = true)
    protected Start start;
    @XmlElements({
        @XmlElement(name = "BusinessTransactionActivity", type = BusinessTransactionActivity.class),
        @XmlElement(name = "CollaborationActivity", type = CollaborationActivity.class)
    })
    protected List<BusinessActivity> businessTransactionActivityOrCollaborationActivity;
    @XmlElement(name = "Success", required = true)
    protected List<Success> success;
    @XmlElement(name = "Failure", required = true)
    protected List<Failure> failure;
    @XmlElement(name = "Transition")
    protected List<Transition> transition;
    @XmlElement(name = "Fork")
    protected List<Fork> fork;
    @XmlElement(name = "Join")
    protected List<Join> join;
    @XmlElement(name = "Decision")
    protected List<Decision> decision;
    @XmlAttribute(name = "pattern")
    @XmlSchemaType(name = "anyURI")
    protected String pattern;
    @XmlAttribute(name = "beginsWhen")
    protected String beginsWhen;
    @XmlAttribute(name = "endsWhen")
    protected String endsWhen;
    @XmlAttribute(name = "preCondition")
    protected String preCondition;
    @XmlAttribute(name = "postCondition")
    protected String postCondition;
    @XmlAttribute(name = "timeToPerform")
    protected Duration timeToPerform;
    @XmlAttribute(name = "initiatingRoleIDREF")
    protected String initiatingRoleIDREF;
    @XmlAttribute(name = "isInnerCollaboration")
    protected Boolean isInnerCollaboration;
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
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRole() {
        if (role == null) {
            role = new ArrayList<RoleType>();
        }
        return this.role;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Start }
     *     
     */
    public Start getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Start }
     *     
     */
    public void setStart(Start value) {
        this.start = value;
    }

    /**
     * Gets the value of the businessTransactionActivityOrCollaborationActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessTransactionActivityOrCollaborationActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessTransactionActivityOrCollaborationActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessTransactionActivity }
     * {@link CollaborationActivity }
     * 
     * 
     */
    public List<BusinessActivity> getBusinessTransactionActivityOrCollaborationActivity() {
        if (businessTransactionActivityOrCollaborationActivity == null) {
            businessTransactionActivityOrCollaborationActivity = new ArrayList<BusinessActivity>();
        }
        return this.businessTransactionActivityOrCollaborationActivity;
    }

    /**
     * Gets the value of the success property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the success property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Success }
     * 
     * 
     */
    public List<Success> getSuccess() {
        if (success == null) {
            success = new ArrayList<Success>();
        }
        return this.success;
    }

    /**
     * Gets the value of the failure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Failure }
     * 
     * 
     */
    public List<Failure> getFailure() {
        if (failure == null) {
            failure = new ArrayList<Failure>();
        }
        return this.failure;
    }

    /**
     * Gets the value of the transition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transition }
     * 
     * 
     */
    public List<Transition> getTransition() {
        if (transition == null) {
            transition = new ArrayList<Transition>();
        }
        return this.transition;
    }

    /**
     * Gets the value of the fork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fork }
     * 
     * 
     */
    public List<Fork> getFork() {
        if (fork == null) {
            fork = new ArrayList<Fork>();
        }
        return this.fork;
    }

    /**
     * Gets the value of the join property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the join property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Join }
     * 
     * 
     */
    public List<Join> getJoin() {
        if (join == null) {
            join = new ArrayList<Join>();
        }
        return this.join;
    }

    /**
     * Gets the value of the decision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decision }
     * 
     * 
     */
    public List<Decision> getDecision() {
        if (decision == null) {
            decision = new ArrayList<Decision>();
        }
        return this.decision;
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

    /**
     * Gets the value of the initiatingRoleIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingRoleIDREF() {
        return initiatingRoleIDREF;
    }

    /**
     * Sets the value of the initiatingRoleIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingRoleIDREF(String value) {
        this.initiatingRoleIDREF = value;
    }

    /**
     * Gets the value of the isInnerCollaboration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsInnerCollaboration() {
        if (isInnerCollaboration == null) {
            return false;
        } else {
            return isInnerCollaboration;
        }
    }

    /**
     * Sets the value of the isInnerCollaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInnerCollaboration(Boolean value) {
        this.isInnerCollaboration = value;
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
