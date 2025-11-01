
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_04.QuantityChange;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.ChangeDescriptionType;


/**
 * <p>Java class for QuantityChangeDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuantityChangeDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}ChangeDescriptionType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.04}QuantityChange"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuantityChangeDescriptionType", propOrder = {
    "quantityChange"
})
public class QuantityChangeDescriptionType
    extends ChangeDescriptionType
{

    @XmlElementRef(name = "QuantityChange", namespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.04", type = QuantityChange.class)
    protected QuantityChange quantityChange;

    /**
     * Gets the value of the quantityChange property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityChange }
     *     
     */
    public QuantityChange getQuantityChange() {
        return quantityChange;
    }

    /**
     * Sets the value of the quantityChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityChange }
     *     
     */
    public void setQuantityChange(QuantityChange value) {
        this.quantityChange = value;
    }

}
