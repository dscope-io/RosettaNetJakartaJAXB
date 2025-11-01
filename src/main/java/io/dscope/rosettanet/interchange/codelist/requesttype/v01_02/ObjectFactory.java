
package io.dscope.rosettanet.interchange.codelist.requesttype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.requesttype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.requesttype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestTypeType }
     * 
     */
    public RequestTypeType createRequestTypeType() {
        return new RequestTypeType();
    }

    /**
     * Create an instance of {@link RequestTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequestTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.02", name = "RequestTypeA")
    public RequestTypeA createRequestTypeA(Object value) {
        return new RequestTypeA(value);
    }

    /**
     * Create an instance of {@link RequestType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequestType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.02", name = "RequestType", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.02", substitutionHeadName = "RequestTypeA")
    public RequestType createRequestType(RequestTypeType value) {
        return new RequestType(value);
    }

}
