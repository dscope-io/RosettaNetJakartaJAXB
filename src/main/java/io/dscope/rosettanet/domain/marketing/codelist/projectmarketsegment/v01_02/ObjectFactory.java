
package io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.projectmarketsegment.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProjectMarketSegmentType }
     * 
     */
    public ProjectMarketSegmentType createProjectMarketSegmentType() {
        return new ProjectMarketSegmentType();
    }

    /**
     * Create an instance of {@link ProjectMarketSegmentA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProjectMarketSegmentA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", name = "ProjectMarketSegmentA")
    public ProjectMarketSegmentA createProjectMarketSegmentA(Object value) {
        return new ProjectMarketSegmentA(value);
    }

    /**
     * Create an instance of {@link ProjectMarketSegment }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ProjectMarketSegment }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", name = "ProjectMarketSegment", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:ProjectMarketSegment:xsd:codelist:01.02", substitutionHeadName = "ProjectMarketSegmentA")
    public ProjectMarketSegment createProjectMarketSegment(ProjectMarketSegmentType value) {
        return new ProjectMarketSegment(value);
    }

}
