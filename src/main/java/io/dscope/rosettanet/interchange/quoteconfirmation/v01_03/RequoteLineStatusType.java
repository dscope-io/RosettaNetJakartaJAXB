
package io.dscope.rosettanet.interchange.quoteconfirmation.v01_03;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_02.RequoteAction;
import io.dscope.rosettanet.universal.document.v01_01.BusinessDocumentReferenceType;


/**
 * <p>Java class for RequoteLineStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequoteLineStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02}RequoteAction"/&gt;
 *         &lt;element name="RequoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.01}BusinessDocumentReferenceType" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequoteLineStatusType", propOrder = {
    "requoteAction",
    "requoteReference"
})
public class RequoteLineStatusType {

    @XmlElementRef(name = "RequoteAction", namespace = "urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.02", type = RequoteAction.class)
    protected RequoteAction requoteAction;
    @XmlElement(name = "RequoteReference", required = true)
    protected List<BusinessDocumentReferenceType> requoteReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the requoteAction property.
     * 
     * @return
     *     possible object is
     *     {@link RequoteAction }
     *     
     */
    public RequoteAction getRequoteAction() {
        return requoteAction;
    }

    /**
     * Sets the value of the requoteAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequoteAction }
     *     
     */
    public void setRequoteAction(RequoteAction value) {
        this.requoteAction = value;
    }

    /**
     * Gets the value of the requoteReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requoteReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequoteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getRequoteReference() {
        if (requoteReference == null) {
            requoteReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.requoteReference;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
