
package io.dscope.rosettanet.domain.logistics.logistics.v01_07;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.country.v01_01.Country;


/**
 * <p>Java class for CustomsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.01}Country"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:CustomsType:xsd:codelist:01.02}CustomsType"/&gt;
 *         &lt;element name="EntryNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "CustomsType", propOrder = {
    "country",
    "customsType",
    "entryNumber",
    "identifier"
})
public class CustomsType {

    @XmlElementRef(name = "Country", namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.01", type = Country.class)
    protected Country country;
    @XmlElementRef(name = "CustomsType", namespace = "urn:rosettanet:specification:domain:Logistics:CustomsType:xsd:codelist:01.02", type = io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02.CustomsType.class)
    protected io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02.CustomsType customsType;
    @XmlElement(name = "EntryNumber")
    protected String entryNumber;
    @XmlElement(name = "Identifier")
    protected String identifier;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link Country }
     *     
     */
    public Country getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link Country }
     *     
     */
    public void setCountry(Country value) {
        this.country = value;
    }

    /**
     * Gets the value of the customsType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02.CustomsType }
     *     
     */
    public io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02.CustomsType getCustomsType() {
        return customsType;
    }

    /**
     * Sets the value of the customsType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02.CustomsType }
     *     
     */
    public void setCustomsType(io.dscope.rosettanet.domain.logistics.codelist.customstype.v01_02.CustomsType value) {
        this.customsType = value;
    }

    /**
     * Gets the value of the entryNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryNumber() {
        return entryNumber;
    }

    /**
     * Sets the value of the entryNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryNumber(String value) {
        this.entryNumber = value;
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
