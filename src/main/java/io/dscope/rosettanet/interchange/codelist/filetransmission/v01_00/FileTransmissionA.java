
package io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FileTransmissionA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", "FileTransmissionA");

    public FileTransmissionA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public FileTransmissionA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
