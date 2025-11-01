
package io.dscope.rosettanet.interchange.manufacturingworkordernotification.v02_02;

import java.math.BigInteger;
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
import io.dscope.rosettanet.domain.manufacturing.codelist.changereason.v01_04.ChangeReason;
import io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.EngineeringInformation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.MarkInformation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.ProcessInformation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.SourceDevice;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27.SpecialProcessingInformation;
import io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_04.LineItemStatus;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.partneridentification.v01_16.PartnerDescription;


/**
 * <p>Java class for WorkOrderLineItemsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WorkOrderLineItemsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04}ChangeReason" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerProfile" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.02}CustomerProfileType"/&gt;
 *         &lt;element name="DateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}EngineeringInformation" minOccurs="0"/&gt;
 *         &lt;element name="LeadCount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04}LineItemStatus" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}MarkInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}PartnerDescription" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}ProcessInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PurposeOfMultipleSourceDevices" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}SourceDevice" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27}SpecialProcessingInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SublineItems" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.02}SublineItemsType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TargetDevice" type="{urn:rosettanet:specification:interchange:ManufacturingWorkOrderNotification:xsd:schema:02.02}TargetDeviceType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "WorkOrderLineItemsType", propOrder = {
    "businessDocumentReference",
    "changeReason",
    "comment",
    "customerProfile",
    "dateCode",
    "engineeringInformation",
    "leadCount",
    "lineItemStatus",
    "lineNumber",
    "lotType",
    "markInformation",
    "partnerDescription",
    "processInformation",
    "purposeOfMultipleSourceDevices",
    "sourceDevice",
    "specialProcessingInformation",
    "sublineItems",
    "targetDevice"
})
public class WorkOrderLineItemsType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElementRef(name = "ChangeReason", namespace = "urn:rosettanet:specification:domain:Manufacturing:ChangeReason:xsd:codelist:01.04", type = ChangeReason.class, required = false)
    protected ChangeReason changeReason;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "CustomerProfile", required = true)
    protected CustomerProfileType customerProfile;
    @XmlElement(name = "DateCode")
    protected String dateCode;
    @XmlElementRef(name = "EngineeringInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = EngineeringInformation.class, required = false)
    protected EngineeringInformation engineeringInformation;
    @XmlElement(name = "LeadCount")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger leadCount;
    @XmlElementRef(name = "LineItemStatus", namespace = "urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.04", type = LineItemStatus.class, required = false)
    protected LineItemStatus lineItemStatus;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = LotType.class)
    protected LotType lotType;
    @XmlElementRef(name = "MarkInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = MarkInformation.class, required = false)
    protected List<MarkInformation> markInformation;
    @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = PartnerDescription.class, required = false)
    protected PartnerDescription partnerDescription;
    @XmlElementRef(name = "ProcessInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = ProcessInformation.class, required = false)
    protected List<ProcessInformation> processInformation;
    @XmlElement(name = "PurposeOfMultipleSourceDevices")
    protected String purposeOfMultipleSourceDevices;
    @XmlElementRef(name = "SourceDevice", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = SourceDevice.class, required = false)
    protected List<SourceDevice> sourceDevice;
    @XmlElementRef(name = "SpecialProcessingInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", type = SpecialProcessingInformation.class, required = false)
    protected List<SpecialProcessingInformation> specialProcessingInformation;
    @XmlElement(name = "SublineItems")
    protected List<SublineItemsType> sublineItems;
    @XmlElement(name = "TargetDevice", required = true)
    protected List<TargetDeviceType> targetDevice;
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
     * Gets the value of the changeReason property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeReason }
     *     
     */
    public ChangeReason getChangeReason() {
        return changeReason;
    }

    /**
     * Sets the value of the changeReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeReason }
     *     
     */
    public void setChangeReason(ChangeReason value) {
        this.changeReason = value;
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
     * Gets the value of the customerProfile property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerProfileType }
     *     
     */
    public CustomerProfileType getCustomerProfile() {
        return customerProfile;
    }

    /**
     * Sets the value of the customerProfile property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerProfileType }
     *     
     */
    public void setCustomerProfile(CustomerProfileType value) {
        this.customerProfile = value;
    }

    /**
     * Gets the value of the dateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateCode() {
        return dateCode;
    }

    /**
     * Sets the value of the dateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCode(String value) {
        this.dateCode = value;
    }

    /**
     * Gets the value of the engineeringInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EngineeringInformation }
     *     
     */
    public EngineeringInformation getEngineeringInformation() {
        return engineeringInformation;
    }

    /**
     * Sets the value of the engineeringInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineeringInformation }
     *     
     */
    public void setEngineeringInformation(EngineeringInformation value) {
        this.engineeringInformation = value;
    }

    /**
     * Gets the value of the leadCount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLeadCount() {
        return leadCount;
    }

    /**
     * Sets the value of the leadCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLeadCount(BigInteger value) {
        this.leadCount = value;
    }

    /**
     * Gets the value of the lineItemStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LineItemStatus }
     *     
     */
    public LineItemStatus getLineItemStatus() {
        return lineItemStatus;
    }

    /**
     * Sets the value of the lineItemStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LineItemStatus }
     *     
     */
    public void setLineItemStatus(LineItemStatus value) {
        this.lineItemStatus = value;
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
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setLotType(LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the markInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the markInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMarkInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MarkInformation }
     * 
     * 
     */
    public List<MarkInformation> getMarkInformation() {
        if (markInformation == null) {
            markInformation = new ArrayList<MarkInformation>();
        }
        return this.markInformation;
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
     * Gets the value of the processInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the processInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProcessInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProcessInformation }
     * 
     * 
     */
    public List<ProcessInformation> getProcessInformation() {
        if (processInformation == null) {
            processInformation = new ArrayList<ProcessInformation>();
        }
        return this.processInformation;
    }

    /**
     * Gets the value of the purposeOfMultipleSourceDevices property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeOfMultipleSourceDevices() {
        return purposeOfMultipleSourceDevices;
    }

    /**
     * Sets the value of the purposeOfMultipleSourceDevices property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeOfMultipleSourceDevices(String value) {
        this.purposeOfMultipleSourceDevices = value;
    }

    /**
     * Gets the value of the sourceDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sourceDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSourceDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SourceDevice }
     * 
     * 
     */
    public List<SourceDevice> getSourceDevice() {
        if (sourceDevice == null) {
            sourceDevice = new ArrayList<SourceDevice>();
        }
        return this.sourceDevice;
    }

    /**
     * Gets the value of the specialProcessingInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialProcessingInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialProcessingInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialProcessingInformation }
     * 
     * 
     */
    public List<SpecialProcessingInformation> getSpecialProcessingInformation() {
        if (specialProcessingInformation == null) {
            specialProcessingInformation = new ArrayList<SpecialProcessingInformation>();
        }
        return this.specialProcessingInformation;
    }

    /**
     * Gets the value of the sublineItems property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sublineItems property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSublineItems().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SublineItemsType }
     * 
     * 
     */
    public List<SublineItemsType> getSublineItems() {
        if (sublineItems == null) {
            sublineItems = new ArrayList<SublineItemsType>();
        }
        return this.sublineItems;
    }

    /**
     * Gets the value of the targetDevice property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targetDevice property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargetDevice().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TargetDeviceType }
     * 
     * 
     */
    public List<TargetDeviceType> getTargetDevice() {
        if (targetDevice == null) {
            targetDevice = new ArrayList<TargetDeviceType>();
        }
        return this.targetDevice;
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
