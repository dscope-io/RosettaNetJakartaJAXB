
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}SubstitutionSet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Namespaces" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BusinessDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BusinessTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BinaryCollaboration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}MultiPartyCollaboration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
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
    "include",
    "substitutionSet",
    "namespaces",
    "packageOrBusinessDocumentOrBusinessTransaction"
})
@XmlRootElement(name = "Package")
public class Package {

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "Include")
    protected List<Include> include;
    @XmlElement(name = "SubstitutionSet")
    protected SubstitutionSet substitutionSet;
    @XmlElement(name = "Namespaces")
    protected Namespaces namespaces;
    @XmlElements({
        @XmlElement(name = "Package", type = Package.class),
        @XmlElement(name = "BusinessDocument", type = BusinessDocument.class),
        @XmlElement(name = "BusinessTransaction", type = BusinessTransaction.class),
        @XmlElement(name = "BinaryCollaboration", type = BinaryCollaboration.class),
        @XmlElement(name = "MultiPartyCollaboration", type = MultiPartyCollaboration.class)
    })
    protected List<Object> packageOrBusinessDocumentOrBusinessTransaction;
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
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * 
     * 
     */
    public List<Include> getInclude() {
        if (include == null) {
            include = new ArrayList<Include>();
        }
        return this.include;
    }

    /**
     * Gets the value of the substitutionSet property.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionSet }
     *     
     */
    public SubstitutionSet getSubstitutionSet() {
        return substitutionSet;
    }

    /**
     * Sets the value of the substitutionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionSet }
     *     
     */
    public void setSubstitutionSet(SubstitutionSet value) {
        this.substitutionSet = value;
    }

    /**
     * Gets the value of the namespaces property.
     * 
     * @return
     *     possible object is
     *     {@link Namespaces }
     *     
     */
    public Namespaces getNamespaces() {
        return namespaces;
    }

    /**
     * Sets the value of the namespaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Namespaces }
     *     
     */
    public void setNamespaces(Namespaces value) {
        this.namespaces = value;
    }

    /**
     * Gets the value of the packageOrBusinessDocumentOrBusinessTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageOrBusinessDocumentOrBusinessTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageOrBusinessDocumentOrBusinessTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryCollaboration }
     * {@link BusinessDocument }
     * {@link BusinessTransaction }
     * {@link MultiPartyCollaboration }
     * {@link Package }
     * 
     * 
     */
    public List<Object> getPackageOrBusinessDocumentOrBusinessTransaction() {
        if (packageOrBusinessDocumentOrBusinessTransaction == null) {
            packageOrBusinessDocumentOrBusinessTransaction = new ArrayList<Object>();
        }
        return this.packageOrBusinessDocumentOrBusinessTransaction;
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
