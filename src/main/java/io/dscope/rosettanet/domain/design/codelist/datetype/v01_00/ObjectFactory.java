
package io.dscope.rosettanet.domain.design.codelist.datetype.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.design.codelist.datetype.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.design.codelist.datetype.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DateTypeType }
     * 
     */
    public DateTypeType createDateTypeType() {
        return new DateTypeType();
    }

    /**
     * Create an instance of {@link DateTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DateTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:DateType:xsd:codelist:01.00", name = "DateTypeA")
    public DateTypeA createDateTypeA(Object value) {
        return new DateTypeA(value);
    }

    /**
     * Create an instance of {@link DateType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DateType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Design:DateType:xsd:codelist:01.00", name = "DateType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Design:DateType:xsd:codelist:01.00", substitutionHeadName = "DateTypeA")
    public DateType createDateType(DateTypeType value) {
        return new DateType(value);
    }

}
