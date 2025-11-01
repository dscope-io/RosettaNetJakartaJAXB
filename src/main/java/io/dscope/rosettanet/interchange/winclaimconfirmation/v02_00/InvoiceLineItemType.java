
package io.dscope.rosettanet.interchange.winclaimconfirmation.v02_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.marketing.marketing.v02_12.DebitAuthorizationNumber;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.monetaryexpression.v01_04.FinancialAmountType;


/**
 * <p>Java class for InvoiceLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12}DebitAuthorizationNumber" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="LineItemNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceLineItemType", propOrder = {
    "debitAuthorizationNumber",
    "invoiceAmount",
    "lineItemNumber",
    "productQuantity",
    "unitOfMeasure"
})
public class InvoiceLineItemType {

    @XmlElementRef(name = "DebitAuthorizationNumber", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", type = DebitAuthorizationNumber.class, required = false)
    protected DebitAuthorizationNumber debitAuthorizationNumber;
    @XmlElement(name = "InvoiceAmount")
    protected FinancialAmountType invoiceAmount;
    @XmlElement(name = "LineItemNumber", required = true)
    protected String lineItemNumber;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class, required = false)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the debitAuthorizationNumber property.
     * 
     * @return
     *     possible object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public DebitAuthorizationNumber getDebitAuthorizationNumber() {
        return debitAuthorizationNumber;
    }

    /**
     * Sets the value of the debitAuthorizationNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link DebitAuthorizationNumber }
     *     
     */
    public void setDebitAuthorizationNumber(DebitAuthorizationNumber value) {
        this.debitAuthorizationNumber = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets the value of the invoiceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setInvoiceAmount(FinancialAmountType value) {
        this.invoiceAmount = value;
    }

    /**
     * Gets the value of the lineItemNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineItemNumber() {
        return lineItemNumber;
    }

    /**
     * Sets the value of the lineItemNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineItemNumber(String value) {
        this.lineItemNumber = value;
    }

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
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
