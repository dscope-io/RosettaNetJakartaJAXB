
package io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.shippingorderrejectreason.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingOrderRejectReasonType }
     * 
     */
    public ShippingOrderRejectReasonType createShippingOrderRejectReasonType() {
        return new ShippingOrderRejectReasonType();
    }

    /**
     * Create an instance of {@link ShippingOrderRejectReasonA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderRejectReasonA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", name = "ShippingOrderRejectReasonA")
    public ShippingOrderRejectReasonA createShippingOrderRejectReasonA(Object value) {
        return new ShippingOrderRejectReasonA(value);
    }

    /**
     * Create an instance of {@link ShippingOrderRejectReason }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderRejectReason }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", name = "ShippingOrderRejectReason", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ShippingOrderRejectReason:xsd:codelist:01.01", substitutionHeadName = "ShippingOrderRejectReasonA")
    public ShippingOrderRejectReason createShippingOrderRejectReason(ShippingOrderRejectReasonType value) {
        return new ShippingOrderRejectReason(value);
    }

}
