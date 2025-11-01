
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_03.ProductSubstitutionReason;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for SubstituteProductReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstituteProductReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03}ProductSubstitutionReason"/&gt;
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
@XmlType(name = "SubstituteProductReferenceType", propOrder = {
    "productIdentification",
    "productSubstitutionReason"
})
public class SubstituteProductReferenceType {

    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected List<ProductIdentification> productIdentification;
    @XmlElementRef(name = "ProductSubstitutionReason", namespace = "urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.03", type = ProductSubstitutionReason.class)
    protected ProductSubstitutionReason productSubstitutionReason;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the productIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductIdentification }
     * 
     * 
     */
    public List<ProductIdentification> getProductIdentification() {
        if (productIdentification == null) {
            productIdentification = new ArrayList<ProductIdentification>();
        }
        return this.productIdentification;
    }

    /**
     * Gets the value of the productSubstitutionReason property.
     * 
     * @return
     *     possible object is
     *     {@link ProductSubstitutionReason }
     *     
     */
    public ProductSubstitutionReason getProductSubstitutionReason() {
        return productSubstitutionReason;
    }

    /**
     * Sets the value of the productSubstitutionReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductSubstitutionReason }
     *     
     */
    public void setProductSubstitutionReason(ProductSubstitutionReason value) {
        this.productSubstitutionReason = value;
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
