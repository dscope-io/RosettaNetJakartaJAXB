
package io.dscope.rosettanet.interchange.servicecontractreplynotification.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.servicecontractreplynotification.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.servicecontractreplynotification.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceContractReplyNotificationType }
     * 
     */
    public ServiceContractReplyNotificationType createServiceContractReplyNotificationType() {
        return new ServiceContractReplyNotificationType();
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
     * Create an instance of {@link ServiceContractReplyNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceContractReplyNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:01.01", name = "ServiceContractReplyNotification")
    public ServiceContractReplyNotification createServiceContractReplyNotification(ServiceContractReplyNotificationType value) {
        return new ServiceContractReplyNotification(value);
    }

}
