
package io.dscope.rosettanet.interchange.caseconfirmationnotification.v02_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.service.service.v02_20.ResponsePeriod;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:xsd:schema:02.20}ResponsePeriod" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="AcceptanceCase" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}AcceptanceCaseType"/&gt;
 *           &lt;element name="CloseRejectCase" type="{urn:rosettanet:specification:interchange:CaseConfirmationNotification:xsd:schema:02.02}CloseRejectCaseType"/&gt;
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
@XmlType(name = "ResponseType", propOrder = {
    "responsePeriod",
    "acceptanceCase",
    "closeRejectCase"
})
public class ResponseType {

    @XmlElementRef(name = "ResponsePeriod", namespace = "urn:rosettanet:specification:domain:Service:xsd:schema:02.20", type = ResponsePeriod.class, required = false)
    protected ResponsePeriod responsePeriod;
    @XmlElement(name = "AcceptanceCase")
    protected AcceptanceCaseType acceptanceCase;
    @XmlElement(name = "CloseRejectCase")
    protected CloseRejectCaseType closeRejectCase;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the responsePeriod property.
     * 
     * @return
     *     possible object is
     *     {@link ResponsePeriod }
     *     
     */
    public ResponsePeriod getResponsePeriod() {
        return responsePeriod;
    }

    /**
     * Sets the value of the responsePeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponsePeriod }
     *     
     */
    public void setResponsePeriod(ResponsePeriod value) {
        this.responsePeriod = value;
    }

    /**
     * Gets the value of the acceptanceCase property.
     * 
     * @return
     *     possible object is
     *     {@link AcceptanceCaseType }
     *     
     */
    public AcceptanceCaseType getAcceptanceCase() {
        return acceptanceCase;
    }

    /**
     * Sets the value of the acceptanceCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link AcceptanceCaseType }
     *     
     */
    public void setAcceptanceCase(AcceptanceCaseType value) {
        this.acceptanceCase = value;
    }

    /**
     * Gets the value of the closeRejectCase property.
     * 
     * @return
     *     possible object is
     *     {@link CloseRejectCaseType }
     *     
     */
    public CloseRejectCaseType getCloseRejectCase() {
        return closeRejectCase;
    }

    /**
     * Sets the value of the closeRejectCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CloseRejectCaseType }
     *     
     */
    public void setCloseRejectCase(CloseRejectCaseType value) {
        this.closeRejectCase = value;
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
