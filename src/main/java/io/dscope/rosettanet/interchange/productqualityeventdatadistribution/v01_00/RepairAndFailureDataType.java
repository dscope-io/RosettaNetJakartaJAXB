
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductReferenceType;
import io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02.QualityDisposition;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_12.PartnerDescription;


/**
 * <p>Java class for RepairAndFailureDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepairAndFailureDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispositionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FinalProductReference" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductReferenceType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02}QualityDisposition"/&gt;
 *         &lt;element name="QualityIncidentInformation" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}QualityIncidentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ReceivedProductReference" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}ReceivedProductReferenceType"/&gt;
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
@XmlType(name = "RepairAndFailureDataType", propOrder = {
    "businessDocumentReference",
    "comment",
    "dispositionDate",
    "finalProductReference",
    "partnerDescription",
    "productQuantity",
    "qualityDisposition",
    "qualityIncidentInformation",
    "receivedProductReference",
    "unitOfMeasure"
})
public class RepairAndFailureDataType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DispositionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dispositionDate;
    @XmlElement(name = "FinalProductReference")
    protected ProductReferenceType finalProductReference;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class, required = false)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "QualityDisposition", namespace = "urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", type = QualityDisposition.class)
    protected QualityDisposition qualityDisposition;
    @XmlElement(name = "QualityIncidentInformation")
    protected List<QualityIncidentInformationType> qualityIncidentInformation;
    @XmlElement(name = "ReceivedProductReference", required = true)
    protected ReceivedProductReferenceType receivedProductReference;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
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
     * Gets the value of the dispositionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispositionDate() {
        return dispositionDate;
    }

    /**
     * Sets the value of the dispositionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispositionDate(XMLGregorianCalendar value) {
        this.dispositionDate = value;
    }

    /**
     * Gets the value of the finalProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReferenceType }
     *     
     */
    public ProductReferenceType getFinalProductReference() {
        return finalProductReference;
    }

    /**
     * Sets the value of the finalProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReferenceType }
     *     
     */
    public void setFinalProductReference(ProductReferenceType value) {
        this.finalProductReference = value;
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
     * Gets the value of the qualityDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDisposition }
     *     
     */
    public QualityDisposition getQualityDisposition() {
        return qualityDisposition;
    }

    /**
     * Sets the value of the qualityDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDisposition }
     *     
     */
    public void setQualityDisposition(QualityDisposition value) {
        this.qualityDisposition = value;
    }

    /**
     * Gets the value of the qualityIncidentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualityIncidentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualityIncidentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualityIncidentInformationType }
     * 
     * 
     */
    public List<QualityIncidentInformationType> getQualityIncidentInformation() {
        if (qualityIncidentInformation == null) {
            qualityIncidentInformation = new ArrayList<QualityIncidentInformationType>();
        }
        return this.qualityIncidentInformation;
    }

    /**
     * Gets the value of the receivedProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedProductReferenceType }
     *     
     */
    public ReceivedProductReferenceType getReceivedProductReference() {
        return receivedProductReference;
    }

    /**
     * Sets the value of the receivedProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedProductReferenceType }
     *     
     */
    public void setReceivedProductReference(ReceivedProductReferenceType value) {
        this.receivedProductReference = value;
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
