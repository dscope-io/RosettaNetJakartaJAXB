
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DesignRegistrationConfirmationType }
     * 
     */
    public DesignRegistrationConfirmationType createDesignRegistrationConfirmationType() {
        return new DesignRegistrationConfirmationType();
    }

    /**
     * Create an instance of {@link DesignAssemblyInformationType }
     * 
     */
    public DesignAssemblyInformationType createDesignAssemblyInformationType() {
        return new DesignAssemblyInformationType();
    }

    /**
     * Create an instance of {@link DesignPartInformationType }
     * 
     */
    public DesignPartInformationType createDesignPartInformationType() {
        return new DesignPartInformationType();
    }

    /**
     * Create an instance of {@link DesignProjectInformationType }
     * 
     */
    public DesignProjectInformationType createDesignProjectInformationType() {
        return new DesignProjectInformationType();
    }

    /**
     * Create an instance of {@link DesignRegistrationInformationType }
     * 
     */
    public DesignRegistrationInformationType createDesignRegistrationInformationType() {
        return new DesignRegistrationInformationType();
    }

    /**
     * Create an instance of {@link DesignRegistrationConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignRegistrationConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.00", name = "DesignRegistrationConfirmation")
    public DesignRegistrationConfirmation createDesignRegistrationConfirmation(DesignRegistrationConfirmationType value) {
        return new DesignRegistrationConfirmation(value);
    }

}
