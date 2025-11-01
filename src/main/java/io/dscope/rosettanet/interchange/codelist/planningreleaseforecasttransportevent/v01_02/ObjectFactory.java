
package io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.planningreleaseforecasttransportevent.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanningReleaseForecastTransportEventType }
     * 
     */
    public PlanningReleaseForecastTransportEventType createPlanningReleaseForecastTransportEventType() {
        return new PlanningReleaseForecastTransportEventType();
    }

    /**
     * Create an instance of {@link PlanningReleaseForecastTransportEvent }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PlanningReleaseForecastTransportEvent }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PlanningReleaseForecastTransportEvent:xsd:codelist:01.02", name = "PlanningReleaseForecastTransportEvent", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:TransportEvent:xsd:codelist:01.03", substitutionHeadName = "TransportEventA")
    public PlanningReleaseForecastTransportEvent createPlanningReleaseForecastTransportEvent(PlanningReleaseForecastTransportEventType value) {
        return new PlanningReleaseForecastTransportEvent(value);
    }

}
