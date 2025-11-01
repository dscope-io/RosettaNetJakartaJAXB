
package io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.routelocation.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RouteLocationType }
     * 
     */
    public RouteLocationType createRouteLocationType() {
        return new RouteLocationType();
    }

    /**
     * Create an instance of {@link RouteLocationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RouteLocationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.02", name = "RouteLocationA")
    public RouteLocationA createRouteLocationA(Object value) {
        return new RouteLocationA(value);
    }

    /**
     * Create an instance of {@link RouteLocation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RouteLocation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.02", name = "RouteLocation", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:RouteLocation:xsd:codelist:01.02", substitutionHeadName = "RouteLocationA")
    public RouteLocation createRouteLocation(RouteLocationType value) {
        return new RouteLocation(value);
    }

}
