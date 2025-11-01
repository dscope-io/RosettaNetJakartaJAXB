
package io.dscope.rosettanet.interchange.codelist.strategicforecastquantitytype.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.strategicforecastquantitytype.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.strategicforecastquantitytype.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StrategicForecastQuantityTypeType }
     * 
     */
    public StrategicForecastQuantityTypeType createStrategicForecastQuantityTypeType() {
        return new StrategicForecastQuantityTypeType();
    }

    /**
     * Create an instance of {@link StrategicForecastQuantityType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link StrategicForecastQuantityType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:StrategicForecastQuantityType:xsd:codelist:01.01", name = "StrategicForecastQuantityType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ForecastQuantityType:xsd:codelist:01.04", substitutionHeadName = "ForecastQuantityTypeA")
    public StrategicForecastQuantityType createStrategicForecastQuantityType(StrategicForecastQuantityTypeType value) {
        return new StrategicForecastQuantityType(value);
    }

}
