
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotTypeType;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.LotQuantity;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.LotIdentification;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;


/**
 * <p>Java class for PreviousLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PreviousLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}LotIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}LotQuantity"/&gt;
 *         &lt;element name="PreviousLotType" type="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotTypeType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
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
@XmlType(name = "PreviousLotType", propOrder = {
    "lotIdentification",
    "lotQuantity",
    "previousLotType",
    "productIdentification"
})
public class PreviousLotType {

    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = LotIdentification.class)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "LotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = LotQuantity.class)
    protected LotQuantity lotQuantity;
    @XmlElement(name = "PreviousLotType")
    protected LotTypeType previousLotType;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
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
     * @return
     *     possible object is
     *     {@link LotQuantity }
     *     
     */
    public LotQuantity getLotQuantity() {
        return lotQuantity;
    }

    /**
     * Sets the value of the lotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotQuantity }
     *     
     */
    public void setLotQuantity(LotQuantity value) {
        this.lotQuantity = value;
    }

    /**
     * Gets the value of the previousLotType property.
     * 
     * @return
     *     possible object is
     *     {@link LotTypeType }
     *     
     */
    public LotTypeType getPreviousLotType() {
        return previousLotType;
    }

    /**
     * Sets the value of the previousLotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotTypeType }
     *     
     */
    public void setPreviousLotType(LotTypeType value) {
        this.previousLotType = value;
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
