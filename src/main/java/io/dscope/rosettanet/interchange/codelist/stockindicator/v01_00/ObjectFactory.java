
package io.dscope.rosettanet.interchange.codelist.stockindicator.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.stockindicator.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.stockindicator.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StockIndicatorType }
     * 
     */
    public StockIndicatorType createStockIndicatorType() {
        return new StockIndicatorType();
    }

    /**
     * Create an instance of {@link StockIndicatorA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StockIndicatorA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00", name = "StockIndicatorA")
    public StockIndicatorA createStockIndicatorA(Object value) {
        return new StockIndicatorA(value);
    }

    /**
     * Create an instance of {@link StockIndicator }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StockIndicator }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00", name = "StockIndicator", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:StockIndicator:xsd:codelist:01.00", substitutionHeadName = "StockIndicatorA")
    public StockIndicator createStockIndicator(StockIndicatorType value) {
        return new StockIndicator(value);
    }

}
