
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuantityChangeType }
     * 
     */
    public QuantityChangeType createQuantityChangeType() {
        return new QuantityChangeType();
    }

    /**
     * Create an instance of {@link QuantityChangeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuantityChangeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.02", name = "QuantityChangeA")
    public QuantityChangeA createQuantityChangeA(Object value) {
        return new QuantityChangeA(value);
    }

    /**
     * Create an instance of {@link QuantityChange }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuantityChange }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.02", name = "QuantityChange", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:01.02", substitutionHeadName = "QuantityChangeA")
    public QuantityChange createQuantityChange(QuantityChangeType value) {
        return new QuantityChange(value);
    }

}
