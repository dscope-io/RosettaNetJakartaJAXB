
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_02;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RequirementType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequirementType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BuyerProjectedExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="MaterialSpecification" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.02}MaterialSpecificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="MaterialType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OverallShelfLife" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RemainingShelfLife" type="{http://www.w3.org/2001/XMLSchema}duration" minOccurs="0"/&gt;
 *         &lt;element name="RevisionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SellerProjectedExpiryDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
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
@XmlType(name = "RequirementType", propOrder = {
    "buyerProjectedExpiryDate",
    "materialSpecification",
    "materialType",
    "overallShelfLife",
    "partNumber",
    "remainingShelfLife",
    "revisionNumber",
    "sellerProjectedExpiryDate"
})
public class RequirementType {

    @XmlElement(name = "BuyerProjectedExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar buyerProjectedExpiryDate;
    @XmlElement(name = "MaterialSpecification")
    protected List<MaterialSpecificationType> materialSpecification;
    @XmlElement(name = "MaterialType")
    protected String materialType;
    @XmlElement(name = "OverallShelfLife")
    protected Duration overallShelfLife;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "RemainingShelfLife")
    protected Duration remainingShelfLife;
    @XmlElement(name = "RevisionNumber")
    protected String revisionNumber;
    @XmlElement(name = "SellerProjectedExpiryDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar sellerProjectedExpiryDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the buyerProjectedExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBuyerProjectedExpiryDate() {
        return buyerProjectedExpiryDate;
    }

    /**
     * Sets the value of the buyerProjectedExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBuyerProjectedExpiryDate(XMLGregorianCalendar value) {
        this.buyerProjectedExpiryDate = value;
    }

    /**
     * Gets the value of the materialSpecification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the materialSpecification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaterialSpecification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaterialSpecificationType }
     * 
     * 
     */
    public List<MaterialSpecificationType> getMaterialSpecification() {
        if (materialSpecification == null) {
            materialSpecification = new ArrayList<MaterialSpecificationType>();
        }
        return this.materialSpecification;
    }

    /**
     * Gets the value of the materialType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialType() {
        return materialType;
    }

    /**
     * Sets the value of the materialType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialType(String value) {
        this.materialType = value;
    }

    /**
     * Gets the value of the overallShelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getOverallShelfLife() {
        return overallShelfLife;
    }

    /**
     * Sets the value of the overallShelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setOverallShelfLife(Duration value) {
        this.overallShelfLife = value;
    }

    /**
     * Gets the value of the partNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartNumber() {
        return partNumber;
    }

    /**
     * Sets the value of the partNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartNumber(String value) {
        this.partNumber = value;
    }

    /**
     * Gets the value of the remainingShelfLife property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getRemainingShelfLife() {
        return remainingShelfLife;
    }

    /**
     * Sets the value of the remainingShelfLife property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setRemainingShelfLife(Duration value) {
        this.remainingShelfLife = value;
    }

    /**
     * Gets the value of the revisionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevisionNumber() {
        return revisionNumber;
    }

    /**
     * Sets the value of the revisionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevisionNumber(String value) {
        this.revisionNumber = value;
    }

    /**
     * Gets the value of the sellerProjectedExpiryDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSellerProjectedExpiryDate() {
        return sellerProjectedExpiryDate;
    }

    /**
     * Sets the value of the sellerProjectedExpiryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSellerProjectedExpiryDate(XMLGregorianCalendar value) {
        this.sellerProjectedExpiryDate = value;
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
