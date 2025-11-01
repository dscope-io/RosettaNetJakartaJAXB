
package io.dscope.rosettanet.system.standarddocumentheader.v01_24;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Sender
    extends JAXBElement<SenderType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.24", "Sender");

    public Sender(SenderType value) {
        super(NAME, ((Class) SenderType.class), null, value);
    }

    public Sender() {
        super(NAME, ((Class) SenderType.class), null, null);
    }

}
