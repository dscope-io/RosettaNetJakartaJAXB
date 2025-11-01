
package io.dscope.rosettanet.domain.design.design.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Attachment
    extends JAXBElement<AttachmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.05", "Attachment");

    public Attachment(AttachmentType value) {
        super(NAME, ((Class) AttachmentType.class), null, value);
    }

    public Attachment() {
        super(NAME, ((Class) AttachmentType.class), null, null);
    }

}
