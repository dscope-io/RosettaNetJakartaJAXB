
package io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualityStatusType }
     * 
     */
    public QualityStatusType createQualityStatusType() {
        return new QualityStatusType();
    }

    /**
     * Create an instance of {@link QualityStatusA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QualityStatusA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04", name = "QualityStatusA")
    public QualityStatusA createQualityStatusA(Object value) {
        return new QualityStatusA(value);
    }

    /**
     * Create an instance of {@link QualityStatus }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link QualityStatus }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04", name = "QualityStatus", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04", substitutionHeadName = "QualityStatusA")
    public QualityStatus createQualityStatus(QualityStatusType value) {
        return new QualityStatus(value);
    }

}
