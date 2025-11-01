
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_03.LotStatus;
import io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04.Priority;
import io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04.QualityStatus;
import io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_03.WorkInProcessLocation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.LotQuantity;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.OrderReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.LotIdentification;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for LotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}LotIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}LotQuantity" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LotShipment" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}LotShipmentType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:01.03}LotStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType"/&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}OrderReference"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreviousLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}PreviousLotType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04}QualityStatus" minOccurs="0"/&gt;
 *         &lt;element name="SubLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}SubLotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransferManufacturingTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TransferToManufacturingLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03}WorkInProcessLocation"/&gt;
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
@XmlType(name = "LotType", propOrder = {
    "lotIdentification",
    "lotQuantity",
    "lotShipment",
    "lotStatus",
    "lotType",
    "manufacturingDateCode",
    "orderReference",
    "partInformation",
    "previousLot",
    "priority",
    "productIdentification",
    "qualityStatus",
    "subLot",
    "transferManufacturingTo",
    "transferToManufacturingLine",
    "workInProcessLocation"
})
public class LotType {

    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = LotIdentification.class)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "LotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = LotQuantity.class)
    protected List<LotQuantity> lotQuantity;
    @XmlElement(name = "LotShipment")
    protected LotShipmentType lotShipment;
    @XmlElementRef(name = "LotStatus", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:01.03", type = LotStatus.class)
    protected LotStatus lotStatus;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType.class)
    protected io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType lotType;
    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlElementRef(name = "OrderReference", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = OrderReference.class)
    protected OrderReference orderReference;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElement(name = "PreviousLot")
    protected PreviousLotType previousLot;
    @XmlElementRef(name = "Priority", namespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", type = Priority.class, required = false)
    protected Priority priority;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "QualityStatus", namespace = "urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04", type = QualityStatus.class, required = false)
    protected QualityStatus qualityStatus;
    @XmlElement(name = "SubLot")
    protected List<SubLotType> subLot;
    @XmlElement(name = "TransferManufacturingTo")
    protected SpecifiedPartnerDescriptionType transferManufacturingTo;
    @XmlElement(name = "TransferToManufacturingLine")
    protected String transferToManufacturingLine;
    @XmlElementRef(name = "WorkInProcessLocation", namespace = "urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03", type = WorkInProcessLocation.class)
    protected WorkInProcessLocation workInProcessLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the lotQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotQuantity }
     * 
     * 
     */
    public List<LotQuantity> getLotQuantity() {
        if (lotQuantity == null) {
            lotQuantity = new ArrayList<LotQuantity>();
        }
        return this.lotQuantity;
    }

    /**
     * Gets the value of the lotShipment property.
     * 
     * @return
     *     possible object is
     *     {@link LotShipmentType }
     *     
     */
    public LotShipmentType getLotShipment() {
        return lotShipment;
    }

    /**
     * Sets the value of the lotShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotShipmentType }
     *     
     */
    public void setLotShipment(LotShipmentType value) {
        this.lotShipment = value;
    }

    /**
     * Gets the value of the lotStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LotStatus }
     *     
     */
    public LotStatus getLotStatus() {
        return lotStatus;
    }

    /**
     * Sets the value of the lotStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotStatus }
     *     
     */
    public void setLotStatus(LotStatus value) {
        this.lotStatus = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public void setLotType(io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReference }
     *     
     */
    public OrderReference getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReference }
     *     
     */
    public void setOrderReference(OrderReference value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the previousLot property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousLotType }
     *     
     */
    public PreviousLotType getPreviousLot() {
        return previousLot;
    }

    /**
     * Sets the value of the previousLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousLotType }
     *     
     */
    public void setPreviousLot(PreviousLotType value) {
        this.previousLot = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
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
     * Gets the value of the qualityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QualityStatus }
     *     
     */
    public QualityStatus getQualityStatus() {
        return qualityStatus;
    }

    /**
     * Sets the value of the qualityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityStatus }
     *     
     */
    public void setQualityStatus(QualityStatus value) {
        this.qualityStatus = value;
    }

    /**
     * Gets the value of the subLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubLotType }
     * 
     * 
     */
    public List<SubLotType> getSubLot() {
        if (subLot == null) {
            subLot = new ArrayList<SubLotType>();
        }
        return this.subLot;
    }

    /**
     * Gets the value of the transferManufacturingTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransferManufacturingTo() {
        return transferManufacturingTo;
    }

    /**
     * Sets the value of the transferManufacturingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransferManufacturingTo(SpecifiedPartnerDescriptionType value) {
        this.transferManufacturingTo = value;
    }

    /**
     * Gets the value of the transferToManufacturingLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToManufacturingLine() {
        return transferToManufacturingLine;
    }

    /**
     * Sets the value of the transferToManufacturingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToManufacturingLine(String value) {
        this.transferToManufacturingLine = value;
    }

    /**
     * Gets the value of the workInProcessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public WorkInProcessLocation getWorkInProcessLocation() {
        return workInProcessLocation;
    }

    /**
     * Sets the value of the workInProcessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public void setWorkInProcessLocation(WorkInProcessLocation value) {
        this.workInProcessLocation = value;
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
