
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_26;

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
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentificationType;


/**
 * <p>Java class for LotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AlternativePN" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ContractorLotNumber" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}LotIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CustomerLotNumber" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}LotIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="CustomerPN" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentificationType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType" minOccurs="0"/&gt;
 *         &lt;element name="NominalSize" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="ProductName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SubLot" type="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.26}LotIdentifierType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Technology" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LotType", propOrder = {
    "alternativePN",
    "contractorLotNumber",
    "customerLotNumber",
    "customerPN",
    "lotType",
    "nominalSize",
    "productName",
    "subLot",
    "technology"
})
public class LotType {

    @XmlElement(name = "AlternativePN")
    protected List<ProductIdentificationType> alternativePN;
    @XmlElement(name = "ContractorLotNumber")
    protected List<LotIdentifierType> contractorLotNumber;
    @XmlElement(name = "CustomerLotNumber")
    protected LotIdentifierType customerLotNumber;
    @XmlElement(name = "CustomerPN")
    protected ProductIdentificationType customerPN;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType.class, required = false)
    protected io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType lotType;
    @XmlElement(name = "NominalSize")
    protected Float nominalSize;
    @XmlElement(name = "ProductName")
    protected String productName;
    @XmlElement(name = "SubLot")
    protected List<LotIdentifierType> subLot;
    @XmlElement(name = "Technology")
    protected String technology;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the alternativePN property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativePN property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativePN().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationType }
     * 
     * 
     */
    public List<ProductIdentificationType> getAlternativePN() {
        if (alternativePN == null) {
            alternativePN = new ArrayList<ProductIdentificationType>();
        }
        return this.alternativePN;
    }

    /**
     * Gets the value of the contractorLotNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contractorLotNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContractorLotNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotIdentifierType }
     * 
     * 
     */
    public List<LotIdentifierType> getContractorLotNumber() {
        if (contractorLotNumber == null) {
            contractorLotNumber = new ArrayList<LotIdentifierType>();
        }
        return this.contractorLotNumber;
    }

    /**
     * Gets the value of the customerLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentifierType }
     *     
     */
    public LotIdentifierType getCustomerLotNumber() {
        return customerLotNumber;
    }

    /**
     * Sets the value of the customerLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentifierType }
     *     
     */
    public void setCustomerLotNumber(LotIdentifierType value) {
        this.customerLotNumber = value;
    }

    /**
     * Gets the value of the customerPN property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationType }
     *     
     */
    public ProductIdentificationType getCustomerPN() {
        return customerPN;
    }

    /**
     * Sets the value of the customerPN property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationType }
     *     
     */
    public void setCustomerPN(ProductIdentificationType value) {
        this.customerPN = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public void setLotType(io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the nominalSize property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getNominalSize() {
        return nominalSize;
    }

    /**
     * Sets the value of the nominalSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setNominalSize(Float value) {
        this.nominalSize = value;
    }

    /**
     * Gets the value of the productName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Sets the value of the productName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Gets the value of the subLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotIdentifierType }
     * 
     * 
     */
    public List<LotIdentifierType> getSubLot() {
        if (subLot == null) {
            subLot = new ArrayList<LotIdentifierType>();
        }
        return this.subLot;
    }

    /**
     * Gets the value of the technology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechnology() {
        return technology;
    }

    /**
     * Sets the value of the technology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTechnology(String value) {
        this.technology = value;
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
