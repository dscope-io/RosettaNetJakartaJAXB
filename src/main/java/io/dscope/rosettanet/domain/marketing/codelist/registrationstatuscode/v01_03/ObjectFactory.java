
package io.dscope.rosettanet.domain.marketing.codelist.registrationstatuscode.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.registrationstatuscode.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.registrationstatuscode.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrationStatusCodeType }
     * 
     */
    public RegistrationStatusCodeType createRegistrationStatusCodeType() {
        return new RegistrationStatusCodeType();
    }

    /**
     * Create an instance of {@link RegistrationStatusCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationStatusCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationStatusCode:xsd:codelist:01.03", name = "RegistrationStatusCodeA")
    public RegistrationStatusCodeA createRegistrationStatusCodeA(Object value) {
        return new RegistrationStatusCodeA(value);
    }

    /**
     * Create an instance of {@link RegistrationStatusCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationStatusCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationStatusCode:xsd:codelist:01.03", name = "RegistrationStatusCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:RegistrationStatusCode:xsd:codelist:01.03", substitutionHeadName = "RegistrationStatusCodeA")
    public RegistrationStatusCode createRegistrationStatusCode(RegistrationStatusCodeType value) {
        return new RegistrationStatusCode(value);
    }

}
