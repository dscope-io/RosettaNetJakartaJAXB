
package io.dscope.rosettanet.domain.design.design.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Attachment
    extends JAXBElement<AttachmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "Attachment");

    public Attachment(AttachmentType value) {
        super(NAME, ((Class) AttachmentType.class), null, value);
    }

    public Attachment() {
        super(NAME, ((Class) AttachmentType.class), null, null);
    }

}
