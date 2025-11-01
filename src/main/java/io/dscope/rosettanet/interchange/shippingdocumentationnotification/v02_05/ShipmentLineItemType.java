
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_05;

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
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.CustomsPermittedInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.ExportLicense;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.FreightValuation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.Handbook;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.HarmonizedTariffScheduleInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.HazardousMaterialDescription;
import io.dscope.rosettanet.domain.logistics.logistics.v02_17.IsHazardousMaterial;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.RequestingOrderLineItemReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.TaxExemptStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_12.QuantityInformation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.productidentification.v01_04.TextualDescriptionType;


/**
 * <p>Java class for ShipmentLineItemType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentLineItemType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}CustomsPermittedInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}ExportLicense" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}FreightValuation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}Handbook" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}HarmonizedTariffScheduleInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}HazardousMaterialDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17}IsHazardousMaterial" minOccurs="0"/&gt;
 *         &lt;element name="LineNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PricingInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}PricingInformationType" minOccurs="0"/&gt;
 *         &lt;element name="ProductDescription" type="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}TextualDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="ProductIdentificationInformation" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ProductIdentificationInformationType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}QuantityInformation"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}RequestingOrderLineItemReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ShippingContainer" type="{urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.05}ShippingContainerType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}TaxExemptStatus" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure"/&gt;
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
@XmlType(name = "ShipmentLineItemType", propOrder = {
    "customsPermittedInformation",
    "exportLicense",
    "freightValuation",
    "handbook",
    "harmonizedTariffScheduleInformation",
    "hazardousMaterialDescription",
    "isHazardousMaterial",
    "lineNumber",
    "pricingInformation",
    "productDescription",
    "productIdentificationInformation",
    "quantityInformation",
    "requestingOrderLineItemReference",
    "shippingContainer",
    "taxExemptStatus",
    "unitOfMeasure"
})
public class ShipmentLineItemType {

    @XmlElementRef(name = "CustomsPermittedInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = CustomsPermittedInformation.class, required = false)
    protected List<CustomsPermittedInformation> customsPermittedInformation;
    @XmlElementRef(name = "ExportLicense", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = ExportLicense.class, required = false)
    protected ExportLicense exportLicense;
    @XmlElementRef(name = "FreightValuation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = FreightValuation.class, required = false)
    protected FreightValuation freightValuation;
    @XmlElementRef(name = "Handbook", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = Handbook.class, required = false)
    protected List<Handbook> handbook;
    @XmlElementRef(name = "HarmonizedTariffScheduleInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = HarmonizedTariffScheduleInformation.class, required = false)
    protected List<HarmonizedTariffScheduleInformation> harmonizedTariffScheduleInformation;
    @XmlElementRef(name = "HazardousMaterialDescription", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = HazardousMaterialDescription.class, required = false)
    protected List<HazardousMaterialDescription> hazardousMaterialDescription;
    @XmlElementRef(name = "IsHazardousMaterial", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.17", type = IsHazardousMaterial.class, required = false)
    protected IsHazardousMaterial isHazardousMaterial;
    @XmlElement(name = "LineNumber", required = true)
    protected String lineNumber;
    @XmlElement(name = "PricingInformation")
    protected PricingInformationType pricingInformation;
    @XmlElement(name = "ProductDescription")
    protected TextualDescriptionType productDescription;
    @XmlElement(name = "ProductIdentificationInformation", required = true)
    protected ProductIdentificationInformationType productIdentificationInformation;
    @XmlElementRef(name = "QuantityInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.12", type = QuantityInformation.class)
    protected QuantityInformation quantityInformation;
    @XmlElementRef(name = "RequestingOrderLineItemReference", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = RequestingOrderLineItemReference.class, required = false)
    protected List<RequestingOrderLineItemReference> requestingOrderLineItemReference;
    @XmlElement(name = "ShippingContainer")
    protected List<ShippingContainerType> shippingContainer;
    @XmlElementRef(name = "TaxExemptStatus", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = TaxExemptStatus.class, required = false)
    protected TaxExemptStatus taxExemptStatus;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customsPermittedInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsPermittedInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsPermittedInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomsPermittedInformation }
     * 
     * 
     */
    public List<CustomsPermittedInformation> getCustomsPermittedInformation() {
        if (customsPermittedInformation == null) {
            customsPermittedInformation = new ArrayList<CustomsPermittedInformation>();
        }
        return this.customsPermittedInformation;
    }

    /**
     * Gets the value of the exportLicense property.
     * 
     * @return
     *     possible object is
     *     {@link ExportLicense }
     *     
     */
    public ExportLicense getExportLicense() {
        return exportLicense;
    }

    /**
     * Sets the value of the exportLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExportLicense }
     *     
     */
    public void setExportLicense(ExportLicense value) {
        this.exportLicense = value;
    }

    /**
     * Gets the value of the freightValuation property.
     * 
     * @return
     *     possible object is
     *     {@link FreightValuation }
     *     
     */
    public FreightValuation getFreightValuation() {
        return freightValuation;
    }

    /**
     * Sets the value of the freightValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightValuation }
     *     
     */
    public void setFreightValuation(FreightValuation value) {
        this.freightValuation = value;
    }

    /**
     * Gets the value of the handbook property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the handbook property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHandbook().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Handbook }
     * 
     * 
     */
    public List<Handbook> getHandbook() {
        if (handbook == null) {
            handbook = new ArrayList<Handbook>();
        }
        return this.handbook;
    }

    /**
     * Gets the value of the harmonizedTariffScheduleInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the harmonizedTariffScheduleInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHarmonizedTariffScheduleInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HarmonizedTariffScheduleInformation }
     * 
     * 
     */
    public List<HarmonizedTariffScheduleInformation> getHarmonizedTariffScheduleInformation() {
        if (harmonizedTariffScheduleInformation == null) {
            harmonizedTariffScheduleInformation = new ArrayList<HarmonizedTariffScheduleInformation>();
        }
        return this.harmonizedTariffScheduleInformation;
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
     * Gets the value of the isHazardousMaterial property.
     * 
     * @return
     *     possible object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public IsHazardousMaterial getIsHazardousMaterial() {
        return isHazardousMaterial;
    }

    /**
     * Sets the value of the isHazardousMaterial property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsHazardousMaterial }
     *     
     */
    public void setIsHazardousMaterial(IsHazardousMaterial value) {
        this.isHazardousMaterial = value;
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
     * Gets the value of the pricingInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PricingInformationType }
     *     
     */
    public PricingInformationType getPricingInformation() {
        return pricingInformation;
    }

    /**
     * Sets the value of the pricingInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PricingInformationType }
     *     
     */
    public void setPricingInformation(PricingInformationType value) {
        this.pricingInformation = value;
    }

    /**
     * Gets the value of the productDescription property.
     * 
     * @return
     *     possible object is
     *     {@link TextualDescriptionType }
     *     
     */
    public TextualDescriptionType getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextualDescriptionType }
     *     
     */
    public void setProductDescription(TextualDescriptionType value) {
        this.productDescription = value;
    }

    /**
     * Gets the value of the productIdentificationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentificationInformationType }
     *     
     */
    public ProductIdentificationInformationType getProductIdentificationInformation() {
        return productIdentificationInformation;
    }

    /**
     * Sets the value of the productIdentificationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentificationInformationType }
     *     
     */
    public void setProductIdentificationInformation(ProductIdentificationInformationType value) {
        this.productIdentificationInformation = value;
    }

    /**
     * Gets the value of the quantityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityInformation }
     *     
     */
    public QuantityInformation getQuantityInformation() {
        return quantityInformation;
    }

    /**
     * Sets the value of the quantityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityInformation }
     *     
     */
    public void setQuantityInformation(QuantityInformation value) {
        this.quantityInformation = value;
    }

    /**
     * Gets the value of the requestingOrderLineItemReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requestingOrderLineItemReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequestingOrderLineItemReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RequestingOrderLineItemReference }
     * 
     * 
     */
    public List<RequestingOrderLineItemReference> getRequestingOrderLineItemReference() {
        if (requestingOrderLineItemReference == null) {
            requestingOrderLineItemReference = new ArrayList<RequestingOrderLineItemReference>();
        }
        return this.requestingOrderLineItemReference;
    }

    /**
     * Gets the value of the shippingContainer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shippingContainer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShippingContainer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShippingContainerType }
     * 
     * 
     */
    public List<ShippingContainerType> getShippingContainer() {
        if (shippingContainer == null) {
            shippingContainer = new ArrayList<ShippingContainerType>();
        }
        return this.shippingContainer;
    }

    /**
     * Gets the value of the taxExemptStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TaxExemptStatus }
     *     
     */
    public TaxExemptStatus getTaxExemptStatus() {
        return taxExemptStatus;
    }

    /**
     * Sets the value of the taxExemptStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxExemptStatus }
     *     
     */
    public void setTaxExemptStatus(TaxExemptStatus value) {
        this.taxExemptStatus = value;
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
