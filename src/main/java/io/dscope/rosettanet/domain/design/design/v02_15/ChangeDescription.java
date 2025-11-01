
package io.dscope.rosettanet.domain.design.design.v02_15;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChangeDescription
    extends JAXBElement<ChangeDescriptionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.15", "ChangeDescription");

    public ChangeDescription(ChangeDescriptionType value) {
        super(NAME, ((Class) ChangeDescriptionType.class), null, value);
    }

    public ChangeDescription() {
        super(NAME, ((Class) ChangeDescriptionType.class), null, null);
    }

}
