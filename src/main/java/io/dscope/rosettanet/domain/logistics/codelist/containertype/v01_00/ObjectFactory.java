
package io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.containertype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ContainerTypeType }
     * 
     */
    public ContainerTypeType createContainerTypeType() {
        return new ContainerTypeType();
    }

    /**
     * Create an instance of {@link ContainerTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContainerTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.00", name = "ContainerTypeA")
    public ContainerTypeA createContainerTypeA(Object value) {
        return new ContainerTypeA(value);
    }

    /**
     * Create an instance of {@link ContainerType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ContainerType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.00", name = "ContainerType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:ContainerType:xsd:codelist:01.00", substitutionHeadName = "ContainerTypeA")
    public ContainerType createContainerType(ContainerTypeType value) {
        return new ContainerType(value);
    }

}
