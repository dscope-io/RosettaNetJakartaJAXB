
package io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.customerauthorizationcode.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerAuthorizationCodeType }
     * 
     */
    public CustomerAuthorizationCodeType createCustomerAuthorizationCodeType() {
        return new CustomerAuthorizationCodeType();
    }

    /**
     * Create an instance of {@link CustomerAuthorizationCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CustomerAuthorizationCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:1.0", name = "CustomerAuthorizationCodeA")
    public CustomerAuthorizationCodeA createCustomerAuthorizationCodeA(Object value) {
        return new CustomerAuthorizationCodeA(value);
    }

    /**
     * Create an instance of {@link CustomerAuthorizationCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CustomerAuthorizationCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:1.0", name = "CustomerAuthorizationCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:CustomerAuthorizationCode:xsd:codelist:1.0", substitutionHeadName = "CustomerAuthorizationCodeA")
    public CustomerAuthorizationCode createCustomerAuthorizationCode(CustomerAuthorizationCodeType value) {
        return new CustomerAuthorizationCode(value);
    }

}
