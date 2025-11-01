
package io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualityDispositionType }
     * 
     */
    public QualityDispositionType createQualityDispositionType() {
        return new QualityDispositionType();
    }

    /**
     * Create an instance of {@link QualityDispositionA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QualityDispositionA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", name = "QualityDispositionA")
    public QualityDispositionA createQualityDispositionA(Object value) {
        return new QualityDispositionA(value);
    }

    /**
     * Create an instance of {@link QualityDisposition }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QualityDisposition }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", name = "QualityDisposition", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", substitutionHeadName = "QualityDispositionA")
    public QualityDisposition createQualityDisposition(QualityDispositionType value) {
        return new QualityDisposition(value);
    }

}
