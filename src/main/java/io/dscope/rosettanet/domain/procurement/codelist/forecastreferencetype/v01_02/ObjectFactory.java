
package io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.forecastreferencetype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForecastReferenceTypeType }
     * 
     */
    public ForecastReferenceTypeType createForecastReferenceTypeType() {
        return new ForecastReferenceTypeType();
    }

    /**
     * Create an instance of {@link ForecastReferenceTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastReferenceTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.02", name = "ForecastReferenceTypeA")
    public ForecastReferenceTypeA createForecastReferenceTypeA(Object value) {
        return new ForecastReferenceTypeA(value);
    }

    /**
     * Create an instance of {@link ForecastReferenceType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastReferenceType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.02", name = "ForecastReferenceType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ForecastReferenceType:xsd:codelist:01.02", substitutionHeadName = "ForecastReferenceTypeA")
    public ForecastReferenceType createForecastReferenceType(ForecastReferenceTypeType value) {
        return new ForecastReferenceType(value);
    }

}
