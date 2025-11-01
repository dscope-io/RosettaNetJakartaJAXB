
package io.dscope.rosettanet.domain.design.design.v02_19;

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
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;


/**
 * <p>Java class for SubstanceIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubstanceIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:02.19}CAS"/&gt;
 *         &lt;/choice&gt;
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
@XmlType(name = "SubstanceIdentificationType", propOrder = {
    "alternativeIdentifier",
    "cas"
})
public class SubstanceIdentificationType {

    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "CAS", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:02.19", type = CAS.class, required = false)
    protected CAS cas;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

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
     * Gets the value of the cas property.
     * 
     * @return
     *     possible object is
     *     {@link CAS }
     *     
     */
    public CAS getCAS() {
        return cas;
    }

    /**
     * Sets the value of the cas property.
     * 
     * @param value
     *     allowed object is
     *     {@link CAS }
     *     
     */
    public void setCAS(CAS value) {
        this.cas = value;
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
