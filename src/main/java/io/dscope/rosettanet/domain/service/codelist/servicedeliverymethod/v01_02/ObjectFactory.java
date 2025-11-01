
package io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.servicedeliverymethod.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ServiceDeliveryMethodType }
     * 
     */
    public ServiceDeliveryMethodType createServiceDeliveryMethodType() {
        return new ServiceDeliveryMethodType();
    }

    /**
     * Create an instance of {@link ServiceDeliveryMethodA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceDeliveryMethodA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02", name = "ServiceDeliveryMethodA")
    public ServiceDeliveryMethodA createServiceDeliveryMethodA(Object value) {
        return new ServiceDeliveryMethodA(value);
    }

    /**
     * Create an instance of {@link ServiceDeliveryMethod }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ServiceDeliveryMethod }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02", name = "ServiceDeliveryMethod", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:ServiceDeliveryMethod:xsd:codelist:01.02", substitutionHeadName = "ServiceDeliveryMethodA")
    public ServiceDeliveryMethod createServiceDeliveryMethod(ServiceDeliveryMethodType value) {
        return new ServiceDeliveryMethod(value);
    }

}
