
package io.dscope.rosettanet.domain.procurement.codelist.exportcontrolclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ExportControlClassification
    extends JAXBElement<ExportControlClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ExportControlClassification:xsd:codelist:1.0", "ExportControlClassification");

    public ExportControlClassification(ExportControlClassificationType value) {
        super(NAME, ((Class) ExportControlClassificationType.class), null, value);
    }

    public ExportControlClassification() {
        super(NAME, ((Class) ExportControlClassificationType.class), null, null);
    }

}
