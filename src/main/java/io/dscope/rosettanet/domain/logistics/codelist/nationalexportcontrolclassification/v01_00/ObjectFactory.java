
package io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NationalExportControlClassificationType }
     * 
     */
    public NationalExportControlClassificationType createNationalExportControlClassificationType() {
        return new NationalExportControlClassificationType();
    }

    /**
     * Create an instance of {@link NationalExportControlClassificationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NationalExportControlClassificationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:1.0", name = "NationalExportControlClassificationA")
    public NationalExportControlClassificationA createNationalExportControlClassificationA(Object value) {
        return new NationalExportControlClassificationA(value);
    }

    /**
     * Create an instance of {@link NationalExportControlClassification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NationalExportControlClassification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:1.0", name = "NationalExportControlClassification", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:1.0", substitutionHeadName = "NationalExportControlClassificationA")
    public NationalExportControlClassification createNationalExportControlClassification(NationalExportControlClassificationType value) {
        return new NationalExportControlClassification(value);
    }

}
