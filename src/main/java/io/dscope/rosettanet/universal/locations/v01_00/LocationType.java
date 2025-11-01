
package io.dscope.rosettanet.universal.locations.v01_00;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_00.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_00.Duns;
import io.dscope.rosettanet.universal.datatype.v01_00.DunsPlus4;


/**
 * <p>Java class for LocationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:1.0}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:1.0}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}Duns"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:1.0}DunsPlus4"/&gt;
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
@XmlType(name = "LocationType", propOrder = {
    "alternativeIdentifier",
    "duns",
    "dunsPlus4"
})
public class LocationType
    extends IdentifierType
{

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:1.0", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "Duns", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", type = Duns.class, required = false)
    protected Duns duns;
    @XmlElementRef(name = "DunsPlus4", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:1.0", type = DunsPlus4 .class, required = false)
    protected DunsPlus4 dunsPlus4;

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
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link Duns }
     *     
     */
    public Duns getDuns() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duns }
     *     
     */
    public void setDuns(Duns value) {
        this.duns = value;
    }

    /**
     * Gets the value of the dunsPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link DunsPlus4 }
     *     
     */
    public DunsPlus4 getDunsPlus4() {
        return dunsPlus4;
    }

    /**
     * Sets the value of the dunsPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DunsPlus4 }
     *     
     */
    public void setDunsPlus4(DunsPlus4 value) {
        this.dunsPlus4 = value;
    }

}
