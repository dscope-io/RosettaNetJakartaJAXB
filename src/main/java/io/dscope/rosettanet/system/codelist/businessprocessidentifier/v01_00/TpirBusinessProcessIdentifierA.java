
package io.dscope.rosettanet.system.codelist.businessprocessidentifier.v01_00;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TpirBusinessProcessIdentifierA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:BusinessProcessIdentifier:xsd:codelist:1.0", "TpirBusinessProcessIdentifierA");

    public TpirBusinessProcessIdentifierA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public TpirBusinessProcessIdentifierA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
