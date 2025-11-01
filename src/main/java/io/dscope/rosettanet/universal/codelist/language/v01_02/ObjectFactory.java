
package io.dscope.rosettanet.universal.codelist.language.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.universal.codelist.language.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.universal.codelist.language.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LanguageType }
     * 
     */
    public LanguageType createLanguageType() {
        return new LanguageType();
    }

    /**
     * Create an instance of {@link LanguageA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LanguageA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Language:xsd:codelist:01.02", name = "LanguageA")
    public LanguageA createLanguageA(Object value) {
        return new LanguageA(value);
    }

    /**
     * Create an instance of {@link Language }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Language }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:universal:Language:xsd:codelist:01.02", name = "Language", substitutionHeadNamespace = "urn:rosettanet:specification:universal:Language:xsd:codelist:01.02", substitutionHeadName = "LanguageA")
    public Language createLanguage(LanguageType value) {
        return new Language(value);
    }

}
