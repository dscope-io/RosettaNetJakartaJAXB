
package io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.productcataloginformationdistribution.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductCatalogInformationDistributionType }
     * 
     */
    public ProductCatalogInformationDistributionType createProductCatalogInformationDistributionType() {
        return new ProductCatalogInformationDistributionType();
    }

    /**
     * Create an instance of {@link ProductCatalogType }
     * 
     */
    public ProductCatalogType createProductCatalogType() {
        return new ProductCatalogType();
    }

    /**
     * Create an instance of {@link ProductIdentificationInformationType }
     * 
     */
    public ProductIdentificationInformationType createProductIdentificationInformationType() {
        return new ProductIdentificationInformationType();
    }

    /**
     * Create an instance of {@link ProductInformationType }
     * 
     */
    public ProductInformationType createProductInformationType() {
        return new ProductInformationType();
    }

    /**
     * Create an instance of {@link ProductLifeCycleType }
     * 
     */
    public ProductLifeCycleType createProductLifeCycleType() {
        return new ProductLifeCycleType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link ProductPriceAndAvailabilityType }
     * 
     */
    public ProductPriceAndAvailabilityType createProductPriceAndAvailabilityType() {
        return new ProductPriceAndAvailabilityType();
    }

    /**
     * Create an instance of {@link ProductProcurementType }
     * 
     */
    public ProductProcurementType createProductProcurementType() {
        return new ProductProcurementType();
    }

    /**
     * Create an instance of {@link ProductCatalogInformationDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductCatalogInformationDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ProductCatalogInformationDistribution:xsd:schema:01.00", name = "ProductCatalogInformationDistribution")
    public ProductCatalogInformationDistribution createProductCatalogInformationDistribution(ProductCatalogInformationDistributionType value) {
        return new ProductCatalogInformationDistribution(value);
    }

}
