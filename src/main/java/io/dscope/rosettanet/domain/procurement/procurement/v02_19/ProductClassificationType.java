
package io.dscope.rosettanet.domain.procurement.procurement.v02_19;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_02.IdentifierType;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;


/**
 * <p>Java class for ProductClassificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductClassificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.02}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}UNSPSC"/&gt;
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
@XmlType(name = "ProductClassificationType", propOrder = {
    "alternativeIdentifier",
    "unspsc"
})
public class ProductClassificationType
    extends IdentifierType
{

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "UNSPSC", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = UNSPSC.class, required = false)
    protected UNSPSC unspsc;

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
     * Gets the value of the unspsc property.
     * 
     * @return
     *     possible object is
     *     {@link UNSPSC }
     *     
     */
    public UNSPSC getUNSPSC() {
        return unspsc;
    }

    /**
     * Sets the value of the unspsc property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNSPSC }
     *     
     */
    public void setUNSPSC(UNSPSC value) {
        this.unspsc = value;
    }

}
