
package io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.marketing.codelist.designwinclassification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DesignWinClassificationType }
     * 
     */
    public DesignWinClassificationType createDesignWinClassificationType() {
        return new DesignWinClassificationType();
    }

    /**
     * Create an instance of {@link DesignWinClassificationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignWinClassificationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00", name = "DesignWinClassificationA")
    public DesignWinClassificationA createDesignWinClassificationA(Object value) {
        return new DesignWinClassificationA(value);
    }

    /**
     * Create an instance of {@link DesignWinClassification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link DesignWinClassification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00", name = "DesignWinClassification", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Marketing:DesignWinClassification:xsd:codelist:01.00", substitutionHeadName = "DesignWinClassificationA")
    public DesignWinClassification createDesignWinClassification(DesignWinClassificationType value) {
        return new DesignWinClassification(value);
    }

}
