
package io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_02;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_02 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.waferqualityrating.v01_02
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WaferQualityRatingType }
     * 
     */
    public WaferQualityRatingType createWaferQualityRatingType() {
        return new WaferQualityRatingType();
    }

    /**
     * Create an instance of {@link WaferQualityRatingA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WaferQualityRatingA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.02", name = "WaferQualityRatingA")
    public WaferQualityRatingA createWaferQualityRatingA(Object value) {
        return new WaferQualityRatingA(value);
    }

    /**
     * Create an instance of {@link WaferQualityRating }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WaferQualityRating }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.02", name = "WaferQualityRating", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:WaferQualityRating:xsd:codelist:01.02", substitutionHeadName = "WaferQualityRatingA")
    public WaferQualityRating createWaferQualityRating(WaferQualityRatingType value) {
        return new WaferQualityRating(value);
    }

}
