
package io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_07;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import io.dscope.rosettanet.domain.procurement.codelist.paymentterms.v01_03.PaymentTermsType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.AccountSummaryType;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.TaxSummaryType;
import io.dscope.rosettanet.domain.shared.shared.v01_12.MonetaryAmountType;
import io.dscope.rosettanet.universal.partneridentification.v01_14.SpecifiedPartnerDescriptionType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_07 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InvoiceTypeAncillaryAmount_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "AncillaryAmount");
    private final static QName _InvoiceTypeBillToAccount_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "BillToAccount");
    private final static QName _InvoiceTypeInvoiceLineItem_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "InvoiceLineItem");
    private final static QName _InvoiceTypeIsLockBoxUsed_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "IsLockBoxUsed");
    private final static QName _InvoiceTypeIsRebill_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "IsRebill");
    private final static QName _InvoiceTypePaymentTerms_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "PaymentTerms");
    private final static QName _InvoiceTypeRemitTo_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "RemitTo");
    private final static QName _InvoiceTypeRemitToAccount_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "RemitToAccount");
    private final static QName _InvoiceTypeRemitToTax_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "RemitToTax");
    private final static QName _InvoiceTypeSelfBillingFrom_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "SelfBillingFrom");
    private final static QName _InvoiceTypeSelfBillingTo_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "SelfBillingTo");
    private final static QName _InvoiceTypeSoldToAccount_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "SoldToAccount");
    private final static QName _InvoiceTypeSoldToTax_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "SoldToTax");
    private final static QName _InvoiceTypeTotalInvoiceAmount_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "TotalInvoiceAmount");
    private final static QName _InvoiceTypeTransferToAccount_QNAME = new QName("urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", "TransferToAccount");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.selfbillinginvoicenotification.v01_07
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelfBillingInvoiceNotificationType }
     * 
     */
    public SelfBillingInvoiceNotificationType createSelfBillingInvoiceNotificationType() {
        return new SelfBillingInvoiceNotificationType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link InvoiceLineItemType }
     * 
     */
    public InvoiceLineItemType createInvoiceLineItemType() {
        return new InvoiceLineItemType();
    }

    /**
     * Create an instance of {@link ProductDescriptionType }
     * 
     */
    public ProductDescriptionType createProductDescriptionType() {
        return new ProductDescriptionType();
    }

    /**
     * Create an instance of {@link ProductMovementType }
     * 
     */
    public ProductMovementType createProductMovementType() {
        return new ProductMovementType();
    }

    /**
     * Create an instance of {@link SelfBillingInvoiceNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SelfBillingInvoiceNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "SelfBillingInvoiceNotification")
    public SelfBillingInvoiceNotification createSelfBillingInvoiceNotification(SelfBillingInvoiceNotificationType value) {
        return new SelfBillingInvoiceNotification(value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "AncillaryAmount", scope = InvoiceType.class)
    public JAXBElement<MonetaryAmountType> createInvoiceTypeAncillaryAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_InvoiceTypeAncillaryAmount_QNAME, MonetaryAmountType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "BillToAccount", scope = InvoiceType.class)
    public JAXBElement<String> createInvoiceTypeBillToAccount(String value) {
        return new JAXBElement<String>(_InvoiceTypeBillToAccount_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineItemType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link InvoiceLineItemType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "InvoiceLineItem", scope = InvoiceType.class)
    public JAXBElement<InvoiceLineItemType> createInvoiceTypeInvoiceLineItem(InvoiceLineItemType value) {
        return new JAXBElement<InvoiceLineItemType>(_InvoiceTypeInvoiceLineItem_QNAME, InvoiceLineItemType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "IsLockBoxUsed", scope = InvoiceType.class)
    public JAXBElement<Boolean> createInvoiceTypeIsLockBoxUsed(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceTypeIsLockBoxUsed_QNAME, Boolean.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "IsRebill", scope = InvoiceType.class)
    public JAXBElement<Boolean> createInvoiceTypeIsRebill(Boolean value) {
        return new JAXBElement<Boolean>(_InvoiceTypeIsRebill_QNAME, Boolean.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentTermsType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "PaymentTerms", scope = InvoiceType.class)
    public JAXBElement<PaymentTermsType> createInvoiceTypePaymentTerms(PaymentTermsType value) {
        return new JAXBElement<PaymentTermsType>(_InvoiceTypePaymentTerms_QNAME, PaymentTermsType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "RemitTo", scope = InvoiceType.class)
    public JAXBElement<SpecifiedPartnerDescriptionType> createInvoiceTypeRemitTo(SpecifiedPartnerDescriptionType value) {
        return new JAXBElement<SpecifiedPartnerDescriptionType>(_InvoiceTypeRemitTo_QNAME, SpecifiedPartnerDescriptionType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AccountSummaryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "RemitToAccount", scope = InvoiceType.class)
    public JAXBElement<AccountSummaryType> createInvoiceTypeRemitToAccount(AccountSummaryType value) {
        return new JAXBElement<AccountSummaryType>(_InvoiceTypeRemitToAccount_QNAME, AccountSummaryType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "RemitToTax", scope = InvoiceType.class)
    public JAXBElement<TaxSummaryType> createInvoiceTypeRemitToTax(TaxSummaryType value) {
        return new JAXBElement<TaxSummaryType>(_InvoiceTypeRemitToTax_QNAME, TaxSummaryType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "SelfBillingFrom", scope = InvoiceType.class)
    public JAXBElement<SpecifiedPartnerDescriptionType> createInvoiceTypeSelfBillingFrom(SpecifiedPartnerDescriptionType value) {
        return new JAXBElement<SpecifiedPartnerDescriptionType>(_InvoiceTypeSelfBillingFrom_QNAME, SpecifiedPartnerDescriptionType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SpecifiedPartnerDescriptionType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "SelfBillingTo", scope = InvoiceType.class)
    public JAXBElement<SpecifiedPartnerDescriptionType> createInvoiceTypeSelfBillingTo(SpecifiedPartnerDescriptionType value) {
        return new JAXBElement<SpecifiedPartnerDescriptionType>(_InvoiceTypeSelfBillingTo_QNAME, SpecifiedPartnerDescriptionType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "SoldToAccount", scope = InvoiceType.class)
    public JAXBElement<String> createInvoiceTypeSoldToAccount(String value) {
        return new JAXBElement<String>(_InvoiceTypeSoldToAccount_QNAME, String.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TaxSummaryType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "SoldToTax", scope = InvoiceType.class)
    public JAXBElement<TaxSummaryType> createInvoiceTypeSoldToTax(TaxSummaryType value) {
        return new JAXBElement<TaxSummaryType>(_InvoiceTypeSoldToTax_QNAME, TaxSummaryType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MonetaryAmountType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "TotalInvoiceAmount", scope = InvoiceType.class)
    public JAXBElement<MonetaryAmountType> createInvoiceTypeTotalInvoiceAmount(MonetaryAmountType value) {
        return new JAXBElement<MonetaryAmountType>(_InvoiceTypeTotalInvoiceAmount_QNAME, MonetaryAmountType.class, InvoiceType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:SelfBillingInvoiceNotification:xsd:schema:01.07", name = "TransferToAccount", scope = InvoiceType.class)
    public JAXBElement<String> createInvoiceTypeTransferToAccount(String value) {
        return new JAXBElement<String>(_InvoiceTypeTransferToAccount_QNAME, String.class, InvoiceType.class, value);
    }

}
