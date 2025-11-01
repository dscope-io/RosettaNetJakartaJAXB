
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Attachment
    extends JAXBElement<AttachmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", "Attachment");

    public Attachment(AttachmentType value) {
        super(NAME, ((Class) AttachmentType.class), null, value);
    }

    public Attachment() {
        super(NAME, ((Class) AttachmentType.class), null, null);
    }

}
