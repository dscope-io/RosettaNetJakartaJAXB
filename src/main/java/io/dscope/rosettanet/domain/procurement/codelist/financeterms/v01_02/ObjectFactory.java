
package io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.financeterms.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FinanceTermsType }
     * 
     */
    public FinanceTermsType createFinanceTermsType() {
        return new FinanceTermsType();
    }

    /**
     * Create an instance of {@link FinanceTermsA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FinanceTermsA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.02", name = "FinanceTermsA")
    public FinanceTermsA createFinanceTermsA(Object value) {
        return new FinanceTermsA(value);
    }

    /**
     * Create an instance of {@link FinanceTerms }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link FinanceTerms }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.02", name = "FinanceTerms", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:FinanceTerms:xsd:codelist:01.02", substitutionHeadName = "FinanceTermsA")
    public FinanceTerms createFinanceTerms(FinanceTermsType value) {
        return new FinanceTerms(value);
    }

}
