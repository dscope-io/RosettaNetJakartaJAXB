
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.manufacturing.codelist.statuschange.v01_01.StatusChange;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.ChangeDescriptionType;


/**
 * <p>Java class for StatusChangeDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusChangeDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}ChangeDescriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.01}StatusChange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusChangeDescriptionType", propOrder = {
    "statusChange"
})
public class StatusChangeDescriptionType
    extends ChangeDescriptionType
{

    @XmlElementRef(name = "StatusChange", namespace = "urn:rosettanet:specification:domain:Manufacturing:StatusChange:xsd:codelist:01.01", type = StatusChange.class)
    protected StatusChange statusChange;

    /**
     * Gets the value of the statusChange property.
     * 
     * @return
     *     possible object is
     *     {@link StatusChange }
     *     
     */
    public StatusChange getStatusChange() {
        return statusChange;
    }

    /**
     * Sets the value of the statusChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusChange }
     *     
     */
    public void setStatusChange(StatusChange value) {
        this.statusChange = value;
    }

}
