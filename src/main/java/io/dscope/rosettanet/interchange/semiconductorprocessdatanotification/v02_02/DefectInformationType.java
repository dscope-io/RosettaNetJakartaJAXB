
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_02;

import java.math.BigInteger;
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


/**
 * <p>Java class for DefectInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DefectInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DefectCount" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="DefectDescription" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DefectID" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *         &lt;element name="DefectType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "DefectInformationType", propOrder = {
    "defectCount",
    "defectDescription",
    "defectID",
    "defectType"
})
public class DefectInformationType {

    @XmlElement(name = "DefectCount", required = true)
    protected BigInteger defectCount;
    @XmlElement(name = "DefectDescription")
    protected List<String> defectDescription;
    @XmlElement(name = "DefectID", required = true)
    protected List<String> defectID;
    @XmlElement(name = "DefectType")
    protected String defectType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the defectCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDefectCount() {
        return defectCount;
    }

    /**
     * Sets the value of the defectCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDefectCount(BigInteger value) {
        this.defectCount = value;
    }

    /**
     * Gets the value of the defectDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defectDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefectDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDefectDescription() {
        if (defectDescription == null) {
            defectDescription = new ArrayList<String>();
        }
        return this.defectDescription;
    }

    /**
     * Gets the value of the defectID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the defectID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDefectID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDefectID() {
        if (defectID == null) {
            defectID = new ArrayList<String>();
        }
        return this.defectID;
    }

    /**
     * Gets the value of the defectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefectType() {
        return defectType;
    }

    /**
     * Sets the value of the defectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefectType(String value) {
        this.defectType = value;
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
