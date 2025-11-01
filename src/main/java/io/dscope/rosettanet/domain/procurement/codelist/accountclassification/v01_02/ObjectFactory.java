
package io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.accountclassification.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountClassificationType }
     * 
     */
    public AccountClassificationType createAccountClassificationType() {
        return new AccountClassificationType();
    }

    /**
     * Create an instance of {@link AccountClassificationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AccountClassificationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02", name = "AccountClassificationA")
    public AccountClassificationA createAccountClassificationA(Object value) {
        return new AccountClassificationA(value);
    }

    /**
     * Create an instance of {@link AccountClassification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link AccountClassification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02", name = "AccountClassification", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:AccountClassification:xsd:codelist:01.02", substitutionHeadName = "AccountClassificationA")
    public AccountClassification createAccountClassification(AccountClassificationType value) {
        return new AccountClassification(value);
    }

}
