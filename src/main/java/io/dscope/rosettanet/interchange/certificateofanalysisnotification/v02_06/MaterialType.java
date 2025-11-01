
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.universal.partneridentification.v01_16.FullPartnerType;


/**
 * <p>Java class for MaterialType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AnalysisDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Characteristic" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}CharacteristicType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ContainerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturedBy" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}FullPartnerType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ManufacturedDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="Packaging" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}PackagingType" minOccurs="0"/&gt;
 *         &lt;element name="PartNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Requirement" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}RequirementType"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialType", propOrder = {
    "analysisDate",
    "characteristic",
    "containerIdentifier",
    "description",
    "grade",
    "manufacturedBy",
    "manufacturedDate",
    "packaging",
    "partNumber",
    "requirement",
    "serialIdentifier"
})
public class MaterialType {

    @XmlElement(name = "AnalysisDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar analysisDate;
    @XmlElement(name = "Characteristic", required = true)
    protected List<CharacteristicType> characteristic;
    @XmlElement(name = "ContainerIdentifier")
    protected List<String> containerIdentifier;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Grade")
    protected String grade;
    @XmlElement(name = "ManufacturedBy", required = true)
    protected List<FullPartnerType> manufacturedBy;
    @XmlElement(name = "ManufacturedDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar manufacturedDate;
    @XmlElement(name = "Packaging")
    protected PackagingType packaging;
    @XmlElement(name = "PartNumber")
    protected String partNumber;
    @XmlElement(name = "Requirement", required = true)
    protected RequirementType requirement;
    @XmlElement(name = "SerialIdentifier")
    protected List<String> serialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the analysisDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAnalysisDate() {
        return analysisDate;
    }

    /**
     * Sets the value of the analysisDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAnalysisDate(XMLGregorianCalendar value) {
        this.analysisDate = value;
    }

    /**
     * Gets the value of the characteristic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the characteristic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCharacteristic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CharacteristicType }
     * 
     * 
     */
    public List<CharacteristicType> getCharacteristic() {
        if (characteristic == null) {
            characteristic = new ArrayList<CharacteristicType>();
        }
        return this.characteristic;
    }

    /**
     * Gets the value of the containerIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containerIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainerIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getContainerIdentifier() {
        if (containerIdentifier == null) {
            containerIdentifier = new ArrayList<String>();
        }
        return this.containerIdentifier;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the grade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrade() {
        return grade;
    }

    /**
     * Sets the value of the grade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrade(String value) {
        this.grade = value;
    }

    /**
     * Gets the value of the manufacturedBy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturedBy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturedBy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullPartnerType }
     * 
     * 
     */
    public List<FullPartnerType> getManufacturedBy() {
        if (manufacturedBy == null) {
            manufacturedBy = new ArrayList<FullPartnerType>();
        }
        return this.manufacturedBy;
    }

    /**
     * Gets the value of the manufacturedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getManufacturedDate() {
        return manufacturedDate;
    }

    /**
     * Sets the value of the manufacturedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setManufacturedDate(XMLGregorianCalendar value) {
        this.manufacturedDate = value;
    }

    /**
     * Gets the value of the packaging property.
     * 
     * @return
     *     possible object is
     *     {@link PackagingType }
     *     
     */
    public PackagingType getPackaging() {
        return packaging;
    }

    /**
     * Sets the value of the packaging property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackagingType }
     *     
     */
    public void setPackaging(PackagingType value) {
        this.packaging = value;
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
     * Gets the value of the requirement property.
     * 
     * @return
     *     possible object is
     *     {@link RequirementType }
     *     
     */
    public RequirementType getRequirement() {
        return requirement;
    }

    /**
     * Sets the value of the requirement property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequirementType }
     *     
     */
    public void setRequirement(RequirementType value) {
        this.requirement = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serialIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSerialIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSerialIdentifier() {
        if (serialIdentifier == null) {
            serialIdentifier = new ArrayList<String>();
        }
        return this.serialIdentifier;
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
