
package io.dscope.rosettanet.domain.logistics.codelist.nationalexportcontrolclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NationalExportControlClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:NationalExportControlClassification:xsd:codelist:1.0", "NationalExportControlClassificationA");

    public NationalExportControlClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public NationalExportControlClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
