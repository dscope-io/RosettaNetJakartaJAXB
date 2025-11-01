
package io.dscope.rosettanet.universal.productidentification.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_00.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_00.Gtin;
import io.dscope.rosettanet.universal.locations.v01_00.AlternativeIdentifier;


/**
 * <p>Java class for ProductIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:1.0}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Revision" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:1.0}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}Gtin"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductIdentificationType", propOrder = {
    "revision",
    "alternativeIdentifier",
    "gtin"
})
public class ProductIdentificationType
    extends IdentifierType
{

    @XmlElement(name = "Revision")
    protected String revision;
    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:1.0", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "Gtin", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", type = Gtin.class, required = false)
    protected Gtin gtin;

    /**
     * Gets the value of the revision property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRevision() {
        return revision;
    }

    /**
     * Sets the value of the revision property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRevision(String value) {
        this.revision = value;
    }

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeIdentifier }
     * 
     * 
     */
    public List<AlternativeIdentifier> getAlternativeIdentifier() {
        if (alternativeIdentifier == null) {
            alternativeIdentifier = new ArrayList<AlternativeIdentifier>();
        }
        return this.alternativeIdentifier;
    }

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link Gtin }
     *     
     */
    public Gtin getGtin() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gtin }
     *     
     */
    public void setGtin(Gtin value) {
        this.gtin = value;
    }

}
