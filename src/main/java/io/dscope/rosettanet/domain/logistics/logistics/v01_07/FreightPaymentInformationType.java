
package io.dscope.rosettanet.domain.logistics.logistics.v01_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.logistics.codelist.freightpaymentterms.v01_02.FreightPaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v01_13.SpecialHandlingInstruction;
import io.dscope.rosettanet.universal.monetaryexpression.v01_01.FinancialAmountType;


/**
 * <p>Java class for FreightPaymentInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FreightPaymentInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FreightCharges" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.01}FinancialAmountType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.02}FreightPaymentTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13}SpecialHandlingInstruction" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FreightPaymentInformationType", propOrder = {
    "freightCharges",
    "freightPaymentTerms",
    "specialHandlingInstruction"
})
public class FreightPaymentInformationType {

    @XmlElement(name = "FreightCharges")
    protected FinancialAmountType freightCharges;
    @XmlElementRef(name = "FreightPaymentTerms", namespace = "urn:rosettanet:specification:domain:Logistics:FreightPaymentTerms:xsd:codelist:01.02", type = FreightPaymentTerms.class, required = false)
    protected FreightPaymentTerms freightPaymentTerms;
    @XmlElementRef(name = "SpecialHandlingInstruction", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:01.13", type = SpecialHandlingInstruction.class, required = false)
    protected List<SpecialHandlingInstruction> specialHandlingInstruction;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the freightCharges property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getFreightCharges() {
        return freightCharges;
    }

    /**
     * Sets the value of the freightCharges property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setFreightCharges(FinancialAmountType value) {
        this.freightCharges = value;
    }

    /**
     * Gets the value of the freightPaymentTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public FreightPaymentTerms getFreightPaymentTerms() {
        return freightPaymentTerms;
    }

    /**
     * Sets the value of the freightPaymentTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FreightPaymentTerms }
     *     
     */
    public void setFreightPaymentTerms(FreightPaymentTerms value) {
        this.freightPaymentTerms = value;
    }

    /**
     * Gets the value of the specialHandlingInstruction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specialHandlingInstruction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecialHandlingInstruction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialHandlingInstruction }
     * 
     * 
     */
    public List<SpecialHandlingInstruction> getSpecialHandlingInstruction() {
        if (specialHandlingInstruction == null) {
            specialHandlingInstruction = new ArrayList<SpecialHandlingInstruction>();
        }
        return this.specialHandlingInstruction;
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
