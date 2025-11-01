
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_04.WaferBackSideFinish;
import io.dscope.rosettanet.domain.manufacturing.codelist.waferpassivation.v01_04.WaferPassivation;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_04.UnitOfMeasureType;


/**
 * <p>Java class for WaferBacksideInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WaferBacksideInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsWaferBackGrind" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="WaferBackGrindFinalThickness" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/&gt;
 *         &lt;element name="WaferBackGrindFinalThicknessUOM" type="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.04}UnitOfMeasureType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.04}WaferBackSideFinish" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WaferPassivation:xsd:codelist:01.04}WaferPassivation" minOccurs="0"/&gt;
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
@XmlType(name = "WaferBacksideInformationType", propOrder = {
    "isWaferBackGrind",
    "waferBackGrindFinalThickness",
    "waferBackGrindFinalThicknessUOM",
    "waferBackSideFinish",
    "waferPassivation"
})
public class WaferBacksideInformationType {

    @XmlElement(name = "IsWaferBackGrind")
    protected Boolean isWaferBackGrind;
    @XmlElement(name = "WaferBackGrindFinalThickness")
    protected Float waferBackGrindFinalThickness;
    @XmlElement(name = "WaferBackGrindFinalThicknessUOM")
    protected UnitOfMeasureType waferBackGrindFinalThicknessUOM;
    @XmlElementRef(name = "WaferBackSideFinish", namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferBackSideFinish:xsd:codelist:01.04", type = WaferBackSideFinish.class, required = false)
    protected WaferBackSideFinish waferBackSideFinish;
    @XmlElementRef(name = "WaferPassivation", namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferPassivation:xsd:codelist:01.04", type = WaferPassivation.class, required = false)
    protected WaferPassivation waferPassivation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isWaferBackGrind property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsWaferBackGrind() {
        return isWaferBackGrind;
    }

    /**
     * Sets the value of the isWaferBackGrind property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsWaferBackGrind(Boolean value) {
        this.isWaferBackGrind = value;
    }

    /**
     * Gets the value of the waferBackGrindFinalThickness property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getWaferBackGrindFinalThickness() {
        return waferBackGrindFinalThickness;
    }

    /**
     * Sets the value of the waferBackGrindFinalThickness property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setWaferBackGrindFinalThickness(Float value) {
        this.waferBackGrindFinalThickness = value;
    }

    /**
     * Gets the value of the waferBackGrindFinalThicknessUOM property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public UnitOfMeasureType getWaferBackGrindFinalThicknessUOM() {
        return waferBackGrindFinalThicknessUOM;
    }

    /**
     * Sets the value of the waferBackGrindFinalThicknessUOM property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasureType }
     *     
     */
    public void setWaferBackGrindFinalThicknessUOM(UnitOfMeasureType value) {
        this.waferBackGrindFinalThicknessUOM = value;
    }

    /**
     * Gets the value of the waferBackSideFinish property.
     * 
     * @return
     *     possible object is
     *     {@link WaferBackSideFinish }
     *     
     */
    public WaferBackSideFinish getWaferBackSideFinish() {
        return waferBackSideFinish;
    }

    /**
     * Sets the value of the waferBackSideFinish property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferBackSideFinish }
     *     
     */
    public void setWaferBackSideFinish(WaferBackSideFinish value) {
        this.waferBackSideFinish = value;
    }

    /**
     * Gets the value of the waferPassivation property.
     * 
     * @return
     *     possible object is
     *     {@link WaferPassivation }
     *     
     */
    public WaferPassivation getWaferPassivation() {
        return waferPassivation;
    }

    /**
     * Sets the value of the waferPassivation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferPassivation }
     *     
     */
    public void setWaferPassivation(WaferPassivation value) {
        this.waferPassivation = value;
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
