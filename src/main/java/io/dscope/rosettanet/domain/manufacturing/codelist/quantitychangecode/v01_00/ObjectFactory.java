
package io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.quantitychangecode.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QuantityChangeCodeType }
     * 
     */
    public QuantityChangeCodeType createQuantityChangeCodeType() {
        return new QuantityChangeCodeType();
    }

    /**
     * Create an instance of {@link QuantityChangeCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuantityChangeCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:1.0", name = "QuantityChangeCodeA")
    public QuantityChangeCodeA createQuantityChangeCodeA(Object value) {
        return new QuantityChangeCodeA(value);
    }

    /**
     * Create an instance of {@link QuantityChangeCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QuantityChangeCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:1.0", name = "QuantityChangeCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:QuantityChangeCode:xsd:codelist:1.0", substitutionHeadName = "QuantityChangeCodeA")
    public QuantityChangeCode createQuantityChangeCode(QuantityChangeCodeType value) {
        return new QuantityChangeCode(value);
    }

}
