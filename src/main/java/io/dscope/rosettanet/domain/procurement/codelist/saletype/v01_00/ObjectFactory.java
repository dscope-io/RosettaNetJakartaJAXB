
package io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SaleTypeType }
     * 
     */
    public SaleTypeType createSaleTypeType() {
        return new SaleTypeType();
    }

    /**
     * Create an instance of {@link SaleTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SaleTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:1.0", name = "SaleTypeA")
    public SaleTypeA createSaleTypeA(Object value) {
        return new SaleTypeA(value);
    }

    /**
     * Create an instance of {@link SaleType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SaleType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:1.0", name = "SaleType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:SaleType:xsd:codelist:1.0", substitutionHeadName = "SaleTypeA")
    public SaleType createSaleType(SaleTypeType value) {
        return new SaleType(value);
    }

}
