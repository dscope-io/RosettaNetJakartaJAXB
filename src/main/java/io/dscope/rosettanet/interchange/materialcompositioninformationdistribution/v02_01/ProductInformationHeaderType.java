
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v02_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.partneridentification.v01_14.FullPartner;


/**
 * <p>Java class for ProductInformationHeaderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationHeaderType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}FullPartner" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RequesterNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResponseByDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="SupplierNote" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "ProductInformationHeaderType", propOrder = {
    "fullPartner",
    "requesterNote",
    "responseByDate",
    "supplierNote"
})
public class ProductInformationHeaderType {

    @XmlElementRef(name = "FullPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = FullPartner.class)
    protected List<FullPartner> fullPartner;
    @XmlElement(name = "RequesterNote")
    protected String requesterNote;
    @XmlElement(name = "ResponseByDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar responseByDate;
    @XmlElement(name = "SupplierNote")
    protected String supplierNote;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fullPartner property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullPartner property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullPartner().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullPartner }
     * 
     * 
     */
    public List<FullPartner> getFullPartner() {
        if (fullPartner == null) {
            fullPartner = new ArrayList<FullPartner>();
        }
        return this.fullPartner;
    }

    /**
     * Gets the value of the requesterNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterNote() {
        return requesterNote;
    }

    /**
     * Sets the value of the requesterNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterNote(String value) {
        this.requesterNote = value;
    }

    /**
     * Gets the value of the responseByDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getResponseByDate() {
        return responseByDate;
    }

    /**
     * Sets the value of the responseByDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setResponseByDate(XMLGregorianCalendar value) {
        this.responseByDate = value;
    }

    /**
     * Gets the value of the supplierNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierNote() {
        return supplierNote;
    }

    /**
     * Sets the value of the supplierNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierNote(String value) {
        this.supplierNote = value;
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
