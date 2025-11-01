
package io.dscope.rosettanet.interchange.shippingordercancellationrequest.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shippingordercancellationrequest.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shippingordercancellationrequest.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationRequestType }
     * 
     */
    public ShippingOrderCancellationRequestType createShippingOrderCancellationRequestType() {
        return new ShippingOrderCancellationRequestType();
    }

    /**
     * Create an instance of {@link RequestingOrderInformationType }
     * 
     */
    public RequestingOrderInformationType createRequestingOrderInformationType() {
        return new RequestingOrderInformationType();
    }

    /**
     * Create an instance of {@link ShippingOrderType }
     * 
     */
    public ShippingOrderType createShippingOrderType() {
        return new ShippingOrderType();
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationRequest }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderCancellationRequest }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShippingOrderCancellationRequestNotification:xsd:schema:01.00", name = "ShippingOrderCancellationRequest")
    public ShippingOrderCancellationRequest createShippingOrderCancellationRequest(ShippingOrderCancellationRequestType value) {
        return new ShippingOrderCancellationRequest(value);
    }

}
