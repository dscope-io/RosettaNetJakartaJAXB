
package io.dscope.rosettanet.domain.logistics.logistics.v02_20;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.shared.shared.v01_15.MonetaryAmountType;


/**
 * <p>Java class for FreightValuationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightValuationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CustomsValue" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.15}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="DeclaredValue" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.15}MonetaryAmountType" minOccurs="0"/&gt;
 *         &lt;element name="InsuredValue" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.15}MonetaryAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "FreightValuationType", propOrder = {
    "customsValue",
    "declaredValue",
    "insuredValue"
})
public class FreightValuationType {

    @XmlElement(name = "CustomsValue")
    protected List<MonetaryAmountType> customsValue;
    @XmlElement(name = "DeclaredValue")
    protected MonetaryAmountType declaredValue;
    @XmlElement(name = "InsuredValue")
    protected MonetaryAmountType insuredValue;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the customsValue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customsValue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomsValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonetaryAmountType }
     * 
     * 
     */
    public List<MonetaryAmountType> getCustomsValue() {
        if (customsValue == null) {
            customsValue = new ArrayList<MonetaryAmountType>();
        }
        return this.customsValue;
    }

    /**
     * Gets the value of the declaredValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getDeclaredValue() {
        return declaredValue;
    }

    /**
     * Sets the value of the declaredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setDeclaredValue(MonetaryAmountType value) {
        this.declaredValue = value;
    }

    /**
     * Gets the value of the insuredValue property.
     * 
     * @return
     *     possible object is
     *     {@link MonetaryAmountType }
     *     
     */
    public MonetaryAmountType getInsuredValue() {
        return insuredValue;
    }

    /**
     * Sets the value of the insuredValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link MonetaryAmountType }
     *     
     */
    public void setInsuredValue(MonetaryAmountType value) {
        this.insuredValue = value;
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
