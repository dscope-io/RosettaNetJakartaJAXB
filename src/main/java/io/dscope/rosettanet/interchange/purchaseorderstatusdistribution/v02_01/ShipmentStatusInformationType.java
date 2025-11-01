
package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.ProofOfDeliveryInformation;
import io.dscope.rosettanet.domain.logistics.logistics.v02_22.TrackingReference;


/**
 * <p>Java class for ShipmentStatusInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShipmentStatusInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}ProofOfDeliveryInformation" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22}TrackingReference"/&gt;
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
@XmlType(name = "ShipmentStatusInformationType", propOrder = {
    "proofOfDeliveryInformation",
    "trackingReference"
})
public class ShipmentStatusInformationType {

    @XmlElementRef(name = "ProofOfDeliveryInformation", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = ProofOfDeliveryInformation.class, required = false)
    protected ProofOfDeliveryInformation proofOfDeliveryInformation;
    @XmlElementRef(name = "TrackingReference", namespace = "urn:rosettanet:specification:domain:Logistics:xsd:schema:02.22", type = TrackingReference.class)
    protected TrackingReference trackingReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the proofOfDeliveryInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ProofOfDeliveryInformation }
     *     
     */
    public ProofOfDeliveryInformation getProofOfDeliveryInformation() {
        return proofOfDeliveryInformation;
    }

    /**
     * Sets the value of the proofOfDeliveryInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProofOfDeliveryInformation }
     *     
     */
    public void setProofOfDeliveryInformation(ProofOfDeliveryInformation value) {
        this.proofOfDeliveryInformation = value;
    }

    /**
     * Gets the value of the trackingReference property.
     * 
     * @return
     *     possible object is
     *     {@link TrackingReference }
     *     
     */
    public TrackingReference getTrackingReference() {
        return trackingReference;
    }

    /**
     * Sets the value of the trackingReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrackingReference }
     *     
     */
    public void setTrackingReference(TrackingReference value) {
        this.trackingReference = value;
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
