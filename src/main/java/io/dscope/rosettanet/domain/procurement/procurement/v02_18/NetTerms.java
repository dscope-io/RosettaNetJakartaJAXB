
package io.dscope.rosettanet.domain.procurement.procurement.v02_18;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class NetTerms
    extends JAXBElement<NetTermsType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.18", "NetTerms");

    public NetTerms(NetTermsType value) {
        super(NAME, ((Class) NetTermsType.class), null, value);
    }

    public NetTerms() {
        super(NAME, ((Class) NetTermsType.class), null, null);
    }

}
