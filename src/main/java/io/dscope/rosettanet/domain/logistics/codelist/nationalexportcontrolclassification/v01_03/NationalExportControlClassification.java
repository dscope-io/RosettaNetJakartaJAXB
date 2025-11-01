
package io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NationalExportControlClassification
    extends JAXBElement<NationalExportControlClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:01.03", "NationalExportControlClassification");

    public NationalExportControlClassification(NationalExportControlClassificationType value) {
        super(NAME, ((Class) NationalExportControlClassificationType.class), null, value);
    }

    public NationalExportControlClassification() {
        super(NAME, ((Class) NationalExportControlClassificationType.class), null, null);
    }

}
