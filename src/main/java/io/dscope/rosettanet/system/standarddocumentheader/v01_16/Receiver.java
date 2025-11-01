
package io.dscope.rosettanet.system.standarddocumentheader.v01_16;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Receiver
    extends JAXBElement<ReceiverType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.16", "Receiver");

    public Receiver(ReceiverType value) {
        super(NAME, ((Class) ReceiverType.class), null, value);
    }

    public Receiver() {
        super(NAME, ((Class) ReceiverType.class), null, null);
    }

}
