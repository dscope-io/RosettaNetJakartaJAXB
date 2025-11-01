
package io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.registrationcomplexitylevel.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrationComplexityLevelType }
     * 
     */
    public RegistrationComplexityLevelType createRegistrationComplexityLevelType() {
        return new RegistrationComplexityLevelType();
    }

    /**
     * Create an instance of {@link RegistrationComplexityLevelA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationComplexityLevelA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", name = "RegistrationComplexityLevelA")
    public RegistrationComplexityLevelA createRegistrationComplexityLevelA(Object value) {
        return new RegistrationComplexityLevelA(value);
    }

    /**
     * Create an instance of {@link RegistrationComplexityLevel }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationComplexityLevel }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", name = "RegistrationComplexityLevel", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:RegistrationComplexityLevel:xsd:codelist:01.02", substitutionHeadName = "RegistrationComplexityLevelA")
    public RegistrationComplexityLevel createRegistrationComplexityLevel(RegistrationComplexityLevelType value) {
        return new RegistrationComplexityLevel(value);
    }

}
