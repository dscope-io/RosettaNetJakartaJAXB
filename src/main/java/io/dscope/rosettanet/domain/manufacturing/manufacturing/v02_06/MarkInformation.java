
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_06;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkInformation
    extends JAXBElement<MarkInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.06", "MarkInformation");

    public MarkInformation(MarkInformationType value) {
        super(NAME, ((Class) MarkInformationType.class), null, value);
    }

    public MarkInformation() {
        super(NAME, ((Class) MarkInformationType.class), null, null);
    }

}
