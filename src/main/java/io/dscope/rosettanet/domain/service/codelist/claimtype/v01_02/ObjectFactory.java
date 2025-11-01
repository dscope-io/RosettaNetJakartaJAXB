
package io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.claimtype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClaimTypeType }
     * 
     */
    public ClaimTypeType createClaimTypeType() {
        return new ClaimTypeType();
    }

    /**
     * Create an instance of {@link ClaimTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ClaimTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", name = "ClaimTypeA")
    public ClaimTypeA createClaimTypeA(Object value) {
        return new ClaimTypeA(value);
    }

    /**
     * Create an instance of {@link ClaimType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ClaimType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", name = "ClaimType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:ClaimType:xsd:codelist:01.02", substitutionHeadName = "ClaimTypeA")
    public ClaimType createClaimType(ClaimTypeType value) {
        return new ClaimType(value);
    }

}
