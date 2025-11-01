
package io.dscope.rosettanet.domain.logistics.logistics.v01_00;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.universal.partneridentification.v01_00.SpecifiedPartnerDescription;


/**
 * <p>Java class for ProofOfDeliveryInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProofOfDeliveryInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0}SpecifiedPartnerDescription"/&gt;
 *         &lt;element name="TotalContainer" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
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
@XmlType(name = "ProofOfDeliveryInformationType", propOrder = {
    "specifiedPartnerDescription",
    "totalContainer"
})
public class ProofOfDeliveryInformationType {

    @XmlElementRef(name = "SpecifiedPartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:1.0", type = SpecifiedPartnerDescription.class)
    protected SpecifiedPartnerDescription specifiedPartnerDescription;
    @XmlElement(name = "TotalContainer")
    protected BigInteger totalContainer;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the specifiedPartnerDescription property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescription }
     *     
     */
    public SpecifiedPartnerDescription getSpecifiedPartnerDescription() {
        return specifiedPartnerDescription;
    }

    /**
     * Sets the value of the specifiedPartnerDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescription }
     *     
     */
    public void setSpecifiedPartnerDescription(SpecifiedPartnerDescription value) {
        this.specifiedPartnerDescription = value;
    }

    /**
     * Gets the value of the totalContainer property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalContainer() {
        return totalContainer;
    }

    /**
     * Sets the value of the totalContainer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalContainer(BigInteger value) {
        this.totalContainer = value;
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
