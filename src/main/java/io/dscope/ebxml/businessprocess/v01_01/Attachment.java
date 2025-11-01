
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
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}documentSecurity"/&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="businessDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="businessDocumentIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="specification" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="mimeType" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
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
@XmlRootElement(name = "Attachment")
public class Attachment {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "businessDocument", required = true)
    protected String businessDocument;
    @XmlAttribute(name = "businessDocumentIDREF")
    protected String businessDocumentIDREF;
    @XmlAttribute(name = "specification")
    @XmlSchemaType(name = "anyURI")
    protected String specification;
    @XmlAttribute(name = "mimeType")
    protected String mimeType;
    @XmlAttribute(name = "isAuthenticated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isAuthenticated;
    @XmlAttribute(name = "isConfidential")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isConfidential;
    @XmlAttribute(name = "isTamperDetectable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isTamperDetectable;
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
     * Gets the value of the businessDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDocument() {
        return businessDocument;
    }

    /**
     * Sets the value of the businessDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDocument(String value) {
        this.businessDocument = value;
    }

    /**
     * Gets the value of the businessDocumentIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDocumentIDREF() {
        return businessDocumentIDREF;
    }

    /**
     * Sets the value of the businessDocumentIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDocumentIDREF(String value) {
        this.businessDocumentIDREF = value;
    }

    /**
     * Gets the value of the specification property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * Sets the value of the specification property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecification(String value) {
        this.specification = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMimeType(String value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the isAuthenticated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAuthenticated() {
        return isAuthenticated;
    }

    /**
     * Sets the value of the isAuthenticated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAuthenticated(String value) {
        this.isAuthenticated = value;
    }

    /**
     * Gets the value of the isConfidential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConfidential() {
        return isConfidential;
    }

    /**
     * Sets the value of the isConfidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConfidential(String value) {
        this.isConfidential = value;
    }

    /**
     * Gets the value of the isTamperDetectable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTamperDetectable() {
        return isTamperDetectable;
    }

    /**
     * Sets the value of the isTamperDetectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTamperDetectable(String value) {
        this.isTamperDetectable = value;
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
