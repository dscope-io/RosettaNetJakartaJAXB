
package io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.governmentpriorityrating.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GovernmentPriorityRatingType }
     * 
     */
    public GovernmentPriorityRatingType createGovernmentPriorityRatingType() {
        return new GovernmentPriorityRatingType();
    }

    /**
     * Create an instance of {@link GovernmentPriorityRatingA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GovernmentPriorityRatingA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", name = "GovernmentPriorityRatingA")
    public GovernmentPriorityRatingA createGovernmentPriorityRatingA(Object value) {
        return new GovernmentPriorityRatingA(value);
    }

    /**
     * Create an instance of {@link GovernmentPriorityRating }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link GovernmentPriorityRating }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", name = "GovernmentPriorityRating", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:GovernmentPriorityRating:xsd:codelist:01.03", substitutionHeadName = "GovernmentPriorityRatingA")
    public GovernmentPriorityRating createGovernmentPriorityRating(GovernmentPriorityRatingType value) {
        return new GovernmentPriorityRating(value);
    }

}
