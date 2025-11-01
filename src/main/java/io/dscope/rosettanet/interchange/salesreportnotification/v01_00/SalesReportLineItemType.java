
package io.dscope.rosettanet.interchange.salesreportnotification.v01_00;

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
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.InstallLocation;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.ProductInformation;
import io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00.SalesOutAndTransaction;
import io.dscope.rosettanet.universal.document.v01_00.BusinessDocumentReference;


/**
 * <p>Java class for SalesReportLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesReportLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:1.0}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}InstallLocation" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}ProductInformation"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0}SalesOutAndTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SpecialPriceClaim" type="{urn:rosettanet:specification:interchange:SalesReportNotification:xsd:schema:1.0}SpecialPriceClaimType" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "SalesReportLineItemType", propOrder = {
    "businessDocumentReference",
    "comment",
    "installLocation",
    "lineNumber",
    "productInformation",
    "quantity",
    "salesOutAndTransaction",
    "specialPriceClaim"
})
public class SalesReportLineItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:1.0", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "InstallLocation", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = InstallLocation.class, required = false)
    protected InstallLocation installLocation;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "ProductInformation", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = ProductInformation.class)
    protected ProductInformation productInformation;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElementRef(name = "SalesOutAndTransaction", namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", type = SalesOutAndTransaction.class, required = false)
    protected List<SalesOutAndTransaction> salesOutAndTransaction;
    @XmlElement(name = "SpecialPriceClaim")
    protected List<SpecialPriceClaimType> specialPriceClaim;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the installLocation property.
     * 
     * @return
     *     possible object is
     *     {@link InstallLocation }
     *     
     */
    public InstallLocation getInstallLocation() {
        return installLocation;
    }

    /**
     * Sets the value of the installLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstallLocation }
     *     
     */
    public void setInstallLocation(InstallLocation value) {
        this.installLocation = value;
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
     * Gets the value of the productInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformation }
     *     
     */
    public ProductInformation getProductInformation() {
        return productInformation;
    }

    /**
     * Sets the value of the productInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformation }
     *     
     */
    public void setProductInformation(ProductInformation value) {
        this.productInformation = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the salesOutAndTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the salesOutAndTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSalesOutAndTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SalesOutAndTransaction }
     * 
     * 
     */
    public List<SalesOutAndTransaction> getSalesOutAndTransaction() {
        if (salesOutAndTransaction == null) {
            salesOutAndTransaction = new ArrayList<SalesOutAndTransaction>();
        }
        return this.salesOutAndTransaction;
    }

    /**
     * Gets the value of the specialPriceClaim property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialPriceClaim property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialPriceClaim().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialPriceClaimType }
     * 
     * 
     */
    public List<SpecialPriceClaimType> getSpecialPriceClaim() {
        if (specialPriceClaim == null) {
            specialPriceClaim = new ArrayList<SpecialPriceClaimType>();
        }
        return this.specialPriceClaim;
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
