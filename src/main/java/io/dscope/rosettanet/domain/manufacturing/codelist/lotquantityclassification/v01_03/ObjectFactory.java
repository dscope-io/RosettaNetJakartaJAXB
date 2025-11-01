
package io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_03;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.manufacturing.codelist.lotquantityclassification.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LotQuantityClassificationType }
     * 
     */
    public LotQuantityClassificationType createLotQuantityClassificationType() {
        return new LotQuantityClassificationType();
    }

    /**
     * Create an instance of {@link LotQuantityClassificationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotQuantityClassificationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.03", name = "LotQuantityClassificationA")
    public LotQuantityClassificationA createLotQuantityClassificationA(Object value) {
        return new LotQuantityClassificationA(value);
    }

    /**
     * Create an instance of {@link LotQuantityClassification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link LotQuantityClassification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.03", name = "LotQuantityClassification", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Manufacturing:LotQuantityClassification:xsd:codelist:01.03", substitutionHeadName = "LotQuantityClassificationA")
    public LotQuantityClassification createLotQuantityClassification(LotQuantityClassificationType value) {
        return new LotQuantityClassification(value);
    }

}
