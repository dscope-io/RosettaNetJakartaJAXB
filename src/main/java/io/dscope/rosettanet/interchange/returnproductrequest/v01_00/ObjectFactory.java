
package io.dscope.rosettanet.interchange.returnproductrequest.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.returnproductrequest.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.returnproductrequest.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReturnProductRequestType }
     * 
     */
    public ReturnProductRequestType createReturnProductRequestType() {
        return new ReturnProductRequestType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link ResourceType }
     * 
     */
    public ResourceType createResourceType() {
        return new ResourceType();
    }

    /**
     * Create an instance of {@link ReturnProductRequest }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ReturnProductRequest }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ReturnProductRequestNotification:xsd:schema:01.00", name = "ReturnProductRequest")
    public ReturnProductRequest createReturnProductRequest(ReturnProductRequestType value) {
        return new ReturnProductRequest(value);
    }

}
