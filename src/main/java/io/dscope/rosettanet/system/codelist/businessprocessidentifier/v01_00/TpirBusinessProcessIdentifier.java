
package io.dscope.rosettanet.system.codelist.businessprocessidentifier.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TpirBusinessProcessIdentifier
    extends JAXBElement<TpirBusinessProcessIdentifierType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0", "TpirBusinessProcessIdentifier");

    public TpirBusinessProcessIdentifier(TpirBusinessProcessIdentifierType value) {
        super(NAME, ((Class) TpirBusinessProcessIdentifierType.class), null, value);
    }

    public TpirBusinessProcessIdentifier() {
        super(NAME, ((Class) TpirBusinessProcessIdentifierType.class), null, null);
    }

}
