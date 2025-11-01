
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *       &lt;attribute name="binaryCollaboration" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="binaryCollaborationIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
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
@XmlRootElement(name = "CollaborationActivity")
public class CollaborationActivity
    extends BusinessActivity
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "binaryCollaboration", required = true)
    protected String binaryCollaboration;
    @XmlAttribute(name = "binaryCollaborationIDREF")
    protected String binaryCollaborationIDREF;

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
     * Gets the value of the binaryCollaboration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryCollaboration() {
        return binaryCollaboration;
    }

    /**
     * Sets the value of the binaryCollaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryCollaboration(String value) {
        this.binaryCollaboration = value;
    }

    /**
     * Gets the value of the binaryCollaborationIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryCollaborationIDREF() {
        return binaryCollaborationIDREF;
    }

    /**
     * Sets the value of the binaryCollaborationIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryCollaborationIDREF(String value) {
        this.binaryCollaborationIDREF = value;
    }

}
