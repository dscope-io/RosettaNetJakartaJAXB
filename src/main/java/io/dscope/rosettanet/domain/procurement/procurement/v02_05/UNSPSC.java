
package io.dscope.rosettanet.domain.procurement.procurement.v02_05;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class UNSPSC
    extends JAXBElement<String>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.05", "UNSPSC");

    public UNSPSC(String value) {
        super(NAME, ((Class) String.class), null, value);
    }

    public UNSPSC() {
        super(NAME, ((Class) String.class), null, null);
    }

}
