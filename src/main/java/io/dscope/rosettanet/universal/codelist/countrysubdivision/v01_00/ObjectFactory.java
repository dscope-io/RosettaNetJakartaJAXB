
package io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.countrysubdivision.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CountrySubdivisionType }
     * 
     */
    public CountrySubdivisionType createCountrySubdivisionType() {
        return new CountrySubdivisionType();
    }

    /**
     * Create an instance of {@link CountrySubdivisionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CountrySubdivisionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:1.0", name = "CountrySubdivisionA")
    public CountrySubdivisionA createCountrySubdivisionA(Object value) {
        return new CountrySubdivisionA(value);
    }

    /**
     * Create an instance of {@link CountrySubdivision }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link CountrySubdivision }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:1.0", name = "CountrySubdivision", substitutionHeadNamespace = "urn:rosettanet:specification:universal:CountrySubdivision:xsd:codelist:1.0", substitutionHeadName = "CountrySubdivisionA")
    public CountrySubdivision createCountrySubdivision(CountrySubdivisionType value) {
        return new CountrySubdivision(value);
    }

}
