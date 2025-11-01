
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.locations.v01_04.PhysicalAddressType;


/**
 * <p>Java class for MapReferenceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MapReferenceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}PhysicalAddressType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reference1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Reference2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MapReferenceType", propOrder = {
    "description",
    "identifier",
    "reference1",
    "reference2"
})
public class MapReferenceType
    extends PhysicalAddressType
{

    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Reference1", required = true)
    protected String reference1;
    @XmlElement(name = "Reference2")
    protected String reference2;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     * Gets the value of the reference1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference1() {
        return reference1;
    }

    /**
     * Sets the value of the reference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference1(String value) {
        this.reference1 = value;
    }

    /**
     * Gets the value of the reference2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference2() {
        return reference2;
    }

    /**
     * Sets the value of the reference2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference2(String value) {
        this.reference2 = value;
    }

}
