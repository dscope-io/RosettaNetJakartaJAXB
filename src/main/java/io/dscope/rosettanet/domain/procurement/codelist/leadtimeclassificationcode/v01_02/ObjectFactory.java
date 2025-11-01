
package io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.leadtimeclassificationcode.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LeadTimeClassificationCodeType }
     * 
     */
    public LeadTimeClassificationCodeType createLeadTimeClassificationCodeType() {
        return new LeadTimeClassificationCodeType();
    }

    /**
     * Create an instance of {@link LeadTimeClassificationCodeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LeadTimeClassificationCodeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02", name = "LeadTimeClassificationCodeA")
    public LeadTimeClassificationCodeA createLeadTimeClassificationCodeA(Object value) {
        return new LeadTimeClassificationCodeA(value);
    }

    /**
     * Create an instance of {@link LeadTimeClassificationCode }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LeadTimeClassificationCode }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02", name = "LeadTimeClassificationCode", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:LeadTimeClassificationCode:xsd:codelist:01.02", substitutionHeadName = "LeadTimeClassificationCodeA")
    public LeadTimeClassificationCode createLeadTimeClassificationCode(LeadTimeClassificationCodeType value) {
        return new LeadTimeClassificationCode(value);
    }

}
