
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

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
import io.dscope.rosettanet.universal.productidentification.v01_00.ProductIdentification;


/**
 * <p>Java class for ProductInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContractIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}LotIdentification" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0}ProductIdentification"/&gt;
 *         &lt;element name="ProvisionPeriod" type="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}DatePeriodAndDurationType" minOccurs="0"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" fixed="1.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductInformationType", propOrder = {
    "contractIdentifier",
    "lotIdentification",
    "productIdentification",
    "provisionPeriod",
    "serialIdentifier"
})
public class ProductInformationType {

    @XmlElement(name = "ContractIdentifier")
    protected String contractIdentifier;
    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = LotIdentification.class, required = false)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:1.0", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ProvisionPeriod")
    protected DatePeriodAndDurationType provisionPeriod;
    @XmlElement(name = "SerialIdentifier")
    protected List<String> serialIdentifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractIdentifier() {
        return contractIdentifier;
    }

    /**
     * Sets the value of the contractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractIdentifier(String value) {
        this.contractIdentifier = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
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
     * Gets the value of the provisionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public DatePeriodAndDurationType getProvisionPeriod() {
        return provisionPeriod;
    }

    /**
     * Sets the value of the provisionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDurationType }
     *     
     */
    public void setProvisionPeriod(DatePeriodAndDurationType value) {
        this.provisionPeriod = value;
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
        if (schemaVersion == null) {
            return "1.0";
        } else {
            return schemaVersion;
        }
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
