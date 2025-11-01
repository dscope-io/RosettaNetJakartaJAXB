
package io.dscope.rosettanet.interchange.productlistdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.productlistdistribution.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.productlistdistribution.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductListDistributionType }
     * 
     */
    public ProductListDistributionType createProductListDistributionType() {
        return new ProductListDistributionType();
    }

    /**
     * Create an instance of {@link CoreProductInformationType }
     * 
     */
    public CoreProductInformationType createCoreProductInformationType() {
        return new CoreProductInformationType();
    }

    /**
     * Create an instance of {@link DeviceProductInformationType }
     * 
     */
    public DeviceProductInformationType createDeviceProductInformationType() {
        return new DeviceProductInformationType();
    }

    /**
     * Create an instance of {@link DocumentIdentificationType }
     * 
     */
    public DocumentIdentificationType createDocumentIdentificationType() {
        return new DocumentIdentificationType();
    }

    /**
     * Create an instance of {@link EligibleProductInformationType }
     * 
     */
    public EligibleProductInformationType createEligibleProductInformationType() {
        return new EligibleProductInformationType();
    }

    /**
     * Create an instance of {@link EligibleProductListType }
     * 
     */
    public EligibleProductListType createEligibleProductListType() {
        return new EligibleProductListType();
    }

    /**
     * Create an instance of {@link ProductListDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductListDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ProductListDistribution:xsd:schema:02.00", name = "ProductListDistribution")
    public ProductListDistribution createProductListDistribution(ProductListDistributionType value) {
        return new ProductListDistribution(value);
    }

}
