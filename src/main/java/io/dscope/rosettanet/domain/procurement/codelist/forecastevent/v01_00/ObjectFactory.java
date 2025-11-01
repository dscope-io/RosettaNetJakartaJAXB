
package io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.forecastevent.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ForecastEventType }
     * 
     */
    public ForecastEventType createForecastEventType() {
        return new ForecastEventType();
    }

    /**
     * Create an instance of {@link ForecastEventA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastEventA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0", name = "ForecastEventA")
    public ForecastEventA createForecastEventA(Object value) {
        return new ForecastEventA(value);
    }

    /**
     * Create an instance of {@link ForecastEvent }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ForecastEvent }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0", name = "ForecastEvent", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ForecastEvent:xsd:codelist:1.0", substitutionHeadName = "ForecastEventA")
    public ForecastEvent createForecastEvent(ForecastEventType value) {
        return new ForecastEvent(value);
    }

}
