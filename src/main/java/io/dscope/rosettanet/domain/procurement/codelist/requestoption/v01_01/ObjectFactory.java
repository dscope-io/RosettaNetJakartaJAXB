
package io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.requestoption.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestOptionType }
     * 
     */
    public RequestOptionType createRequestOptionType() {
        return new RequestOptionType();
    }

    /**
     * Create an instance of {@link RequestOptionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequestOptionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01", name = "RequestOptionA")
    public RequestOptionA createRequestOptionA(Object value) {
        return new RequestOptionA(value);
    }

    /**
     * Create an instance of {@link RequestOption }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RequestOption }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01", name = "RequestOption", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:RequestOption:xsd:codelist:01.01", substitutionHeadName = "RequestOptionA")
    public RequestOption createRequestOption(RequestOptionType value) {
        return new RequestOption(value);
    }

}
