
package io.dscope.rosettanet.interchange.codelist.plan.v02_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.codelist.plan.v02_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.codelist.plan.v02_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PlanType }
     * 
     */
    public PlanType createPlanType() {
        return new PlanType();
    }

    /**
     * Create an instance of {@link PlanA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PlanA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:Plan:xsd:codelist:02.00", name = "PlanA")
    public PlanA createPlanA(Object value) {
        return new PlanA(value);
    }

    /**
     * Create an instance of {@link Plan }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Plan }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:Plan:xsd:codelist:02.00", name = "Plan", substitutionHeadNamespace = "urn:rosettanet:specification:interchange:Plan:xsd:codelist:02.00", substitutionHeadName = "PlanA")
    public Plan createPlan(PlanType value) {
        return new Plan(value);
    }

}
