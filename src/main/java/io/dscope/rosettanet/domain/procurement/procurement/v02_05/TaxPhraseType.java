
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for TaxPhraseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxPhraseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsTaxTriangulationApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Phrase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
@XmlType(name = "TaxPhraseType", propOrder = {
    "isTaxTriangulationApplicable",
    "phrase"
})
public class TaxPhraseType {

    @XmlElement(name = "IsTaxTriangulationApplicable")
    protected boolean isTaxTriangulationApplicable;
    @XmlElement(name = "Phrase", required = true)
    protected String phrase;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isTaxTriangulationApplicable property.
     * 
     */
    public boolean isIsTaxTriangulationApplicable() {
        return isTaxTriangulationApplicable;
    }

    /**
     * Sets the value of the isTaxTriangulationApplicable property.
     * 
     */
    public void setIsTaxTriangulationApplicable(boolean value) {
        this.isTaxTriangulationApplicable = value;
    }

    /**
     * Gets the value of the phrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhrase() {
        return phrase;
    }

    /**
     * Sets the value of the phrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhrase(String value) {
        this.phrase = value;
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
