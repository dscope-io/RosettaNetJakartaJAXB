
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_03.SaleType;
import io.dscope.rosettanet.domain.shared.shared.v01_04.ProductQuantity;


/**
 * <p>Java class for SalesOutType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesOutType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.04}ProductQuantity"/&gt;
 *         &lt;element name="SalesOutDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.03}SaleType" minOccurs="0"/&gt;
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
@XmlType(name = "SalesOutType", propOrder = {
    "productQuantity",
    "salesOutDate",
    "saleType"
})
public class SalesOutType {

    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.04", type = ProductQuantity.class)
    protected ProductQuantity productQuantity;
    @XmlElement(name = "SalesOutDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar salesOutDate;
    @XmlElementRef(name = "SaleType", namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.03", type = SaleType.class, required = false)
    protected SaleType saleType;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the salesOutDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSalesOutDate() {
        return salesOutDate;
    }

    /**
     * Sets the value of the salesOutDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSalesOutDate(XMLGregorianCalendar value) {
        this.salesOutDate = value;
    }

    /**
     * Gets the value of the saleType property.
     * 
     * @return
     *     possible object is
     *     {@link SaleType }
     *     
     */
    public SaleType getSaleType() {
        return saleType;
    }

    /**
     * Sets the value of the saleType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SaleType }
     *     
     */
    public void setSaleType(SaleType value) {
        this.saleType = value;
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
