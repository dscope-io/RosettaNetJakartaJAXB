
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkInformation
    extends JAXBElement<MarkInformationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", "MarkInformation");

    public MarkInformation(MarkInformationType value) {
        super(NAME, ((Class) MarkInformationType.class), null, value);
    }

    public MarkInformation() {
        super(NAME, ((Class) MarkInformationType.class), null, null);
    }

}
