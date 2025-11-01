
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.codelist.packagetypecode.v01_01.PackageTypeCode;
import io.dscope.rosettanet.domain.shared.shared.v01_10.DatePeriodAndDuration;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.physicaldimension.v01_05.Linear;


/**
 * <p>Java class for ProductPackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductPackagingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}DatePeriodAndDuration" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.05}Linear" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15}MassPhysicalDimension" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01}PackageTypeCode" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "ProductPackagingType", propOrder = {
    "datePeriodAndDuration",
    "linear",
    "massPhysicalDimension",
    "packageTypeCode",
    "unitOfMeasure"
})
public class ProductPackagingType {

    @XmlElementRef(name = "DatePeriodAndDuration", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = DatePeriodAndDuration.class, required = false)
    protected DatePeriodAndDuration datePeriodAndDuration;
    @XmlElementRef(name = "Linear", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.05", type = Linear.class, required = false)
    protected Linear linear;
    @XmlElementRef(name = "MassPhysicalDimension", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", type = MassPhysicalDimension.class, required = false)
    protected MassPhysicalDimension massPhysicalDimension;
    @XmlElementRef(name = "PackageTypeCode", namespace = "urn:rosettanet:specification:domain:Shared:PackageTypeCode:xsd:codelist:01.01", type = PackageTypeCode.class, required = false)
    protected List<PackageTypeCode> packageTypeCode;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the datePeriodAndDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public DatePeriodAndDuration getDatePeriodAndDuration() {
        return datePeriodAndDuration;
    }

    /**
     * Sets the value of the datePeriodAndDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriodAndDuration }
     *     
     */
    public void setDatePeriodAndDuration(DatePeriodAndDuration value) {
        this.datePeriodAndDuration = value;
    }

    /**
     * Gets the value of the linear property.
     * 
     * @return
     *     possible object is
     *     {@link Linear }
     *     
     */
    public Linear getLinear() {
        return linear;
    }

    /**
     * Sets the value of the linear property.
     * 
     * @param value
     *     allowed object is
     *     {@link Linear }
     *     
     */
    public void setLinear(Linear value) {
        this.linear = value;
    }

    /**
     * Gets the value of the massPhysicalDimension property.
     * 
     * @return
     *     possible object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public MassPhysicalDimension getMassPhysicalDimension() {
        return massPhysicalDimension;
    }

    /**
     * Sets the value of the massPhysicalDimension property.
     * 
     * @param value
     *     allowed object is
     *     {@link MassPhysicalDimension }
     *     
     */
    public void setMassPhysicalDimension(MassPhysicalDimension value) {
        this.massPhysicalDimension = value;
    }

    /**
     * Gets the value of the packageTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageTypeCode }
     * 
     * 
     */
    public List<PackageTypeCode> getPackageTypeCode() {
        if (packageTypeCode == null) {
            packageTypeCode = new ArrayList<PackageTypeCode>();
        }
        return this.packageTypeCode;
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
