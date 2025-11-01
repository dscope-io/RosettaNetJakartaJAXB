
package io.dscope.rosettanet.interchange.productmasterdistribution.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.productmasterdistribution.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.productmasterdistribution.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductMasterDistributionType }
     * 
     */
    public ProductMasterDistributionType createProductMasterDistributionType() {
        return new ProductMasterDistributionType();
    }

    /**
     * Create an instance of {@link ChangeOrderWindowType }
     * 
     */
    public ChangeOrderWindowType createChangeOrderWindowType() {
        return new ChangeOrderWindowType();
    }

    /**
     * Create an instance of {@link OrderProvisionType }
     * 
     */
    public OrderProvisionType createOrderProvisionType() {
        return new OrderProvisionType();
    }

    /**
     * Create an instance of {@link ProductAttributeType }
     * 
     */
    public ProductAttributeType createProductAttributeType() {
        return new ProductAttributeType();
    }

    /**
     * Create an instance of {@link ProductLifeCycleType }
     * 
     */
    public ProductLifeCycleType createProductLifeCycleType() {
        return new ProductLifeCycleType();
    }

    /**
     * Create an instance of {@link ProductMasterType }
     * 
     */
    public ProductMasterType createProductMasterType() {
        return new ProductMasterType();
    }

    /**
     * Create an instance of {@link ProductMasterLineItemType }
     * 
     */
    public ProductMasterLineItemType createProductMasterLineItemType() {
        return new ProductMasterLineItemType();
    }

    /**
     * Create an instance of {@link ProductProcurementType }
     * 
     */
    public ProductProcurementType createProductProcurementType() {
        return new ProductProcurementType();
    }

    /**
     * Create an instance of {@link ProductMasterDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductMasterDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ProductMasterDistribution:xsd:schema:02.00", name = "ProductMasterDistribution")
    public ProductMasterDistribution createProductMasterDistribution(ProductMasterDistributionType value) {
        return new ProductMasterDistribution(value);
    }

}
