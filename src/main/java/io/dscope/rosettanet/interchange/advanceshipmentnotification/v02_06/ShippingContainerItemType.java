
package io.dscope.rosettanet.interchange.advanceshipmentnotification.v02_06;

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
import io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03.NationalExportControlClassification;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.HazardousMaterialDescription;
import io.dscope.rosettanet.domain.logistics.logistics.v02_23.ManufacturerProfile;
import io.dscope.rosettanet.domain.procurement.procurement.v02_30.SpecialHandlingInstruction;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_05.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
import io.dscope.rosettanet.universal.monetaryexpression.v01_07.FinancialAmountType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for ShippingContainerItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShippingContainerItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeviceActivationInformation" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.06}DeviceActivationInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DocumentSubLineLotShipReference" type="{urn:rosettanet:specification:interchange:AdvanceShipmentNotification:xsd:schema:02.06}DocumentSubLineLotShipReferenceType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="FreightAmount" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.07}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element name="HazardousMaterial" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}HazardousMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23}ManufacturerProfile" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03}NationalExportControlClassification" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="NationalHarmonizedTariffSchedule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageCount" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element name="ShippedQuantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30}SpecialHandlingInstruction" minOccurs="0"/&gt;
 *         &lt;element name="TraceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.05}UnitOfMeasure"/&gt;
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
@XmlType(name = "ShippingContainerItemType", propOrder = {
    "businessDocumentReference",
    "deviceActivationInformation",
    "documentSubLineLotShipReference",
    "freightAmount",
    "hazardousMaterial",
    "hazardousMaterialDescription",
    "identifier",
    "manufacturerProfile",
    "nationalExportControlClassification",
    "nationalHarmonizedTariffSchedule",
    "packageCount",
    "productIdentification",
    "shippedQuantity",
    "specialHandlingInstruction",
    "traceIdentifier",
    "unitOfMeasure"
})
public class ShippingContainerItemType {

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "DeviceActivationInformation")
    protected List<DeviceActivationInformationType> deviceActivationInformation;
    @XmlElement(name = "DocumentSubLineLotShipReference", required = true)
    protected List<DocumentSubLineLotShipReferenceType> documentSubLineLotShipReference;
    @XmlElement(name = "FreightAmount")
    protected FinancialAmountType freightAmount;
    @XmlElement(name = "HazardousMaterial")
    protected boolean hazardousMaterial;
    @XmlElementRef(name = "HazardousMaterialDescription", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = HazardousMaterialDescription.class, required = false)
    protected List<HazardousMaterialDescription> hazardousMaterialDescription;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlElementRef(name = "ManufacturerProfile", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", type = ManufacturerProfile.class, required = false)
    protected List<ManufacturerProfile> manufacturerProfile;
    @XmlElementRef(name = "NationalExportControlClassification", namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", type = NationalExportControlClassification.class, required = false)
    protected List<NationalExportControlClassification> nationalExportControlClassification;
    @XmlElement(name = "NationalHarmonizedTariffSchedule")
    protected String nationalHarmonizedTariffSchedule;
    @XmlElement(name = "PackageCount")
    protected Float packageCount;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElement(name = "ShippedQuantity")
    protected float shippedQuantity;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.30", type = SpecialHandlingInstruction.class, required = false)
    protected SpecialHandlingInstruction specialHandlingInstruction;
    @XmlElement(name = "TraceIdentifier")
    protected List<String> traceIdentifier;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.05", type = UnitOfMeasure.class)
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
     * Gets the value of the deviceActivationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deviceActivationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeviceActivationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeviceActivationInformationType }
     * 
     * 
     */
    public List<DeviceActivationInformationType> getDeviceActivationInformation() {
        if (deviceActivationInformation == null) {
            deviceActivationInformation = new ArrayList<DeviceActivationInformationType>();
        }
        return this.deviceActivationInformation;
    }

    /**
     * Gets the value of the documentSubLineLotShipReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentSubLineLotShipReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentSubLineLotShipReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSubLineLotShipReferenceType }
     * 
     * 
     */
    public List<DocumentSubLineLotShipReferenceType> getDocumentSubLineLotShipReference() {
        if (documentSubLineLotShipReference == null) {
            documentSubLineLotShipReference = new ArrayList<DocumentSubLineLotShipReferenceType>();
        }
        return this.documentSubLineLotShipReference;
    }

    /**
     * Gets the value of the freightAmount property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightAmount() {
        return freightAmount;
    }

    /**
     * Sets the value of the freightAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightAmount(FinancialAmountType value) {
        this.freightAmount = value;
    }

    /**
     * Gets the value of the hazardousMaterial property.
     * 
     */
    public boolean isHazardousMaterial() {
        return hazardousMaterial;
    }

    /**
     * Sets the value of the hazardousMaterial property.
     * 
     */
    public void setHazardousMaterial(boolean value) {
        this.hazardousMaterial = value;
    }

    /**
     * Gets the value of the hazardousMaterialDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hazardousMaterialDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHazardousMaterialDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HazardousMaterialDescription }
     * 
     * 
     */
    public List<HazardousMaterialDescription> getHazardousMaterialDescription() {
        if (hazardousMaterialDescription == null) {
            hazardousMaterialDescription = new ArrayList<HazardousMaterialDescription>();
        }
        return this.hazardousMaterialDescription;
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
     * Gets the value of the manufacturerProfile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the manufacturerProfile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManufacturerProfile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManufacturerProfile }
     * 
     * 
     */
    public List<ManufacturerProfile> getManufacturerProfile() {
        if (manufacturerProfile == null) {
            manufacturerProfile = new ArrayList<ManufacturerProfile>();
        }
        return this.manufacturerProfile;
    }

    /**
     * Gets the value of the nationalExportControlClassification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nationalExportControlClassification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNationalExportControlClassification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NationalExportControlClassification }
     * 
     * 
     */
    public List<NationalExportControlClassification> getNationalExportControlClassification() {
        if (nationalExportControlClassification == null) {
            nationalExportControlClassification = new ArrayList<NationalExportControlClassification>();
        }
        return this.nationalExportControlClassification;
    }

    /**
     * Gets the value of the nationalHarmonizedTariffSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalHarmonizedTariffSchedule() {
        return nationalHarmonizedTariffSchedule;
    }

    /**
     * Sets the value of the nationalHarmonizedTariffSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalHarmonizedTariffSchedule(String value) {
        this.nationalHarmonizedTariffSchedule = value;
    }

    /**
     * Gets the value of the packageCount property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getPackageCount() {
        return packageCount;
    }

    /**
     * Sets the value of the packageCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setPackageCount(Float value) {
        this.packageCount = value;
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
     * Gets the value of the shippedQuantity property.
     * 
     */
    public float getShippedQuantity() {
        return shippedQuantity;
    }

    /**
     * Sets the value of the shippedQuantity property.
     * 
     */
    public void setShippedQuantity(float value) {
        this.shippedQuantity = value;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * @return
     *     possible object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public SpecialHandlingInstruction getSpecialHandlingInstruction() {
        return specialHandlingInstruction;
    }

    /**
     * Sets the value of the specialHandlingInstruction property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialHandlingInstruction }
     *     
     */
    public void setSpecialHandlingInstruction(SpecialHandlingInstruction value) {
        this.specialHandlingInstruction = value;
    }

    /**
     * Gets the value of the traceIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the traceIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTraceIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTraceIdentifier() {
        if (traceIdentifier == null) {
            traceIdentifier = new ArrayList<String>();
        }
        return this.traceIdentifier;
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
