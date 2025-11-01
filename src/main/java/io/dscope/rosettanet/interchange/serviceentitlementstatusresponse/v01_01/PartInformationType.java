
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_01;

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
import io.dscope.rosettanet.domain.service.service.v02_20.PurchaseDate;
import io.dscope.rosettanet.domain.service.service.v02_20.WarrantyInformation;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for PartInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsPartValidForThisUnit" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}PurchaseDate" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponse:xsd:schema:01.01}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}WarrantyInformation" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "PartInformationType", propOrder = {
    "isPartValidForThisUnit",
    "manufacturingDateCode",
    "productIdentification",
    "purchaseDate",
    "statusInformation",
    "warrantyInformation"
})
public class PartInformationType {

    @XmlElement(name = "IsPartValidForThisUnit")
    protected Boolean isPartValidForThisUnit;
    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "PurchaseDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = PurchaseDate.class, required = false)
    protected PurchaseDate purchaseDate;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElementRef(name = "WarrantyInformation", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = WarrantyInformation.class)
    protected List<WarrantyInformation> warrantyInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isPartValidForThisUnit property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPartValidForThisUnit() {
        return isPartValidForThisUnit;
    }

    /**
     * Sets the value of the isPartValidForThisUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPartValidForThisUnit(Boolean value) {
        this.isPartValidForThisUnit = value;
    }

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the purchaseDate property.
     * 
     * @return
     *     possible object is
     *     {@link PurchaseDate }
     *     
     */
    public PurchaseDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the value of the purchaseDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseDate }
     *     
     */
    public void setPurchaseDate(PurchaseDate value) {
        this.purchaseDate = value;
    }

    /**
     * Gets the value of the statusInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StatusInformationType }
     * 
     * 
     */
    public List<StatusInformationType> getStatusInformation() {
        if (statusInformation == null) {
            statusInformation = new ArrayList<StatusInformationType>();
        }
        return this.statusInformation;
    }

    /**
     * Gets the value of the warrantyInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the warrantyInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWarrantyInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WarrantyInformation }
     * 
     * 
     */
    public List<WarrantyInformation> getWarrantyInformation() {
        if (warrantyInformation == null) {
            warrantyInformation = new ArrayList<WarrantyInformation>();
        }
        return this.warrantyInformation;
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
