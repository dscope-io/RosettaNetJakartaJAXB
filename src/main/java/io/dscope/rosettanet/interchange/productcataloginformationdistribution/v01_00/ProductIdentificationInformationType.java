
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00;

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
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.IsDesignWin;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.IsSoleSource;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductClassification;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductDescription;


/**
 * <p>Java class for ProductIdentificationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}IsDesignWin"/&gt;
 *         &lt;element name="IsGeneric" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}IsSoleSource"/&gt;
 *         &lt;element name="ProductClassCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductClassification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductDescription"/&gt;
 *         &lt;element name="ProductIdentificationInformation" type="{urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00}ProductIdentificationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductIdentificationInformationType", propOrder = {
    "isDesignWin",
    "isGeneric",
    "isSoleSource",
    "productClassCode",
    "productClassification",
    "productDescription",
    "productIdentificationInformation"
})
public class ProductIdentificationInformationType {

    @XmlElementRef(name = "IsDesignWin", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = IsDesignWin.class)
    protected IsDesignWin isDesignWin;
    @XmlElement(name = "IsGeneric")
    protected boolean isGeneric;
    @XmlElementRef(name = "IsSoleSource", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = IsSoleSource.class)
    protected IsSoleSource isSoleSource;
    @XmlElement(name = "ProductClassCode")
    protected String productClassCode;
    @XmlElementRef(name = "ProductClassification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = ProductClassification.class, required = false)
    protected ProductClassification productClassification;
    @XmlElementRef(name = "ProductDescription", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductDescription.class)
    protected ProductDescription productDescription;
    @XmlElement(name = "ProductIdentificationInformation")
    protected List<ProductIdentificationInformationType> productIdentificationInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isDesignWin property.
     * 
     * @return
     *     possible object is
     *     {@link IsDesignWin }
     *     
     */
    public IsDesignWin getIsDesignWin() {
        return isDesignWin;
    }

    /**
     * Sets the value of the isDesignWin property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsDesignWin }
     *     
     */
    public void setIsDesignWin(IsDesignWin value) {
        this.isDesignWin = value;
    }

    /**
     * Gets the value of the isGeneric property.
     * 
     */
    public boolean isIsGeneric() {
        return isGeneric;
    }

    /**
     * Sets the value of the isGeneric property.
     * 
     */
    public void setIsGeneric(boolean value) {
        this.isGeneric = value;
    }

    /**
     * Gets the value of the isSoleSource property.
     * 
     * @return
     *     possible object is
     *     {@link IsSoleSource }
     *     
     */
    public IsSoleSource getIsSoleSource() {
        return isSoleSource;
    }

    /**
     * Sets the value of the isSoleSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsSoleSource }
     *     
     */
    public void setIsSoleSource(IsSoleSource value) {
        this.isSoleSource = value;
    }

    /**
     * Gets the value of the productClassCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClassCode() {
        return productClassCode;
    }

    /**
     * Sets the value of the productClassCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClassCode(String value) {
        this.productClassCode = value;
    }

    /**
     * Gets the value of the productClassification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductClassification }
     *     
     */
    public ProductClassification getProductClassification() {
        return productClassification;
    }

    /**
     * Sets the value of the productClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductClassification }
     *     
     */
    public void setProductClassification(ProductClassification value) {
        this.productClassification = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescription }
     *     
     */
    public ProductDescription getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescription }
     *     
     */
    public void setProductDescription(ProductDescription value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productIdentificationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentificationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentificationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentificationInformationType }
     * 
     * 
     */
    public List<ProductIdentificationInformationType> getProductIdentificationInformation() {
        if (productIdentificationInformation == null) {
            productIdentificationInformation = new ArrayList<ProductIdentificationInformationType>();
        }
        return this.productIdentificationInformation;
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
