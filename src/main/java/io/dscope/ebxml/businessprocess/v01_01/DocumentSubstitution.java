
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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="originalBusinessDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="originalBusinessDocumentID" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="substituteBusinessDocumentLocation" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="substituteBusinessDocumentId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
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
@XmlRootElement(name = "DocumentSubstitution")
public class DocumentSubstitution {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "originalBusinessDocument", required = true)
    protected String originalBusinessDocument;
    @XmlAttribute(name = "originalBusinessDocumentID")
    protected String originalBusinessDocumentID;
    @XmlAttribute(name = "substituteBusinessDocumentLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String substituteBusinessDocumentLocation;
    @XmlAttribute(name = "substituteBusinessDocumentId")
    @XmlSchemaType(name = "anyURI")
    protected String substituteBusinessDocumentId;

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
     * Gets the value of the originalBusinessDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBusinessDocument() {
        return originalBusinessDocument;
    }

    /**
     * Sets the value of the originalBusinessDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBusinessDocument(String value) {
        this.originalBusinessDocument = value;
    }

    /**
     * Gets the value of the originalBusinessDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBusinessDocumentID() {
        return originalBusinessDocumentID;
    }

    /**
     * Sets the value of the originalBusinessDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBusinessDocumentID(String value) {
        this.originalBusinessDocumentID = value;
    }

    /**
     * Gets the value of the substituteBusinessDocumentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteBusinessDocumentLocation() {
        return substituteBusinessDocumentLocation;
    }

    /**
     * Sets the value of the substituteBusinessDocumentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteBusinessDocumentLocation(String value) {
        this.substituteBusinessDocumentLocation = value;
    }

    /**
     * Gets the value of the substituteBusinessDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteBusinessDocumentId() {
        return substituteBusinessDocumentId;
    }

    /**
     * Sets the value of the substituteBusinessDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteBusinessDocumentId(String value) {
        this.substituteBusinessDocumentId = value;
    }

}
