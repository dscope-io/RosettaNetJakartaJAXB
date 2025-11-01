
package io.dscope.rosettanet.domain.service.service.v02_20;

import jakarta.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CRContact
    extends JAXBElement<CRContactType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.20", "CRContact");

    public CRContact(CRContactType value) {
        super(NAME, ((Class) CRContactType.class), null, value);
    }

    public CRContact() {
        super(NAME, ((Class) CRContactType.class), null, null);
    }

}
