
package io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_03;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AttachmentDescription
    extends JAXBElement<AttachmentDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:AttachmentDescription:xsd:codelist:01.03", "AttachmentDescription");

    public AttachmentDescription(AttachmentDescriptionType value) {
        super(NAME, ((Class) AttachmentDescriptionType.class), null, value);
    }

    public AttachmentDescription() {
        super(NAME, ((Class) AttachmentDescriptionType.class), null, null);
    }

}
