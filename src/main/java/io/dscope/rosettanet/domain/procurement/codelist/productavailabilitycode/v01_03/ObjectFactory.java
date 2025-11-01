
package io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.productavailabilitycode.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductAvailabilityCodeType }
     * 
     */
    public ProductAvailabilityCodeType createProductAvailabilityCodeType() {
        return new ProductAvailabilityCodeType();
    }

    /**
     * Create an instance of {@link ProductAvailabilityCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductAvailabilityCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", name = "ProductAvailabilityCodeA")
    public ProductAvailabilityCodeA createProductAvailabilityCodeA(Object value) {
        return new ProductAvailabilityCodeA(value);
    }

    /**
     * Create an instance of {@link ProductAvailabilityCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProductAvailabilityCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", name = "ProductAvailabilityCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ProductAvailabilityCode:xsd:codelist:01.03", substitutionHeadName = "ProductAvailabilityCodeA")
    public ProductAvailabilityCode createProductAvailabilityCode(ProductAvailabilityCodeType value) {
        return new ProductAvailabilityCode(value);
    }

}
