
package io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.registrationinvolvementlevel.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrationInvolvementLevelType }
     * 
     */
    public RegistrationInvolvementLevelType createRegistrationInvolvementLevelType() {
        return new RegistrationInvolvementLevelType();
    }

    /**
     * Create an instance of {@link RegistrationInvolvementLevelA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationInvolvementLevelA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", name = "RegistrationInvolvementLevelA")
    public RegistrationInvolvementLevelA createRegistrationInvolvementLevelA(Object value) {
        return new RegistrationInvolvementLevelA(value);
    }

    /**
     * Create an instance of {@link RegistrationInvolvementLevel }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationInvolvementLevel }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", name = "RegistrationInvolvementLevel", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:RegistrationInvolvementLevel:xsd:codelist:01.02", substitutionHeadName = "RegistrationInvolvementLevelA")
    public RegistrationInvolvementLevel createRegistrationInvolvementLevel(RegistrationInvolvementLevelType value) {
        return new RegistrationInvolvementLevel(value);
    }

}
