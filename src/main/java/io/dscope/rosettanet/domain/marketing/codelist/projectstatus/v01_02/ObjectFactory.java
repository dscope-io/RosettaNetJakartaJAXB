
package io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.projectstatus.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProjectStatusType }
     * 
     */
    public ProjectStatusType createProjectStatusType() {
        return new ProjectStatusType();
    }

    /**
     * Create an instance of {@link ProjectStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProjectStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", name = "ProjectStatusA")
    public ProjectStatusA createProjectStatusA(Object value) {
        return new ProjectStatusA(value);
    }

    /**
     * Create an instance of {@link ProjectStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProjectStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", name = "ProjectStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:ProjectStatus:xsd:codelist:01.02", substitutionHeadName = "ProjectStatusA")
    public ProjectStatus createProjectStatus(ProjectStatusType value) {
        return new ProjectStatus(value);
    }

}
