
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}ConditionExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="fromBusinessState" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="fromBusinessStateIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="conditionGuard"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN"&gt;
 *             &lt;enumeration value="ProtocolSuccess"/&gt;
 *             &lt;enumeration value="AnyProtocolFailure"/&gt;
 *             &lt;enumeration value="RequestReceiptFailure"/&gt;
 *             &lt;enumeration value="RequestAcceptanceFailure"/&gt;
 *             &lt;enumeration value="ResponseReceiptFailure"/&gt;
 *             &lt;enumeration value="ResponseAcceptanceFailure"/&gt;
 *             &lt;enumeration value="SignalTimeout"/&gt;
 *             &lt;enumeration value="ResponseTimeout"/&gt;
 *             &lt;enumeration value="BusinessSuccess"/&gt;
 *             &lt;enumeration value="BusinessFailure"/&gt;
 *             &lt;enumeration value="Success"/&gt;
 *             &lt;enumeration value="Failure"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
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
    "conditionExpression"
})
@XmlRootElement(name = "Success")
public class Success {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "ConditionExpression")
    protected ConditionExpression conditionExpression;
    @XmlAttribute(name = "fromBusinessState", required = true)
    protected String fromBusinessState;
    @XmlAttribute(name = "fromBusinessStateIDREF")
    protected String fromBusinessStateIDREF;
    @XmlAttribute(name = "conditionGuard")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String conditionGuard;
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
     * Gets the value of the conditionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionExpression }
     *     
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Sets the value of the conditionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionExpression }
     *     
     */
    public void setConditionExpression(ConditionExpression value) {
        this.conditionExpression = value;
    }

    /**
     * Gets the value of the fromBusinessState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBusinessState() {
        return fromBusinessState;
    }

    /**
     * Sets the value of the fromBusinessState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBusinessState(String value) {
        this.fromBusinessState = value;
    }

    /**
     * Gets the value of the fromBusinessStateIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromBusinessStateIDREF() {
        return fromBusinessStateIDREF;
    }

    /**
     * Sets the value of the fromBusinessStateIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromBusinessStateIDREF(String value) {
        this.fromBusinessStateIDREF = value;
    }

    /**
     * Gets the value of the conditionGuard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionGuard() {
        return conditionGuard;
    }

    /**
     * Sets the value of the conditionGuard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionGuard(String value) {
        this.conditionGuard = value;
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
