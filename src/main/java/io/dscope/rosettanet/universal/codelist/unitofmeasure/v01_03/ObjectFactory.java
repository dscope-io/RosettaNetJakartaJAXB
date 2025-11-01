
package io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnitOfMeasureType }
     * 
     */
    public UnitOfMeasureType createUnitOfMeasureType() {
        return new UnitOfMeasureType();
    }

    /**
     * Create an instance of {@link UnitOfMeasureA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link UnitOfMeasureA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", name = "UnitOfMeasureA")
    public UnitOfMeasureA createUnitOfMeasureA(Object value) {
        return new UnitOfMeasureA(value);
    }

    /**
     * Create an instance of {@link UnitOfMeasure }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link UnitOfMeasure }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", name = "UnitOfMeasure", substitutionHeadNamespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", substitutionHeadName = "UnitOfMeasureA")
    public UnitOfMeasure createUnitOfMeasure(UnitOfMeasureType value) {
        return new UnitOfMeasure(value);
    }

}
