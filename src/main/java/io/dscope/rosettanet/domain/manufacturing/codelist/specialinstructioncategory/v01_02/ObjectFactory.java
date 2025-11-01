
package io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.specialinstructioncategory.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SpecialInstructionCategoryType }
     * 
     */
    public SpecialInstructionCategoryType createSpecialInstructionCategoryType() {
        return new SpecialInstructionCategoryType();
    }

    /**
     * Create an instance of {@link SpecialInstructionCategoryA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecialInstructionCategoryA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.02", name = "SpecialInstructionCategoryA")
    public SpecialInstructionCategoryA createSpecialInstructionCategoryA(Object value) {
        return new SpecialInstructionCategoryA(value);
    }

    /**
     * Create an instance of {@link SpecialInstructionCategory }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SpecialInstructionCategory }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.02", name = "SpecialInstructionCategory", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:SpecialInstructionCategory:xsd:codelist:01.02", substitutionHeadName = "SpecialInstructionCategoryA")
    public SpecialInstructionCategory createSpecialInstructionCategory(SpecialInstructionCategoryType value) {
        return new SpecialInstructionCategory(value);
    }

}
