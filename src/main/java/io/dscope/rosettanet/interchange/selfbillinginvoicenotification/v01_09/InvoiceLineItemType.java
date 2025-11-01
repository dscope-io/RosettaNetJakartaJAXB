
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_09;

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
import io.dscope.rosettanet.domain.procurement.codelist.shipmentterms.v01_03.ShipmentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_29.FeeInformation;
import io.dscope.rosettanet.domain.shared.shared.v01_17.MonetaryAmountType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReferenceType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


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
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29}FeeInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GovernmentContractIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PreTaxAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="PrimaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.09}ProductDescriptionType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification" minOccurs="0"/&gt;
 *         &lt;element name="SecondaryIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03}ShipmentTerms" minOccurs="0"/&gt;
 *         &lt;element name="TotalLineItemAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}MonetaryAmountType"/&gt;
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
    "feeInformation",
    "governmentContractIdentifier",
    "lineNumber",
    "preTaxAmount",
    "primaryIdentifier",
    "productDescription",
    "productIdentification",
    "secondaryIdentifier",
    "shipmentTerms",
    "totalLineItemAmount"
})
public class InvoiceLineItemType {

    @XmlElementRef(name = "FeeInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", type = FeeInformation.class, required = false)
    protected List<FeeInformation> feeInformation;
    @XmlElement(name = "GovernmentContractIdentifier")
    protected BusinessDocumentReferenceType governmentContractIdentifier;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "PreTaxAmount")
    protected MonetaryAmountType preTaxAmount;
    @XmlElement(name = "PrimaryIdentifier")
    protected String primaryIdentifier;
    @XmlElement(name = "ProductDescription", required = true)
    protected ProductDescriptionType productDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class, required = false)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "SecondaryIdentifier")
    protected String secondaryIdentifier;
    @XmlElementRef(name = "ShipmentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:ShipmentTerms:xsd:codelist:01.03", type = ShipmentTerms.class, required = false)
    protected ShipmentTerms shipmentTerms;
    @XmlElement(name = "TotalLineItemAmount", required = true)
    protected MonetaryAmountType totalLineItemAmount;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the feeInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feeInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FeeInformation }
     * 
     * 
     */
    public List<FeeInformation> getFeeInformation() {
        if (feeInformation == null) {
            feeInformation = new ArrayList<FeeInformation>();
        }
        return this.feeInformation;
    }

    /**
     * Gets the value of the governmentContractIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getGovernmentContractIdentifier() {
        return governmentContractIdentifier;
    }

    /**
     * Sets the value of the governmentContractIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setGovernmentContractIdentifier(BusinessDocumentReferenceType value) {
        this.governmentContractIdentifier = value;
    }

    /**
     * Gets the value of the lineNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineNumber() {
        return lineNumber;
    }

    /**
     * Sets the value of the lineNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineNumber(String value) {
        this.lineNumber = value;
    }

    /**
     * Gets the value of the preTaxAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getPreTaxAmount() {
        return preTaxAmount;
    }

    /**
     * Sets the value of the preTaxAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setPreTaxAmount(MonetaryAmountType value) {
        this.preTaxAmount = value;
    }

    /**
     * Gets the value of the primaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryIdentifier() {
        return primaryIdentifier;
    }

    /**
     * Sets the value of the primaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryIdentifier(String value) {
        this.primaryIdentifier = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link ProductDescriptionType }
     *     
     */
    public ProductDescriptionType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescriptionType }
     *     
     */
    public void setProductDescription(ProductDescriptionType value) {
        this.productDescription = value;
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
     * Gets the value of the secondaryIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondaryIdentifier() {
        return secondaryIdentifier;
    }

    /**
     * Sets the value of the secondaryIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondaryIdentifier(String value) {
        this.secondaryIdentifier = value;
    }

    /**
     * Gets the value of the shipmentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link ShipmentTerms }
     *     
     */
    public ShipmentTerms getShipmentTerms() {
        return shipmentTerms;
    }

    /**
     * Sets the value of the shipmentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShipmentTerms }
     *     
     */
    public void setShipmentTerms(ShipmentTerms value) {
        this.shipmentTerms = value;
    }

    /**
     * Gets the value of the totalLineItemAmount property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getTotalLineItemAmount() {
        return totalLineItemAmount;
    }

    /**
     * Sets the value of the totalLineItemAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setTotalLineItemAmount(MonetaryAmountType value) {
        this.totalLineItemAmount = value;
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
