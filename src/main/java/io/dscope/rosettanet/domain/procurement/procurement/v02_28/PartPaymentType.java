
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import java.math.BigDecimal;
import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PartPaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartPaymentType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompleteOrderLineQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="PartPaymentPercentage" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}PercentAmountType"/&gt;
 *         &lt;element name="PartPaymentQuantity" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
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
@XmlType(name = "PartPaymentType", propOrder = {
    "completeOrderLineQuantity",
    "partPaymentPercentage",
    "partPaymentQuantity"
})
public class PartPaymentType {

    @XmlElement(name = "CompleteOrderLineQuantity", required = true)
    protected BigInteger completeOrderLineQuantity;
    @XmlElement(name = "PartPaymentPercentage", required = true)
    protected BigDecimal partPaymentPercentage;
    @XmlElement(name = "PartPaymentQuantity", required = true)
    protected BigInteger partPaymentQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the completeOrderLineQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCompleteOrderLineQuantity() {
        return completeOrderLineQuantity;
    }

    /**
     * Sets the value of the completeOrderLineQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCompleteOrderLineQuantity(BigInteger value) {
        this.completeOrderLineQuantity = value;
    }

    /**
     * Gets the value of the partPaymentPercentage property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPartPaymentPercentage() {
        return partPaymentPercentage;
    }

    /**
     * Sets the value of the partPaymentPercentage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPartPaymentPercentage(BigDecimal value) {
        this.partPaymentPercentage = value;
    }

    /**
     * Gets the value of the partPaymentQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPartPaymentQuantity() {
        return partPaymentQuantity;
    }

    /**
     * Sets the value of the partPaymentQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPartPaymentQuantity(BigInteger value) {
        this.partPaymentQuantity = value;
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
