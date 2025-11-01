
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Notes
    extends JAXBElement<NotesType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "Notes");

    public Notes(NotesType value) {
        super(NAME, ((Class) NotesType.class), null, value);
    }

    public Notes() {
        super(NAME, ((Class) NotesType.class), null, null);
    }

}
