
package io.dscope.rosettanet.domain.procurement.codelist.exportcontrolclassification.v01_00;

import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.exportcontrolclassification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.exportcontrolclassification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ExportControlClassificationType }
     * 
     */
    public ExportControlClassificationType createExportControlClassificationType() {
        return new ExportControlClassificationType();
    }

    /**
     * Create an instance of {@link ExportControlClassificationA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ExportControlClassificationA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ExportControlClassification:xsd:codelist:1.0", name = "ExportControlClassificationA")
    public ExportControlClassificationA createExportControlClassificationA(Object value) {
        return new ExportControlClassificationA(value);
    }

    /**
     * Create an instance of {@link ExportControlClassification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ExportControlClassification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:ExportControlClassification:xsd:codelist:1.0", name = "ExportControlClassification", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:ExportControlClassification:xsd:codelist:1.0", substitutionHeadName = "ExportControlClassificationA")
    public ExportControlClassification createExportControlClassification(ExportControlClassificationType value) {
        return new ExportControlClassification(value);
    }

}
