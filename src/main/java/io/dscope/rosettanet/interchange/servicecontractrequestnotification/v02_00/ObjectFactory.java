
package io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.servicecontractrequestnotification.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceContractRequestNotificationType }
     * 
     */
    public ServiceContractRequestNotificationType createServiceContractRequestNotificationType() {
        return new ServiceContractRequestNotificationType();
    }

    /**
     * Create an instance of {@link ProductType }
     * 
     */
    public ProductType createProductType() {
        return new ProductType();
    }

    /**
     * Create an instance of {@link ServiceContractType }
     * 
     */
    public ServiceContractType createServiceContractType() {
        return new ServiceContractType();
    }

    /**
     * Create an instance of {@link ServiceContractLineItemType }
     * 
     */
    public ServiceContractLineItemType createServiceContractLineItemType() {
        return new ServiceContractLineItemType();
    }

    /**
     * Create an instance of {@link SiteType }
     * 
     */
    public SiteType createSiteType() {
        return new SiteType();
    }

    /**
     * Create an instance of {@link ServiceContractRequestNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceContractRequestNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ServiceContractRequestNotification:xsd:schema:02.00", name = "ServiceContractRequestNotification")
    public ServiceContractRequestNotification createServiceContractRequestNotification(ServiceContractRequestNotificationType value) {
        return new ServiceContractRequestNotification(value);
    }

}
