
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TesterAttachment
    extends JAXBElement<TesterAttachmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "TesterAttachment");

    public TesterAttachment(TesterAttachmentType value) {
        super(NAME, ((Class) TesterAttachmentType.class), null, value);
    }

    public TesterAttachment() {
        super(NAME, ((Class) TesterAttachmentType.class), null, null);
    }

}
