
package io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.salesreporting.salesreporting.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookPriceType }
     * 
     */
    public BookPriceType createBookPriceType() {
        return new BookPriceType();
    }

    /**
     * Create an instance of {@link ContractDetailsType }
     * 
     */
    public ContractDetailsType createContractDetailsType() {
        return new ContractDetailsType();
    }

    /**
     * Create an instance of {@link DatePeriodAndDurationType }
     * 
     */
    public DatePeriodAndDurationType createDatePeriodAndDurationType() {
        return new DatePeriodAndDurationType();
    }

    /**
     * Create an instance of {@link InstallLocationType }
     * 
     */
    public InstallLocationType createInstallLocationType() {
        return new InstallLocationType();
    }

    /**
     * Create an instance of {@link LotIdentificationType }
     * 
     */
    public LotIdentificationType createLotIdentificationType() {
        return new LotIdentificationType();
    }

    /**
     * Create an instance of {@link ParticipatingPartnerType }
     * 
     */
    public ParticipatingPartnerType createParticipatingPartnerType() {
        return new ParticipatingPartnerType();
    }

    /**
     * Create an instance of {@link ProductInformationType }
     * 
     */
    public ProductInformationType createProductInformationType() {
        return new ProductInformationType();
    }

    /**
     * Create an instance of {@link ProductSummaryType }
     * 
     */
    public ProductSummaryType createProductSummaryType() {
        return new ProductSummaryType();
    }

    /**
     * Create an instance of {@link ProductUnitTotalType }
     * 
     */
    public ProductUnitTotalType createProductUnitTotalType() {
        return new ProductUnitTotalType();
    }

    /**
     * Create an instance of {@link SalesOutType }
     * 
     */
    public SalesOutType createSalesOutType() {
        return new SalesOutType();
    }

    /**
     * Create an instance of {@link SalesOutAndTransactionType }
     * 
     */
    public SalesOutAndTransactionType createSalesOutAndTransactionType() {
        return new SalesOutAndTransactionType();
    }

    /**
     * Create an instance of {@link SpecialPriceType }
     * 
     */
    public SpecialPriceType createSpecialPriceType() {
        return new SpecialPriceType();
    }

    /**
     * Create an instance of {@link BookPrice }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link BookPrice }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "BookPrice")
    public BookPrice createBookPrice(BookPriceType value) {
        return new BookPrice(value);
    }

    /**
     * Create an instance of {@link ContractDetails }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContractDetails }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "ContractDetails")
    public ContractDetails createContractDetails(ContractDetailsType value) {
        return new ContractDetails(value);
    }

    /**
     * Create an instance of {@link DatePeriodAndDuration }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DatePeriodAndDuration }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "DatePeriodAndDuration")
    public DatePeriodAndDuration createDatePeriodAndDuration(DatePeriodAndDurationType value) {
        return new DatePeriodAndDuration(value);
    }

    /**
     * Create an instance of {@link InstallLocation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link InstallLocation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "InstallLocation")
    public InstallLocation createInstallLocation(InstallLocationType value) {
        return new InstallLocation(value);
    }

    /**
     * Create an instance of {@link LotIdentification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotIdentification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "LotIdentification")
    public LotIdentification createLotIdentification(LotIdentificationType value) {
        return new LotIdentification(value);
    }

    /**
     * Create an instance of {@link ParticipatingPartner }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ParticipatingPartner }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "ParticipatingPartner")
    public ParticipatingPartner createParticipatingPartner(ParticipatingPartnerType value) {
        return new ParticipatingPartner(value);
    }

    /**
     * Create an instance of {@link ProductInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "ProductInformation")
    public ProductInformation createProductInformation(ProductInformationType value) {
        return new ProductInformation(value);
    }

    /**
     * Create an instance of {@link ProductSummary }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductSummary }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "ProductSummary")
    public ProductSummary createProductSummary(ProductSummaryType value) {
        return new ProductSummary(value);
    }

    /**
     * Create an instance of {@link ProductUnitTotal }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductUnitTotal }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "ProductUnitTotal")
    public ProductUnitTotal createProductUnitTotal(ProductUnitTotalType value) {
        return new ProductUnitTotal(value);
    }

    /**
     * Create an instance of {@link SalesOut }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SalesOut }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "SalesOut")
    public SalesOut createSalesOut(SalesOutType value) {
        return new SalesOut(value);
    }

    /**
     * Create an instance of {@link SalesOutAndTransaction }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SalesOutAndTransaction }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "SalesOutAndTransaction")
    public SalesOutAndTransaction createSalesOutAndTransaction(SalesOutAndTransactionType value) {
        return new SalesOutAndTransaction(value);
    }

    /**
     * Create an instance of {@link SpecialPrice }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecialPrice }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:SalesReporting:xsd:schema:1.0", name = "SpecialPrice")
    public SpecialPrice createSpecialPrice(SpecialPriceType value) {
        return new SpecialPrice(value);
    }

}
