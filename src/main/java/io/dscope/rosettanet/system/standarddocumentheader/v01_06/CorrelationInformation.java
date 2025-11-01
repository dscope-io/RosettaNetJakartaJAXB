
package io.dscope.rosettanet.system.standarddocumentheader.v01_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CorrelationInformation
    extends JAXBElement<CorrelationInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06", "CorrelationInformation");

    public CorrelationInformation(CorrelationInformationType value) {
        super(NAME, ((Class) CorrelationInformationType.class), null, value);
    }

    public CorrelationInformation() {
        super(NAME, ((Class) CorrelationInformationType.class), null, null);
    }

}
