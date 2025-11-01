
package io.dscope.rosettanet.interchange.warrantyclaimconfirmation.v01_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.service.codelist.claimstatus.v01_02.ClaimStatus;
import io.dscope.rosettanet.domain.shared.shared.v01_17.PaymentInformation;
import io.dscope.rosettanet.universal.monetaryexpression.v01_06.FinancialAmountType;


/**
 * <p>Java class for ClaimDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02}ClaimStatus"/&gt;
 *         &lt;element name="IsFixedInTime" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.17}PaymentInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="ProcessDate" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="TotalReimbursement" type="{urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.06}FinancialAmountType" minOccurs="0"/&gt;
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
@XmlType(name = "ClaimDataType", propOrder = {
    "claimStatus",
    "isFixedInTime",
    "paymentInformation",
    "processDate",
    "totalReimbursement"
})
public class ClaimDataType {

    @XmlElementRef(name = "ClaimStatus", namespace = "urn:rosettanet:specification:domain:Service:ClaimStatus:xsd:codelist:01.02", type = ClaimStatus.class)
    protected ClaimStatus claimStatus;
    @XmlElement(name = "IsFixedInTime")
    protected boolean isFixedInTime;
    @XmlElementRef(name = "PaymentInformation", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.17", type = PaymentInformation.class, required = false)
    protected List<PaymentInformation> paymentInformation;
    @XmlElement(name = "ProcessDate", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar processDate;
    @XmlElement(name = "TotalReimbursement")
    protected FinancialAmountType totalReimbursement;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the claimStatus property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimStatus }
     *     
     */
    public ClaimStatus getClaimStatus() {
        return claimStatus;
    }

    /**
     * Sets the value of the claimStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimStatus }
     *     
     */
    public void setClaimStatus(ClaimStatus value) {
        this.claimStatus = value;
    }

    /**
     * Gets the value of the isFixedInTime property.
     * 
     */
    public boolean isIsFixedInTime() {
        return isFixedInTime;
    }

    /**
     * Sets the value of the isFixedInTime property.
     * 
     */
    public void setIsFixedInTime(boolean value) {
        this.isFixedInTime = value;
    }

    /**
     * Gets the value of the paymentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the paymentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPaymentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentInformation }
     * 
     * 
     */
    public List<PaymentInformation> getPaymentInformation() {
        if (paymentInformation == null) {
            paymentInformation = new ArrayList<PaymentInformation>();
        }
        return this.paymentInformation;
    }

    /**
     * Gets the value of the processDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessDate() {
        return processDate;
    }

    /**
     * Sets the value of the processDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessDate(XMLGregorianCalendar value) {
        this.processDate = value;
    }

    /**
     * Gets the value of the totalReimbursement property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialAmountType }
     *     
     */
    public FinancialAmountType getTotalReimbursement() {
        return totalReimbursement;
    }

    /**
     * Sets the value of the totalReimbursement property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialAmountType }
     *     
     */
    public void setTotalReimbursement(FinancialAmountType value) {
        this.totalReimbursement = value;
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
