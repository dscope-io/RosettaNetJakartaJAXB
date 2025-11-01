
package io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.warrantyclaimrequest.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WarrantyClaimRequestType }
     * 
     */
    public WarrantyClaimRequestType createWarrantyClaimRequestType() {
        return new WarrantyClaimRequestType();
    }

    /**
     * Create an instance of {@link ServicedUnitType }
     * 
     */
    public ServicedUnitType createServicedUnitType() {
        return new ServicedUnitType();
    }

    /**
     * Create an instance of {@link ServiceEventType }
     * 
     */
    public ServiceEventType createServiceEventType() {
        return new ServiceEventType();
    }

    /**
     * Create an instance of {@link WarrantyClaimRequestDataType }
     * 
     */
    public WarrantyClaimRequestDataType createWarrantyClaimRequestDataType() {
        return new WarrantyClaimRequestDataType();
    }

    /**
     * Create an instance of {@link WarrantyClaimRequest }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WarrantyClaimRequest }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:WarrantyClaimRequestNotification:xsd:schema:01.00", name = "WarrantyClaimRequest")
    public WarrantyClaimRequest createWarrantyClaimRequest(WarrantyClaimRequestType value) {
        return new WarrantyClaimRequest(value);
    }

}
