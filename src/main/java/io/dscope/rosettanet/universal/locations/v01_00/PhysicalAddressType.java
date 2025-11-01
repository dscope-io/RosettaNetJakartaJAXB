
package io.dscope.rosettanet.universal.locations.v01_00;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.codelist.country.v01_00.CountryType;
import io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_00.CountrySubdivisionType;


/**
 * <p>Java class for PhysicalAddressType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PhysicalAddressType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AddressLine1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Country" type="{urn:rosettanet:specification:universal:Country:xsd:codelist:1.0}CountryType"/&gt;
 *         &lt;element name="CountrySubdivision" type="{urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:1.0}CountrySubdivisionType" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PostOfficeBox" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "PhysicalAddressType", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "cityName",
    "country",
    "countrySubdivision",
    "postalCode",
    "postOfficeBox"
})
public class PhysicalAddressType {

    @XmlElement(name = "AddressLine1", required = true)
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AddressLine4")
    protected String addressLine4;
    @XmlElement(name = "AddressLine5")
    protected String addressLine5;
    @XmlElement(name = "CityName", required = true)
    protected String cityName;
    @XmlElement(name = "Country", required = true)
    protected CountryType country;
    @XmlElement(name = "CountrySubdivision")
    protected CountrySubdivisionType countrySubdivision;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "PostOfficeBox")
    protected String postOfficeBox;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the addressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the addressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * Sets the value of the addressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * Gets the value of the addressLine5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * Sets the value of the addressLine5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * Gets the value of the cityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link CountryType }
     *     
     */
    public CountryType getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType }
     *     
     */
    public void setCountry(CountryType value) {
        this.country = value;
    }

    /**
     * Gets the value of the countrySubdivision property.
     * 
     * @return
     *     possible object is
     *     {@link CountrySubdivisionType }
     *     
     */
    public CountrySubdivisionType getCountrySubdivision() {
        return countrySubdivision;
    }

    /**
     * Sets the value of the countrySubdivision property.
     * 
     * @param value
     *     allowed object is
     *     {@link CountrySubdivisionType }
     *     
     */
    public void setCountrySubdivision(CountrySubdivisionType value) {
        this.countrySubdivision = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the postOfficeBox property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostOfficeBox() {
        return postOfficeBox;
    }

    /**
     * Sets the value of the postOfficeBox property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostOfficeBox(String value) {
        this.postOfficeBox = value;
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
