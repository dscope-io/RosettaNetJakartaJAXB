
package io.dscope.rosettanet.interchange.openshipfromstockanddebitauthorizationstatusdistribution.v01_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_24.BranchInformation;
import io.dscope.rosettanet.domain.procurement.procurement.v02_24.PricingInformationType;
import io.dscope.rosettanet.universal.dates.v01_03.DatePeriodType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;


/**
 * <p>Java class for AuthorizationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AuthorizationPeriod" type="{urn:rosettanet:specification:universal:Dates:xsd:schema:01.03}DatePeriodType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24}BranchInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ProductFamilyInformation" type="{urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.01}ProductFamilyInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.01}ProductInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="RevisionInformation" type="{urn:rosettanet:specification:interchange:OpenShipFromStockAndDebitAuthorizationStatusDistribution:xsd:schema:01.01}RevisionInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SupplierPricing" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24}PricingInformationType" minOccurs="0"/&gt;
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
@XmlType(name = "AuthorizationInformationType", propOrder = {
    "authorizationPeriod",
    "branchInformation",
    "businessDocumentReference",
    "identifier",
    "productFamilyInformation",
    "productInformation",
    "revisionInformation",
    "supplierPricing"
})
public class AuthorizationInformationType {

    @XmlElement(name = "AuthorizationPeriod", required = true)
    protected DatePeriodType authorizationPeriod;
    @XmlElementRef(name = "BranchInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24", type = BranchInformation.class, required = false)
    protected List<BranchInformation> branchInformation;
    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "ProductFamilyInformation")
    protected ProductFamilyInformationType productFamilyInformation;
    @XmlElement(name = "ProductInformation", required = true)
    protected List<ProductInformationType> productInformation;
    @XmlElement(name = "RevisionInformation")
    protected List<RevisionInformationType> revisionInformation;
    @XmlElement(name = "SupplierPricing")
    protected PricingInformationType supplierPricing;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the authorizationPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodType }
     *     
     */
    public DatePeriodType getAuthorizationPeriod() {
        return authorizationPeriod;
    }

    /**
     * Sets the value of the authorizationPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodType }
     *     
     */
    public void setAuthorizationPeriod(DatePeriodType value) {
        this.authorizationPeriod = value;
    }

    /**
     * Gets the value of the branchInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchInformation }
     * 
     * 
     */
    public List<BranchInformation> getBranchInformation() {
        if (branchInformation == null) {
            branchInformation = new ArrayList<BranchInformation>();
        }
        return this.branchInformation;
    }

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
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the productFamilyInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductFamilyInformationType }
     *     
     */
    public ProductFamilyInformationType getProductFamilyInformation() {
        return productFamilyInformation;
    }

    /**
     * Sets the value of the productFamilyInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductFamilyInformationType }
     *     
     */
    public void setProductFamilyInformation(ProductFamilyInformationType value) {
        this.productFamilyInformation = value;
    }

    /**
     * Gets the value of the productInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductInformationType }
     * 
     * 
     */
    public List<ProductInformationType> getProductInformation() {
        if (productInformation == null) {
            productInformation = new ArrayList<ProductInformationType>();
        }
        return this.productInformation;
    }

    /**
     * Gets the value of the revisionInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisionInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisionInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevisionInformationType }
     * 
     * 
     */
    public List<RevisionInformationType> getRevisionInformation() {
        if (revisionInformation == null) {
            revisionInformation = new ArrayList<RevisionInformationType>();
        }
        return this.revisionInformation;
    }

    /**
     * Gets the value of the supplierPricing property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getSupplierPricing() {
        return supplierPricing;
    }

    /**
     * Sets the value of the supplierPricing property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setSupplierPricing(PricingInformationType value) {
        this.supplierPricing = value;
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
