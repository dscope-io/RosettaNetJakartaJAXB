
package io.dscope.rosettanet.universal.partneridentification.v01_16;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_11.ProcessRoleIdentifier;


/**
 * <p>Java class for FullPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}SpecifiedFullPartnerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.11}ProcessRoleIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullPartnerType", propOrder = {
    "processRoleIdentifier"
})
public class FullPartnerType
    extends SpecifiedFullPartnerType
{

    @XmlElementRef(name = "ProcessRoleIdentifier", namespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.11", type = ProcessRoleIdentifier.class)
    protected ProcessRoleIdentifier processRoleIdentifier;

    /**
     * Gets the value of the processRoleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public ProcessRoleIdentifier getProcessRoleIdentifier() {
        return processRoleIdentifier;
    }

    /**
     * Sets the value of the processRoleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public void setProcessRoleIdentifier(ProcessRoleIdentifier value) {
        this.processRoleIdentifier = value;
    }

}
