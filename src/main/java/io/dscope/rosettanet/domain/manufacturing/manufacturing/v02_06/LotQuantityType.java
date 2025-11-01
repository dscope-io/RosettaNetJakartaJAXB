
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_03.LotQuantityClassification;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;


/**
 * <p>Java class for LotQuantityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotQuantityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.03}LotQuantityClassification"/&gt;
 *         &lt;element name="Quantity" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
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
@XmlType(name = "LotQuantityType", propOrder = {
    "binNumber",
    "lotQuantityClassification",
    "quantity",
    "unitOfMeasure"
})
public class LotQuantityType {

    @XmlElement(name = "BinNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger binNumber;
    @XmlElementRef(name = "LotQuantityClassification", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.03", type = LotQuantityClassification.class)
    protected LotQuantityClassification lotQuantityClassification;
    @XmlElement(name = "Quantity")
    protected float quantity;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the binNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBinNumber() {
        return binNumber;
    }

    /**
     * Sets the value of the binNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBinNumber(BigInteger value) {
        this.binNumber = value;
    }

    /**
     * Gets the value of the lotQuantityClassification property.
     * 
     * @return
     *     possible object is
     *     {@link LotQuantityClassification }
     *     
     */
    public LotQuantityClassification getLotQuantityClassification() {
        return lotQuantityClassification;
    }

    /**
     * Sets the value of the lotQuantityClassification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotQuantityClassification }
     *     
     */
    public void setLotQuantityClassification(LotQuantityClassification value) {
        this.lotQuantityClassification = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
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
