
package io.dscope.rosettanet.domain.procurement.procurement.v02_28;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_03.FinanceTerms;


/**
 * <p>Java class for FinancingTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinancingTermsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.03}FinanceTerms" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "FinancingTermsType", propOrder = {
    "financeTerms",
    "paymentTerms"
})
public class FinancingTermsType {

    @XmlElementRef(name = "FinanceTerms", namespace = "urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.03", type = FinanceTerms.class, required = false)
    protected FinanceTerms financeTerms;
    @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.28", type = PaymentTerms.class, required = false)
    protected List<PaymentTerms> paymentTerms;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the financeTerms property.
     * 
     * @return
     *     possible object is
     *     {@link FinanceTerms }
     *     
     */
    public FinanceTerms getFinanceTerms() {
        return financeTerms;
    }

    /**
     * Sets the value of the financeTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinanceTerms }
     *     
     */
    public void setFinanceTerms(FinanceTerms value) {
        this.financeTerms = value;
    }

    /**
     * Gets the value of the paymentTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTerms }
     * 
     * 
     */
    public List<PaymentTerms> getPaymentTerms() {
        if (paymentTerms == null) {
            paymentTerms = new ArrayList<PaymentTerms>();
        }
        return this.paymentTerms;
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
