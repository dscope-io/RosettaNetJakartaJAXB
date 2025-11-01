
package io.dscope.rosettanet.domain.procurement.codelist.exportcontrolclassification.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ExportControlClassificationA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ExportControlClassification:xsd:codelist:1.0", "ExportControlClassificationA");

    public ExportControlClassificationA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ExportControlClassificationA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
