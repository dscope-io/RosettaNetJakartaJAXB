
package io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.containerspecification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContainerSpecificationType }
     * 
     */
    public ContainerSpecificationType createContainerSpecificationType() {
        return new ContainerSpecificationType();
    }

    /**
     * Create an instance of {@link ContainerSpecificationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContainerSpecificationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.00", name = "ContainerSpecificationA")
    public ContainerSpecificationA createContainerSpecificationA(Object value) {
        return new ContainerSpecificationA(value);
    }

    /**
     * Create an instance of {@link ContainerSpecification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContainerSpecification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.00", name = "ContainerSpecification", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ContainerSpecification:xsd:codelist:01.00", substitutionHeadName = "ContainerSpecificationA")
    public ContainerSpecification createContainerSpecification(ContainerSpecificationType value) {
        return new ContainerSpecification(value);
    }

}
