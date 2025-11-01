
package io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.deliverytype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeliveryTypeType }
     * 
     */
    public DeliveryTypeType createDeliveryTypeType() {
        return new DeliveryTypeType();
    }

    /**
     * Create an instance of {@link DeliveryTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DeliveryTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", name = "DeliveryTypeA")
    public DeliveryTypeA createDeliveryTypeA(Object value) {
        return new DeliveryTypeA(value);
    }

    /**
     * Create an instance of {@link DeliveryType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DeliveryType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", name = "DeliveryType", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:DeliveryType:xsd:codelist:01.00", substitutionHeadName = "DeliveryTypeA")
    public DeliveryType createDeliveryType(DeliveryTypeType value) {
        return new DeliveryType(value);
    }

}
