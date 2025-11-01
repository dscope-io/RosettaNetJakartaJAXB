
package io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.registrationstatusdistribution.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegistrationStatusDistributionType }
     * 
     */
    public RegistrationStatusDistributionType createRegistrationStatusDistributionType() {
        return new RegistrationStatusDistributionType();
    }

    /**
     * Create an instance of {@link AssemblyInformationType }
     * 
     */
    public AssemblyInformationType createAssemblyInformationType() {
        return new AssemblyInformationType();
    }

    /**
     * Create an instance of {@link DesignRegistrationInformationType }
     * 
     */
    public DesignRegistrationInformationType createDesignRegistrationInformationType() {
        return new DesignRegistrationInformationType();
    }

    /**
     * Create an instance of {@link DesignStatusNotificationType }
     * 
     */
    public DesignStatusNotificationType createDesignStatusNotificationType() {
        return new DesignStatusNotificationType();
    }

    /**
     * Create an instance of {@link PartInformationType }
     * 
     */
    public PartInformationType createPartInformationType() {
        return new PartInformationType();
    }

    /**
     * Create an instance of {@link ProductProviderInformationType }
     * 
     */
    public ProductProviderInformationType createProductProviderInformationType() {
        return new ProductProviderInformationType();
    }

    /**
     * Create an instance of {@link ProductProviderLeadType }
     * 
     */
    public ProductProviderLeadType createProductProviderLeadType() {
        return new ProductProviderLeadType();
    }

    /**
     * Create an instance of {@link ProjectInformationType }
     * 
     */
    public ProjectInformationType createProjectInformationType() {
        return new ProjectInformationType();
    }

    /**
     * Create an instance of {@link RegistrationStatusDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link RegistrationStatusDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:RegistrationStatusDistribution:xsd:schema:01.00", name = "RegistrationStatusDistribution")
    public RegistrationStatusDistribution createRegistrationStatusDistribution(RegistrationStatusDistributionType value) {
        return new RegistrationStatusDistribution(value);
    }

}
