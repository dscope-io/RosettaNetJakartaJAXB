
package io.dscope.rosettanet.universal.codelist.country.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.country.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.country.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountryType }
     * 
     */
    public CountryType createCountryType() {
        return new CountryType();
    }

    /**
     * Create an instance of {@link CountryA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CountryA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.01", name = "CountryA")
    public CountryA createCountryA(Object value) {
        return new CountryA(value);
    }

    /**
     * Create an instance of {@link Country }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Country }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.01", name = "Country", substitutionHeadNamespace = "urn:rosettanet:specification:universal:Country:xsd:codelist:01.01", substitutionHeadName = "CountryA")
    public Country createCountry(CountryType value) {
        return new Country(value);
    }

}
