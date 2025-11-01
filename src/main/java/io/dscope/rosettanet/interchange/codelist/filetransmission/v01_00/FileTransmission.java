
package io.dscope.rosettanet.interchange.codelist.filetransmission.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FileTransmission
    extends JAXBElement<FileTransmissionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:FileTransmission:xsd:codelist:01.00", "FileTransmission");

    public FileTransmission(FileTransmissionType value) {
        super(NAME, ((Class) FileTransmissionType.class), null, value);
    }

    public FileTransmission() {
        super(NAME, ((Class) FileTransmissionType.class), null, null);
    }

}
