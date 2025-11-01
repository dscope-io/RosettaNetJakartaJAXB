
package io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.measurementtype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link MeasurementTypeType }
     * 
     */
    public MeasurementTypeType createMeasurementTypeType() {
        return new MeasurementTypeType();
    }

    /**
     * Create an instance of {@link MeasurementTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MeasurementTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", name = "MeasurementTypeA")
    public MeasurementTypeA createMeasurementTypeA(Object value) {
        return new MeasurementTypeA(value);
    }

    /**
     * Create an instance of {@link MeasurementType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link MeasurementType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", name = "MeasurementType", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:MeasurementType:xsd:codelist:01.02", substitutionHeadName = "MeasurementTypeA")
    public MeasurementType createMeasurementType(MeasurementTypeType value) {
        return new MeasurementType(value);
    }

}
