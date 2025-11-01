
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_12;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MarkingContents
    extends JAXBElement<MarkingContentsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.12", "MarkingContents");

    public MarkingContents(MarkingContentsType value) {
        super(NAME, ((Class) MarkingContentsType.class), null, value);
    }

    public MarkingContents() {
        super(NAME, ((Class) MarkingContentsType.class), null, null);
    }

}
