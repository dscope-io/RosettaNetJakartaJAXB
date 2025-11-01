
package io.dscope.rosettanet.interchange.materialcompositioninformationdistribution.v01_00;

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
import io.dscope.rosettanet.system.standarddocumentheader.v01_00.DocumentHeader;
import io.dscope.rosettanet.universal.document.v01_00.BusinessDocumentReferenceType;


/**
 * <p>Java class for MaterialCompositionInformationDistributionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaterialCompositionInformationDistributionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AgreementIdentifier" type="{urn:rosettanet:specification:universal:Document:xsd:schema:1.0}BusinessDocumentReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0}DocumentHeader"/&gt;
 *         &lt;element name="ProductInformation" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0}ProductInformationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="ProductInformationHeader" type="{urn:rosettanet:specification:interchange:MaterialCompositionInformationDistribution:xsd:schema:1.0}ProductInformationHeaderType" minOccurs="0"/&gt;
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
@XmlType(name = "MaterialCompositionInformationDistributionType", propOrder = {
    "agreementIdentifier",
    "documentHeader",
    "productInformation",
    "productInformationHeader"
})
public class MaterialCompositionInformationDistributionType {

    @XmlElement(name = "AgreementIdentifier")
    protected BusinessDocumentReferenceType agreementIdentifier;
    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:1.0", type = DocumentHeader.class)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "ProductInformation", required = true)
    protected List<ProductInformationType> productInformation;
    @XmlElement(name = "ProductInformationHeader")
    protected ProductInformationHeaderType productInformationHeader;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the agreementIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public BusinessDocumentReferenceType getAgreementIdentifier() {
        return agreementIdentifier;
    }

    /**
     * Sets the value of the agreementIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReferenceType }
     *     
     */
    public void setAgreementIdentifier(BusinessDocumentReferenceType value) {
        this.agreementIdentifier = value;
    }

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
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
     * Gets the value of the productInformationHeader property.
     * 
     * @return
     *     possible object is
     *     {@link ProductInformationHeaderType }
     *     
     */
    public ProductInformationHeaderType getProductInformationHeader() {
        return productInformationHeader;
    }

    /**
     * Sets the value of the productInformationHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductInformationHeaderType }
     *     
     */
    public void setProductInformationHeader(ProductInformationHeaderType value) {
        this.productInformationHeader = value;
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
