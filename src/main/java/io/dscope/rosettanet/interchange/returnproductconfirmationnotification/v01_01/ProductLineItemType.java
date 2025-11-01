
package io.dscope.rosettanet.interchange.returnproductconfirmationnotification.v01_01;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.service.codelist.returnproductinstruction.v01_02.ReturnProductInstruction;
import io.dscope.rosettanet.domain.shared.codelist.shippingservicelevel.v01_01.ShippingServiceLevel;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_05.UnitOfMeasure;
import io.dscope.rosettanet.universal.monetaryexpression.v01_07.FinancialAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ProductLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizedReturnQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.19}ProductQuantityType" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="RequestedReturnQuantity" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.19}ProductQuantityType"/&gt;
 *         &lt;element name="RequestedShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02}ReturnProductInstruction"/&gt;
 *         &lt;element name="SerialIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ShipDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01}ShippingServiceLevel" minOccurs="0"/&gt;
 *         &lt;element name="StatusInformation" type="{urn:rosettanet:specification:interchange:ReturnProductConfirmationNotification:xsd:schema:01.01}StatusInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.05}UnitOfMeasure" minOccurs="0"/&gt;
 *         &lt;element name="UnitPrice" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.07}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ProductLineItemType", propOrder = {
    "authorizedReturnQuantity",
    "lineNumber",
    "partnerDescription",
    "productIdentification",
    "requestedReturnQuantity",
    "requestedShipDate",
    "returnProductInstruction",
    "serialIdentifier",
    "shipDate",
    "shippingServiceLevel",
    "statusInformation",
    "unitOfMeasure",
    "unitPrice"
})
public class ProductLineItemType {

    @XmlElement(name = "AuthorizedReturnQuantity")
    protected Float authorizedReturnQuantity;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "RequestedReturnQuantity")
    protected float requestedReturnQuantity;
    @XmlElement(name = "RequestedShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar requestedShipDate;
    @XmlElementRef(name = "ReturnProductInstruction", namespace = "urn:rosettanet:specification:domain:Service:ReturnProductInstruction:xsd:codelist:01.02", type = ReturnProductInstruction.class)
    protected ReturnProductInstruction returnProductInstruction;
    @XmlElement(name = "SerialIdentifier")
    protected String serialIdentifier;
    @XmlElement(name = "ShipDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shipDate;
    @XmlElementRef(name = "ShippingServiceLevel", namespace = "urn:rosettanet:specification:domain:Shared:ShippingServiceLevel:xsd:codelist:01.01", type = ShippingServiceLevel.class, required = false)
    protected ShippingServiceLevel shippingServiceLevel;
    @XmlElement(name = "StatusInformation")
    protected List<StatusInformationType> statusInformation;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.05", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlElement(name = "UnitPrice")
    protected FinancialAmountType unitPrice;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizedReturnQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAuthorizedReturnQuantity() {
        return authorizedReturnQuantity;
    }

    /**
     * Sets the value of the authorizedReturnQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAuthorizedReturnQuantity(Float value) {
        this.authorizedReturnQuantity = value;
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
     * Gets the value of the partnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link PartnerDescription }
     *     
     */
    public PartnerDescription getPartnerDescription() {
        return partnerDescription;
    }

    /**
     * Sets the value of the partnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartnerDescription }
     *     
     */
    public void setPartnerDescription(PartnerDescription value) {
        this.partnerDescription = value;
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
     * Gets the value of the requestedReturnQuantity property.
     * 
     */
    public float getRequestedReturnQuantity() {
        return requestedReturnQuantity;
    }

    /**
     * Sets the value of the requestedReturnQuantity property.
     * 
     */
    public void setRequestedReturnQuantity(float value) {
        this.requestedReturnQuantity = value;
    }

    /**
     * Gets the value of the requestedShipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestedShipDate() {
        return requestedShipDate;
    }

    /**
     * Sets the value of the requestedShipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestedShipDate(XMLGregorianCalendar value) {
        this.requestedShipDate = value;
    }

    /**
     * Gets the value of the returnProductInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link ReturnProductInstruction }
     *     
     */
    public ReturnProductInstruction getReturnProductInstruction() {
        return returnProductInstruction;
    }

    /**
     * Sets the value of the returnProductInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReturnProductInstruction }
     *     
     */
    public void setReturnProductInstruction(ReturnProductInstruction value) {
        this.returnProductInstruction = value;
    }

    /**
     * Gets the value of the serialIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSerialIdentifier() {
        return serialIdentifier;
    }

    /**
     * Sets the value of the serialIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSerialIdentifier(String value) {
        this.serialIdentifier = value;
    }

    /**
     * Gets the value of the shipDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShipDate() {
        return shipDate;
    }

    /**
     * Sets the value of the shipDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShipDate(XMLGregorianCalendar value) {
        this.shipDate = value;
    }

    /**
     * Gets the value of the shippingServiceLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public ShippingServiceLevel getShippingServiceLevel() {
        return shippingServiceLevel;
    }

    /**
     * Sets the value of the shippingServiceLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ShippingServiceLevel }
     *     
     */
    public void setShippingServiceLevel(ShippingServiceLevel value) {
        this.shippingServiceLevel = value;
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
     * Gets the value of the unitPrice property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getUnitPrice() {
        return unitPrice;
    }

    /**
     * Sets the value of the unitPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setUnitPrice(FinancialAmountType value) {
        this.unitPrice = value;
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
