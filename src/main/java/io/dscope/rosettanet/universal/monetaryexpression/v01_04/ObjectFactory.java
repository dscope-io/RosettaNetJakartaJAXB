
package io.dscope.rosettanet.universal.monetaryexpression.v01_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.monetaryexpression.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.monetaryexpression.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinancialAmountType }
     * 
     */
    public FinancialAmountType createFinancialAmountType() {
        return new FinancialAmountType();
    }

    /**
     * Create an instance of {@link ProductPricingType }
     * 
     */
    public ProductPricingType createProductPricingType() {
        return new ProductPricingType();
    }

    /**
     * Create an instance of {@link TaxAmountType }
     * 
     */
    public TaxAmountType createTaxAmountType() {
        return new TaxAmountType();
    }

    /**
     * Create an instance of {@link TaxJurisdictionType }
     * 
     */
    public TaxJurisdictionType createTaxJurisdictionType() {
        return new TaxJurisdictionType();
    }

    /**
     * Create an instance of {@link FinancialAmount }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FinancialAmount }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04", name = "FinancialAmount")
    public FinancialAmount createFinancialAmount(FinancialAmountType value) {
        return new FinancialAmount(value);
    }

    /**
     * Create an instance of {@link ProductPricing }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductPricing }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04", name = "ProductPricing")
    public ProductPricing createProductPricing(ProductPricingType value) {
        return new ProductPricing(value);
    }

    /**
     * Create an instance of {@link TaxAmount }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TaxAmount }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04", name = "TaxAmount")
    public TaxAmount createTaxAmount(TaxAmountType value) {
        return new TaxAmount(value);
    }

    /**
     * Create an instance of {@link TaxJurisdiction }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TaxJurisdiction }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:MonetaryExpression:xsd:schema:01.04", name = "TaxJurisdiction")
    public TaxJurisdiction createTaxJurisdiction(TaxJurisdictionType value) {
        return new TaxJurisdiction(value);
    }

}
