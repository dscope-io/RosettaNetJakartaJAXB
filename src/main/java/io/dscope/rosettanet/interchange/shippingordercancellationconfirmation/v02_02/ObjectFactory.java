
package io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shippingordercancellationconfirmation.v02_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationConfirmationType }
     * 
     */
    public ShippingOrderCancellationConfirmationType createShippingOrderCancellationConfirmationType() {
        return new ShippingOrderCancellationConfirmationType();
    }

    /**
     * Create an instance of {@link CancellationConfirmationType }
     * 
     */
    public CancellationConfirmationType createCancellationConfirmationType() {
        return new CancellationConfirmationType();
    }

    /**
     * Create an instance of {@link RequestingOrderInformationType }
     * 
     */
    public RequestingOrderInformationType createRequestingOrderInformationType() {
        return new RequestingOrderInformationType();
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationType }
     * 
     */
    public ShippingOrderCancellationType createShippingOrderCancellationType() {
        return new ShippingOrderCancellationType();
    }

    /**
     * Create an instance of {@link ShippingOrderCancellationConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderCancellationConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShippingOrderCancellationConfirmation:xsd:schema:02.02", name = "ShippingOrderCancellationConfirmation")
    public ShippingOrderCancellationConfirmation createShippingOrderCancellationConfirmation(ShippingOrderCancellationConfirmationType value) {
        return new ShippingOrderCancellationConfirmation(value);
    }

}
