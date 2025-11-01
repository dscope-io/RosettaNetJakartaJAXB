
package io.dscope.rosettanet.system.codelist.businessprocessidentifier.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.system.codelist.businessprocessidentifier.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.system.codelist.businessprocessidentifier.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TpirBusinessProcessIdentifierType }
     * 
     */
    public TpirBusinessProcessIdentifierType createTpirBusinessProcessIdentifierType() {
        return new TpirBusinessProcessIdentifierType();
    }

    /**
     * Create an instance of {@link TpirBusinessProcessIdentifierA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TpirBusinessProcessIdentifierA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0", name = "TpirBusinessProcessIdentifierA")
    public TpirBusinessProcessIdentifierA createTpirBusinessProcessIdentifierA(Object value) {
        return new TpirBusinessProcessIdentifierA(value);
    }

    /**
     * Create an instance of {@link TpirBusinessProcessIdentifier }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TpirBusinessProcessIdentifier }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0", name = "TpirBusinessProcessIdentifier", substitutionHeadNamespace = "urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0", substitutionHeadName = "TpirBusinessProcessIdentifierA")
    public TpirBusinessProcessIdentifier createTpirBusinessProcessIdentifier(TpirBusinessProcessIdentifierType value) {
        return new TpirBusinessProcessIdentifier(value);
    }

}
