
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

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
import io.dscope.rosettanet.domain.marketing.codelist.geographicregioncode.v01_02.GeographicRegionCode;
import io.dscope.rosettanet.universal.codelist.country.v01_02.Country;


/**
 * <p>Java class for GeographicRegionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GeographicRegionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Country:xsd:codelist:01.02}Country" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02}GeographicRegionCode" minOccurs="0"/&gt;
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
@XmlType(name = "GeographicRegionType", propOrder = {
    "country",
    "geographicRegionCode"
})
public class GeographicRegionType {

    @XmlElementRef(name = "Country", namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.02", type = Country.class, required = false)
    protected List<Country> country;
    @XmlElementRef(name = "GeographicRegionCode", namespace = "urn:rosettanet:specification:domain:Marketing:GeographicRegionCode:xsd:codelist:01.02", type = GeographicRegionCode.class, required = false)
    protected GeographicRegionCode geographicRegionCode;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the country property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the country property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCountry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Country }
     * 
     * 
     */
    public List<Country> getCountry() {
        if (country == null) {
            country = new ArrayList<Country>();
        }
        return this.country;
    }

    /**
     * Gets the value of the geographicRegionCode property.
     * 
     * @return
     *     possible object is
     *     {@link GeographicRegionCode }
     *     
     */
    public GeographicRegionCode getGeographicRegionCode() {
        return geographicRegionCode;
    }

    /**
     * Sets the value of the geographicRegionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeographicRegionCode }
     *     
     */
    public void setGeographicRegionCode(GeographicRegionCode value) {
        this.geographicRegionCode = value;
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
