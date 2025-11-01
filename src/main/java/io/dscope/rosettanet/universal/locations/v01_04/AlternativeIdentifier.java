
package io.dscope.rosettanet.universal.locations.v01_04;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AlternativeIdentifier
    extends JAXBElement<AlternativeIdentifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:Locations:xsd:schema:01.04", "AlternativeIdentifier");

    public AlternativeIdentifier(AlternativeIdentifierType value) {
        super(NAME, ((Class) AlternativeIdentifierType.class), null, value);
    }

    public AlternativeIdentifier() {
        super(NAME, ((Class) AlternativeIdentifierType.class), null, null);
    }

}
