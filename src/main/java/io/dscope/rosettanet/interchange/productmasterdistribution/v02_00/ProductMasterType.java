
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

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
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedKnownPartnerType;


/**
 * <p>Java class for ProductMasterType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductMasterType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="InternalBusinessEntity" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedKnownPartnerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProductMasterLineItem" type="{urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00}ProductMasterLineItemType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ProductMasterType", propOrder = {
    "internalBusinessEntity",
    "productMasterLineItem"
})
public class ProductMasterType {

    @XmlElement(name = "InternalBusinessEntity")
    protected List<SpecifiedKnownPartnerType> internalBusinessEntity;
    @XmlElement(name = "ProductMasterLineItem", required = true)
    protected List<ProductMasterLineItemType> productMasterLineItem;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the internalBusinessEntity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the internalBusinessEntity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInternalBusinessEntity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifiedKnownPartnerType }
     * 
     * 
     */
    public List<SpecifiedKnownPartnerType> getInternalBusinessEntity() {
        if (internalBusinessEntity == null) {
            internalBusinessEntity = new ArrayList<SpecifiedKnownPartnerType>();
        }
        return this.internalBusinessEntity;
    }

    /**
     * Gets the value of the productMasterLineItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productMasterLineItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductMasterLineItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductMasterLineItemType }
     * 
     * 
     */
    public List<ProductMasterLineItemType> getProductMasterLineItem() {
        if (productMasterLineItem == null) {
            productMasterLineItem = new ArrayList<ProductMasterLineItemType>();
        }
        return this.productMasterLineItem;
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
