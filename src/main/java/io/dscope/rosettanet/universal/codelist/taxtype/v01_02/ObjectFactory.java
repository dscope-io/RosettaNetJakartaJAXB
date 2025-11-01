
package io.dscope.rosettanet.universal.codelist.taxtype.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.taxtype.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.taxtype.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TaxTypeType }
     * 
     */
    public TaxTypeType createTaxTypeType() {
        return new TaxTypeType();
    }

    /**
     * Create an instance of {@link TaxTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TaxTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02", name = "TaxTypeA")
    public TaxTypeA createTaxTypeA(Object value) {
        return new TaxTypeA(value);
    }

    /**
     * Create an instance of {@link TaxType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link TaxType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02", name = "TaxType", substitutionHeadNamespace = "urn:rosettanet:specification:universal:TaxType:xsd:codelist:01.02", substitutionHeadName = "TaxTypeA")
    public TaxType createTaxType(TaxTypeType value) {
        return new TaxType(value);
    }

}
