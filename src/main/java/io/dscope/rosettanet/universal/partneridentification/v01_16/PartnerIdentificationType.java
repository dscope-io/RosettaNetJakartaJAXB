
package io.dscope.rosettanet.universal.partneridentification.v01_16;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_02.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_04.DUNS;
import io.dscope.rosettanet.universal.datatype.v01_04.DUNSPlus4;
import io.dscope.rosettanet.universal.datatype.v01_04.GLN;
import io.dscope.rosettanet.universal.locations.v01_04.AlternativeIdentifier;


/**
 * <p>Java class for PartnerIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.02}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.04}AlternativeIdentifier"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNS"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}DUNSPlus4"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.04}GLN"/&gt;
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
@XmlType(name = "PartnerIdentificationType", propOrder = {
    "partnerName",
    "alternativeIdentifier",
    "duns",
    "dunsPlus4",
    "gln"
})
public class PartnerIdentificationType
    extends IdentifierType
{

    @XmlElement(name = "PartnerName")
    protected String partnerName;
    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", type = AlternativeIdentifier.class, required = false)
    protected AlternativeIdentifier alternativeIdentifier;
    @XmlElementRef(name = "DUNS", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = DUNS.class, required = false)
    protected DUNS duns;
    @XmlElementRef(name = "DUNSPlus4", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = DUNSPlus4 .class, required = false)
    protected DUNSPlus4 dunsPlus4;
    @XmlElementRef(name = "GLN", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.04", type = GLN.class, required = false)
    protected GLN gln;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public AlternativeIdentifier getAlternativeIdentifier() {
        return alternativeIdentifier;
    }

    /**
     * Sets the value of the alternativeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlternativeIdentifier }
     *     
     */
    public void setAlternativeIdentifier(AlternativeIdentifier value) {
        this.alternativeIdentifier = value;
    }

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link DUNS }
     *     
     */
    public DUNS getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNS }
     *     
     */
    public void setDUNS(DUNS value) {
        this.duns = value;
    }

    /**
     * Gets the value of the dunsPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSPlus4 }
     *     
     */
    public DUNSPlus4 getDUNSPlus4() {
        return dunsPlus4;
    }

    /**
     * Sets the value of the dunsPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSPlus4 }
     *     
     */
    public void setDUNSPlus4(DUNSPlus4 value) {
        this.dunsPlus4 = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link GLN }
     *     
     */
    public GLN getGLN() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLN }
     *     
     */
    public void setGLN(GLN value) {
        this.gln = value;
    }

}
