
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_04;

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
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28.LotQuantity;
import io.dscope.rosettanet.interchange.codelist.lottype.v01_00.LotType;
import io.dscope.rosettanet.universal.codelist.country.v01_02.CountryType;


/**
 * <p>Java class for LotIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CountryOfOrigin" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}CountryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28}LotQuantity" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:LotType:xsd:codelist:01.00}LotType" minOccurs="0"/&gt;
 *         &lt;element name="Primary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Secondary" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "LotIdentificationType", propOrder = {
    "countryOfOrigin",
    "lotQuantity",
    "lotType",
    "primary",
    "secondary"
})
public class LotIdentificationType {

    @XmlElement(name = "CountryOfOrigin")
    protected List<CountryType> countryOfOrigin;
    @XmlElementRef(name = "LotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", type = LotQuantity.class, required = false)
    protected List<LotQuantity> lotQuantity;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:interchange:LotType:xsd:codelist:01.00", type = LotType.class, required = false)
    protected LotType lotType;
    @XmlElement(name = "Primary")
    protected String primary;
    @XmlElement(name = "Secondary")
    protected String secondary;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the countryOfOrigin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the countryOfOrigin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountryOfOrigin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CountryType }
     * 
     * 
     */
    public List<CountryType> getCountryOfOrigin() {
        if (countryOfOrigin == null) {
            countryOfOrigin = new ArrayList<CountryType>();
        }
        return this.countryOfOrigin;
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
     * Gets the value of the primary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimary() {
        return primary;
    }

    /**
     * Sets the value of the primary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimary(String value) {
        this.primary = value;
    }

    /**
     * Gets the value of the secondary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecondary() {
        return secondary;
    }

    /**
     * Sets the value of the secondary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecondary(String value) {
        this.secondary = value;
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
