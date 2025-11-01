
package io.dscope.rosettanet.interchange.codelist.phase.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.phase.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.phase.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PhaseType }
     * 
     */
    public PhaseType createPhaseType() {
        return new PhaseType();
    }

    /**
     * Create an instance of {@link PhaseA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PhaseA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", name = "PhaseA")
    public PhaseA createPhaseA(Object value) {
        return new PhaseA(value);
    }

    /**
     * Create an instance of {@link Phase }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Phase }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", name = "Phase", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", substitutionHeadName = "PhaseA")
    public Phase createPhase(PhaseType value) {
        return new Phase(value);
    }

}
