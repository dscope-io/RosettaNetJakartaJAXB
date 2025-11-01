
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_07;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_03.PaymentTermsType;
import io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_04.SaleType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.Financing;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.PaymentTerms;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.shared.v01_12.MonetaryAmountType;
import io.dscope.rosettanet.universal.codelist.documenttype.v01_09.DocumentType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.PartnerDescription;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedPartnerDescriptionType;


/**
 * <p>Java class for InvoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AncillaryAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="BillToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.09}DocumentType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}Financing" minOccurs="0"/&gt;
 *         &lt;element name="InvoiceLineItem" type="{urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07}InvoiceLineItemType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="IsLockBoxUsed" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="IsRebill" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}PartnerDescription" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PaymentTerms" type="{urn:rosettanet:specification:domain:Procurement:PaymentTerms:xsd:codelist:01.03}PaymentTermsType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}PaymentTerms" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="RemitToAccount" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}AccountSummaryType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RemitToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04}SaleType" minOccurs="0"/&gt;
 *         &lt;element name="SelfBillingFrom" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="SelfBillingTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14}SpecifiedPartnerDescriptionType"/&gt;
 *         &lt;element name="SoldToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SoldToTax" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}TaxSummaryType" minOccurs="0"/&gt;
 *         &lt;element name="TotalInvoiceAmount" type="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.12}MonetaryAmountType"/&gt;
 *         &lt;element name="TransferToAccount" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "InvoiceType", propOrder = {
    "content"
})
public class InvoiceType {

    @XmlElementRefs({
        @XmlElementRef(name = "AncillaryAmount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BillToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DocumentType", namespace = "urn:rosettanet:specification:universal:DocumentType:xsd:codelist:01.09", type = DocumentType.class, required = false),
        @XmlElementRef(name = "Financing", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = Financing.class, required = false),
        @XmlElementRef(name = "InvoiceLineItem", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IsLockBoxUsed", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "IsRebill", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PartnerDescription", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.14", type = PartnerDescription.class, required = false),
        @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "PaymentTerms", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19", type = PaymentTerms.class, required = false),
        @XmlElementRef(name = "RemitTo", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RemitToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RemitToTax", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SaleType", namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:01.04", type = SaleType.class, required = false),
        @XmlElementRef(name = "SelfBillingFrom", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SelfBillingTo", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoldToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SoldToTax", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TotalInvoiceAmount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "TransferToAccount", namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "PaymentTerms" is used by two different parts of a schema. See: 
     * line 4 of file:/Users/roman/Projects/DScope/RosettaNetJAXBBuilder/src/xsd/PIP3C7_V11.01.00_NotifyOfSelfBillingInvoice/XML/Interchange/SelfBillingInvoiceNotification_01_07.xsd
     * line 4 of file:/Users/roman/Projects/DScope/RosettaNetJAXBBuilder/src/xsd/PIP3C7_V11.01.00_NotifyOfSelfBillingInvoice/XML/Interchange/SelfBillingInvoiceNotification_01_07.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SaleType }
     * {@link Financing }
     * {@link PaymentTerms }
     * {@link DocumentType }
     * {@link PartnerDescription }
     * {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * {@link JAXBElement }{@code <}{@link InvoiceLineItemType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
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
