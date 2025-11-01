
package io.dscope.rosettanet.domain.shared.shared.v01_05;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.shared.shared.v01_05 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.shared.shared.v01_05
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CarrierInformationType }
     * 
     */
    public CarrierInformationType createCarrierInformationType() {
        return new CarrierInformationType();
    }

    /**
     * Create an instance of {@link DatePeriodAndDurationType }
     * 
     */
    public DatePeriodAndDurationType createDatePeriodAndDurationType() {
        return new DatePeriodAndDurationType();
    }

    /**
     * Create an instance of {@link DurationType }
     * 
     */
    public DurationType createDurationType() {
        return new DurationType();
    }

    /**
     * Create an instance of {@link ManufacturedDateType }
     * 
     */
    public ManufacturedDateType createManufacturedDateType() {
        return new ManufacturedDateType();
    }

    /**
     * Create an instance of {@link MonetaryAmountType }
     * 
     */
    public MonetaryAmountType createMonetaryAmountType() {
        return new MonetaryAmountType();
    }

    /**
     * Create an instance of {@link PaymentInformationType }
     * 
     */
    public PaymentInformationType createPaymentInformationType() {
        return new PaymentInformationType();
    }

    /**
     * Create an instance of {@link ProductPricingType }
     * 
     */
    public ProductPricingType createProductPricingType() {
        return new ProductPricingType();
    }

    /**
     * Create an instance of {@link QuantityInformationType }
     * 
     */
    public QuantityInformationType createQuantityInformationType() {
        return new QuantityInformationType();
    }

    /**
     * Create an instance of {@link RateType }
     * 
     */
    public RateType createRateType() {
        return new RateType();
    }

    /**
     * Create an instance of {@link WarrantyType }
     * 
     */
    public WarrantyType createWarrantyType() {
        return new WarrantyType();
    }

    /**
     * Create an instance of {@link CarrierInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CarrierInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "CarrierInformation")
    public CarrierInformation createCarrierInformation(CarrierInformationType value) {
        return new CarrierInformation(value);
    }

    /**
     * Create an instance of {@link DatePeriodAndDuration }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DatePeriodAndDuration }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "DatePeriodAndDuration")
    public DatePeriodAndDuration createDatePeriodAndDuration(DatePeriodAndDurationType value) {
        return new DatePeriodAndDuration(value);
    }

    /**
     * Create an instance of {@link Duration }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Duration }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "Duration")
    public Duration createDuration(DurationType value) {
        return new Duration(value);
    }

    /**
     * Create an instance of {@link ManufacturedDate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ManufacturedDate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "ManufacturedDate")
    public ManufacturedDate createManufacturedDate(ManufacturedDateType value) {
        return new ManufacturedDate(value);
    }

    /**
     * Create an instance of {@link MonetaryAmount }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MonetaryAmount }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "MonetaryAmount")
    public MonetaryAmount createMonetaryAmount(MonetaryAmountType value) {
        return new MonetaryAmount(value);
    }

    /**
     * Create an instance of {@link PaymentInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PaymentInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "PaymentInformation")
    public PaymentInformation createPaymentInformation(PaymentInformationType value) {
        return new PaymentInformation(value);
    }

    /**
     * Create an instance of {@link ProductPricing }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductPricing }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "ProductPricing")
    public ProductPricing createProductPricing(ProductPricingType value) {
        return new ProductPricing(value);
    }

    /**
     * Create an instance of {@link ProductQuantity }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductQuantity }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "ProductQuantity")
    public ProductQuantity createProductQuantity(Float value) {
        return new ProductQuantity(value);
    }

    /**
     * Create an instance of {@link QuantityInformation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuantityInformation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "QuantityInformation")
    public QuantityInformation createQuantityInformation(QuantityInformationType value) {
        return new QuantityInformation(value);
    }

    /**
     * Create an instance of {@link Rate }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Rate }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "Rate")
    public Rate createRate(RateType value) {
        return new Rate(value);
    }

    /**
     * Create an instance of {@link SCAC }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SCAC }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "SCAC")
    public SCAC createSCAC(String value) {
        return new SCAC(value);
    }

    /**
     * Create an instance of {@link Warranty }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Warranty }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.05", name = "Warranty")
    public Warranty createWarranty(WarrantyType value) {
        return new Warranty(value);
    }

}
