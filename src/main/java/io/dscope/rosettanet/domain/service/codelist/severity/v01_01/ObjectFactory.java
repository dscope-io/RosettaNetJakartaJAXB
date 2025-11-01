
package io.dscope.rosettanet.domain.service.codelist.severity.v01_01;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.severity.v01_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.severity.v01_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SeverityType }
     * 
     */
    public SeverityType createSeverityType() {
        return new SeverityType();
    }

    /**
     * Create an instance of {@link SeverityA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link SeverityA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", name = "SeverityA")
    public SeverityA createSeverityA(Object value) {
        return new SeverityA(value);
    }

    /**
     * Create an instance of {@link Severity }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link Severity }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", name = "Severity", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", substitutionHeadName = "SeverityA")
    public Severity createSeverity(SeverityType value) {
        return new Severity(value);
    }

}
