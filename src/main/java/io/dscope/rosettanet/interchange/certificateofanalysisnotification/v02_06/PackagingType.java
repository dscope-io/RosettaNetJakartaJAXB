
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_06;

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
import io.dscope.rosettanet.universal.physicaldimension.v01_07.MeasureType;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.Volume;
import io.dscope.rosettanet.universal.physicaldimension.v01_07.Weight;


/**
 * <p>Java class for PackagingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackagingType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BackFillGas" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChemicalFormula" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Container" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}ContainerType" minOccurs="0"/&gt;
 *         &lt;element name="Pressure" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}MeasureType" minOccurs="0"/&gt;
 *         &lt;element name="Valve" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.06}ValveType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}Volume" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07}Weight" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "PackagingType", propOrder = {
    "backFillGas",
    "chemicalFormula",
    "container",
    "pressure",
    "valve",
    "volume",
    "weight"
})
public class PackagingType {

    @XmlElement(name = "BackFillGas")
    protected String backFillGas;
    @XmlElement(name = "ChemicalFormula")
    protected String chemicalFormula;
    @XmlElement(name = "Container")
    protected ContainerType container;
    @XmlElement(name = "Pressure")
    protected MeasureType pressure;
    @XmlElement(name = "Valve")
    protected ValveType valve;
    @XmlElementRef(name = "Volume", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", type = Volume.class, required = false)
    protected Volume volume;
    @XmlElementRef(name = "Weight", namespace = "urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.07", type = Weight.class, required = false)
    protected List<Weight> weight;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the backFillGas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackFillGas() {
        return backFillGas;
    }

    /**
     * Sets the value of the backFillGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackFillGas(String value) {
        this.backFillGas = value;
    }

    /**
     * Gets the value of the chemicalFormula property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChemicalFormula() {
        return chemicalFormula;
    }

    /**
     * Sets the value of the chemicalFormula property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChemicalFormula(String value) {
        this.chemicalFormula = value;
    }

    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link ContainerType }
     *     
     */
    public ContainerType getContainer() {
        return container;
    }

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContainerType }
     *     
     */
    public void setContainer(ContainerType value) {
        this.container = value;
    }

    /**
     * Gets the value of the pressure property.
     * 
     * @return
     *     possible object is
     *     {@link MeasureType }
     *     
     */
    public MeasureType getPressure() {
        return pressure;
    }

    /**
     * Sets the value of the pressure property.
     * 
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *     
     */
    public void setPressure(MeasureType value) {
        this.pressure = value;
    }

    /**
     * Gets the value of the valve property.
     * 
     * @return
     *     possible object is
     *     {@link ValveType }
     *     
     */
    public ValveType getValve() {
        return valve;
    }

    /**
     * Sets the value of the valve property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValveType }
     *     
     */
    public void setValve(ValveType value) {
        this.valve = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * @return
     *     possible object is
     *     {@link Volume }
     *     
     */
    public Volume getVolume() {
        return volume;
    }

    /**
     * Sets the value of the volume property.
     * 
     * @param value
     *     allowed object is
     *     {@link Volume }
     *     
     */
    public void setVolume(Volume value) {
        this.volume = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Weight }
     * 
     * 
     */
    public List<Weight> getWeight() {
        if (weight == null) {
            weight = new ArrayList<Weight>();
        }
        return this.weight;
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
