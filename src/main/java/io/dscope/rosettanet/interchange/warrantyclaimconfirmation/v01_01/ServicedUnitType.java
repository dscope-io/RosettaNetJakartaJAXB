
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_01;

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
import io.dscope.rosettanet.domain.shared.codelist.warrantytype.v01_01.WarrantyType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductSerialIdentification;


/**
 * <p>Java class for ServicedUnitType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServicedUnitType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsEntitledToWarranty" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsProofOfPurchaseIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductSerialIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}PurchaseDate"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01}WarrantyType" minOccurs="0"/&gt;
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
@XmlType(name = "ServicedUnitType", propOrder = {
    "isEntitledToWarranty",
    "isProofOfPurchaseIncluded",
    "productSerialIdentification",
    "purchaseDate",
    "warrantyType"
})
public class ServicedUnitType {

    @XmlElement(name = "IsEntitledToWarranty")
    protected boolean isEntitledToWarranty;
    @XmlElement(name = "IsProofOfPurchaseIncluded")
    protected Boolean isProofOfPurchaseIncluded;
    @XmlElementRef(name = "ProductSerialIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductSerialIdentification.class)
    protected ProductSerialIdentification productSerialIdentification;
    @XmlElementRef(name = "PurchaseDate", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = PurchaseDate.class)
    protected PurchaseDate purchaseDate;
    @XmlElementRef(name = "WarrantyType", namespace = "urn:rosettanet:specification:domain:Shared:WarrantyType:xsd:codelist:01.01", type = WarrantyType.class, required = false)
    protected WarrantyType warrantyType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isEntitledToWarranty property.
     * 
     */
    public boolean isIsEntitledToWarranty() {
        return isEntitledToWarranty;
    }

    /**
     * Sets the value of the isEntitledToWarranty property.
     * 
     */
    public void setIsEntitledToWarranty(boolean value) {
        this.isEntitledToWarranty = value;
    }

    /**
     * Gets the value of the isProofOfPurchaseIncluded property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsProofOfPurchaseIncluded() {
        return isProofOfPurchaseIncluded;
    }

    /**
     * Sets the value of the isProofOfPurchaseIncluded property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsProofOfPurchaseIncluded(Boolean value) {
        this.isProofOfPurchaseIncluded = value;
    }

    /**
     * Gets the value of the productSerialIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public ProductSerialIdentification getProductSerialIdentification() {
        return productSerialIdentification;
    }

    /**
     * Sets the value of the productSerialIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSerialIdentification }
     *     
     */
    public void setProductSerialIdentification(ProductSerialIdentification value) {
        this.productSerialIdentification = value;
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
     * Gets the value of the warrantyType property.
     * 
     * @return
     *     possible object is
     *     {@link WarrantyType }
     *     
     */
    public WarrantyType getWarrantyType() {
        return warrantyType;
    }

    /**
     * Sets the value of the warrantyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link WarrantyType }
     *     
     */
    public void setWarrantyType(WarrantyType value) {
        this.warrantyType = value;
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
