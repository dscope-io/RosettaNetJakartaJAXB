
package io.dscope.rosettanet.domain.marketing.marketing.v02_19;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for RegistrationRenewableStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationRenewableStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}IsRegistrationRenewable"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19}RegistrationRenewableDate" minOccurs="0"/&gt;
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
@XmlType(name = "RegistrationRenewableStatusType", propOrder = {
    "isRegistrationRenewable",
    "registrationRenewableDate"
})
public class RegistrationRenewableStatusType {

    @XmlElementRef(name = "IsRegistrationRenewable", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = IsRegistrationRenewable.class)
    protected IsRegistrationRenewable isRegistrationRenewable;
    @XmlElementRef(name = "RegistrationRenewableDate", namespace = "urn:rosettanet:specification:domain:Marketing:xsd:schema:02.19", type = RegistrationRenewableDate.class, required = false)
    protected RegistrationRenewableDate registrationRenewableDate;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the isRegistrationRenewable property.
     * 
     * @return
     *     possible object is
     *     {@link IsRegistrationRenewable }
     *     
     */
    public IsRegistrationRenewable getIsRegistrationRenewable() {
        return isRegistrationRenewable;
    }

    /**
     * Sets the value of the isRegistrationRenewable property.
     * 
     * @param value
     *     allowed object is
     *     {@link IsRegistrationRenewable }
     *     
     */
    public void setIsRegistrationRenewable(IsRegistrationRenewable value) {
        this.isRegistrationRenewable = value;
    }

    /**
     * Gets the value of the registrationRenewableDate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationRenewableDate }
     *     
     */
    public RegistrationRenewableDate getRegistrationRenewableDate() {
        return registrationRenewableDate;
    }

    /**
     * Sets the value of the registrationRenewableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationRenewableDate }
     *     
     */
    public void setRegistrationRenewableDate(RegistrationRenewableDate value) {
        this.registrationRenewableDate = value;
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
