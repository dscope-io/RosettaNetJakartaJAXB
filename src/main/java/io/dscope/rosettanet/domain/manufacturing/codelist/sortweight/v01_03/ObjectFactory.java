
package io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SortWeightType }
     * 
     */
    public SortWeightType createSortWeightType() {
        return new SortWeightType();
    }

    /**
     * Create an instance of {@link SortWeightA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SortWeightA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03", name = "SortWeightA")
    public SortWeightA createSortWeightA(Object value) {
        return new SortWeightA(value);
    }

    /**
     * Create an instance of {@link SortWeight }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SortWeight }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03", name = "SortWeight", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03", substitutionHeadName = "SortWeightA")
    public SortWeight createSortWeight(SortWeightType value) {
        return new SortWeight(value);
    }

}
