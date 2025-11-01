
package io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.serviceentitlementquery.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceEntitlementQueryType }
     * 
     */
    public ServiceEntitlementQueryType createServiceEntitlementQueryType() {
        return new ServiceEntitlementQueryType();
    }

    /**
     * Create an instance of {@link EventInformationType }
     * 
     */
    public EventInformationType createEventInformationType() {
        return new EventInformationType();
    }

    /**
     * Create an instance of {@link PartInformationType }
     * 
     */
    public PartInformationType createPartInformationType() {
        return new PartInformationType();
    }

    /**
     * Create an instance of {@link ServiceEntitlementType }
     * 
     */
    public ServiceEntitlementType createServiceEntitlementType() {
        return new ServiceEntitlementType();
    }

    /**
     * Create an instance of {@link UnitInformationType }
     * 
     */
    public UnitInformationType createUnitInformationType() {
        return new UnitInformationType();
    }

    /**
     * Create an instance of {@link ServiceEntitlementQuery }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceEntitlementQuery }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ServiceEntitlementQuery:xsd:schema:01.01", name = "ServiceEntitlementQuery")
    public ServiceEntitlementQuery createServiceEntitlementQuery(ServiceEntitlementQueryType value) {
        return new ServiceEntitlementQuery(value);
    }

}
