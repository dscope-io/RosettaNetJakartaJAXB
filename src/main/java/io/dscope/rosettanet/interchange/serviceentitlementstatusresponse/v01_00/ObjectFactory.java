
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceEntitlementStatusResponseType }
     * 
     */
    public ServiceEntitlementStatusResponseType createServiceEntitlementStatusResponseType() {
        return new ServiceEntitlementStatusResponseType();
    }

    /**
     * Create an instance of {@link ContractInformationType }
     * 
     */
    public ContractInformationType createContractInformationType() {
        return new ContractInformationType();
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
     * Create an instance of {@link StatusInformationType }
     * 
     */
    public StatusInformationType createStatusInformationType() {
        return new StatusInformationType();
    }

    /**
     * Create an instance of {@link UnitInformationType }
     * 
     */
    public UnitInformationType createUnitInformationType() {
        return new UnitInformationType();
    }

    /**
     * Create an instance of {@link ServiceEntitlementStatusResponse }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceEntitlementStatusResponse }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponseNotification:xsd:schema:01.00", name = "ServiceEntitlementStatusResponse")
    public ServiceEntitlementStatusResponse createServiceEntitlementStatusResponse(ServiceEntitlementStatusResponseType value) {
        return new ServiceEntitlementStatusResponse(value);
    }

}
