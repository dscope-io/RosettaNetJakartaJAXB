
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_02.SortWeight;


/**
 * <p>Java class for SortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinAssignment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="HardSort" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="HardSortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardSortSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassVisualInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RepairableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortCount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SortID" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="SortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.02}SortWeight" minOccurs="0"/&gt;
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
@XmlType(name = "SortType", propOrder = {
    "binAssignment",
    "hardSort",
    "hardSortName",
    "hardSortSymbol",
    "passVisualInspection",
    "repairableFlag",
    "sortCount",
    "sortID",
    "sortName",
    "sortSymbol",
    "sortWeight"
})
public class SortType {

    @XmlElement(name = "BinAssignment")
    protected BigInteger binAssignment;
    @XmlElement(name = "HardSort")
    protected BigInteger hardSort;
    @XmlElement(name = "HardSortName")
    protected String hardSortName;
    @XmlElement(name = "HardSortSymbol")
    protected String hardSortSymbol;
    @XmlElement(name = "PassVisualInspection", type = Boolean.class)
    protected List<Boolean> passVisualInspection;
    @XmlElement(name = "RepairableFlag")
    protected Boolean repairableFlag;
    @XmlElement(name = "SortCount")
    protected List<String> sortCount;
    @XmlElement(name = "SortID", required = true)
    protected BigInteger sortID;
    @XmlElement(name = "SortName")
    protected String sortName;
    @XmlElement(name = "SortSymbol")
    protected String sortSymbol;
    @XmlElementRef(name = "SortWeight", namespace = "urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.02", type = SortWeight.class, required = false)
    protected SortWeight sortWeight;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the binAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBinAssignment() {
        return binAssignment;
    }

    /**
     * Sets the value of the binAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBinAssignment(BigInteger value) {
        this.binAssignment = value;
    }

    /**
     * Gets the value of the hardSort property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHardSort() {
        return hardSort;
    }

    /**
     * Sets the value of the hardSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHardSort(BigInteger value) {
        this.hardSort = value;
    }

    /**
     * Gets the value of the hardSortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardSortName() {
        return hardSortName;
    }

    /**
     * Sets the value of the hardSortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardSortName(String value) {
        this.hardSortName = value;
    }

    /**
     * Gets the value of the hardSortSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardSortSymbol() {
        return hardSortSymbol;
    }

    /**
     * Sets the value of the hardSortSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardSortSymbol(String value) {
        this.hardSortSymbol = value;
    }

    /**
     * Gets the value of the passVisualInspection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passVisualInspection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassVisualInspection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getPassVisualInspection() {
        if (passVisualInspection == null) {
            passVisualInspection = new ArrayList<Boolean>();
        }
        return this.passVisualInspection;
    }

    /**
     * Gets the value of the repairableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepairableFlag() {
        return repairableFlag;
    }

    /**
     * Sets the value of the repairableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepairableFlag(Boolean value) {
        this.repairableFlag = value;
    }

    /**
     * Gets the value of the sortCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getSortCount() {
        if (sortCount == null) {
            sortCount = new ArrayList<String>();
        }
        return this.sortCount;
    }

    /**
     * Gets the value of the sortID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSortID() {
        return sortID;
    }

    /**
     * Sets the value of the sortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSortID(BigInteger value) {
        this.sortID = value;
    }

    /**
     * Gets the value of the sortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * Sets the value of the sortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortName(String value) {
        this.sortName = value;
    }

    /**
     * Gets the value of the sortSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortSymbol() {
        return sortSymbol;
    }

    /**
     * Sets the value of the sortSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortSymbol(String value) {
        this.sortSymbol = value;
    }

    /**
     * Gets the value of the sortWeight property.
     * 
     * @return
     *     possible object is
     *     {@link SortWeight }
     *     
     */
    public SortWeight getSortWeight() {
        return sortWeight;
    }

    /**
     * Sets the value of the sortWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortWeight }
     *     
     */
    public void setSortWeight(SortWeight value) {
        this.sortWeight = value;
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
